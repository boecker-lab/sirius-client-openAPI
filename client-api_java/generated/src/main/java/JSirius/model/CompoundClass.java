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
 * Predicted compound class with name, probability and id if available.  (ClassyFire and NPC). This can be seen as the set of classes a compound most likely belongs to
 */
@Schema(description = "Predicted compound class with name, probability and id if available.  (ClassyFire and NPC). This can be seen as the set of classes a compound most likely belongs to")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-05T09:48:22.769731Z[Etc/UTC]")
public class CompoundClass {
  /**
   * Specifies the classification ontology the CompoundClass belongs to.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CLASSYFIRE("ClassyFire"),
    NPC("NPC");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("probability")
  private Double probability = null;

  public CompoundClass type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Specifies the classification ontology the CompoundClass belongs to.
   * @return type
  **/
  @Schema(description = "Specifies the classification ontology the CompoundClass belongs to.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CompoundClass name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the compound class.
   * @return name
  **/
  @Schema(description = "Name of the compound class.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompoundClass description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the compound class.
   * @return description
  **/
  @Schema(description = "Description of the compound class.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CompoundClass id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Unique id of the class. Might be undefined for certain classification ontologies.
   * @return id
  **/
  @Schema(description = "Unique id of the class. Might be undefined for certain classification ontologies.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CompoundClass probability(Double probability) {
    this.probability = probability;
    return this;
  }

   /**
   * prediction probability
   * @return probability
  **/
  @Schema(description = "prediction probability")
  public Double getProbability() {
    return probability;
  }

  public void setProbability(Double probability) {
    this.probability = probability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompoundClass compoundClass = (CompoundClass) o;
    return Objects.equals(this.type, compoundClass.type) &&
        Objects.equals(this.name, compoundClass.name) &&
        Objects.equals(this.description, compoundClass.description) &&
        Objects.equals(this.id, compoundClass.id) &&
        Objects.equals(this.probability, compoundClass.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, description, id, probability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompoundClass {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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
