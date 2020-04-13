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
 * Activity description for the user 
 */
@ApiModel(description = "Activity description for the user ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

public class ActivityDescription   {
  @JsonProperty("memoSequenceId")
  private Integer memoSequenceId = null;

  @JsonProperty("longDescription")
  private String longDescription = null;

  @JsonProperty("activitySubType")
  private String activitySubType = null;

  @JsonProperty("action")
  private String action = null;

  public ActivityDescription memoSequenceId(Integer memoSequenceId) {
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

  public ActivityDescription longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

  /**
   * long description of the activity 
   * @return longDescription
  **/
  @ApiModelProperty(value = "long description of the activity ")


  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public ActivityDescription activitySubType(String activitySubType) {
    this.activitySubType = activitySubType;
    return this;
  }

  /**
   * Subtype of the activity 
   * @return activitySubType
  **/
  @ApiModelProperty(value = "Subtype of the activity ")


  public String getActivitySubType() {
    return activitySubType;
  }

  public void setActivitySubType(String activitySubType) {
    this.activitySubType = activitySubType;
  }

  public ActivityDescription action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Action performed by the user 
   * @return action
  **/
  @ApiModelProperty(value = "Action performed by the user ")


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityDescription activityDescription = (ActivityDescription) o;
    return Objects.equals(this.memoSequenceId, activityDescription.memoSequenceId) &&
        Objects.equals(this.longDescription, activityDescription.longDescription) &&
        Objects.equals(this.activitySubType, activityDescription.activitySubType) &&
        Objects.equals(this.action, activityDescription.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memoSequenceId, longDescription, activitySubType, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityDescription {\n");
    
    sb.append("    memoSequenceId: ").append(toIndentedString(memoSequenceId)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    activitySubType: ").append(toIndentedString(activitySubType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

