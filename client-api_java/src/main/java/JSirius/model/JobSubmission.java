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
import JSirius.model.Canopus;
import JSirius.model.FingerprintPrediction;
import JSirius.model.Sirius;
import JSirius.model.StructureDbSearch;
import JSirius.model.Zodiac;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Object to submit a job to be executed by SIRIUS
 */
@Schema(description = "Object to submit a job to be executed by SIRIUS")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-18T13:25:26.492361Z[Etc/UTC]")
public class JobSubmission {
  @SerializedName("compoundIds")
  private List<String> compoundIds = null;

  @SerializedName("fallbackAdducts")
  private List<String> fallbackAdducts = null;

  @SerializedName("enforcedAdducts")
  private List<String> enforcedAdducts = null;

  @SerializedName("detectableAdducts")
  private List<String> detectableAdducts = null;

  @SerializedName("recompute")
  private Boolean recompute = null;

  @SerializedName("formulaIdParas")
  private Sirius formulaIdParas = null;

  @SerializedName("zodiacParas")
  private Zodiac zodiacParas = null;

  @SerializedName("fingerprintPredictionParas")
  private FingerprintPrediction fingerprintPredictionParas = null;

  @SerializedName("structureDbSearchParas")
  private StructureDbSearch structureDbSearchParas = null;

  @SerializedName("canopusParas")
  private Canopus canopusParas = null;

  @SerializedName("configMap")
  private Map<String, String> configMap = null;

  public JobSubmission compoundIds(List<String> compoundIds) {
    this.compoundIds = compoundIds;
    return this;
  }

  public JobSubmission addCompoundIdsItem(String compoundIdsItem) {
    if (this.compoundIds == null) {
      this.compoundIds = new ArrayList<String>();
    }
    this.compoundIds.add(compoundIdsItem);
    return this;
  }

   /**
   * Compounds that should be the input for this Job
   * @return compoundIds
  **/
  @Schema(description = "Compounds that should be the input for this Job")
  public List<String> getCompoundIds() {
    return compoundIds;
  }

  public void setCompoundIds(List<String> compoundIds) {
    this.compoundIds = compoundIds;
  }

  public JobSubmission fallbackAdducts(List<String> fallbackAdducts) {
    this.fallbackAdducts = fallbackAdducts;
    return this;
  }

  public JobSubmission addFallbackAdductsItem(String fallbackAdductsItem) {
    if (this.fallbackAdducts == null) {
      this.fallbackAdducts = new ArrayList<String>();
    }
    this.fallbackAdducts.add(fallbackAdductsItem);
    return this;
  }

   /**
   * Describes how to deal with Adducts: Fallback adducts are considered if the auto detection did not find any indication for an ion mode.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-
   * @return fallbackAdducts
  **/
  @Schema(description = "Describes how to deal with Adducts: Fallback adducts are considered if the auto detection did not find any indication for an ion mode.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-")
  public List<String> getFallbackAdducts() {
    return fallbackAdducts;
  }

  public void setFallbackAdducts(List<String> fallbackAdducts) {
    this.fallbackAdducts = fallbackAdducts;
  }

  public JobSubmission enforcedAdducts(List<String> enforcedAdducts) {
    this.enforcedAdducts = enforcedAdducts;
    return this;
  }

  public JobSubmission addEnforcedAdductsItem(String enforcedAdductsItem) {
    if (this.enforcedAdducts == null) {
      this.enforcedAdducts = new ArrayList<String>();
    }
    this.enforcedAdducts.add(enforcedAdductsItem);
    return this;
  }

   /**
   * Describes how to deal with Adducts:  Enforced adducts that are always considered.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-
   * @return enforcedAdducts
  **/
  @Schema(description = "Describes how to deal with Adducts:  Enforced adducts that are always considered.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-")
  public List<String> getEnforcedAdducts() {
    return enforcedAdducts;
  }

  public void setEnforcedAdducts(List<String> enforcedAdducts) {
    this.enforcedAdducts = enforcedAdducts;
  }

  public JobSubmission detectableAdducts(List<String> detectableAdducts) {
    this.detectableAdducts = detectableAdducts;
    return this;
  }

  public JobSubmission addDetectableAdductsItem(String detectableAdductsItem) {
    if (this.detectableAdducts == null) {
      this.detectableAdducts = new ArrayList<String>();
    }
    this.detectableAdducts.add(detectableAdductsItem);
    return this;
  }

   /**
   * Describes how to deal with Adducts: Detectable adducts which are only considered if there is an indication in the MS1 scan (e.g. correct mass delta).  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-
   * @return detectableAdducts
  **/
  @Schema(description = "Describes how to deal with Adducts: Detectable adducts which are only considered if there is an indication in the MS1 scan (e.g. correct mass delta).  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-")
  public List<String> getDetectableAdducts() {
    return detectableAdducts;
  }

  public void setDetectableAdducts(List<String> detectableAdducts) {
    this.detectableAdducts = detectableAdducts;
  }

  public JobSubmission recompute(Boolean recompute) {
    this.recompute = recompute;
    return this;
  }

   /**
   * Indicate if already existing result for a tool to be executed should be overwritten or not.
   * @return recompute
  **/
  @Schema(description = "Indicate if already existing result for a tool to be executed should be overwritten or not.")
  public Boolean isRecompute() {
    return recompute;
  }

  public void setRecompute(Boolean recompute) {
    this.recompute = recompute;
  }

  public JobSubmission formulaIdParas(Sirius formulaIdParas) {
    this.formulaIdParas = formulaIdParas;
    return this;
  }

