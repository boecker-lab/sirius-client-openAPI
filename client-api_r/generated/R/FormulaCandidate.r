# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' FormulaCandidate Class
#'
#' @field siriusScore 
#' @field isotopeScore 
#' @field treeScore 
#' @field zodiacScore 
#' @field molecularFormula 
#' @field adduct 
#' @field numOfexplainedPeaks 
#' @field numOfexplainablePeaks 
#' @field totalExplainedIntensity 
#' @field medianMassDeviation 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FormulaCandidate <- R6::R6Class(
  'FormulaCandidate',
  public = list(
    `siriusScore` = NULL,
    `isotopeScore` = NULL,
    `treeScore` = NULL,
    `zodiacScore` = NULL,
    `molecularFormula` = NULL,
    `adduct` = NULL,
    `numOfexplainedPeaks` = NULL,
    `numOfexplainablePeaks` = NULL,
    `totalExplainedIntensity` = NULL,
    `medianMassDeviation` = NULL,
    initialize = function(`siriusScore`, `isotopeScore`, `treeScore`, `zodiacScore`, `molecularFormula`, `adduct`, `numOfexplainedPeaks`, `numOfexplainablePeaks`, `totalExplainedIntensity`, `medianMassDeviation`){
      if (!missing(`siriusScore`)) {
        stopifnot(is.numeric(`siriusScore`), length(`siriusScore`) == 1)
        self$`siriusScore` <- `siriusScore`
      }
      if (!missing(`isotopeScore`)) {
        stopifnot(is.numeric(`isotopeScore`), length(`isotopeScore`) == 1)
        self$`isotopeScore` <- `isotopeScore`
      }
      if (!missing(`treeScore`)) {
        stopifnot(is.numeric(`treeScore`), length(`treeScore`) == 1)
        self$`treeScore` <- `treeScore`
      }
      if (!missing(`zodiacScore`)) {
        stopifnot(is.numeric(`zodiacScore`), length(`zodiacScore`) == 1)
        self$`zodiacScore` <- `zodiacScore`
      }
      if (!missing(`molecularFormula`)) {
        stopifnot(is.character(`molecularFormula`), length(`molecularFormula`) == 1)
        self$`molecularFormula` <- `molecularFormula`
      }
      if (!missing(`adduct`)) {
        stopifnot(is.character(`adduct`), length(`adduct`) == 1)
        self$`adduct` <- `adduct`
      }
      if (!missing(`numOfexplainedPeaks`)) {
        stopifnot(is.numeric(`numOfexplainedPeaks`), length(`numOfexplainedPeaks`) == 1)
        self$`numOfexplainedPeaks` <- `numOfexplainedPeaks`
      }
      if (!missing(`numOfexplainablePeaks`)) {
        stopifnot(is.numeric(`numOfexplainablePeaks`), length(`numOfexplainablePeaks`) == 1)
        self$`numOfexplainablePeaks` <- `numOfexplainablePeaks`
      }
      if (!missing(`totalExplainedIntensity`)) {
        stopifnot(is.numeric(`totalExplainedIntensity`), length(`totalExplainedIntensity`) == 1)
        self$`totalExplainedIntensity` <- `totalExplainedIntensity`
      }
      if (!missing(`medianMassDeviation`)) {
        stopifnot(R6::is.R6(`medianMassDeviation`))
        self$`medianMassDeviation` <- `medianMassDeviation`
      }
    },
    toJSON = function() {
      FormulaCandidateObject <- list()
      if (!is.null(self$`siriusScore`)) {
        FormulaCandidateObject[['siriusScore']] <- self$`siriusScore`
      }
      if (!is.null(self$`isotopeScore`)) {
        FormulaCandidateObject[['isotopeScore']] <- self$`isotopeScore`
      }
      if (!is.null(self$`treeScore`)) {
        FormulaCandidateObject[['treeScore']] <- self$`treeScore`
      }
      if (!is.null(self$`zodiacScore`)) {
        FormulaCandidateObject[['zodiacScore']] <- self$`zodiacScore`
      }
      if (!is.null(self$`molecularFormula`)) {
        FormulaCandidateObject[['molecularFormula']] <- self$`molecularFormula`
      }
      if (!is.null(self$`adduct`)) {
        FormulaCandidateObject[['adduct']] <- self$`adduct`
      }
      if (!is.null(self$`numOfexplainedPeaks`)) {
        FormulaCandidateObject[['numOfexplainedPeaks']] <- self$`numOfexplainedPeaks`
      }
      if (!is.null(self$`numOfexplainablePeaks`)) {
        FormulaCandidateObject[['numOfexplainablePeaks']] <- self$`numOfexplainablePeaks`
      }
      if (!is.null(self$`totalExplainedIntensity`)) {
        FormulaCandidateObject[['totalExplainedIntensity']] <- self$`totalExplainedIntensity`
      }
      if (!is.null(self$`medianMassDeviation`)) {
        FormulaCandidateObject[['medianMassDeviation']] <- self$`medianMassDeviation`$toJSON()
      }

      FormulaCandidateObject
    },
    fromJSON = function(FormulaCandidateJson) {
      FormulaCandidateObject <- jsonlite::fromJSON(FormulaCandidateJson)
      if (!is.null(FormulaCandidateObject$`siriusScore`)) {
        self$`siriusScore` <- FormulaCandidateObject$`siriusScore`
      }
      if (!is.null(FormulaCandidateObject$`isotopeScore`)) {
        self$`isotopeScore` <- FormulaCandidateObject$`isotopeScore`
      }
      if (!is.null(FormulaCandidateObject$`treeScore`)) {
        self$`treeScore` <- FormulaCandidateObject$`treeScore`
      }
      if (!is.null(FormulaCandidateObject$`zodiacScore`)) {
        self$`zodiacScore` <- FormulaCandidateObject$`zodiacScore`
      }
      if (!is.null(FormulaCandidateObject$`molecularFormula`)) {
        self$`molecularFormula` <- FormulaCandidateObject$`molecularFormula`
      }
      if (!is.null(FormulaCandidateObject$`adduct`)) {
        self$`adduct` <- FormulaCandidateObject$`adduct`
      }
      if (!is.null(FormulaCandidateObject$`numOfexplainedPeaks`)) {
        self$`numOfexplainedPeaks` <- FormulaCandidateObject$`numOfexplainedPeaks`
      }
      if (!is.null(FormulaCandidateObject$`numOfexplainablePeaks`)) {
        self$`numOfexplainablePeaks` <- FormulaCandidateObject$`numOfexplainablePeaks`
      }
      if (!is.null(FormulaCandidateObject$`totalExplainedIntensity`)) {
        self$`totalExplainedIntensity` <- FormulaCandidateObject$`totalExplainedIntensity`
      }
      if (!is.null(FormulaCandidateObject$`medianMassDeviation`)) {
        medianMassDeviationObject <- Deviation$new()
        medianMassDeviationObject$fromJSON(jsonlite::toJSON(FormulaCandidateObject$medianMassDeviation, auto_unbox = TRUE))
        self$`medianMassDeviation` <- medianMassDeviationObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "siriusScore": %d,
           "isotopeScore": %d,
           "treeScore": %d,
           "zodiacScore": %d,
           "molecularFormula": %s,
           "adduct": %s,
           "numOfexplainedPeaks": %d,
           "numOfexplainablePeaks": %d,
           "totalExplainedIntensity": %d,
           "medianMassDeviation": %s
        }',
        self$`siriusScore`,
        self$`isotopeScore`,
        self$`treeScore`,
        self$`zodiacScore`,
        self$`molecularFormula`,
        self$`adduct`,
        self$`numOfexplainedPeaks`,
        self$`numOfexplainablePeaks`,
        self$`totalExplainedIntensity`,
        self$`medianMassDeviation`$toJSON()
      )
    },
    fromJSONString = function(FormulaCandidateJson) {
      FormulaCandidateObject <- jsonlite::fromJSON(FormulaCandidateJson)
      self$`siriusScore` <- FormulaCandidateObject$`siriusScore`
      self$`isotopeScore` <- FormulaCandidateObject$`isotopeScore`
      self$`treeScore` <- FormulaCandidateObject$`treeScore`
      self$`zodiacScore` <- FormulaCandidateObject$`zodiacScore`
      self$`molecularFormula` <- FormulaCandidateObject$`molecularFormula`
      self$`adduct` <- FormulaCandidateObject$`adduct`
      self$`numOfexplainedPeaks` <- FormulaCandidateObject$`numOfexplainedPeaks`
      self$`numOfexplainablePeaks` <- FormulaCandidateObject$`numOfexplainablePeaks`
      self$`totalExplainedIntensity` <- FormulaCandidateObject$`totalExplainedIntensity`
      DeviationObject <- Deviation$new()
      self$`medianMassDeviation` <- DeviationObject$fromJSON(jsonlite::toJSON(FormulaCandidateObject$medianMassDeviation, auto_unbox = TRUE))
    }
  )
)
