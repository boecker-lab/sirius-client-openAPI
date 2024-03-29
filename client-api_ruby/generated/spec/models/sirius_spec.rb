=begin
#SIRIUS Nightsky API

#REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.

OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.35
=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for RubySirius::Sirius
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'Sirius' do
  before do
    # run before each test
    @instance = RubySirius::Sirius.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of Sirius' do
    it 'should create an instance of Sirius' do
      expect(@instance).to be_instance_of(RubySirius::Sirius)
    end
  end
  describe 'test attribute "enabled"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "profile"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["QTOF", "ORBI", "FTICR"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.profile = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "number_of_candidates"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "number_of_candidates_per_ion"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "mass_accuracy_ms2ppm"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "isotope_ms2_settings"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["IGNORE", "FILTER", "SCORE"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.isotope_ms2_settings = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "formula_search_d_bs"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('Array<String>', ["ALL", "ALL_BUT_INSILICO", "PUBCHEM", "MESH", "HMDB", "KNAPSACK", "CHEBI", "PUBMED", "BIO", "KEGG", "HSDB", "MACONDA", "METACYC", "GNPS", "ZINCBIO", "TRAIN", "UNDP", "YMDB", "PLANTCYC", "NORMAN", "ADDITIONAL", "SUPERNATURAL", "COCONUT", "PUBCHEMANNOTATIONBIO", "PUBCHEMANNOTATIONDRUG", "PUBCHEMANNOTATIONSAFETYANDTOXIC", "PUBCHEMANNOTATIONFOOD", "LIPID", "KEGGMINE", "ECOCYCMINE", "YMDBMINE"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.formula_search_d_bs = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "enforced_formula_constraints"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "fallback_formula_constraints"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "detectable_elements"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "ilp_timeout"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "use_heuristic"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
