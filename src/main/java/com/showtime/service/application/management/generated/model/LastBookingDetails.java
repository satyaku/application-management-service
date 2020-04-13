package com.showtime.service.application.management.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LastBookingDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-12T21:36:58.218Z")

public class LastBookingDetails   {
  @JsonProperty("lastBookingDate")
  private OffsetDateTime lastBookingDate = null;

  @JsonProperty("lastBookingtype")
  private String lastBookingtype = null;

  @JsonProperty("lastBookingTotal")
  private BigDecimal lastBookingTotal = null;

  public LastBookingDetails lastBookingDate(OffsetDateTime lastBookingDate) {
    this.lastBookingDate = lastBookingDate;
    return this;
  }

  /**
   * Get lastBookingDate
   * @return lastBookingDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastBookingDate() {
    return lastBookingDate;
  }

  public void setLastBookingDate(OffsetDateTime lastBookingDate) {
    this.lastBookingDate = lastBookingDate;
  }

  public LastBookingDetails lastBookingtype(String lastBookingtype) {
    this.lastBookingtype = lastBookingtype;
    return this;
  }

  /**
   * Get lastBookingtype
   * @return lastBookingtype
  **/
  @ApiModelProperty(value = "")


  public String getLastBookingtype() {
    return lastBookingtype;
  }

  public void setLastBookingtype(String lastBookingtype) {
    this.lastBookingtype = lastBookingtype;
  }

  public LastBookingDetails lastBookingTotal(BigDecimal lastBookingTotal) {
    this.lastBookingTotal = lastBookingTotal;
    return this;
  }

  /**
   * Get lastBookingTotal
   * @return lastBookingTotal
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLastBookingTotal() {
    return lastBookingTotal;
  }

  public void setLastBookingTotal(BigDecimal lastBookingTotal) {
    this.lastBookingTotal = lastBookingTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastBookingDetails lastBookingDetails = (LastBookingDetails) o;
    return Objects.equals(this.lastBookingDate, lastBookingDetails.lastBookingDate) &&
        Objects.equals(this.lastBookingtype, lastBookingDetails.lastBookingtype) &&
        Objects.equals(this.lastBookingTotal, lastBookingDetails.lastBookingTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastBookingDate, lastBookingtype, lastBookingTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastBookingDetails {\n");
    
    sb.append("    lastBookingDate: ").append(toIndentedString(lastBookingDate)).append("\n");
    sb.append("    lastBookingtype: ").append(toIndentedString(lastBookingtype)).append("\n");
    sb.append("    lastBookingTotal: ").append(toIndentedString(lastBookingTotal)).append("\n");
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

