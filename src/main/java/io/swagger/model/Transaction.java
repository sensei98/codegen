package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transfer money to another IBAN
 */
@Schema(description = "Transfer money to another IBAN")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-01T11:41:56.516Z[GMT]")


public class Transaction   {
  @JsonProperty("userPerform")
  private String userPerform = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("IBANFrom")
  private String ibANFrom = null;

  @JsonProperty("IBANTo")
  private String ibANTo = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("time")
  private String time = null;

  public Transaction userPerform(String userPerform) {
    this.userPerform = userPerform;
    return this;
  }


  /**
   * Get userPerform
   * @return userPerform
   **/
  @Schema(example = "username", description = "")

  public String getUserPerform() {
    return userPerform;
  }

  public void setUserPerform(String userPerform) {
    this.userPerform = userPerform;
  }

  public Transaction token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   **/
  @Schema(example = "a1b2c3b4d5e6", description = "")

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Transaction ibANFrom(String ibANFrom) {
    this.ibANFrom = ibANFrom;
    return this;
  }

  /**
   * Get ibANFrom
   * @return ibANFrom
   **/
  @Schema(example = "NL11INGB223345", description = "")

  public String getIbANFrom() {
    return ibANFrom;
  }

  public void setIbANFrom(String ibANFrom) {
    this.ibANFrom = ibANFrom;
  }

  public Transaction ibANTo(String ibANTo) {
    this.ibANTo = ibANTo;
    return this;
  }

  /**
   * Get ibANTo
   * @return ibANTo
   **/
  @Schema(example = "NL44INGB556677", description = "")

  public String getIbANTo() {
    return ibANTo;
  }

  public void setIbANTo(String ibANTo) {
    this.ibANTo = ibANTo;
  }

  public Transaction amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Transaction time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   **/
  @Schema(description = "")

  @Valid
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.userPerform, transaction.userPerform) &&
            Objects.equals(this.token, transaction.token) &&
            Objects.equals(this.ibANFrom, transaction.ibANFrom) &&
            Objects.equals(this.ibANTo, transaction.ibANTo) &&
            Objects.equals(this.amount, transaction.amount) &&
            Objects.equals(this.time, transaction.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userPerform, token, ibANFrom, ibANTo, amount, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");

    sb.append("    userPerform: ").append(toIndentedString(userPerform)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    ibANFrom: ").append(toIndentedString(ibANFrom)).append("\n");
    sb.append("    ibANTo: ").append(toIndentedString(ibANTo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
