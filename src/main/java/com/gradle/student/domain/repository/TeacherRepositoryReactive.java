package com.gradle.student.domain.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import com.gradle.student.domain.model.TeacherEntity;
import reactor.core.publisher.Mono;

/**
 * TeacherRepositoryReactive.
 * This interface provides reactive operations for TeacherEntity.
 *
 * @author Joseph Magallanes
 * @since 2025-06-26
 */
@Repository
public interface TeacherRepositoryReactive extends ReactiveCrudRepository<TeacherEntity, Long> {
    Mono<TeacherEntity> findByDocument(String documentNumber);
}
