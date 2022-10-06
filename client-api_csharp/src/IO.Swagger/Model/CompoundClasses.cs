/* 
 * SIRIUS Nightsky API
 *
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// Container class that holds the best matching compound class for different levels of each ontology for a  certain compound/feature/predicted fingerprint.
    /// </summary>
    [DataContract]
        public partial class CompoundClasses :  IEquatable<CompoundClasses>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CompoundClasses" /> class.
        /// </summary>
        /// <param name="npcPathway">npcPathway.</param>
        /// <param name="npcSuperclass">npcSuperclass.</param>
        /// <param name="npcClass">npcClass.</param>
        /// <param name="classyFireMostSpecific">classyFireMostSpecific.</param>
        /// <param name="classyFireLevel5">classyFireLevel5.</param>
        /// <param name="classyFireClass">classyFireClass.</param>
        /// <param name="classyFireSubClass">classyFireSubClass.</param>
        /// <param name="classyFireSuperClass">classyFireSuperClass.</param>
        public CompoundClasses(CompoundClass npcPathway = default(CompoundClass), CompoundClass npcSuperclass = default(CompoundClass), CompoundClass npcClass = default(CompoundClass), CompoundClass classyFireMostSpecific = default(CompoundClass), CompoundClass classyFireLevel5 = default(CompoundClass), CompoundClass classyFireClass = default(CompoundClass), CompoundClass classyFireSubClass = default(CompoundClass), CompoundClass classyFireSuperClass = default(CompoundClass))
        {
            this.NpcPathway = npcPathway;
            this.NpcSuperclass = npcSuperclass;
            this.NpcClass = npcClass;
            this.ClassyFireMostSpecific = classyFireMostSpecific;
            this.ClassyFireLevel5 = classyFireLevel5;
            this.ClassyFireClass = classyFireClass;
            this.ClassyFireSubClass = classyFireSubClass;
            this.ClassyFireSuperClass = classyFireSuperClass;
        }
        
        /// <summary>
        /// Gets or Sets NpcPathway
        /// </summary>
        [DataMember(Name="npcPathway", EmitDefaultValue=false)]
        public CompoundClass NpcPathway { get; set; }

        /// <summary>
        /// Gets or Sets NpcSuperclass
        /// </summary>
        [DataMember(Name="npcSuperclass", EmitDefaultValue=false)]
        public CompoundClass NpcSuperclass { get; set; }

        /// <summary>
        /// Gets or Sets NpcClass
        /// </summary>
        [DataMember(Name="npcClass", EmitDefaultValue=false)]
        public CompoundClass NpcClass { get; set; }

        /// <summary>
        /// Gets or Sets ClassyFireMostSpecific
        /// </summary>
        [DataMember(Name="classyFireMostSpecific", EmitDefaultValue=false)]
        public CompoundClass ClassyFireMostSpecific { get; set; }

        /// <summary>
        /// Gets or Sets ClassyFireLevel5
        /// </summary>
        [DataMember(Name="classyFireLevel5", EmitDefaultValue=false)]
        public CompoundClass ClassyFireLevel5 { get; set; }

        /// <summary>
        /// Gets or Sets ClassyFireClass
        /// </summary>
        [DataMember(Name="classyFireClass", EmitDefaultValue=false)]
        public CompoundClass ClassyFireClass { get; set; }

        /// <summary>
        /// Gets or Sets ClassyFireSubClass
        /// </summary>
        [DataMember(Name="classyFireSubClass", EmitDefaultValue=false)]
        public CompoundClass ClassyFireSubClass { get; set; }

        /// <summary>
        /// Gets or Sets ClassyFireSuperClass
        /// </summary>
        [DataMember(Name="classyFireSuperClass", EmitDefaultValue=false)]
        public CompoundClass ClassyFireSuperClass { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CompoundClasses {\n");
            sb.Append("  NpcPathway: ").Append(NpcPathway).Append("\n");
            sb.Append("  NpcSuperclass: ").Append(NpcSuperclass).Append("\n");
            sb.Append("  NpcClass: ").Append(NpcClass).Append("\n");
            sb.Append("  ClassyFireMostSpecific: ").Append(ClassyFireMostSpecific).Append("\n");
            sb.Append("  ClassyFireLevel5: ").Append(ClassyFireLevel5).Append("\n");
            sb.Append("  ClassyFireClass: ").Append(ClassyFireClass).Append("\n");
            sb.Append("  ClassyFireSubClass: ").Append(ClassyFireSubClass).Append("\n");
            sb.Append("  ClassyFireSuperClass: ").Append(ClassyFireSuperClass).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as CompoundClasses);
        }

        /// <summary>
        /// Returns true if CompoundClasses instances are equal
        /// </summary>
        /// <param name="input">Instance of CompoundClasses to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CompoundClasses input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.NpcPathway == input.NpcPathway ||
                    (this.NpcPathway != null &&
                    this.NpcPathway.Equals(input.NpcPathway))
                ) && 
                (
                    this.NpcSuperclass == input.NpcSuperclass ||
                    (this.NpcSuperclass != null &&
                    this.NpcSuperclass.Equals(input.NpcSuperclass))
                ) && 
                (
                    this.NpcClass == input.NpcClass ||
                    (this.NpcClass != null &&
                    this.NpcClass.Equals(input.NpcClass))
                ) && 
                (
                    this.ClassyFireMostSpecific == input.ClassyFireMostSpecific ||
                    (this.ClassyFireMostSpecific != null &&
                    this.ClassyFireMostSpecific.Equals(input.ClassyFireMostSpecific))
                ) && 
                (
                    this.ClassyFireLevel5 == input.ClassyFireLevel5 ||
                    (this.ClassyFireLevel5 != null &&
                    this.ClassyFireLevel5.Equals(input.ClassyFireLevel5))
                ) && 
                (
                    this.ClassyFireClass == input.ClassyFireClass ||
                    (this.ClassyFireClass != null &&
                    this.ClassyFireClass.Equals(input.ClassyFireClass))
                ) && 
                (
                    this.ClassyFireSubClass == input.ClassyFireSubClass ||
                    (this.ClassyFireSubClass != null &&
                    this.ClassyFireSubClass.Equals(input.ClassyFireSubClass))
                ) && 
                (
                    this.ClassyFireSuperClass == input.ClassyFireSuperClass ||
                    (this.ClassyFireSuperClass != null &&
                    this.ClassyFireSuperClass.Equals(input.ClassyFireSuperClass))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.NpcPathway != null)
                    hashCode = hashCode * 59 + this.NpcPathway.GetHashCode();
                if (this.NpcSuperclass != null)
                    hashCode = hashCode * 59 + this.NpcSuperclass.GetHashCode();
                if (this.NpcClass != null)
                    hashCode = hashCode * 59 + this.NpcClass.GetHashCode();
                if (this.ClassyFireMostSpecific != null)
                    hashCode = hashCode * 59 + this.ClassyFireMostSpecific.GetHashCode();
                if (this.ClassyFireLevel5 != null)
                    hashCode = hashCode * 59 + this.ClassyFireLevel5.GetHashCode();
                if (this.ClassyFireClass != null)
                    hashCode = hashCode * 59 + this.ClassyFireClass.GetHashCode();
                if (this.ClassyFireSubClass != null)
                    hashCode = hashCode * 59 + this.ClassyFireSubClass.GetHashCode();
                if (this.ClassyFireSuperClass != null)
                    hashCode = hashCode * 59 + this.ClassyFireSuperClass.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}