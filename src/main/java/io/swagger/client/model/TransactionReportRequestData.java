/*
 * BVNK API Endpoints
 * The BVNK API is designed to facilitate seamless and secure transactions including payments, channels, anddigital wallet transactions.
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TransactionReportRequestData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-07-05T20:47:27.517449+02:00[Africa/Johannesburg]")

public class TransactionReportRequestData {
  @SerializedName("type")
  private String type = null;

  @SerializedName("externalProcessing")
  private String externalProcessing = null;

  @SerializedName("walletId")
  private Long walletId = null;

  @SerializedName("transactionType")
  private String transactionType = null;

  @SerializedName("fromDate")
  private String fromDate = null;

  @SerializedName("toDate")
  private String toDate = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("languageTag")
  private String languageTag = null;

  @SerializedName("category")
  private Integer category = null;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("include")
  private String include = null;

  @SerializedName("exclude")
  private String exclude = null;

  public TransactionReportRequestData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(example = "transactions", description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TransactionReportRequestData externalProcessing(String externalProcessing) {
    this.externalProcessing = externalProcessing;
    return this;
  }

   /**
   * Get externalProcessing
   * @return externalProcessing
  **/
  @Schema(description = "")
  public String getExternalProcessing() {
    return externalProcessing;
  }

  public void setExternalProcessing(String externalProcessing) {
    this.externalProcessing = externalProcessing;
  }

  public TransactionReportRequestData walletId(Long walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * Get walletId
   * @return walletId
  **/
  @Schema(example = "504841", description = "")
  public Long getWalletId() {
    return walletId;
  }

  public void setWalletId(Long walletId) {
    this.walletId = walletId;
  }

  public TransactionReportRequestData transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @Schema(description = "")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public TransactionReportRequestData fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @Schema(example = "2023-03-01", description = "")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public TransactionReportRequestData toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Get toDate
   * @return toDate
  **/
  @Schema(example = "2023-06-30", description = "")
  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public TransactionReportRequestData format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @Schema(example = "CSV", description = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public TransactionReportRequestData languageTag(String languageTag) {
    this.languageTag = languageTag;
    return this;
  }

   /**
   * Get languageTag
   * @return languageTag
  **/
  @Schema(example = "en-US", description = "")
  public String getLanguageTag() {
    return languageTag;
  }

  public void setLanguageTag(String languageTag) {
    this.languageTag = languageTag;
  }

  public TransactionReportRequestData category(Integer category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(example = "0", description = "")
  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }

  public TransactionReportRequestData accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public TransactionReportRequestData include(String include) {
    this.include = include;
    return this;
  }

   /**
   * Get include
   * @return include
  **/
  @Schema(description = "")
  public String getInclude() {
    return include;
  }

  public void setInclude(String include) {
    this.include = include;
  }

  public TransactionReportRequestData exclude(String exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @Schema(description = "")
  public String getExclude() {
    return exclude;
  }

  public void setExclude(String exclude) {
    this.exclude = exclude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionReportRequestData transactionReportRequestData = (TransactionReportRequestData) o;
    return Objects.equals(this.type, transactionReportRequestData.type) &&
        Objects.equals(this.externalProcessing, transactionReportRequestData.externalProcessing) &&
        Objects.equals(this.walletId, transactionReportRequestData.walletId) &&
        Objects.equals(this.transactionType, transactionReportRequestData.transactionType) &&
        Objects.equals(this.fromDate, transactionReportRequestData.fromDate) &&
        Objects.equals(this.toDate, transactionReportRequestData.toDate) &&
        Objects.equals(this.format, transactionReportRequestData.format) &&
        Objects.equals(this.languageTag, transactionReportRequestData.languageTag) &&
        Objects.equals(this.category, transactionReportRequestData.category) &&
        Objects.equals(this.accountName, transactionReportRequestData.accountName) &&
        Objects.equals(this.include, transactionReportRequestData.include) &&
        Objects.equals(this.exclude, transactionReportRequestData.exclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, externalProcessing, walletId, transactionType, fromDate, toDate, format, languageTag, category, accountName, include, exclude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionReportRequestData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    externalProcessing: ").append(toIndentedString(externalProcessing)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    languageTag: ").append(toIndentedString(languageTag)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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