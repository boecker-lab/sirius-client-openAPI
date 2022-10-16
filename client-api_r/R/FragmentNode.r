# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' FragmentNode Class
#'
#' @field id 
#' @field molecularFormula 
#' @field ionType 
#' @field massDeviationDa 
#' @field massErrorPpm 
#' @field score 
#' @field intensity 
#' @field mz 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FragmentNode <- R6::R6Class(
  'FragmentNode',
  public = list(
    `id` = NULL,
    `molecularFormula` = NULL,
    `ionType` = NULL,
    `massDeviationDa` = NULL,
    `massErrorPpm` = NULL,
    `score` = NULL,
    `intensity` = NULL,
    `mz` = NULL,
    initialize = function(`id`, `molecularFormula`, `ionType`, `massDeviationDa`, `massErrorPpm`, `score`, `intensity`, `mz`){
      if (!missing(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`molecularFormula`)) {
        stopifnot(is.character(`molecularFormula`), length(`molecularFormula`) == 1)
        self$`molecularFormula` <- `molecularFormula`
      }
      if (!missing(`ionType`)) {
        stopifnot(is.character(`ionType`), length(`ionType`) == 1)
        self$`ionType` <- `ionType`
      }
      if (!missing(`massDeviationDa`)) {
        stopifnot(is.numeric(`massDeviationDa`), length(`massDeviationDa`) == 1)
        self$`massDeviationDa` <- `massDeviationDa`
      }
      if (!missing(`massErrorPpm`)) {
        stopifnot(is.numeric(`massErrorPpm`), length(`massErrorPpm`) == 1)
        self$`massErrorPpm` <- `massErrorPpm`
      }
      if (!missing(`score`)) {
        stopifnot(is.numeric(`score`), length(`score`) == 1)
        self$`score` <- `score`
      }
      if (!missing(`intensity`)) {
        stopifnot(is.numeric(`intensity`), length(`intensity`) == 1)
        self$`intensity` <- `intensity`
      }
      if (!missing(`mz`)) {
        stopifnot(is.numeric(`mz`), length(`mz`) == 1)
        self$`mz` <- `mz`
      }
    },
    toJSON = function() {
      FragmentNodeObject <- list()
      if (!is.null(self$`id`)) {
        FragmentNodeObject[['id']] <- self$`id`
      }
      if (!is.null(self$`molecularFormula`)) {
        FragmentNodeObject[['molecularFormula']] <- self$`molecularFormula`
      }
      if (!is.null(self$`ionType`)) {
        FragmentNodeObject[['ionType']] <- self$`ionType`
      }
      if (!is.null(self$`massDeviationDa`)) {
        FragmentNodeObject[['massDeviationDa']] <- self$`massDeviationDa`
      }
      if (!is.null(self$`massErrorPpm`)) {
        FragmentNodeObject[['massErrorPpm']] <- self$`massErrorPpm`
      }
      if (!is.null(self$`score`)) {
        FragmentNodeObject[['score']] <- self$`score`
      }
      if (!is.null(self$`intensity`)) {
        FragmentNodeObject[['intensity']] <- self$`intensity`
      }
      if (!is.null(self$`mz`)) {
        FragmentNodeObject[['mz']] <- self$`mz`
      }

      FragmentNodeObject
    },
    fromJSON = function(FragmentNodeJson) {
      FragmentNodeObject <- jsonlite::fromJSON(FragmentNodeJson)
      if (!is.null(FragmentNodeObject$`id`)) {
        self$`id` <- FragmentNodeObject$`id`
      }
      if (!is.null(FragmentNodeObject$`molecularFormula`)) {
        self$`molecularFormula` <- FragmentNodeObject$`molecularFormula`
      }
      if (!is.null(FragmentNodeObject$`ionType`)) {
        self$`ionType` <- FragmentNodeObject$`ionType`
      }
      if (!is.null(FragmentNodeObject$`massDeviationDa`)) {
        self$`massDeviationDa` <- FragmentNodeObject$`massDeviationDa`
      }
      if (!is.null(FragmentNodeObject$`massErrorPpm`)) {
        self$`massErrorPpm` <- FragmentNodeObject$`massErrorPpm`
      }
      if (!is.null(FragmentNodeObject$`score`)) {
        self$`score` <- FragmentNodeObject$`score`
      }
      if (!is.null(FragmentNodeObject$`intensity`)) {
        self$`intensity` <- FragmentNodeObject$`intensity`
      }
      if (!is.null(FragmentNodeObject$`mz`)) {
        self$`mz` <- FragmentNodeObject$`mz`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %d,
           "molecularFormula": %s,
           "ionType": %s,
           "massDeviationDa": %d,
           "massErrorPpm": %d,
           "score": %d,
           "intensity": %d,
           "mz": %d
        }',
        self$`id`,
        self$`molecularFormula`,
        self$`ionType`,
        self$`massDeviationDa`,
        self$`massErrorPpm`,
        self$`score`,
        self$`intensity`,
        self$`mz`
      )
    },
    fromJSONString = function(FragmentNodeJson) {
      FragmentNodeObject <- jsonlite::fromJSON(FragmentNodeJson)
      self$`id` <- FragmentNodeObject$`id`
      self$`molecularFormula` <- FragmentNodeObject$`molecularFormula`
      self$`ionType` <- FragmentNodeObject$`ionType`
      self$`massDeviationDa` <- FragmentNodeObject$`massDeviationDa`
      self$`massErrorPpm` <- FragmentNodeObject$`massErrorPpm`
      self$`score` <- FragmentNodeObject$`score`
      self$`intensity` <- FragmentNodeObject$`intensity`
      self$`mz` <- FragmentNodeObject$`mz`
    }
  )
)
