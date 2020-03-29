package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse404
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-28T09:16:30.423Z[GMT]")
public class InlineResponse404   {
  @JsonProperty("path")
  private String path = null;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("status")
  private Integer status = null;

  public InlineResponse404 path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  
    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public InlineResponse404 error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  
    public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public InlineResponse404 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse404 timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  
    public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public InlineResponse404 status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse404 inlineResponse404 = (InlineResponse404) o;
    return Objects.equals(this.path, inlineResponse404.path) &&
        Objects.equals(this.error, inlineResponse404.error) &&
        Objects.equals(this.message, inlineResponse404.message) &&
        Objects.equals(this.timestamp, inlineResponse404.timestamp) &&
        Objects.equals(this.status, inlineResponse404.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, error, message, timestamp, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse404 {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
