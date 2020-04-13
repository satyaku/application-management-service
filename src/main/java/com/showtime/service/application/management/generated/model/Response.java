package com.showtime.service.application.management.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response for the activity on HTTP200OK 
 */
@ApiModel(description = "Response for the activity on HTTP200OK ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

public class Response   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("description")
  private String description = null;

  public Response status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the activity  
   * @return status
  **/
  @ApiModelProperty(value = "Status of the activity  ")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Response description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description for the response status 
   * @return description
  **/
  @ApiModelProperty(value = "Description for the response status ")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.status, response.status) &&
        Objects.equals(this.description, response.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

