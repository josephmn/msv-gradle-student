/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.openapi.generate.api;

import com.openapi.generate.model.Error;
import com.openapi.generate.model.RequestStudentDto;
import com.openapi.generate.model.ResponseStudentDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-26T08:15:30.159728600-05:00[America/Lima]", comments = "Generator version: 7.5.0")
@Validated
@Tag(name = "student", description = "Operations about student")
public interface StudentApi {

    /**
     * POST /students : Create student.
     * Create student in database.
     *
     * @param requestStudentDto Created user object (required)
     * @return successful operation (status code 201)
     *         or Unexpected error (status code 200)
     */
    @Operation(
        operationId = "createStudent",
        summary = "Create student.",
        description = "Create student in database.",
        tags = { "student" },
        responses = {
            @ApiResponse(responseCode = "201", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseStudentDto.class))
            }),
            @ApiResponse(responseCode = "default", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/students",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default Mono<ResponseEntity<ResponseStudentDto>> createStudent(
        @Parameter(name = "RequestStudentDto", description = "Created user object", required = true) @Valid @RequestBody Mono<RequestStudentDto> requestStudentDto,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"lastName\" : \"James\", \"document\" : \"78653423\", \"name\" : \"Jhon\", \"id\" : 1, \"age\" : 30, \"status\" : true }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"code\" : \"code\", \"message\" : \"message\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(requestStudentDto).then(Mono.empty());

    }


    /**
     * GET /students : Get all student actives.
     * Get all student status actives.
     *
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     *         or Unexpected error (status code 200)
     */
    @Operation(
        operationId = "getAllStudentsActives",
        summary = "Get all student actives.",
        description = "Get all student status actives.",
        tags = { "student" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ResponseStudentDto.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found"),
            @ApiResponse(responseCode = "default", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/students",
        produces = { "application/json" }
    )
    
    default Mono<ResponseEntity<Flux<ResponseStudentDto>>> getAllStudentsActives(
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "[ { \"lastName\" : \"James\", \"document\" : \"78653423\", \"name\" : \"Jhon\", \"id\" : 1, \"age\" : 30, \"status\" : true }, { \"lastName\" : \"James\", \"document\" : \"78653423\", \"name\" : \"Jhon\", \"id\" : 1, \"age\" : 30, \"status\" : true } ]";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"code\" : \"code\", \"message\" : \"message\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

}
