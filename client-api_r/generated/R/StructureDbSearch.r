# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' StructureDbSearch Class
#'
#' @field enabled 
#' @field structureSearchDBs 
#' @field tagLipids 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
StructureDbSearch <- R6::R6Class(
  'StructureDbSearch',
  public = list(
    `enabled` = NULL,
    `structureSearchDBs` = NULL,
    `tagLipids` = NULL,
    initialize = function(`enabled`, `structureSearchDBs`, `tagLipids`){
      if (!missing(`enabled`)) {
        self$`enabled` <- `enabled`
      }
      if (!missing(`structureSearchDBs`)) {
        stopifnot(is.list(`structureSearchDBs`), length(`structureSearchDBs`) != 0)
        lapply(`structureSearchDBs`, function(x) stopifnot(is.character(x)))
        self$`structureSearchDBs` <- `structureSearchDBs`
      }
      if (!missing(`tagLipids`)) {
        self$`tagLipids` <- `tagLipids`
      }
    },
    toJSON = function() {
      StructureDbSearchObject <- list()
      if (!is.null(self$`enabled`)) {
        StructureDbSearchObject[['enabled']] <- self$`enabled`
      }
      if (!is.null(self$`structureSearchDBs`)) {
        StructureDbSearchObject[['structureSearchDBs']] <- self$`structureSearchDBs`
      }
      if (!is.null(self$`tagLipids`)) {
        StructureDbSearchObject[['tagLipids']] <- self$`tagLipids`
      }

      StructureDbSearchObject
    },
    fromJSON = function(StructureDbSearchJson) {
      StructureDbSearchObject <- jsonlite::fromJSON(StructureDbSearchJson)
      if (!is.null(StructureDbSearchObject$`enabled`)) {
        self$`enabled` <- StructureDbSearchObject$`enabled`
      }
      if (!is.null(StructureDbSearchObject$`structureSearchDBs`)) {
        self$`structureSearchDBs` <- StructureDbSearchObject$`structureSearchDBs`
      }
      if (!is.null(StructureDbSearchObject$`tagLipids`)) {
        self$`tagLipids` <- StructureDbSearchObject$`tagLipids`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "enabled": %s,
           "structureSearchDBs": [%s],
           "tagLipids": %s
        }',
        self$`enabled`,
        lapply(self$`structureSearchDBs`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`tagLipids`
      )
    },
    fromJSONString = function(StructureDbSearchJson) {
      StructureDbSearchObject <- jsonlite::fromJSON(StructureDbSearchJson)
      self$`enabled` <- StructureDbSearchObject$`enabled`
      self$`structureSearchDBs` <- StructureDbSearchObject$`structureSearchDBs`
      self$`tagLipids` <- StructureDbSearchObject$`tagLipids`
    }
  )
)
