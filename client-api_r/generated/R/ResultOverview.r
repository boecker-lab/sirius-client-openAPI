# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' ResultOverview Class
#'
#' @field siriusScore 
#' @field zodiacScore 
#' @field topCSIScore 
#' @field confidenceScore 
#' @field canopusResult 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ResultOverview <- R6::R6Class(
  'ResultOverview',
  public = list(
    `siriusScore` = NULL,
    `zodiacScore` = NULL,
    `topCSIScore` = NULL,
    `confidenceScore` = NULL,
    `canopusResult` = NULL,
    initialize = function(`siriusScore`, `zodiacScore`, `topCSIScore`, `confidenceScore`, `canopusResult`){
      if (!missing(`siriusScore`)) {
        stopifnot(is.numeric(`siriusScore`), length(`siriusScore`) == 1)
        self$`siriusScore` <- `siriusScore`
      }
      if (!missing(`zodiacScore`)) {
        stopifnot(is.numeric(`zodiacScore`), length(`zodiacScore`) == 1)
        self$`zodiacScore` <- `zodiacScore`
      }
      if (!missing(`topCSIScore`)) {
        stopifnot(is.numeric(`topCSIScore`), length(`topCSIScore`) == 1)
        self$`topCSIScore` <- `topCSIScore`
      }
      if (!missing(`confidenceScore`)) {
        stopifnot(is.numeric(`confidenceScore`), length(`confidenceScore`) == 1)
        self$`confidenceScore` <- `confidenceScore`
      }
      if (!missing(`canopusResult`)) {
        self$`canopusResult` <- `canopusResult`
      }
    },
    toJSON = function() {
      ResultOverviewObject <- list()
      if (!is.null(self$`siriusScore`)) {
        ResultOverviewObject[['siriusScore']] <- self$`siriusScore`
      }
      if (!is.null(self$`zodiacScore`)) {
        ResultOverviewObject[['zodiacScore']] <- self$`zodiacScore`
      }
      if (!is.null(self$`topCSIScore`)) {
        ResultOverviewObject[['topCSIScore']] <- self$`topCSIScore`
      }
      if (!is.null(self$`confidenceScore`)) {
        ResultOverviewObject[['confidenceScore']] <- self$`confidenceScore`
      }
      if (!is.null(self$`canopusResult`)) {
        ResultOverviewObject[['canopusResult']] <- self$`canopusResult`
      }

      ResultOverviewObject
    },
    fromJSON = function(ResultOverviewJson) {
      ResultOverviewObject <- jsonlite::fromJSON(ResultOverviewJson)
      if (!is.null(ResultOverviewObject$`siriusScore`)) {
        self$`siriusScore` <- ResultOverviewObject$`siriusScore`
      }
      if (!is.null(ResultOverviewObject$`zodiacScore`)) {
        self$`zodiacScore` <- ResultOverviewObject$`zodiacScore`
      }
      if (!is.null(ResultOverviewObject$`topCSIScore`)) {
        self$`topCSIScore` <- ResultOverviewObject$`topCSIScore`
      }
      if (!is.null(ResultOverviewObject$`confidenceScore`)) {
        self$`confidenceScore` <- ResultOverviewObject$`confidenceScore`
      }
      if (!is.null(ResultOverviewObject$`canopusResult`)) {
        self$`canopusResult` <- ResultOverviewObject$`canopusResult`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "siriusScore": %d,
           "zodiacScore": %d,
           "topCSIScore": %d,
           "confidenceScore": %d,
           "canopusResult": %s
        }',
        self$`siriusScore`,
        self$`zodiacScore`,
        self$`topCSIScore`,
        self$`confidenceScore`,
        self$`canopusResult`
      )
    },
    fromJSONString = function(ResultOverviewJson) {
      ResultOverviewObject <- jsonlite::fromJSON(ResultOverviewJson)
      self$`siriusScore` <- ResultOverviewObject$`siriusScore`
      self$`zodiacScore` <- ResultOverviewObject$`zodiacScore`
      self$`topCSIScore` <- ResultOverviewObject$`topCSIScore`
      self$`confidenceScore` <- ResultOverviewObject$`confidenceScore`
      self$`canopusResult` <- ResultOverviewObject$`canopusResult`
    }
  )
)
