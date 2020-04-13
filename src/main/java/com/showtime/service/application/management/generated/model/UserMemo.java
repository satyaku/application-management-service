package com.showtime.service.application.management.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.showtime.service.application.management.generated.model.ActivityDescription;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User activity memo 
 */
@ApiModel(description = "User activity memo ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

public class UserMemo   {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("memoSequenceId")
  private Integer memoSequenceId = null;

  @JsonProperty("acitivityType")
  private String acitivityType = null;

  @JsonProperty("acitivityTimeStamp")
  private OffsetDateTime acitivityTimeStamp = null;

  @JsonProperty("activityDescription")
  private ActivityDescription activityDescription = null;

  public UserMemo username(String username) {
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

  public UserMemo memoSequenceId(Integer memoSequenceId) {
    this.memoSequenceId = memoSequenceId;
    return this;
  }

  /**
   * Get memoSequenceId
   * @return memoSequenceId
  **/
  @ApiModelProperty(value = "")


  public Integer getMemoSequenceId() {
    return memoSequenceId;
  }

  public void setMemoSequenceId(Integer memoSequenceId) {
    this.memoSequenceId = memoSequenceId;
  }

  public UserMemo acitivityType(String acitivityType) {
    this.acitivityType = acitivityType;
    return this;
  }

  /**
   * Get acitivityType
   * @return acitivityType
  **/
  @ApiModelProperty(value = "")


  public String getAcitivityType() {
    return acitivityType;
  }

  public void setAcitivityType(String acitivityType) {
    this.acitivityType = acitivityType;
  }

  public UserMemo acitivityTimeStamp(OffsetDateTime acitivityTimeStamp) {
    this.acitivityTimeStamp = acitivityTimeStamp;
    return this;
  }

  /**
   * Get acitivityTimeStamp
   * @return acitivityTimeStamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getAcitivityTimeStamp() {
    return acitivityTimeStamp;
  }

  public void setAcitivityTimeStamp(OffsetDateTime acitivityTimeStamp) {
    this.acitivityTimeStamp = acitivityTimeStamp;
  }

  public UserMemo activityDescription(ActivityDescription activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

  /**
   * Get activityDescription
   * @return activityDescription
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ActivityDescription getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(ActivityDescription activityDescription) {
    this.activityDescription = activityDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMemo userMemo = (UserMemo) o;
    return Objects.equals(this.username, userMemo.username) &&
        Objects.equals(this.memoSequenceId, userMemo.memoSequenceId) &&
        Objects.equals(this.acitivityType, userMemo.acitivityType) &&
        Objects.equals(this.acitivityTimeStamp, userMemo.acitivityTimeStamp) &&
        Objects.equals(this.activityDescription, userMemo.activityDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, memoSequenceId, acitivityType, acitivityTimeStamp, activityDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMemo {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    memoSequenceId: ").append(toIndentedString(memoSequenceId)).append("\n");
    sb.append("    acitivityType: ").append(toIndentedString(acitivityType)).append("\n");
    sb.append("    acitivityTimeStamp: ").append(toIndentedString(acitivityTimeStamp)).append("\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
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

