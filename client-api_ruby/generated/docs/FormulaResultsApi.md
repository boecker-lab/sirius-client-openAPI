# RubySirius::FormulaResultsApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_best_matching_canopus_predictions**](FormulaResultsApi.md#get_best_matching_canopus_predictions) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/best-canopus-predictions | Best matching compound classes,  Set of the highest scoring compound classes CANOPUS) on each hierarchy level of  the ClassyFire and NPC ontology, |
| [**get_canopus_predictions**](FormulaResultsApi.md#get_canopus_predictions) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/canopus-predictions | All predicted compound classes (CANOPUS) from ClassyFire and NPC and their probabilities, |
| [**get_fingerprint_prediction**](FormulaResultsApi.md#get_fingerprint_prediction) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/fingerprint | Returns predicted fingerprint (CSI:FingerID) for the given formula result identifier  This fingerprint is used to perfom structure database search and predict compound classes. |
| [**get_formula_ids**](FormulaResultsApi.md#get_formula_ids) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas | List of all FormulaResultContainers available for this compound/feature with minimal information. |
| [**get_formula_result**](FormulaResultsApi.md#get_formula_result) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId} | FormulaResultContainers for the given &#39;formulaId&#39; with minimal information. |
| [**get_frag_tree**](FormulaResultsApi.md#get_frag_tree) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/tree | Returns fragmentation tree (SIRIUS) for the given formula result identifier  This tree is used to rank formula candidates (treeScore). |
| [**get_simulated_isotope_pattern**](FormulaResultsApi.md#get_simulated_isotope_pattern) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/isotope-pattern | Returns simulated isotope pattern (SIRIUS) for the given formula result identifier. |
| [**get_structure_candidates**](FormulaResultsApi.md#get_structure_candidates) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/structures | List of StructureCandidates the given &#39;formulaId&#39; with minimal information. |
| [**get_top_structure_candidate**](FormulaResultsApi.md#get_top_structure_candidate) | **GET** /api/projects/{projectId}/compounds/{compoundId}/top-structure | Best Scoring StructureCandidate over all molecular formular resutls that belong to the specified  compound/feature (compoundId). |


## get_best_matching_canopus_predictions

> <CompoundClasses> get_best_matching_canopus_predictions(project_id, compound_id, formula_id)

Best matching compound classes,  Set of the highest scoring compound classes CANOPUS) on each hierarchy level of  the ClassyFire and NPC ontology,

Best matching compound classes,  Set of the highest scoring compound classes CANOPUS) on each hierarchy level of  the ClassyFire and NPC ontology,

### Examples

```ruby
require 'time'
require 'ruby_sirius'

api_instance = RubySirius::FormulaResultsApi.new
project_id = 'project_id_example' # String | project-space to read from.
compound_id = 'compound_id_example' # String | compound/feature the formula result belongs to.
formula_id = 'formula_id_example' # String | identifier of the requested formula result

begin
  # Best matching compound classes,  Set of the highest scoring compound classes CANOPUS) on each hierarchy level of  the ClassyFire and NPC ontology,
  result = api_instance.get_best_matching_canopus_predictions(project_id, compound_id, formula_id)
  p result
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_best_matching_canopus_predictions: #{e}"
end
```

#### Using the get_best_matching_canopus_predictions_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CompoundClasses>, Integer, Hash)> get_best_matching_canopus_predictions_with_http_info(project_id, compound_id, formula_id)

```ruby
begin
  # Best matching compound classes,  Set of the highest scoring compound classes CANOPUS) on each hierarchy level of  the ClassyFire and NPC ontology,
  data, status_code, headers = api_instance.get_best_matching_canopus_predictions_with_http_info(project_id, compound_id, formula_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CompoundClasses>
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_best_matching_canopus_predictions_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | project-space to read from. |  |
| **compound_id** | **String** | compound/feature the formula result belongs to. |  |
| **formula_id** | **String** | identifier of the requested formula result |  |

### Return type

[**CompoundClasses**](CompoundClasses.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_canopus_predictions

> <CanopusPredictions> get_canopus_predictions(project_id, compound_id, formula_id)

All predicted compound classes (CANOPUS) from ClassyFire and NPC and their probabilities,

All predicted compound classes (CANOPUS) from ClassyFire and NPC and their probabilities,

### Examples

```ruby
require 'time'
require 'ruby_sirius'

api_instance = RubySirius::FormulaResultsApi.new
project_id = 'project_id_example' # String | project-space to read from.
compound_id = 'compound_id_example' # String | compound/feature the formula result belongs to.
formula_id = 'formula_id_example' # String | identifier of the requested formula result

begin
  # All predicted compound classes (CANOPUS) from ClassyFire and NPC and their probabilities,
  result = api_instance.get_canopus_predictions(project_id, compound_id, formula_id)
  p result
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_canopus_predictions: #{e}"
end
```

#### Using the get_canopus_predictions_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CanopusPredictions>, Integer, Hash)> get_canopus_predictions_with_http_info(project_id, compound_id, formula_id)

```ruby
begin
  # All predicted compound classes (CANOPUS) from ClassyFire and NPC and their probabilities,
  data, status_code, headers = api_instance.get_canopus_predictions_with_http_info(project_id, compound_id, formula_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CanopusPredictions>
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_canopus_predictions_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | project-space to read from. |  |
| **compound_id** | **String** | compound/feature the formula result belongs to. |  |
| **formula_id** | **String** | identifier of the requested formula result |  |

### Return type

[**CanopusPredictions**](CanopusPredictions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_fingerprint_prediction

> Array&lt;Float&gt; get_fingerprint_prediction(project_id, compound_id, formula_id)

Returns predicted fingerprint (CSI:FingerID) for the given formula result identifier  This fingerprint is used to perfom structure database search and predict compound classes.

Returns predicted fingerprint (CSI:FingerID) for the given formula result identifier  This fingerprint is used to perfom structure database search and predict compound classes.

### Examples

```ruby
require 'time'
require 'ruby_sirius'

api_instance = RubySirius::FormulaResultsApi.new
project_id = 'project_id_example' # String | project-space to read from.
compound_id = 'compound_id_example' # String | compound/feature the formula result belongs to.
formula_id = 'formula_id_example' # String | identifier of the requested formula result

begin
  # Returns predicted fingerprint (CSI:FingerID) for the given formula result identifier  This fingerprint is used to perfom structure database search and predict compound classes.
  result = api_instance.get_fingerprint_prediction(project_id, compound_id, formula_id)
  p result
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_fingerprint_prediction: #{e}"
end
```

#### Using the get_fingerprint_prediction_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;Float&gt;, Integer, Hash)> get_fingerprint_prediction_with_http_info(project_id, compound_id, formula_id)

```ruby
begin
  # Returns predicted fingerprint (CSI:FingerID) for the given formula result identifier  This fingerprint is used to perfom structure database search and predict compound classes.
  data, status_code, headers = api_instance.get_fingerprint_prediction_with_http_info(project_id, compound_id, formula_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;Float&gt;
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_fingerprint_prediction_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | project-space to read from. |  |
| **compound_id** | **String** | compound/feature the formula result belongs to. |  |
| **formula_id** | **String** | identifier of the requested formula result |  |

### Return type

**Array&lt;Float&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_formula_ids

> <Array<FormulaResultContainer>> get_formula_ids(project_id, compound_id, opts)

List of all FormulaResultContainers available for this compound/feature with minimal information.

List of all FormulaResultContainers available for this compound/feature with minimal information.  Can be enriched with an optional results overview.

### Examples

```ruby
require 'time'
require 'ruby_sirius'

api_instance = RubySirius::FormulaResultsApi.new
project_id = 'project_id_example' # String | project-space to read from.
compound_id = 'compound_id_example' # String | compound/feature the formula result belongs to.
opts = {
  result_overview: true, # Boolean | add ResultOverview to the FormulaResultContainers
  formula_candidate: true # Boolean | add extended formula candidate information to the FormulaResultContainers
}

begin
  # List of all FormulaResultContainers available for this compound/feature with minimal information.
  result = api_instance.get_formula_ids(project_id, compound_id, opts)
  p result
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_formula_ids: #{e}"
end
```

#### Using the get_formula_ids_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<FormulaResultContainer>>, Integer, Hash)> get_formula_ids_with_http_info(project_id, compound_id, opts)

```ruby
begin
  # List of all FormulaResultContainers available for this compound/feature with minimal information.
  data, status_code, headers = api_instance.get_formula_ids_with_http_info(project_id, compound_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<FormulaResultContainer>>
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_formula_ids_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | project-space to read from. |  |
| **compound_id** | **String** | compound/feature the formula result belongs to. |  |
| **result_overview** | **Boolean** | add ResultOverview to the FormulaResultContainers | [optional][default to true] |
| **formula_candidate** | **Boolean** | add extended formula candidate information to the FormulaResultContainers | [optional][default to false] |

### Return type

[**Array&lt;FormulaResultContainer&gt;**](FormulaResultContainer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_formula_result

> <FormulaResultContainer> get_formula_result(project_id, compound_id, formula_id, opts)

FormulaResultContainers for the given 'formulaId' with minimal information.

FormulaResultContainers for the given 'formulaId' with minimal information.  Can be enriched with an optional results overview and formula candidate information.

### Examples

```ruby
require 'time'
require 'ruby_sirius'

api_instance = RubySirius::FormulaResultsApi.new
project_id = 'project_id_example' # String | project-space to read from.
compound_id = 'compound_id_example' # String | compound/feature the formula result belongs to.
formula_id = 'formula_id_example' # String | identifier of the requested formula result
opts = {
  result_overview: true, # Boolean | add ResultOverview to the FormulaResultContainer
  formula_candidate: true # Boolean | add extended formula candidate information to the FormulaResultContainer
}

begin
  # FormulaResultContainers for the given 'formulaId' with minimal information.
  result = api_instance.get_formula_result(project_id, compound_id, formula_id, opts)
  p result
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_formula_result: #{e}"
end
```

#### Using the get_formula_result_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FormulaResultContainer>, Integer, Hash)> get_formula_result_with_http_info(project_id, compound_id, formula_id, opts)

```ruby
begin
  # FormulaResultContainers for the given 'formulaId' with minimal information.
  data, status_code, headers = api_instance.get_formula_result_with_http_info(project_id, compound_id, formula_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FormulaResultContainer>
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_formula_result_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | project-space to read from. |  |
| **compound_id** | **String** | compound/feature the formula result belongs to. |  |
| **formula_id** | **String** | identifier of the requested formula result |  |
| **result_overview** | **Boolean** | add ResultOverview to the FormulaResultContainer | [optional][default to true] |
| **formula_candidate** | **Boolean** | add extended formula candidate information to the FormulaResultContainer | [optional][default to true] |

### Return type

[**FormulaResultContainer**](FormulaResultContainer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_frag_tree

> <FragmentationTree> get_frag_tree(project_id, compound_id, formula_id)

Returns fragmentation tree (SIRIUS) for the given formula result identifier  This tree is used to rank formula candidates (treeScore).

Returns fragmentation tree (SIRIUS) for the given formula result identifier  This tree is used to rank formula candidates (treeScore).

### Examples

```ruby
require 'time'
require 'ruby_sirius'

api_instance = RubySirius::FormulaResultsApi.new
project_id = 'project_id_example' # String | project-space to read from.
compound_id = 'compound_id_example' # String | compound/feature the formula result belongs to.
formula_id = 'formula_id_example' # String | identifier of the requested formula result

begin
  # Returns fragmentation tree (SIRIUS) for the given formula result identifier  This tree is used to rank formula candidates (treeScore).
  result = api_instance.get_frag_tree(project_id, compound_id, formula_id)
  p result
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_frag_tree: #{e}"
end
```

#### Using the get_frag_tree_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FragmentationTree>, Integer, Hash)> get_frag_tree_with_http_info(project_id, compound_id, formula_id)

```ruby
begin
  # Returns fragmentation tree (SIRIUS) for the given formula result identifier  This tree is used to rank formula candidates (treeScore).
  data, status_code, headers = api_instance.get_frag_tree_with_http_info(project_id, compound_id, formula_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FragmentationTree>
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_frag_tree_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | project-space to read from. |  |
| **compound_id** | **String** | compound/feature the formula result belongs to. |  |
| **formula_id** | **String** | identifier of the requested formula result |  |

### Return type

[**FragmentationTree**](FragmentationTree.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_simulated_isotope_pattern

> <AnnotatedSpectrum> get_simulated_isotope_pattern(project_id, compound_id, formula_id)

Returns simulated isotope pattern (SIRIUS) for the given formula result identifier.

Returns simulated isotope pattern (SIRIUS) for the given formula result identifier.  This simulated isotope pattern is used to rank formula candidates (treeScore).

### Examples

```ruby
require 'time'
require 'ruby_sirius'

api_instance = RubySirius::FormulaResultsApi.new
project_id = 'project_id_example' # String | project-space to read from.
compound_id = 'compound_id_example' # String | compound/feature the formula result belongs to.
formula_id = 'formula_id_example' # String | identifier of the requested formula result

begin
  # Returns simulated isotope pattern (SIRIUS) for the given formula result identifier.
  result = api_instance.get_simulated_isotope_pattern(project_id, compound_id, formula_id)
  p result
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_simulated_isotope_pattern: #{e}"
end
```

#### Using the get_simulated_isotope_pattern_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AnnotatedSpectrum>, Integer, Hash)> get_simulated_isotope_pattern_with_http_info(project_id, compound_id, formula_id)

```ruby
begin
  # Returns simulated isotope pattern (SIRIUS) for the given formula result identifier.
  data, status_code, headers = api_instance.get_simulated_isotope_pattern_with_http_info(project_id, compound_id, formula_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AnnotatedSpectrum>
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_simulated_isotope_pattern_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | project-space to read from. |  |
| **compound_id** | **String** | compound/feature the formula result belongs to. |  |
| **formula_id** | **String** | identifier of the requested formula result |  |

### Return type

[**AnnotatedSpectrum**](AnnotatedSpectrum.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_structure_candidates

> <Array<StructureCandidate>> get_structure_candidates(project_id, compound_id, formula_id, opts)

List of StructureCandidates the given 'formulaId' with minimal information.

List of StructureCandidates the given 'formulaId' with minimal information.  StructureCandidates can be enriched with molecular fingerprint, structure database links and pubmed ids,

### Examples

```ruby
require 'time'
require 'ruby_sirius'

api_instance = RubySirius::FormulaResultsApi.new
project_id = 'project_id_example' # String | project-space to read from.
compound_id = 'compound_id_example' # String | compound/feature the formula result belongs to.
formula_id = 'formula_id_example' # String | identifier of the requested formula result
opts = {
  fingerprint: true, # Boolean | add molecular fingerprint to StructureCandidates
  db_links: true, # Boolean | add dbLinks to StructureCandidates
  pub_med_ids: true, # Boolean | add PubMedIds (citation count) to StructureCandidates
  top_k: 56 # Integer | retrieve only the top k StructureCandidates
}

begin
  # List of StructureCandidates the given 'formulaId' with minimal information.
  result = api_instance.get_structure_candidates(project_id, compound_id, formula_id, opts)
  p result
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_structure_candidates: #{e}"
end
```

#### Using the get_structure_candidates_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<StructureCandidate>>, Integer, Hash)> get_structure_candidates_with_http_info(project_id, compound_id, formula_id, opts)

```ruby
begin
  # List of StructureCandidates the given 'formulaId' with minimal information.
  data, status_code, headers = api_instance.get_structure_candidates_with_http_info(project_id, compound_id, formula_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<StructureCandidate>>
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_structure_candidates_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | project-space to read from. |  |
| **compound_id** | **String** | compound/feature the formula result belongs to. |  |
| **formula_id** | **String** | identifier of the requested formula result |  |
| **fingerprint** | **Boolean** | add molecular fingerprint to StructureCandidates | [optional][default to false] |
| **db_links** | **Boolean** | add dbLinks to StructureCandidates | [optional][default to false] |
| **pub_med_ids** | **Boolean** | add PubMedIds (citation count) to StructureCandidates | [optional][default to false] |
| **top_k** | **Integer** | retrieve only the top k StructureCandidates | [optional][default to -1] |

### Return type

[**Array&lt;StructureCandidate&gt;**](StructureCandidate.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_top_structure_candidate

> <StructureCandidate> get_top_structure_candidate(project_id, compound_id, opts)

Best Scoring StructureCandidate over all molecular formular resutls that belong to the specified  compound/feature (compoundId).

Best Scoring StructureCandidate over all molecular formular resutls that belong to the specified  compound/feature (compoundId).

### Examples

```ruby
require 'time'
require 'ruby_sirius'

api_instance = RubySirius::FormulaResultsApi.new
project_id = 'project_id_example' # String | project-space to read from.
compound_id = 'compound_id_example' # String | compound/feature the formula result belongs to.
opts = {
  fingerprint: true, # Boolean | add molecular fingerprint to StructureCandidates
  db_links: true, # Boolean | add dbLinks to StructureCandidates
  pub_med_ids: true # Boolean | add PubMedIds (citation count) to StructureCandidates
}

begin
  # Best Scoring StructureCandidate over all molecular formular resutls that belong to the specified  compound/feature (compoundId).
  result = api_instance.get_top_structure_candidate(project_id, compound_id, opts)
  p result
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_top_structure_candidate: #{e}"
end
```

#### Using the get_top_structure_candidate_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<StructureCandidate>, Integer, Hash)> get_top_structure_candidate_with_http_info(project_id, compound_id, opts)

```ruby
begin
  # Best Scoring StructureCandidate over all molecular formular resutls that belong to the specified  compound/feature (compoundId).
  data, status_code, headers = api_instance.get_top_structure_candidate_with_http_info(project_id, compound_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <StructureCandidate>
rescue RubySirius::ApiError => e
  puts "Error when calling FormulaResultsApi->get_top_structure_candidate_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **project_id** | **String** | project-space to read from. |  |
| **compound_id** | **String** | compound/feature the formula result belongs to. |  |
| **fingerprint** | **Boolean** | add molecular fingerprint to StructureCandidates | [optional][default to false] |
| **db_links** | **Boolean** | add dbLinks to StructureCandidates | [optional][default to false] |
| **pub_med_ids** | **Boolean** | add PubMedIds (citation count) to StructureCandidates | [optional][default to false] |

### Return type

[**StructureCandidate**](StructureCandidate.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

