# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' JobId Class
#'
#' @field id 
#' @field command 
#' @field progress 
#' @field affectedCompoundIds 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
JobId <- R6::R6Class(
  'JobId',
  public = list(
    `id` = NULL,
    `command` = NULL,
    `progress` = NULL,
    `affectedCompoundIds` = NULL,
    initialize = function(`id`, `command`, `progress`, `affectedCompoundIds`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`command`)) {
        stopifnot(is.character(`command`), length(`command`) == 1)
        self$`command` <- `command`
      }
      if (!missing(`progress`)) {
        stopifnot(R6::is.R6(`progress`))
        self$`progress` <- `progress`
      }
      if (!missing(`affectedCompoundIds`)) {
        stopifnot(is.list(`affectedCompoundIds`), length(`affectedCompoundIds`) != 0)
        lapply(`affectedCompoundIds`, function(x) stopifnot(is.character(x)))
        self$`affectedCompoundIds` <- `affectedCompoundIds`
      }
    },
    toJSON = function() {
      JobIdObject <- list()
      if (!is.null(self$`id`)) {
        JobIdObject[['id']] <- self$`id`
      }
      if (!is.null(self$`command`)) {
        JobIdObject[['command']] <- self$`command`
      }
      if (!is.null(self$`progress`)) {
        JobIdObject[['progress']] <- self$`progress`$toJSON()
      }
      if (!is.null(self$`affectedCompoundIds`)) {
        JobIdObject[['affectedCompoundIds']] <- self$`affectedCompoundIds`
      }

      JobIdObject
    },
    fromJSON = function(JobIdJson) {
      JobIdObject <- jsonlite::fromJSON(JobIdJson)
      if (!is.null(JobIdObject$`id`)) {
        self$`id` <- JobIdObject$`id`
      }
      if (!is.null(JobIdObject$`command`)) {
        self$`command` <- JobIdObject$`command`
      }
      if (!is.null(JobIdObject$`progress`)) {
        progressObject <- JobProgress$new()
        progressObject$fromJSON(jsonlite::toJSON(JobIdObject$progress, auto_unbox = TRUE))
        self$`progress` <- progressObject
      }
      if (!is.null(JobIdObject$`affectedCompoundIds`)) {
        self$`affectedCompoundIds` <- JobIdObject$`affectedCompoundIds`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "command": %s,
           "progress": %s,
           "affectedCompoundIds": [%s]
        }',
        self$`id`,
        self$`command`,
        self$`progress`$toJSON(),
        lapply(self$`affectedCompoundIds`, function(x) paste(paste0('"', x, '"'), sep=","))
      )
    },
    fromJSONString = function(JobIdJson) {
      JobIdObject <- jsonlite::fromJSON(JobIdJson)
      self$`id` <- JobIdObject$`id`
      self$`command` <- JobIdObject$`command`
      JobProgressObject <- JobProgress$new()
      self$`progress` <- JobProgressObject$fromJSON(jsonlite::toJSON(JobIdObject$progress, auto_unbox = TRUE))
      self$`affectedCompoundIds` <- JobIdObject$`affectedCompoundIds`
    }
  )
)
