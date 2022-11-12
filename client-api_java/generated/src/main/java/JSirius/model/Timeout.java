/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
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
 * Timeout
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-12T13:36:36.846585Z[Etc/UTC]")
public class Timeout {
  @SerializedName("numberOfSecondsPerDecomposition")
  private Integer numberOfSecondsPerDecomposition = null;

  @SerializedName("numberOfSecondsPerInstance")
  private Integer numberOfSecondsPerInstance = null;

  @SerializedName("identifier")
  private String identifier = null;

  public Timeout numberOfSecondsPerDecomposition(Integer numberOfSecondsPerDecomposition) {
    this.numberOfSecondsPerDecomposition = numberOfSecondsPerDecomposition;
    return this;
  }

   /**
   * Get numberOfSecondsPerDecomposition
   * @return numberOfSecondsPerDecomposition
  **/
  @Schema(description = "")
  public Integer getNumberOfSecondsPerDecomposition() {
    return numberOfSecondsPerDecomposition;
  }

  public void setNumberOfSecondsPerDecomposition(Integer numberOfSecondsPerDecomposition) {
    this.numberOfSecondsPerDecomposition = numberOfSecondsPerDecomposition;
  }

  public Timeout numberOfSecondsPerInstance(Integer numberOfSecondsPerInstance) {
    this.numberOfSecondsPerInstance = numberOfSecondsPerInstance;
    return this;
  }

   /**
   * Get numberOfSecondsPerInstance
   * @return numberOfSecondsPerInstance
  **/
  @Schema(description = "")
  public Integer getNumberOfSecondsPerInstance() {
    return numberOfSecondsPerInstance;
  }

  public void setNumberOfSecondsPerInstance(Integer numberOfSecondsPerInstance) {
    this.numberOfSecondsPerInstance = numberOfSecondsPerInstance;
  }

  public Timeout identifier(String identifier) {
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
    Timeout timeout = (Timeout) o;
    return Objects.equals(this.numberOfSecondsPerDecomposition, timeout.numberOfSecondsPerDecomposition) &&
        Objects.equals(this.numberOfSecondsPerInstance, timeout.numberOfSecondsPerInstance) &&
        Objects.equals(this.identifier, timeout.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfSecondsPerDecomposition, numberOfSecondsPerInstance, identifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timeout {\n");
    
    sb.append("    numberOfSecondsPerDecomposition: ").append(toIndentedString(numberOfSecondsPerDecomposition)).append("\n");
    sb.append("    numberOfSecondsPerInstance: ").append(toIndentedString(numberOfSecondsPerInstance)).append("\n");
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
