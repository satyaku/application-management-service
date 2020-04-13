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
 * The details of user at sign up 
 */
@ApiModel(description = "The details of user at sign up ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

public class SignUpDetails   {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("personalDetails")
  private Object personalDetails = null;

  public SignUpDetails username(String username) {
    this.username = username;
    return this;
  }

  /**
   * user id of the user 
   * @return username
  **/
  @ApiModelProperty(required = true, value = "user id of the user ")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SignUpDetails email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email id of the user 
   * @return email
  **/
  @ApiModelProperty(required = true, value = "Email id of the user ")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SignUpDetails password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password for the account 
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password for the account ")
  @NotNull


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SignUpDetails personalDetails(Object personalDetails) {
    this.personalDetails = personalDetails;
    return this;
  }

  /**
   * Personal details of the user. 
   * @return personalDetails
  **/
  @ApiModelProperty(required = true, value = "Personal details of the user. ")
  @NotNull


  public Object getPersonalDetails() {
    return personalDetails;
  }

  public void setPersonalDetails(Object personalDetails) {
    this.personalDetails = personalDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignUpDetails signUpDetails = (SignUpDetails) o;
    return Objects.equals(this.username, signUpDetails.username) &&
        Objects.equals(this.email, signUpDetails.email) &&
        Objects.equals(this.password, signUpDetails.password) &&
        Objects.equals(this.personalDetails, signUpDetails.personalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, email, password, personalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignUpDetails {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
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

