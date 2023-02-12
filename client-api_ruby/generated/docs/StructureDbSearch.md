# RubySirius::StructureDbSearch

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **enabled** | **Boolean** | tags whether the tool is enabled | [optional] |
| **structure_search_dbs** | **Array&lt;String&gt;** | Structure databases to search in | [optional] |
| **tag_lipids** | **Boolean** | Candidates matching the lipid class estimated by El Gordo will be tagged.  The lipid class will only be available if El Gordo predicts that the MS/MS is a lipid spectrum.  If this parameter is set to &#39;false&#39; El Gordo will still be executed and e.g. improve the fragmentation  tree, but the matching structure candidates will not be tagged if they match lipid class. | [optional] |

## Example

```ruby
require 'ruby_sirius'

instance = RubySirius::StructureDbSearch.new(
  enabled: null,
  structure_search_dbs: null,
  tag_lipids: null
)
```

