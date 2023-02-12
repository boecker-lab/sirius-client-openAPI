# RubySirius::CompoundClasses

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **npc_pathway** | [**CompoundClass**](CompoundClass.md) |  | [optional] |
| **npc_superclass** | [**CompoundClass**](CompoundClass.md) |  | [optional] |
| **npc_class** | [**CompoundClass**](CompoundClass.md) |  | [optional] |
| **classy_fire_most_specific** | [**CompoundClass**](CompoundClass.md) |  | [optional] |
| **classy_fire_level5** | [**CompoundClass**](CompoundClass.md) |  | [optional] |
| **classy_fire_class** | [**CompoundClass**](CompoundClass.md) |  | [optional] |
| **classy_fire_sub_class** | [**CompoundClass**](CompoundClass.md) |  | [optional] |
| **classy_fire_super_class** | [**CompoundClass**](CompoundClass.md) |  | [optional] |

## Example

```ruby
require 'ruby_sirius'

instance = RubySirius::CompoundClasses.new(
  npc_pathway: null,
  npc_superclass: null,
  npc_class: null,
  classy_fire_most_specific: null,
  classy_fire_level5: null,
  classy_fire_class: null,
  classy_fire_sub_class: null,
  classy_fire_super_class: null
)
```

