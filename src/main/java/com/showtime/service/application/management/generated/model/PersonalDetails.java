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
 * Personal details for sign up. 
 */
@ApiModel(description = "Personal details for sign up. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

public class PersonalDetails   {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("contactNumber")
  private String contactNumber = null;

  @JsonProperty("age")
  private Integer age = null;

  public PersonalDetails username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public PersonalDetails fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name of the customer 
   * @return fullName
  **/
  @ApiModelProperty(required = true, value = "Full name of the customer ")
  @NotNull


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public PersonalDetails contactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
    return this;
  }

  /**
   * The phone number of the customer 
   * @return contactNumber
  **/
  @ApiModelProperty(required = true, value = "The phone number of the customer ")
  @NotNull


  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  public PersonalDetails age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * The age of the customer 
   * @return age
  **/
  @ApiModelProperty(required = true, value = "The age of the customer ")
  @NotNull


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalDetails personalDetails = (PersonalDetails) o;
    return Objects.equals(this.username, personalDetails.username) &&
        Objects.equals(this.fullName, personalDetails.fullName) &&
        Objects.equals(this.contactNumber, personalDetails.contactNumber) &&
        Objects.equals(this.age, personalDetails.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, fullName, contactNumber, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalDetails {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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

