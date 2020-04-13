package com.showtime.service.application.management.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.showtime.service.application.management.generated.model.LastBookingDetails;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

public class AccountDetails   {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("activeFrom")
  private OffsetDateTime activeFrom = null;

  @JsonProperty("isActive")
  private String isActive = null;

  @JsonProperty("lastDate")
  private OffsetDateTime lastDate = null;

  @JsonProperty("lastBookingDetails")
  private LastBookingDetails lastBookingDetails = null;

  public AccountDetails username(String username) {
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

  public AccountDetails activeFrom(OffsetDateTime activeFrom) {
    this.activeFrom = activeFrom;
    return this;
  }

  /**
   * Get activeFrom
   * @return activeFrom
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getActiveFrom() {
    return activeFrom;
  }

  public void setActiveFrom(OffsetDateTime activeFrom) {
    this.activeFrom = activeFrom;
  }

  public AccountDetails isActive(String isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(value = "")


  public String getIsActive() {
    return isActive;
  }

  public void setIsActive(String isActive) {
    this.isActive = isActive;
  }

  public AccountDetails lastDate(OffsetDateTime lastDate) {
    this.lastDate = lastDate;
    return this;
  }

  /**
   * Get lastDate
   * @return lastDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastDate() {
    return lastDate;
  }

  public void setLastDate(OffsetDateTime lastDate) {
    this.lastDate = lastDate;
  }

  public AccountDetails lastBookingDetails(LastBookingDetails lastBookingDetails) {
    this.lastBookingDetails = lastBookingDetails;
    return this;
  }

  /**
   * Get lastBookingDetails
   * @return lastBookingDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LastBookingDetails getLastBookingDetails() {
    return lastBookingDetails;
  }

  public void setLastBookingDetails(LastBookingDetails lastBookingDetails) {
    this.lastBookingDetails = lastBookingDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetails accountDetails = (AccountDetails) o;
    return Objects.equals(this.username, accountDetails.username) &&
        Objects.equals(this.activeFrom, accountDetails.activeFrom) &&
        Objects.equals(this.isActive, accountDetails.isActive) &&
        Objects.equals(this.lastDate, accountDetails.lastDate) &&
        Objects.equals(this.lastBookingDetails, accountDetails.lastBookingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, activeFrom, isActive, lastDate, lastBookingDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetails {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    activeFrom: ").append(toIndentedString(activeFrom)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    lastDate: ").append(toIndentedString(lastDate)).append("\n");
    sb.append("    lastBookingDetails: ").append(toIndentedString(lastBookingDetails)).append("\n");
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