   /**
   * Get formulaIdParas
   * @return formulaIdParas
  **/
  @Schema(description = "")
  public Sirius getFormulaIdParas() {
    return formulaIdParas;
  }

  public void setFormulaIdParas(Sirius formulaIdParas) {
    this.formulaIdParas = formulaIdParas;
  }

  public JobSubmission zodiacParas(Zodiac zodiacParas) {
    this.zodiacParas = zodiacParas;
    return this;
  }

   /**
   * Get zodiacParas
   * @return zodiacParas
  **/
  @Schema(description = "")
  public Zodiac getZodiacParas() {
    return zodiacParas;
  }

  public void setZodiacParas(Zodiac zodiacParas) {
    this.zodiacParas = zodiacParas;
  }

  public JobSubmission fingerprintPredictionParas(FingerprintPrediction fingerprintPredictionParas) {
    this.fingerprintPredictionParas = fingerprintPredictionParas;
    return this;
  }

   /**
   * Get fingerprintPredictionParas
   * @return fingerprintPredictionParas
  **/
  @Schema(description = "")
  public FingerprintPrediction getFingerprintPredictionParas() {
    return fingerprintPredictionParas;
  }

  public void setFingerprintPredictionParas(FingerprintPrediction fingerprintPredictionParas) {
    this.fingerprintPredictionParas = fingerprintPredictionParas;
  }

  public JobSubmission structureDbSearchParas(StructureDbSearch structureDbSearchParas) {
    this.structureDbSearchParas = structureDbSearchParas;
    return this;
  }

   /**
   * Get structureDbSearchParas
   * @return structureDbSearchParas
  **/
  @Schema(description = "")
  public StructureDbSearch getStructureDbSearchParas() {
    return structureDbSearchParas;
  }

  public void setStructureDbSearchParas(StructureDbSearch structureDbSearchParas) {
    this.structureDbSearchParas = structureDbSearchParas;
  }

  public JobSubmission canopusParas(Canopus canopusParas) {
    this.canopusParas = canopusParas;
    return this;
  }

   /**
   * Get canopusParas
   * @return canopusParas
  **/
  @Schema(description = "")
  public Canopus getCanopusParas() {
    return canopusParas;
  }

  public void setCanopusParas(Canopus canopusParas) {
    this.canopusParas = canopusParas;
  }

  public JobSubmission configMap(Map<String, String> configMap) {
    this.configMap = configMap;
    return this;
  }

  public JobSubmission putConfigMapItem(String key, String configMapItem) {
    if (this.configMap == null) {
      this.configMap = new HashMap<String, String>();
    }
    this.configMap.put(key, configMapItem);
    return this;
  }

   /**
   * As an alternative to the object based parameters, this map allows to store key value pairs  of ALL SIRIUS parameters. All possible parameters can be retrieved from SIRIUS via the respective endpoint.
   * @return configMap
  **/
  @Schema(description = "As an alternative to the object based parameters, this map allows to store key value pairs  of ALL SIRIUS parameters. All possible parameters can be retrieved from SIRIUS via the respective endpoint.")
  public Map<String, String> getConfigMap() {
    return configMap;
  }

  public void setConfigMap(Map<String, String> configMap) {
    this.configMap = configMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobSubmission jobSubmission = (JobSubmission) o;
    return Objects.equals(this.compoundIds, jobSubmission.compoundIds) &&
        Objects.equals(this.fallbackAdducts, jobSubmission.fallbackAdducts) &&
        Objects.equals(this.enforcedAdducts, jobSubmission.enforcedAdducts) &&
        Objects.equals(this.detectableAdducts, jobSubmission.detectableAdducts) &&
        Objects.equals(this.recompute, jobSubmission.recompute) &&
        Objects.equals(this.formulaIdParas, jobSubmission.formulaIdParas) &&
        Objects.equals(this.zodiacParas, jobSubmission.zodiacParas) &&
        Objects.equals(this.fingerprintPredictionParas, jobSubmission.fingerprintPredictionParas) &&
        Objects.equals(this.structureDbSearchParas, jobSubmission.structureDbSearchParas) &&
        Objects.equals(this.canopusParas, jobSubmission.canopusParas) &&
        Objects.equals(this.configMap, jobSubmission.configMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compoundIds, fallbackAdducts, enforcedAdducts, detectableAdducts, recompute, formulaIdParas, zodiacParas, fingerprintPredictionParas, structureDbSearchParas, canopusParas, configMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobSubmission {\n");
    
    sb.append("    compoundIds: ").append(toIndentedString(compoundIds)).append("\n");
    sb.append("    fallbackAdducts: ").append(toIndentedString(fallbackAdducts)).append("\n");
    sb.append("    enforcedAdducts: ").append(toIndentedString(enforcedAdducts)).append("\n");
    sb.append("    detectableAdducts: ").append(toIndentedString(detectableAdducts)).append("\n");
    sb.append("    recompute: ").append(toIndentedString(recompute)).append("\n");
    sb.append("    formulaIdParas: ").append(toIndentedString(formulaIdParas)).append("\n");
    sb.append("    zodiacParas: ").append(toIndentedString(zodiacParas)).append("\n");
    sb.append("    fingerprintPredictionParas: ").append(toIndentedString(fingerprintPredictionParas)).append("\n");
    sb.append("    structureDbSearchParas: ").append(toIndentedString(structureDbSearchParas)).append("\n");
    sb.append("    canopusParas: ").append(toIndentedString(canopusParas)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
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
