# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' DBLink Class
#'
#' @field name 
#' @field id 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DBLink <- R6::R6Class(
  'DBLink',
  public = list(
    `name` = NULL,
    `id` = NULL,
    initialize = function(`name`, `id`){
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
    },
    toJSON = function() {
      DBLinkObject <- list()
      if (!is.null(self$`name`)) {
        DBLinkObject[['name']] <- self$`name`
      }
      if (!is.null(self$`id`)) {
        DBLinkObject[['id']] <- self$`id`
      }

      DBLinkObject
    },
    fromJSON = function(DBLinkJson) {
      DBLinkObject <- jsonlite::fromJSON(DBLinkJson)
      if (!is.null(DBLinkObject$`name`)) {
        self$`name` <- DBLinkObject$`name`
      }
      if (!is.null(DBLinkObject$`id`)) {
        self$`id` <- DBLinkObject$`id`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "name": %s,
           "id": %s
        }',
        self$`name`,
        self$`id`
      )
    },
    fromJSONString = function(DBLinkJson) {
      DBLinkObject <- jsonlite::fromJSON(DBLinkJson)
      self$`name` <- DBLinkObject$`name`
      self$`id` <- DBLinkObject$`id`
    }
  )
)
