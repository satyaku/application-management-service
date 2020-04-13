package com.showtime.service.application.management.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.showtime.service.application.management.generated.model.AccountDetails;
import com.showtime.service.application.management.generated.model.PersonalDetails;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User details 
 */
@ApiModel(description = "User details ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

public class Users   {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("personalDetails")
  private PersonalDetails personalDetails = null;

  @JsonProperty("accountDetails")
  private AccountDetails accountDetails = null;

  public Users username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Users email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Users personalDetails(PersonalDetails personalDetails) {
    this.personalDetails = personalDetails;
    return this;
  }

  /**
   * Get personalDetails
   * @return personalDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PersonalDetails getPersonalDetails() {
    return personalDetails;
  }

  public void setPersonalDetails(PersonalDetails personalDetails) {
    this.personalDetails = personalDetails;
  }

  public Users accountDetails(AccountDetails accountDetails) {
    this.accountDetails = accountDetails;
    return this;
  }

  /**
   * Get accountDetails
   * @return accountDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountDetails getAccountDetails() {
    return accountDetails;
  }

  public void setAccountDetails(AccountDetails accountDetails) {
    this.accountDetails = accountDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Users users = (Users) o;
    return Objects.equals(this.username, users.username) &&
        Objects.equals(this.email, users.email) &&
        Objects.equals(this.personalDetails, users.personalDetails) &&
        Objects.equals(this.accountDetails, users.accountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, email, personalDetails, accountDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Users {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
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

