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
    /// AnnotatedPeak
    /// </summary>
    [DataContract]
        public partial class AnnotatedPeak :  IEquatable<AnnotatedPeak>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AnnotatedPeak" /> class.
        /// </summary>
        /// <param name="mass">mass.</param>
        /// <param name="intensity">intensity.</param>
        /// <param name="peakAnnotation">peakAnnotation.</param>
        public AnnotatedPeak(double? mass = default(double?), double? intensity = default(double?), PeakAnnotation peakAnnotation = default(PeakAnnotation))
        {
            this.Mass = mass;
            this.Intensity = intensity;
            this.PeakAnnotation = peakAnnotation;
        }
        
        /// <summary>
        /// Gets or Sets Mass
        /// </summary>
        [DataMember(Name="mass", EmitDefaultValue=false)]
        public double? Mass { get; set; }

        /// <summary>
        /// Gets or Sets Intensity
        /// </summary>
        [DataMember(Name="intensity", EmitDefaultValue=false)]
        public double? Intensity { get; set; }

        /// <summary>
        /// Gets or Sets PeakAnnotation
        /// </summary>
        [DataMember(Name="peakAnnotation", EmitDefaultValue=false)]
        public PeakAnnotation PeakAnnotation { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AnnotatedPeak {\n");
            sb.Append("  Mass: ").Append(Mass).Append("\n");
            sb.Append("  Intensity: ").Append(Intensity).Append("\n");
            sb.Append("  PeakAnnotation: ").Append(PeakAnnotation).Append("\n");
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
            return this.Equals(input as AnnotatedPeak);
        }

        /// <summary>
        /// Returns true if AnnotatedPeak instances are equal
        /// </summary>
        /// <param name="input">Instance of AnnotatedPeak to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AnnotatedPeak input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Mass == input.Mass ||
                    (this.Mass != null &&
                    this.Mass.Equals(input.Mass))
                ) && 
                (
                    this.Intensity == input.Intensity ||
                    (this.Intensity != null &&
                    this.Intensity.Equals(input.Intensity))
                ) && 
                (
                    this.PeakAnnotation == input.PeakAnnotation ||
                    (this.PeakAnnotation != null &&
                    this.PeakAnnotation.Equals(input.PeakAnnotation))
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
                if (this.Mass != null)
                    hashCode = hashCode * 59 + this.Mass.GetHashCode();
                if (this.Intensity != null)
                    hashCode = hashCode * 59 + this.Intensity.GetHashCode();
                if (this.PeakAnnotation != null)
                    hashCode = hashCode * 59 + this.PeakAnnotation.GetHashCode();
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