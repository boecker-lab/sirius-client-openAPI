# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' StructureCandidate Class
#'
#' @field structureName 
#' @field smiles 
#' @field csiScore 
#' @field tanimotoSimilarity 
#' @field confidenceScore 
#' @field numOfPubMedIds 
#' @field xlogP 
#' @field inchiKey 
#' @field fpBitsSet 
#' @field dbLinks 
#' @field pubmedIds 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
StructureCandidate <- R6::R6Class(
  'StructureCandidate',
  public = list(
    `structureName` = NULL,
    `smiles` = NULL,
    `csiScore` = NULL,
    `tanimotoSimilarity` = NULL,
    `confidenceScore` = NULL,
    `numOfPubMedIds` = NULL,
    `xlogP` = NULL,
    `inchiKey` = NULL,
    `fpBitsSet` = NULL,
    `dbLinks` = NULL,
    `pubmedIds` = NULL,
    initialize = function(`structureName`, `smiles`, `csiScore`, `tanimotoSimilarity`, `confidenceScore`, `numOfPubMedIds`, `xlogP`, `inchiKey`, `fpBitsSet`, `dbLinks`, `pubmedIds`){
      if (!missing(`structureName`)) {
        stopifnot(is.character(`structureName`), length(`structureName`) == 1)
        self$`structureName` <- `structureName`
      }
      if (!missing(`smiles`)) {
        stopifnot(is.character(`smiles`), length(`smiles`) == 1)
        self$`smiles` <- `smiles`
      }
      if (!missing(`csiScore`)) {
        stopifnot(is.numeric(`csiScore`), length(`csiScore`) == 1)
        self$`csiScore` <- `csiScore`
      }
      if (!missing(`tanimotoSimilarity`)) {
        stopifnot(is.numeric(`tanimotoSimilarity`), length(`tanimotoSimilarity`) == 1)
        self$`tanimotoSimilarity` <- `tanimotoSimilarity`
      }
      if (!missing(`confidenceScore`)) {
        stopifnot(is.numeric(`confidenceScore`), length(`confidenceScore`) == 1)
        self$`confidenceScore` <- `confidenceScore`
      }
      if (!missing(`numOfPubMedIds`)) {
        stopifnot(is.numeric(`numOfPubMedIds`), length(`numOfPubMedIds`) == 1)
        self$`numOfPubMedIds` <- `numOfPubMedIds`
      }
      if (!missing(`xlogP`)) {
        stopifnot(is.numeric(`xlogP`), length(`xlogP`) == 1)
        self$`xlogP` <- `xlogP`
      }
      if (!missing(`inchiKey`)) {
        stopifnot(is.character(`inchiKey`), length(`inchiKey`) == 1)
        self$`inchiKey` <- `inchiKey`
      }
      if (!missing(`fpBitsSet`)) {
        stopifnot(is.list(`fpBitsSet`), length(`fpBitsSet`) != 0)
        lapply(`fpBitsSet`, function(x) stopifnot(is.character(x)))
        self$`fpBitsSet` <- `fpBitsSet`
      }
      if (!missing(`dbLinks`)) {
        stopifnot(is.list(`dbLinks`), length(`dbLinks`) != 0)
        lapply(`dbLinks`, function(x) stopifnot(R6::is.R6(x)))
        self$`dbLinks` <- `dbLinks`
      }
      if (!missing(`pubmedIds`)) {
        stopifnot(is.list(`pubmedIds`), length(`pubmedIds`) != 0)
        lapply(`pubmedIds`, function(x) stopifnot(is.character(x)))
        self$`pubmedIds` <- `pubmedIds`
      }
    },
    toJSON = function() {
      StructureCandidateObject <- list()
      if (!is.null(self$`structureName`)) {
        StructureCandidateObject[['structureName']] <- self$`structureName`
      }
      if (!is.null(self$`smiles`)) {
        StructureCandidateObject[['smiles']] <- self$`smiles`
      }
      if (!is.null(self$`csiScore`)) {
        StructureCandidateObject[['csiScore']] <- self$`csiScore`
      }
      if (!is.null(self$`tanimotoSimilarity`)) {
        StructureCandidateObject[['tanimotoSimilarity']] <- self$`tanimotoSimilarity`
      }
      if (!is.null(self$`confidenceScore`)) {
        StructureCandidateObject[['confidenceScore']] <- self$`confidenceScore`
      }
      if (!is.null(self$`numOfPubMedIds`)) {
        StructureCandidateObject[['numOfPubMedIds']] <- self$`numOfPubMedIds`
      }
      if (!is.null(self$`xlogP`)) {
        StructureCandidateObject[['xlogP']] <- self$`xlogP`
      }
      if (!is.null(self$`inchiKey`)) {
        StructureCandidateObject[['inchiKey']] <- self$`inchiKey`
      }
      if (!is.null(self$`fpBitsSet`)) {
        StructureCandidateObject[['fpBitsSet']] <- self$`fpBitsSet`
      }
      if (!is.null(self$`dbLinks`)) {
        StructureCandidateObject[['dbLinks']] <- lapply(self$`dbLinks`, function(x) x$toJSON())
      }
      if (!is.null(self$`pubmedIds`)) {
        StructureCandidateObject[['pubmedIds']] <- self$`pubmedIds`
      }

      StructureCandidateObject
    },
    fromJSON = function(StructureCandidateJson) {
      StructureCandidateObject <- jsonlite::fromJSON(StructureCandidateJson)
      if (!is.null(StructureCandidateObject$`structureName`)) {
        self$`structureName` <- StructureCandidateObject$`structureName`
      }
      if (!is.null(StructureCandidateObject$`smiles`)) {
        self$`smiles` <- StructureCandidateObject$`smiles`
      }
      if (!is.null(StructureCandidateObject$`csiScore`)) {
        self$`csiScore` <- StructureCandidateObject$`csiScore`
      }
      if (!is.null(StructureCandidateObject$`tanimotoSimilarity`)) {
        self$`tanimotoSimilarity` <- StructureCandidateObject$`tanimotoSimilarity`
      }
      if (!is.null(StructureCandidateObject$`confidenceScore`)) {
        self$`confidenceScore` <- StructureCandidateObject$`confidenceScore`
      }
      if (!is.null(StructureCandidateObject$`numOfPubMedIds`)) {
        self$`numOfPubMedIds` <- StructureCandidateObject$`numOfPubMedIds`
      }
      if (!is.null(StructureCandidateObject$`xlogP`)) {
        self$`xlogP` <- StructureCandidateObject$`xlogP`
      }
      if (!is.null(StructureCandidateObject$`inchiKey`)) {
        self$`inchiKey` <- StructureCandidateObject$`inchiKey`
      }
      if (!is.null(StructureCandidateObject$`fpBitsSet`)) {
        self$`fpBitsSet` <- StructureCandidateObject$`fpBitsSet`
      }
      if (!is.null(StructureCandidateObject$`dbLinks`)) {
        self$`dbLinks` <- lapply(StructureCandidateObject$`dbLinks`, function(x) {
          dbLinksObject <- DBLink$new()
          dbLinksObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          dbLinksObject
        })
      }
      if (!is.null(StructureCandidateObject$`pubmedIds`)) {
        self$`pubmedIds` <- StructureCandidateObject$`pubmedIds`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "structureName": %s,
           "smiles": %s,
           "csiScore": %d,
           "tanimotoSimilarity": %d,
           "confidenceScore": %d,
           "numOfPubMedIds": %d,
           "xlogP": %d,
           "inchiKey": %s,
           "fpBitsSet": [%s],
           "dbLinks": [%s],
           "pubmedIds": [%s]
        }',
        self$`structureName`,
        self$`smiles`,
        self$`csiScore`,
        self$`tanimotoSimilarity`,
        self$`confidenceScore`,
        self$`numOfPubMedIds`,
        self$`xlogP`,
        self$`inchiKey`,
        lapply(self$`fpBitsSet`, function(x) paste(paste0('"', x, '"'), sep=",")),
        lapply(self$`dbLinks`, function(x) paste(x$toJSON(), sep=",")),
        lapply(self$`pubmedIds`, function(x) paste(paste0('"', x, '"'), sep=","))
      )
    },
    fromJSONString = function(StructureCandidateJson) {
      StructureCandidateObject <- jsonlite::fromJSON(StructureCandidateJson)
      self$`structureName` <- StructureCandidateObject$`structureName`
      self$`smiles` <- StructureCandidateObject$`smiles`
      self$`csiScore` <- StructureCandidateObject$`csiScore`
      self$`tanimotoSimilarity` <- StructureCandidateObject$`tanimotoSimilarity`
      self$`confidenceScore` <- StructureCandidateObject$`confidenceScore`
      self$`numOfPubMedIds` <- StructureCandidateObject$`numOfPubMedIds`
      self$`xlogP` <- StructureCandidateObject$`xlogP`
      self$`inchiKey` <- StructureCandidateObject$`inchiKey`
      self$`fpBitsSet` <- StructureCandidateObject$`fpBitsSet`
      self$`dbLinks` <- lapply(StructureCandidateObject$`dbLinks`, function(x) DBLink$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`pubmedIds` <- StructureCandidateObject$`pubmedIds`
    }
  )
)
