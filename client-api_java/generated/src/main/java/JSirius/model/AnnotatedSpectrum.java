/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import JSirius.model.AnnotatedPeak;
import JSirius.model.CollisionEnergy;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AnnotatedSpectrum
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-30T12:20:21.851302Z[Etc/UTC]")
public class AnnotatedSpectrum {
  @SerializedName("msLevel")
  private Integer msLevel = null;

  @SerializedName("collisionEnergy")
  private CollisionEnergy collisionEnergy = null;

  @SerializedName("peaks")
  private List<AnnotatedPeak> peaks = null;

  public AnnotatedSpectrum msLevel(Integer msLevel) {
    this.msLevel = msLevel;
    return this;
  }

   /**
   * MS level of the measured spectrum.  Artificial spectra with no msLevel (e.g. Simulated Isotope patterns) use 0
   * @return msLevel
  **/
  @Schema(description = "MS level of the measured spectrum.  Artificial spectra with no msLevel (e.g. Simulated Isotope patterns) use 0")
  public Integer getMsLevel() {
    return msLevel;
  }

  public void setMsLevel(Integer msLevel) {
    this.msLevel = msLevel;
  }

  public AnnotatedSpectrum collisionEnergy(CollisionEnergy collisionEnergy) {
    this.collisionEnergy = collisionEnergy;
    return this;
  }

   /**
   * Get collisionEnergy
   * @return collisionEnergy
  **/
  @Schema(description = "")
  public CollisionEnergy getCollisionEnergy() {
    return collisionEnergy;
  }

  public void setCollisionEnergy(CollisionEnergy collisionEnergy) {
    this.collisionEnergy = collisionEnergy;
  }

  public AnnotatedSpectrum peaks(List<AnnotatedPeak> peaks) {
    this.peaks = peaks;
    return this;
  }

  public AnnotatedSpectrum addPeaksItem(AnnotatedPeak peaksItem) {
    if (this.peaks == null) {
      this.peaks = new ArrayList<AnnotatedPeak>();
    }
    this.peaks.add(peaksItem);
    return this;
  }

   /**
   * Get peaks
   * @return peaks
  **/
  @Schema(description = "")
  public List<AnnotatedPeak> getPeaks() {
    return peaks;
  }

  public void setPeaks(List<AnnotatedPeak> peaks) {
    this.peaks = peaks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedSpectrum annotatedSpectrum = (AnnotatedSpectrum) o;
    return Objects.equals(this.msLevel, annotatedSpectrum.msLevel) &&
        Objects.equals(this.collisionEnergy, annotatedSpectrum.collisionEnergy) &&
        Objects.equals(this.peaks, annotatedSpectrum.peaks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msLevel, collisionEnergy, peaks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedSpectrum {\n");
    
    sb.append("    msLevel: ").append(toIndentedString(msLevel)).append("\n");
    sb.append("    collisionEnergy: ").append(toIndentedString(collisionEnergy)).append("\n");
    sb.append("    peaks: ").append(toIndentedString(peaks)).append("\n");
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
