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
 * Body1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-28T09:16:30.423Z[GMT]")
public class Body1   {
  @JsonProperty("framework")
  private String framework = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("id")
  private String id = null;

  public Body1 framework(String framework) {
    this.framework = framework;
    return this;
  }

  /**
   * Get framework
   * @return framework
  **/
  @ApiModelProperty(value = "")
  
    public String getFramework() {
    return framework;
  }

  public void setFramework(String framework) {
    this.framework = framework;
  }

  public Body1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Body1 language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")
  
    public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Body1 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body1 body1 = (Body1) o;
    return Objects.equals(this.framework, body1.framework) &&
        Objects.equals(this.name, body1.name) &&
        Objects.equals(this.language, body1.language) &&
        Objects.equals(this.id, body1.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(framework, name, language, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
