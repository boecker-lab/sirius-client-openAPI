# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Zodiac Class
#'
#' @field enabled 
#' @field consideredCandidatesAt300Mz 
#' @field consideredCandidatesAt800Mz 
#' @field runInTwoSteps 
#' @field edgeFilterThresholds 
#' @field gibbsSamplerParameters 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Zodiac <- R6::R6Class(
  'Zodiac',
  public = list(
    `enabled` = NULL,
    `consideredCandidatesAt300Mz` = NULL,
    `consideredCandidatesAt800Mz` = NULL,
    `runInTwoSteps` = NULL,
    `edgeFilterThresholds` = NULL,
    `gibbsSamplerParameters` = NULL,
    initialize = function(`enabled`, `consideredCandidatesAt300Mz`, `consideredCandidatesAt800Mz`, `runInTwoSteps`, `edgeFilterThresholds`, `gibbsSamplerParameters`){
      if (!missing(`enabled`)) {
        self$`enabled` <- `enabled`
      }
      if (!missing(`consideredCandidatesAt300Mz`)) {
        stopifnot(R6::is.R6(`consideredCandidatesAt300Mz`))
        self$`consideredCandidatesAt300Mz` <- `consideredCandidatesAt300Mz`
      }
      if (!missing(`consideredCandidatesAt800Mz`)) {
        stopifnot(R6::is.R6(`consideredCandidatesAt800Mz`))
        self$`consideredCandidatesAt800Mz` <- `consideredCandidatesAt800Mz`
      }
      if (!missing(`runInTwoSteps`)) {
        stopifnot(R6::is.R6(`runInTwoSteps`))
        self$`runInTwoSteps` <- `runInTwoSteps`
      }
      if (!missing(`edgeFilterThresholds`)) {
        stopifnot(R6::is.R6(`edgeFilterThresholds`))
        self$`edgeFilterThresholds` <- `edgeFilterThresholds`
      }
      if (!missing(`gibbsSamplerParameters`)) {
        stopifnot(R6::is.R6(`gibbsSamplerParameters`))
        self$`gibbsSamplerParameters` <- `gibbsSamplerParameters`
      }
    },
    toJSON = function() {
      ZodiacObject <- list()
      if (!is.null(self$`enabled`)) {
        ZodiacObject[['enabled']] <- self$`enabled`
      }
      if (!is.null(self$`consideredCandidatesAt300Mz`)) {
        ZodiacObject[['consideredCandidatesAt300Mz']] <- self$`consideredCandidatesAt300Mz`$toJSON()
      }
      if (!is.null(self$`consideredCandidatesAt800Mz`)) {
        ZodiacObject[['consideredCandidatesAt800Mz']] <- self$`consideredCandidatesAt800Mz`$toJSON()
      }
      if (!is.null(self$`runInTwoSteps`)) {
        ZodiacObject[['runInTwoSteps']] <- self$`runInTwoSteps`$toJSON()
      }
      if (!is.null(self$`edgeFilterThresholds`)) {
        ZodiacObject[['edgeFilterThresholds']] <- self$`edgeFilterThresholds`$toJSON()
      }
      if (!is.null(self$`gibbsSamplerParameters`)) {
        ZodiacObject[['gibbsSamplerParameters']] <- self$`gibbsSamplerParameters`$toJSON()
      }

      ZodiacObject
    },
    fromJSON = function(ZodiacJson) {
      ZodiacObject <- jsonlite::fromJSON(ZodiacJson)
      if (!is.null(ZodiacObject$`enabled`)) {
        self$`enabled` <- ZodiacObject$`enabled`
      }
      if (!is.null(ZodiacObject$`consideredCandidatesAt300Mz`)) {
        consideredCandidatesAt300MzObject <- ZodiacNumberOfConsideredCandidatesAt300Mz$new()
        consideredCandidatesAt300MzObject$fromJSON(jsonlite::toJSON(ZodiacObject$consideredCandidatesAt300Mz, auto_unbox = TRUE))
        self$`consideredCandidatesAt300Mz` <- consideredCandidatesAt300MzObject
      }
      if (!is.null(ZodiacObject$`consideredCandidatesAt800Mz`)) {
        consideredCandidatesAt800MzObject <- ZodiacNumberOfConsideredCandidatesAt800Mz$new()
        consideredCandidatesAt800MzObject$fromJSON(jsonlite::toJSON(ZodiacObject$consideredCandidatesAt800Mz, auto_unbox = TRUE))
        self$`consideredCandidatesAt800Mz` <- consideredCandidatesAt800MzObject
      }
      if (!is.null(ZodiacObject$`runInTwoSteps`)) {
        runInTwoStepsObject <- ZodiacRunInTwoSteps$new()
        runInTwoStepsObject$fromJSON(jsonlite::toJSON(ZodiacObject$runInTwoSteps, auto_unbox = TRUE))
        self$`runInTwoSteps` <- runInTwoStepsObject
      }
      if (!is.null(ZodiacObject$`edgeFilterThresholds`)) {
        edgeFilterThresholdsObject <- ZodiacEdgeFilterThresholds$new()
        edgeFilterThresholdsObject$fromJSON(jsonlite::toJSON(ZodiacObject$edgeFilterThresholds, auto_unbox = TRUE))
        self$`edgeFilterThresholds` <- edgeFilterThresholdsObject
      }
      if (!is.null(ZodiacObject$`gibbsSamplerParameters`)) {
        gibbsSamplerParametersObject <- ZodiacEpochs$new()
        gibbsSamplerParametersObject$fromJSON(jsonlite::toJSON(ZodiacObject$gibbsSamplerParameters, auto_unbox = TRUE))
        self$`gibbsSamplerParameters` <- gibbsSamplerParametersObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "enabled": %s,
           "consideredCandidatesAt300Mz": %s,
           "consideredCandidatesAt800Mz": %s,
           "runInTwoSteps": %s,
           "edgeFilterThresholds": %s,
           "gibbsSamplerParameters": %s
        }',
        self$`enabled`,
        self$`consideredCandidatesAt300Mz`$toJSON(),
        self$`consideredCandidatesAt800Mz`$toJSON(),
        self$`runInTwoSteps`$toJSON(),
        self$`edgeFilterThresholds`$toJSON(),
        self$`gibbsSamplerParameters`$toJSON()
      )
    },
    fromJSONString = function(ZodiacJson) {
      ZodiacObject <- jsonlite::fromJSON(ZodiacJson)
      self$`enabled` <- ZodiacObject$`enabled`
      ZodiacNumberOfConsideredCandidatesAt300MzObject <- ZodiacNumberOfConsideredCandidatesAt300Mz$new()
      self$`consideredCandidatesAt300Mz` <- ZodiacNumberOfConsideredCandidatesAt300MzObject$fromJSON(jsonlite::toJSON(ZodiacObject$consideredCandidatesAt300Mz, auto_unbox = TRUE))
      ZodiacNumberOfConsideredCandidatesAt800MzObject <- ZodiacNumberOfConsideredCandidatesAt800Mz$new()
      self$`consideredCandidatesAt800Mz` <- ZodiacNumberOfConsideredCandidatesAt800MzObject$fromJSON(jsonlite::toJSON(ZodiacObject$consideredCandidatesAt800Mz, auto_unbox = TRUE))
      ZodiacRunInTwoStepsObject <- ZodiacRunInTwoSteps$new()
      self$`runInTwoSteps` <- ZodiacRunInTwoStepsObject$fromJSON(jsonlite::toJSON(ZodiacObject$runInTwoSteps, auto_unbox = TRUE))
      ZodiacEdgeFilterThresholdsObject <- ZodiacEdgeFilterThresholds$new()
      self$`edgeFilterThresholds` <- ZodiacEdgeFilterThresholdsObject$fromJSON(jsonlite::toJSON(ZodiacObject$edgeFilterThresholds, auto_unbox = TRUE))
      ZodiacEpochsObject <- ZodiacEpochs$new()
      self$`gibbsSamplerParameters` <- ZodiacEpochsObject$fromJSON(jsonlite::toJSON(ZodiacObject$gibbsSamplerParameters, auto_unbox = TRUE))
    }
  )
)
