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
import JSirius.model.CompoundAnnotation;
import JSirius.model.MsData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The CompoundId contains the ID of a compound together with some read-only information that might be displayed in  some summary view.
 */
@Schema(description = "The CompoundId contains the ID of a compound together with some read-only information that might be displayed in  some summary view.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-05T09:27:16.217823Z[Etc/UTC]")
public class CompoundId {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("index")
  private Long index = null;

  @SerializedName("ionMass")
  private Double ionMass = null;

  @SerializedName("ionType")
  private String ionType = null;

  @SerializedName("rtStartSeconds")
  private Double rtStartSeconds = null;

  @SerializedName("rtEndSeconds")
  private Double rtEndSeconds = null;

  @SerializedName("topAnnotation")
  private CompoundAnnotation topAnnotation = null;

  @SerializedName("msData")
  private MsData msData = null;

  @SerializedName("computing")
  private Boolean computing = null;

  public CompoundId id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CompoundId name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompoundId index(Long index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @Schema(description = "")
  public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  public CompoundId ionMass(Double ionMass) {
    this.ionMass = ionMass;
    return this;
  }

   /**
   * Get ionMass
   * @return ionMass
  **/
  @Schema(description = "")
  public Double getIonMass() {
    return ionMass;
  }

  public void setIonMass(Double ionMass) {
    this.ionMass = ionMass;
  }

  public CompoundId ionType(String ionType) {
    this.ionType = ionType;
    return this;
  }

   /**
   * Get ionType
   * @return ionType
  **/
  @Schema(description = "")
  public String getIonType() {
    return ionType;
  }

  public void setIonType(String ionType) {
    this.ionType = ionType;
  }

  public CompoundId rtStartSeconds(Double rtStartSeconds) {
    this.rtStartSeconds = rtStartSeconds;
    return this;
  }

   /**
   * Get rtStartSeconds
   * @return rtStartSeconds
  **/
  @Schema(description = "")
  public Double getRtStartSeconds() {
    return rtStartSeconds;
  }

  public void setRtStartSeconds(Double rtStartSeconds) {
    this.rtStartSeconds = rtStartSeconds;
  }

  public CompoundId rtEndSeconds(Double rtEndSeconds) {
    this.rtEndSeconds = rtEndSeconds;
    return this;
  }

   /**
   * Get rtEndSeconds
   * @return rtEndSeconds
  **/
  @Schema(description = "")
  public Double getRtEndSeconds() {
    return rtEndSeconds;
  }

  public void setRtEndSeconds(Double rtEndSeconds) {
    this.rtEndSeconds = rtEndSeconds;
  }

  public CompoundId topAnnotation(CompoundAnnotation topAnnotation) {
    this.topAnnotation = topAnnotation;
    return this;
  }

   /**
   * Get topAnnotation
   * @return topAnnotation
  **/
  @Schema(description = "")
  public CompoundAnnotation getTopAnnotation() {
    return topAnnotation;
  }

  public void setTopAnnotation(CompoundAnnotation topAnnotation) {
    this.topAnnotation = topAnnotation;
  }

  public CompoundId msData(MsData msData) {
    this.msData = msData;
    return this;
  }

   /**
   * Get msData
   * @return msData
  **/
  @Schema(description = "")
  public MsData getMsData() {
    return msData;
  }

  public void setMsData(MsData msData) {
    this.msData = msData;
  }

  public CompoundId computing(Boolean computing) {
    this.computing = computing;
    return this;
  }

   /**
   * Get computing
   * @return computing
  **/
  @Schema(description = "")
  public Boolean isComputing() {
    return computing;
  }

  public void setComputing(Boolean computing) {
    this.computing = computing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompoundId compoundId = (CompoundId) o;
    return Objects.equals(this.id, compoundId.id) &&
        Objects.equals(this.name, compoundId.name) &&
        Objects.equals(this.index, compoundId.index) &&
        Objects.equals(this.ionMass, compoundId.ionMass) &&
        Objects.equals(this.ionType, compoundId.ionType) &&
        Objects.equals(this.rtStartSeconds, compoundId.rtStartSeconds) &&
        Objects.equals(this.rtEndSeconds, compoundId.rtEndSeconds) &&
        Objects.equals(this.topAnnotation, compoundId.topAnnotation) &&
        Objects.equals(this.msData, compoundId.msData) &&
        Objects.equals(this.computing, compoundId.computing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, index, ionMass, ionType, rtStartSeconds, rtEndSeconds, topAnnotation, msData, computing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompoundId {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    ionMass: ").append(toIndentedString(ionMass)).append("\n");
    sb.append("    ionType: ").append(toIndentedString(ionType)).append("\n");
    sb.append("    rtStartSeconds: ").append(toIndentedString(rtStartSeconds)).append("\n");
    sb.append("    rtEndSeconds: ").append(toIndentedString(rtEndSeconds)).append("\n");
    sb.append("    topAnnotation: ").append(toIndentedString(topAnnotation)).append("\n");
    sb.append("    msData: ").append(toIndentedString(msData)).append("\n");
    sb.append("    computing: ").append(toIndentedString(computing)).append("\n");
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
