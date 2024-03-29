# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test CompoundId")

model_instance <- CompoundId$new()

test_that("id", {
  # tests for the property `id` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("index", {
  # tests for the property `index` (integer)

  # uncomment below to test the property
  #expect_equal(model.instance$`index`, "EXPECTED_RESULT")
})

test_that("ionMass", {
  # tests for the property `ionMass` (numeric)

  # uncomment below to test the property
  #expect_equal(model.instance$`ionMass`, "EXPECTED_RESULT")
})

test_that("ionType", {
  # tests for the property `ionType` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`ionType`, "EXPECTED_RESULT")
})

test_that("rtStartSeconds", {
  # tests for the property `rtStartSeconds` (numeric)

  # uncomment below to test the property
  #expect_equal(model.instance$`rtStartSeconds`, "EXPECTED_RESULT")
})

test_that("rtEndSeconds", {
  # tests for the property `rtEndSeconds` (numeric)

  # uncomment below to test the property
  #expect_equal(model.instance$`rtEndSeconds`, "EXPECTED_RESULT")
})

test_that("topAnnotation", {
  # tests for the property `topAnnotation` (CompoundAnnotation)

  # uncomment below to test the property
  #expect_equal(model.instance$`topAnnotation`, "EXPECTED_RESULT")
})

test_that("msData", {
  # tests for the property `msData` (MsData)

  # uncomment below to test the property
  #expect_equal(model.instance$`msData`, "EXPECTED_RESULT")
})

test_that("qualityFlags", {
  # tests for the property `qualityFlags` (array[character])
  # Contains all pre-computation quality information that belong to  this compound, such as information about the quality of the peak shape, MS2 spectrum etc.,  see ({@link CompoundQuality.CompoundQualityFlag CompoundQuality.CompoundQualityFlag})  &lt;p&gt;  Each Compound has a Set of Quality assessment flags.

  # uncomment below to test the property
  #expect_equal(model.instance$`qualityFlags`, "EXPECTED_RESULT")
})

test_that("computing", {
  # tests for the property `computing` (character)

  # uncomment below to test the property
  #expect_equal(model.instance$`computing`, "EXPECTED_RESULT")
})
