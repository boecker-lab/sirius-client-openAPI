# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test VersionInfoControllerApi")

api_instance <- VersionInfoControllerApi$new()

test_that("GetVersionInfo", {
  # tests for GetVersionInfo
  # base path: http://localhost:8080
  # @return [character]

  resp <- api_instance$GetVersionInfo()
  
  expect_true(is.character(resp$sirius_version))
})
