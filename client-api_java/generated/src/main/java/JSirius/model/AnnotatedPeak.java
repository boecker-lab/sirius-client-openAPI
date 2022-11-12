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
import JSirius.model.PeakAnnotation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AnnotatedPeak
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-12T13:36:36.846585Z[Etc/UTC]")
public class AnnotatedPeak {
  @SerializedName("mass")
  private Double mass = null;

  @SerializedName("intensity")
  private Double intensity = null;

  @SerializedName("peakAnnotation")
  private PeakAnnotation peakAnnotation = null;

  public AnnotatedPeak mass(Double mass) {
    this.mass = mass;
    return this;
  }

   /**
   * Get mass
   * @return mass
  **/
  @Schema(description = "")
  public Double getMass() {
    return mass;
  }

  public void setMass(Double mass) {
    this.mass = mass;
  }

  public AnnotatedPeak intensity(Double intensity) {
    this.intensity = intensity;
    return this;
  }

   /**
   * Get intensity
   * @return intensity
  **/
  @Schema(description = "")
  public Double getIntensity() {
    return intensity;
  }

  public void setIntensity(Double intensity) {
    this.intensity = intensity;
  }

  public AnnotatedPeak peakAnnotation(PeakAnnotation peakAnnotation) {
    this.peakAnnotation = peakAnnotation;
    return this;
  }

   /**
   * Get peakAnnotation
   * @return peakAnnotation
  **/
  @Schema(description = "")
  public PeakAnnotation getPeakAnnotation() {
    return peakAnnotation;
  }

  public void setPeakAnnotation(PeakAnnotation peakAnnotation) {
    this.peakAnnotation = peakAnnotation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedPeak annotatedPeak = (AnnotatedPeak) o;
    return Objects.equals(this.mass, annotatedPeak.mass) &&
        Objects.equals(this.intensity, annotatedPeak.intensity) &&
        Objects.equals(this.peakAnnotation, annotatedPeak.peakAnnotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mass, intensity, peakAnnotation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedPeak {\n");
    
    sb.append("    mass: ").append(toIndentedString(mass)).append("\n");
    sb.append("    intensity: ").append(toIndentedString(intensity)).append("\n");
    sb.append("    peakAnnotation: ").append(toIndentedString(peakAnnotation)).append("\n");
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
