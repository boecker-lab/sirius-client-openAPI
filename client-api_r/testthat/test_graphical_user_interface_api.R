# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test GraphicalUserInterfaceApi")

api_instance <- GraphicalUserInterfaceApi$new()

test_that("ApplyToGui", {
  # tests for ApplyToGui
  # base path: http://localhost:8080
  # Apply given changes to the running GUI instance.
  # Apply given changes to the running GUI instance.
  # @param project_id character of project-space the GUI instance is connected to.
  # @param gui_parameters GuiParameters parameters that should be applied.
  # @return [Void]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CloseGui", {
  # tests for CloseGui
  # base path: http://localhost:8080
  # Close GUI instance of given project-space if available.
  # Close GUI instance of given project-space if available.
  # @param project_id character if project-space the GUI instance is connected to.
  # @return [Void]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("OpenGui", {
  # tests for OpenGui
  # base path: http://localhost:8080
  # Open GUI instance on specified project-space and bring the GUI window to foreground.
  # Open GUI instance on specified project-space and bring the GUI window to foreground.
  # @param project_id character of project-space the GUI instance will connect to.
  # @param read_only character open in read-only mode. (optional)
  # @return [Void]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})
