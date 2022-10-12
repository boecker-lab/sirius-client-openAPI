/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package JSirius.model;

import java.util.Objects;
import java.util.Arrays;
import JSirius.model.FragmentNode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LossEdge
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-10T15:31:49.516631200+02:00[Europe/Berlin]")
public class LossEdge {
  @SerializedName("sourceFragment")
  private FragmentNode sourceFragment = null;

  @SerializedName("targetFragment")
  private FragmentNode targetFragment = null;

  @SerializedName("molecularFormula")
  private String molecularFormula = null;

  @SerializedName("score")
  private Double score = null;

  public LossEdge sourceFragment(FragmentNode sourceFragment) {
    this.sourceFragment = sourceFragment;
    return this;
  }

   /**
   * Get sourceFragment
   * @return sourceFragment
  **/
  @Schema(description = "")
  public FragmentNode getSourceFragment() {
    return sourceFragment;
  }

  public void setSourceFragment(FragmentNode sourceFragment) {
    this.sourceFragment = sourceFragment;
  }

  public LossEdge targetFragment(FragmentNode targetFragment) {
    this.targetFragment = targetFragment;
    return this;
  }

   /**
   * Get targetFragment
   * @return targetFragment
  **/
  @Schema(description = "")
  public FragmentNode getTargetFragment() {
    return targetFragment;
  }

  public void setTargetFragment(FragmentNode targetFragment) {
    this.targetFragment = targetFragment;
  }

  public LossEdge molecularFormula(String molecularFormula) {
    this.molecularFormula = molecularFormula;
    return this;
  }

   /**
   * Get molecularFormula
   * @return molecularFormula
  **/
  @Schema(description = "")
  public String getMolecularFormula() {
    return molecularFormula;
  }

  public void setMolecularFormula(String molecularFormula) {
    this.molecularFormula = molecularFormula;
  }

  public LossEdge score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @Schema(description = "")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LossEdge lossEdge = (LossEdge) o;
    return Objects.equals(this.sourceFragment, lossEdge.sourceFragment) &&
        Objects.equals(this.targetFragment, lossEdge.targetFragment) &&
        Objects.equals(this.molecularFormula, lossEdge.molecularFormula) &&
        Objects.equals(this.score, lossEdge.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceFragment, targetFragment, molecularFormula, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LossEdge {\n");
    
    sb.append("    sourceFragment: ").append(toIndentedString(sourceFragment)).append("\n");
    sb.append("    targetFragment: ").append(toIndentedString(targetFragment)).append("\n");
    sb.append("    molecularFormula: ").append(toIndentedString(molecularFormula)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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