# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test ProjectSpacesApi")

api_instance <- ProjectSpacesApi$new()

test_that("CloseProjectSpace", {
  # tests for CloseProjectSpace
  # base path: http://localhost:8080
  # Close project-space and remove it from application.
  # Close project-space and remove it from application. Project-space will NOT be deleted from disk.
  # @param project_id character unique name/identifier of the  project-space to be closed.
  # @return [Void]
  
  pid_dir <- new_ps("ps1", "psDir1")
  
  resp <- api_instance$GetProjectSpace(pid_dir[1])
  api_instance$CloseProjectSpace(pid_dir[1])
  resp2 <- api_instance$GetProjectSpace(pid_dir[1])

  expect_equal(resp$name, pid_dir[1])
  expect_equal(resp2$status_code, 404)
  
  withr::defer(project_spaces_td(pid_dir))
})

test_that("CreateProjectSpace", {
  # tests for CreateProjectSpace
  # base path: http://localhost:8080
  # Create and open a new project-space at given location and make it accessible via the given projectId.
  # Create and open a new project-space at given location and make it accessible via the given projectId.
  # @param project_id character unique name/identifier that shall be used to access the newly created project-space.
  # @param path_to_project character 
  # @param path_to_source_project character  (optional)
  # @param await_import character  (optional)
  # @return [ProjectSpaceId]
  
  pid <- "ps2"
  dir <- "psDir2"
  resp <- api_instance$CreateProjectSpace(pid, dir)

  expect_equal(resp$name, pid)
  
  withr::defer(project_spaces_td(c(pid, dir)))
})

test_that("GetProjectSpace", {
  # tests for GetProjectSpace
  # base path: http://localhost:8080
  # Get project space info by its projectId.
  # Get project space info by its projectId.
  # @param project_id character unique name/identifier tof the project-space to be accessed.
  # @return [ProjectSpaceId]
  
  pid_dir <- new_ps("ps3", "psDir3")
  
  resp <- api_instance$GetProjectSpace(pid_dir[1])

  expect_equal(resp$name, pid_dir[1])
  
  withr::defer(project_spaces_td(pid_dir))
})

test_that("GetProjectSpaces", {
  # tests for GetProjectSpaces
  # base path: http://localhost:8080
  # List all opened project spaces.
  # List all opened project spaces.
  # @return [array[ProjectSpaceId]]
  
  resp <- api_instance$GetProjectSpaces()

  expect_true(is.list(resp) || is.null(resp))
})

test_that("OpenProjectSpace", {
  # tests for OpenProjectSpace
  # base path: http://localhost:8080
  # Open an existing project-space and make it accessible via the given projectId.
  # Open an existing project-space and make it accessible via the given projectId.
  # @param project_id character unique name/identifier that shall be used to access the opened project-space.
  # @param path_to_project character 
  # @return [ProjectSpaceId]
  
  pid_dir <- new_ps("ps4", "psDir4")
  
  api_instance$CloseProjectSpace(pid_dir[1])
  resp <- api_instance$OpenProjectSpace(pid_dir[1], pid_dir[2])

  expect_equal(resp$name, pid_dir[1])
  
  withr::defer(project_spaces_td(pid_dir))
})
