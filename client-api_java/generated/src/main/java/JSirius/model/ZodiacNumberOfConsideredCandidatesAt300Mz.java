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
 * ZodiacNumberOfConsideredCandidatesAt300Mz
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-13T13:06:27.895593Z[Etc/UTC]")
public class ZodiacNumberOfConsideredCandidatesAt300Mz {
  @SerializedName("value")
  private Integer value = null;

  @SerializedName("identifier")
  private String identifier = null;

  public ZodiacNumberOfConsideredCandidatesAt300Mz value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public ZodiacNumberOfConsideredCandidatesAt300Mz identifier(String identifier) {
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
    ZodiacNumberOfConsideredCandidatesAt300Mz zodiacNumberOfConsideredCandidatesAt300Mz = (ZodiacNumberOfConsideredCandidatesAt300Mz) o;
    return Objects.equals(this.value, zodiacNumberOfConsideredCandidatesAt300Mz.value) &&
        Objects.equals(this.identifier, zodiacNumberOfConsideredCandidatesAt300Mz.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, identifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZodiacNumberOfConsideredCandidatesAt300Mz {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
