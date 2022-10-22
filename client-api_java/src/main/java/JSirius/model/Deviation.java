/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package JSirius.model;

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
 * Deviation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-22T11:35:19.460716Z[Etc/UTC]")
public class Deviation {
  @SerializedName("ppm")
  private Double ppm = null;

  @SerializedName("absolute")
  private Double absolute = null;

  @SerializedName("identifier")
  private String identifier = null;

  public Deviation ppm(Double ppm) {
    this.ppm = ppm;
    return this;
  }

   /**
   * Get ppm
   * @return ppm
  **/
  @Schema(description = "")
  public Double getPpm() {
    return ppm;
  }

  public void setPpm(Double ppm) {
    this.ppm = ppm;
  }

  public Deviation absolute(Double absolute) {
    this.absolute = absolute;
    return this;
  }

   /**
   * Get absolute
   * @return absolute
  **/
  @Schema(description = "")
  public Double getAbsolute() {
    return absolute;
  }

  public void setAbsolute(Double absolute) {
    this.absolute = absolute;
  }

  public Deviation identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @Schema(description = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deviation deviation = (Deviation) o;
    return Objects.equals(this.ppm, deviation.ppm) &&
        Objects.equals(this.absolute, deviation.absolute) &&
        Objects.equals(this.identifier, deviation.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ppm, absolute, identifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deviation {\n");
    
    sb.append("    ppm: ").append(toIndentedString(ppm)).append("\n");
    sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
