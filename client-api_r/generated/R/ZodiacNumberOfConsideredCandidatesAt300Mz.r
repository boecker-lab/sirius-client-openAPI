# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' ZodiacNumberOfConsideredCandidatesAt300Mz Class
#'
#' @field value 
#' @field identifier 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ZodiacNumberOfConsideredCandidatesAt300Mz <- R6::R6Class(
  'ZodiacNumberOfConsideredCandidatesAt300Mz',
  public = list(
    `value` = NULL,
    `identifier` = NULL,
    initialize = function(`value`, `identifier`){
      if (!missing(`value`)) {
        stopifnot(is.numeric(`value`), length(`value`) == 1)
        self$`value` <- `value`
      }
      if (!missing(`identifier`)) {
        stopifnot(is.character(`identifier`), length(`identifier`) == 1)
        self$`identifier` <- `identifier`
      }
    },
    toJSON = function() {
      ZodiacNumberOfConsideredCandidatesAt300MzObject <- list()
      if (!is.null(self$`value`)) {
        ZodiacNumberOfConsideredCandidatesAt300MzObject[['value']] <- self$`value`
      }
      if (!is.null(self$`identifier`)) {
        ZodiacNumberOfConsideredCandidatesAt300MzObject[['identifier']] <- self$`identifier`
      }

      ZodiacNumberOfConsideredCandidatesAt300MzObject
    },
    fromJSON = function(ZodiacNumberOfConsideredCandidatesAt300MzJson) {
      ZodiacNumberOfConsideredCandidatesAt300MzObject <- jsonlite::fromJSON(ZodiacNumberOfConsideredCandidatesAt300MzJson)
      if (!is.null(ZodiacNumberOfConsideredCandidatesAt300MzObject$`value`)) {
        self$`value` <- ZodiacNumberOfConsideredCandidatesAt300MzObject$`value`
      }
      if (!is.null(ZodiacNumberOfConsideredCandidatesAt300MzObject$`identifier`)) {
        self$`identifier` <- ZodiacNumberOfConsideredCandidatesAt300MzObject$`identifier`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "value": %d,
           "identifier": %s
        }',
        self$`value`,
        self$`identifier`
      )
    },
    fromJSONString = function(ZodiacNumberOfConsideredCandidatesAt300MzJson) {
      ZodiacNumberOfConsideredCandidatesAt300MzObject <- jsonlite::fromJSON(ZodiacNumberOfConsideredCandidatesAt300MzJson)
      self$`value` <- ZodiacNumberOfConsideredCandidatesAt300MzObject$`value`
      self$`identifier` <- ZodiacNumberOfConsideredCandidatesAt300MzObject$`identifier`
    }
  )
)
