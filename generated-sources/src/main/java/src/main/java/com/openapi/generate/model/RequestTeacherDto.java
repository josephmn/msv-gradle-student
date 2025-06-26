package com.openapi.generate.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * RequestTeacherDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-26T08:15:30.159728600-05:00[America/Lima]", comments = "Generator version: 7.5.0")
public class RequestTeacherDto {

  private Long id;

  private String document;

  private String name;

  private String lastName;

  private Boolean status;

  private Integer age;

  public RequestTeacherDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RequestTeacherDto document(String document) {
    this.document = document;
    return this;
  }

  /**
   * Get document
   * @return document
  */
  
  @Schema(name = "document", example = "45453245", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("document")
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public RequestTeacherDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "Jhon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RequestTeacherDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", example = "James", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public RequestTeacherDto status(Boolean status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public RequestTeacherDto age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  
  @Schema(name = "age", example = "30", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestTeacherDto requestTeacherDto = (RequestTeacherDto) o;
    return Objects.equals(this.id, requestTeacherDto.id) &&
        Objects.equals(this.document, requestTeacherDto.document) &&
        Objects.equals(this.name, requestTeacherDto.name) &&
        Objects.equals(this.lastName, requestTeacherDto.lastName) &&
        Objects.equals(this.status, requestTeacherDto.status) &&
        Objects.equals(this.age, requestTeacherDto.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, document, name, lastName, status, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestTeacherDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

