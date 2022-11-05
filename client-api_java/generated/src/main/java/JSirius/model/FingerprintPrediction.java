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
 * User/developer friendly parameter subset for the CSI:FingerID Fingerprint tool
 */
@Schema(description = "User/developer friendly parameter subset for the CSI:FingerID Fingerprint tool")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-05T09:44:07.528897Z[Etc/UTC]")
public class FingerprintPrediction {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("useScoreThreshold")
  private Boolean useScoreThreshold = null;

  public FingerprintPrediction enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * tags whether the tool is enabled
   * @return enabled
  **/
  @Schema(description = "tags whether the tool is enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public FingerprintPrediction useScoreThreshold(Boolean useScoreThreshold) {
    this.useScoreThreshold = useScoreThreshold;
    return this;
  }

   /**
   * If true, an adaptive soft threshold will be applied to only compute Fingerprints for promising formula candidates  Enabling is highly recommended.
   * @return useScoreThreshold
  **/
  @Schema(description = "If true, an adaptive soft threshold will be applied to only compute Fingerprints for promising formula candidates  Enabling is highly recommended.")
  public Boolean isUseScoreThreshold() {
    return useScoreThreshold;
  }

  public void setUseScoreThreshold(Boolean useScoreThreshold) {
    this.useScoreThreshold = useScoreThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FingerprintPrediction fingerprintPrediction = (FingerprintPrediction) o;
    return Objects.equals(this.enabled, fingerprintPrediction.enabled) &&
        Objects.equals(this.useScoreThreshold, fingerprintPrediction.useScoreThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, useScoreThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FingerprintPrediction {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    useScoreThreshold: ").append(toIndentedString(useScoreThreshold)).append("\n");
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
