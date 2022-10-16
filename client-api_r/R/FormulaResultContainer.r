# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' FormulaResultContainer Class
#'
#' @field id 
#' @field molecularFormula 
#' @field adduct 
#' @field resultOverview 
#' @field candidate 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FormulaResultContainer <- R6::R6Class(
  'FormulaResultContainer',
  public = list(
    `id` = NULL,
    `molecularFormula` = NULL,
    `adduct` = NULL,
    `resultOverview` = NULL,
    `candidate` = NULL,
    initialize = function(`id`, `molecularFormula`, `adduct`, `resultOverview`, `candidate`){
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`molecularFormula`)) {
        stopifnot(is.character(`molecularFormula`), length(`molecularFormula`) == 1)
        self$`molecularFormula` <- `molecularFormula`
      }
      if (!missing(`adduct`)) {
        stopifnot(is.character(`adduct`), length(`adduct`) == 1)
        self$`adduct` <- `adduct`
      }
      if (!missing(`resultOverview`)) {
        stopifnot(R6::is.R6(`resultOverview`))
        self$`resultOverview` <- `resultOverview`
      }
      if (!missing(`candidate`)) {
        stopifnot(R6::is.R6(`candidate`))
        self$`candidate` <- `candidate`
      }
    },
    toJSON = function() {
      FormulaResultContainerObject <- list()
      if (!is.null(self$`id`)) {
        FormulaResultContainerObject[['id']] <- self$`id`
      }
      if (!is.null(self$`molecularFormula`)) {
        FormulaResultContainerObject[['molecularFormula']] <- self$`molecularFormula`
      }
      if (!is.null(self$`adduct`)) {
        FormulaResultContainerObject[['adduct']] <- self$`adduct`
      }
      if (!is.null(self$`resultOverview`)) {
        FormulaResultContainerObject[['resultOverview']] <- self$`resultOverview`$toJSON()
      }
      if (!is.null(self$`candidate`)) {
        FormulaResultContainerObject[['candidate']] <- self$`candidate`$toJSON()
      }

      FormulaResultContainerObject
    },
    fromJSON = function(FormulaResultContainerJson) {
      FormulaResultContainerObject <- jsonlite::fromJSON(FormulaResultContainerJson)
      if (!is.null(FormulaResultContainerObject$`id`)) {
        self$`id` <- FormulaResultContainerObject$`id`
      }
      if (!is.null(FormulaResultContainerObject$`molecularFormula`)) {
        self$`molecularFormula` <- FormulaResultContainerObject$`molecularFormula`
      }
      if (!is.null(FormulaResultContainerObject$`adduct`)) {
        self$`adduct` <- FormulaResultContainerObject$`adduct`
      }
      if (!is.null(FormulaResultContainerObject$`resultOverview`)) {
        resultOverviewObject <- ResultOverview$new()
        resultOverviewObject$fromJSON(jsonlite::toJSON(FormulaResultContainerObject$resultOverview, auto_unbox = TRUE))
        self$`resultOverview` <- resultOverviewObject
      }
      if (!is.null(FormulaResultContainerObject$`candidate`)) {
        candidateObject <- FormulaCandidate$new()
        candidateObject$fromJSON(jsonlite::toJSON(FormulaResultContainerObject$candidate, auto_unbox = TRUE))
        self$`candidate` <- candidateObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %s,
           "molecularFormula": %s,
           "adduct": %s,
           "resultOverview": %s,
           "candidate": %s
        }',
        self$`id`,
        self$`molecularFormula`,
        self$`adduct`,
        self$`resultOverview`$toJSON(),
        self$`candidate`$toJSON()
      )
    },
    fromJSONString = function(FormulaResultContainerJson) {
      FormulaResultContainerObject <- jsonlite::fromJSON(FormulaResultContainerJson)
      self$`id` <- FormulaResultContainerObject$`id`
      self$`molecularFormula` <- FormulaResultContainerObject$`molecularFormula`
      self$`adduct` <- FormulaResultContainerObject$`adduct`
      ResultOverviewObject <- ResultOverview$new()
      self$`resultOverview` <- ResultOverviewObject$fromJSON(jsonlite::toJSON(FormulaResultContainerObject$resultOverview, auto_unbox = TRUE))
      FormulaCandidateObject <- FormulaCandidate$new()
      self$`candidate` <- FormulaCandidateObject$fromJSON(jsonlite::toJSON(FormulaResultContainerObject$candidate, auto_unbox = TRUE))
    }
  )
)
