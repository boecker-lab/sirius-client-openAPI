=begin
#SIRIUS Nightsky API

#REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.

OpenAPI spec version: v0.9 on SIRIUS 5.6.1

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.35
=end

require 'date'

module RubySirius
  # Object to submit a job to be executed by SIRIUS
  class JobSubmission
    # Compounds that should be the input for this Job
    attr_accessor :compound_ids

    # Describes how to deal with Adducts: Fallback adducts are considered if the auto detection did not find any indication for an ion mode.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-
    attr_accessor :fallback_adducts

    # Describes how to deal with Adducts:  Enforced adducts that are always considered.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-
    attr_accessor :enforced_adducts

    # Describes how to deal with Adducts: Detectable adducts which are only considered if there is an indication in the MS1 scan (e.g. correct mass delta).  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-
    attr_accessor :detectable_adducts

    # Indicate if already existing result for a tool to be executed should be overwritten or not.
    attr_accessor :recompute

    attr_accessor :formula_id_paras

    attr_accessor :zodiac_paras

    attr_accessor :fingerprint_prediction_paras

    attr_accessor :structure_db_search_paras

    attr_accessor :canopus_paras

    # As an alternative to the object based parameters, this map allows to store key value pairs  of ALL SIRIUS parameters. All possible parameters can be retrieved from SIRIUS via the respective endpoint.
    attr_accessor :config_map

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'compound_ids' => :'compoundIds',
        :'fallback_adducts' => :'fallbackAdducts',
        :'enforced_adducts' => :'enforcedAdducts',
        :'detectable_adducts' => :'detectableAdducts',
        :'recompute' => :'recompute',
        :'formula_id_paras' => :'formulaIdParas',
        :'zodiac_paras' => :'zodiacParas',
        :'fingerprint_prediction_paras' => :'fingerprintPredictionParas',
        :'structure_db_search_paras' => :'structureDbSearchParas',
        :'canopus_paras' => :'canopusParas',
        :'config_map' => :'configMap'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'compound_ids' => :'Object',
        :'fallback_adducts' => :'Object',
        :'enforced_adducts' => :'Object',
        :'detectable_adducts' => :'Object',
        :'recompute' => :'Object',
        :'formula_id_paras' => :'Object',
        :'zodiac_paras' => :'Object',
        :'fingerprint_prediction_paras' => :'Object',
        :'structure_db_search_paras' => :'Object',
        :'canopus_paras' => :'Object',
        :'config_map' => :'Object'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end
  
    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `RubySirius::JobSubmission` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `RubySirius::JobSubmission`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'compound_ids')
        if (value = attributes[:'compound_ids']).is_a?(Array)
          self.compound_ids = value
        end
      end

      if attributes.key?(:'fallback_adducts')
        if (value = attributes[:'fallback_adducts']).is_a?(Array)
          self.fallback_adducts = value
        end
      end

      if attributes.key?(:'enforced_adducts')
        if (value = attributes[:'enforced_adducts']).is_a?(Array)
          self.enforced_adducts = value
        end
      end

      if attributes.key?(:'detectable_adducts')
        if (value = attributes[:'detectable_adducts']).is_a?(Array)
          self.detectable_adducts = value
        end
      end

      if attributes.key?(:'recompute')
        self.recompute = attributes[:'recompute']
      end

      if attributes.key?(:'formula_id_paras')
        self.formula_id_paras = attributes[:'formula_id_paras']
      end

      if attributes.key?(:'zodiac_paras')
        self.zodiac_paras = attributes[:'zodiac_paras']
      end

      if attributes.key?(:'fingerprint_prediction_paras')
        self.fingerprint_prediction_paras = attributes[:'fingerprint_prediction_paras']
      end

      if attributes.key?(:'structure_db_search_paras')
        self.structure_db_search_paras = attributes[:'structure_db_search_paras']
      end

      if attributes.key?(:'canopus_paras')
        self.canopus_paras = attributes[:'canopus_paras']
      end

      if attributes.key?(:'config_map')
        if (value = attributes[:'config_map']).is_a?(Hash)
          self.config_map = value
        end
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          compound_ids == o.compound_ids &&
          fallback_adducts == o.fallback_adducts &&
          enforced_adducts == o.enforced_adducts &&
          detectable_adducts == o.detectable_adducts &&
          recompute == o.recompute &&
          formula_id_paras == o.formula_id_paras &&
          zodiac_paras == o.zodiac_paras &&
          fingerprint_prediction_paras == o.fingerprint_prediction_paras &&
          structure_db_search_paras == o.structure_db_search_paras &&
          canopus_paras == o.canopus_paras &&
          config_map == o.config_map
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [compound_ids, fallback_adducts, enforced_adducts, detectable_adducts, recompute, formula_id_paras, zodiac_paras, fingerprint_prediction_paras, structure_db_search_paras, canopus_paras, config_map].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        elsif attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        RubySirius.const_get(type).build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end  end
end
