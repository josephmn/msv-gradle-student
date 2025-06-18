package com.gradle.student.domain.services;


import org.springframework.stereotype.Service;
import com.gradle.student.application.dto.RequestDto;
import com.gradle.student.application.dto.ResponseDto;
import com.gradle.student.application.usecases.StudentUseCase;
import com.gradle.student.domain.repository.StudentRepositoryReactive;
import com.gradle.student.infrastructure.exception.types.StudentAlreadyExistsException;
import com.gradle.student.infrastructure.util.StudentMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Implementation of the StudentUseCase interface.
 * Provides methods to manage students, including retrieving active students and creating new students.
 * Uses reactive programming with Project Reactor.
 *
 * @author Joseph Magallanes
 * @since 2025-06-16
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class StudentUseCaseImpl implements StudentUseCase {

    private final StudentRepositoryReactive repositoryReactive;
    private final StudentMapper studentMapper;

    @Override
    public Flux<ResponseDto> getAllStudentsActives() {
        log.info("Start execute method getAllStudentsActives");
        return repositoryReactive.findByStatusTrue()
                .map(studentMapper::studentToResponse)
                .doOnTerminate(() -> log.info("Finished execute method getAllStudentsActives"));
    }

    @Override
    public Mono<ResponseDto> createStudent(RequestDto requestDto) {
        log.info("Start execute method createStudent");
        final String documentNumber = requestDto.document();
        return repositoryReactive.findByDocument(documentNumber)
                .flatMap(existingCustomer -> Mono.error(new StudentAlreadyExistsException(
                        "Student exists with document number: %s", documentNumber)))
                .switchIfEmpty(Mono.defer(() -> {
                    log.info("Student before create: {}", requestDto);
                    return repositoryReactive.save(studentMapper.requestToStudent(requestDto))
                            .map(studentMapper::studentToResponse)
                            .doOnNext(customerAfter -> log.info("Student after create: {}", customerAfter));
                }))
                .cast(ResponseDto.class)
                .doOnTerminate(() -> log.info("Finished execute method createStudent"));
    }
}
