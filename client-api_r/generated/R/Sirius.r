# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Sirius Class
#'
#' @field enabled 
#' @field profile 
#' @field numberOfCandidates 
#' @field numberOfCandidatesPerIon 
#' @field massAccuracyMS2ppm 
#' @field isotopeMs2Settings 
#' @field formulaSearchDBs 
#' @field enforcedFormulaConstraints 
#' @field fallbackFormulaConstraints 
#' @field detectableElements 
#' @field ilpTimeout 
#' @field useHeuristic 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Sirius <- R6::R6Class(
  'Sirius',
  public = list(
    `enabled` = NULL,
    `profile` = NULL,
    `numberOfCandidates` = NULL,
    `numberOfCandidatesPerIon` = NULL,
    `massAccuracyMS2ppm` = NULL,
    `isotopeMs2Settings` = NULL,
    `formulaSearchDBs` = NULL,
    `enforcedFormulaConstraints` = NULL,
    `fallbackFormulaConstraints` = NULL,
    `detectableElements` = NULL,
    `ilpTimeout` = NULL,
    `useHeuristic` = NULL,
    initialize = function(`enabled`, `profile`, `numberOfCandidates`, `numberOfCandidatesPerIon`, `massAccuracyMS2ppm`, `isotopeMs2Settings`, `formulaSearchDBs`, `enforcedFormulaConstraints`, `fallbackFormulaConstraints`, `detectableElements`, `ilpTimeout`, `useHeuristic`){
      if (!missing(`enabled`)) {
        self$`enabled` <- `enabled`
      }
      if (!missing(`profile`)) {
        stopifnot(is.character(`profile`), length(`profile`) == 1)
        self$`profile` <- `profile`
      }
      if (!missing(`numberOfCandidates`)) {
        stopifnot(is.numeric(`numberOfCandidates`), length(`numberOfCandidates`) == 1)
        self$`numberOfCandidates` <- `numberOfCandidates`
      }
      if (!missing(`numberOfCandidatesPerIon`)) {
        stopifnot(is.numeric(`numberOfCandidatesPerIon`), length(`numberOfCandidatesPerIon`) == 1)
        self$`numberOfCandidatesPerIon` <- `numberOfCandidatesPerIon`
      }
      if (!missing(`massAccuracyMS2ppm`)) {
        stopifnot(is.numeric(`massAccuracyMS2ppm`), length(`massAccuracyMS2ppm`) == 1)
        self$`massAccuracyMS2ppm` <- `massAccuracyMS2ppm`
      }
      if (!missing(`isotopeMs2Settings`)) {
        stopifnot(is.character(`isotopeMs2Settings`), length(`isotopeMs2Settings`) == 1)
        self$`isotopeMs2Settings` <- `isotopeMs2Settings`
      }
      if (!missing(`formulaSearchDBs`)) {
        stopifnot(is.list(`formulaSearchDBs`), length(`formulaSearchDBs`) != 0)
        lapply(`formulaSearchDBs`, function(x) stopifnot(is.character(x)))
        self$`formulaSearchDBs` <- `formulaSearchDBs`
      }
      if (!missing(`enforcedFormulaConstraints`)) {
        stopifnot(is.character(`enforcedFormulaConstraints`), length(`enforcedFormulaConstraints`) == 1)
        self$`enforcedFormulaConstraints` <- `enforcedFormulaConstraints`
      }
      if (!missing(`fallbackFormulaConstraints`)) {
        stopifnot(is.character(`fallbackFormulaConstraints`), length(`fallbackFormulaConstraints`) == 1)
        self$`fallbackFormulaConstraints` <- `fallbackFormulaConstraints`
      }
      if (!missing(`detectableElements`)) {
        stopifnot(is.list(`detectableElements`), length(`detectableElements`) != 0)
        lapply(`detectableElements`, function(x) stopifnot(is.character(x)))
        self$`detectableElements` <- `detectableElements`
      }
      if (!missing(`ilpTimeout`)) {
        stopifnot(R6::is.R6(`ilpTimeout`))
        self$`ilpTimeout` <- `ilpTimeout`
      }
      if (!missing(`useHeuristic`)) {
        stopifnot(R6::is.R6(`useHeuristic`))
        self$`useHeuristic` <- `useHeuristic`
      }
    },
    toJSON = function() {
      SiriusObject <- list()
      if (!is.null(self$`enabled`)) {
        SiriusObject[['enabled']] <- self$`enabled`
      }
      if (!is.null(self$`profile`)) {
        SiriusObject[['profile']] <- self$`profile`
      }
      if (!is.null(self$`numberOfCandidates`)) {
        SiriusObject[['numberOfCandidates']] <- self$`numberOfCandidates`
      }
      if (!is.null(self$`numberOfCandidatesPerIon`)) {
        SiriusObject[['numberOfCandidatesPerIon']] <- self$`numberOfCandidatesPerIon`
      }
      if (!is.null(self$`massAccuracyMS2ppm`)) {
        SiriusObject[['massAccuracyMS2ppm']] <- self$`massAccuracyMS2ppm`
      }
      if (!is.null(self$`isotopeMs2Settings`)) {
        SiriusObject[['isotopeMs2Settings']] <- self$`isotopeMs2Settings`
      }
      if (!is.null(self$`formulaSearchDBs`)) {
        SiriusObject[['formulaSearchDBs']] <- self$`formulaSearchDBs`
      }
      if (!is.null(self$`enforcedFormulaConstraints`)) {
        SiriusObject[['enforcedFormulaConstraints']] <- self$`enforcedFormulaConstraints`
      }
      if (!is.null(self$`fallbackFormulaConstraints`)) {
        SiriusObject[['fallbackFormulaConstraints']] <- self$`fallbackFormulaConstraints`
      }
      if (!is.null(self$`detectableElements`)) {
        SiriusObject[['detectableElements']] <- self$`detectableElements`
      }
      if (!is.null(self$`ilpTimeout`)) {
        SiriusObject[['ilpTimeout']] <- self$`ilpTimeout`$toJSON()
      }
      if (!is.null(self$`useHeuristic`)) {
        SiriusObject[['useHeuristic']] <- self$`useHeuristic`$toJSON()
      }

      SiriusObject
    },
    fromJSON = function(SiriusJson) {
      SiriusObject <- jsonlite::fromJSON(SiriusJson)
      if (!is.null(SiriusObject$`enabled`)) {
        self$`enabled` <- SiriusObject$`enabled`
      }
      if (!is.null(SiriusObject$`profile`)) {
        self$`profile` <- SiriusObject$`profile`
      }
      if (!is.null(SiriusObject$`numberOfCandidates`)) {
        self$`numberOfCandidates` <- SiriusObject$`numberOfCandidates`
      }
      if (!is.null(SiriusObject$`numberOfCandidatesPerIon`)) {
        self$`numberOfCandidatesPerIon` <- SiriusObject$`numberOfCandidatesPerIon`
      }
      if (!is.null(SiriusObject$`massAccuracyMS2ppm`)) {
        self$`massAccuracyMS2ppm` <- SiriusObject$`massAccuracyMS2ppm`
      }
      if (!is.null(SiriusObject$`isotopeMs2Settings`)) {
        self$`isotopeMs2Settings` <- SiriusObject$`isotopeMs2Settings`
      }
      if (!is.null(SiriusObject$`formulaSearchDBs`)) {
        self$`formulaSearchDBs` <- SiriusObject$`formulaSearchDBs`
      }
      if (!is.null(SiriusObject$`enforcedFormulaConstraints`)) {
        self$`enforcedFormulaConstraints` <- SiriusObject$`enforcedFormulaConstraints`
      }
      if (!is.null(SiriusObject$`fallbackFormulaConstraints`)) {
        self$`fallbackFormulaConstraints` <- SiriusObject$`fallbackFormulaConstraints`
      }
      if (!is.null(SiriusObject$`detectableElements`)) {
        self$`detectableElements` <- SiriusObject$`detectableElements`
      }
      if (!is.null(SiriusObject$`ilpTimeout`)) {
        ilpTimeoutObject <- Timeout$new()
        ilpTimeoutObject$fromJSON(jsonlite::toJSON(SiriusObject$ilpTimeout, auto_unbox = TRUE))
        self$`ilpTimeout` <- ilpTimeoutObject
      }
      if (!is.null(SiriusObject$`useHeuristic`)) {
        useHeuristicObject <- UseHeuristic$new()
        useHeuristicObject$fromJSON(jsonlite::toJSON(SiriusObject$useHeuristic, auto_unbox = TRUE))
        self$`useHeuristic` <- useHeuristicObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "enabled": %s,
           "profile": %s,
           "numberOfCandidates": %d,
           "numberOfCandidatesPerIon": %d,
           "massAccuracyMS2ppm": %d,
           "isotopeMs2Settings": %s,
           "formulaSearchDBs": [%s],
           "enforcedFormulaConstraints": %s,
           "fallbackFormulaConstraints": %s,
           "detectableElements": [%s],
           "ilpTimeout": %s,
           "useHeuristic": %s
        }',
        self$`enabled`,
        self$`profile`,
        self$`numberOfCandidates`,
        self$`numberOfCandidatesPerIon`,
        self$`massAccuracyMS2ppm`,
        self$`isotopeMs2Settings`,
        lapply(self$`formulaSearchDBs`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`enforcedFormulaConstraints`,
        self$`fallbackFormulaConstraints`,
        lapply(self$`detectableElements`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`ilpTimeout`$toJSON(),
        self$`useHeuristic`$toJSON()
      )
    },
    fromJSONString = function(SiriusJson) {
      SiriusObject <- jsonlite::fromJSON(SiriusJson)
      self$`enabled` <- SiriusObject$`enabled`
      self$`profile` <- SiriusObject$`profile`
      self$`numberOfCandidates` <- SiriusObject$`numberOfCandidates`
      self$`numberOfCandidatesPerIon` <- SiriusObject$`numberOfCandidatesPerIon`
      self$`massAccuracyMS2ppm` <- SiriusObject$`massAccuracyMS2ppm`
      self$`isotopeMs2Settings` <- SiriusObject$`isotopeMs2Settings`
      self$`formulaSearchDBs` <- SiriusObject$`formulaSearchDBs`
      self$`enforcedFormulaConstraints` <- SiriusObject$`enforcedFormulaConstraints`
      self$`fallbackFormulaConstraints` <- SiriusObject$`fallbackFormulaConstraints`
      self$`detectableElements` <- SiriusObject$`detectableElements`
      TimeoutObject <- Timeout$new()
      self$`ilpTimeout` <- TimeoutObject$fromJSON(jsonlite::toJSON(SiriusObject$ilpTimeout, auto_unbox = TRUE))
      UseHeuristicObject <- UseHeuristic$new()
      self$`useHeuristic` <- UseHeuristicObject$fromJSON(jsonlite::toJSON(SiriusObject$useHeuristic, auto_unbox = TRUE))
    }
  )
)
