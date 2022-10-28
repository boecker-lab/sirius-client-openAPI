# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' FragmentationTree Class
#'
#' @field fragments 
#' @field losses 
#' @field treeScore 
#' @field root 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FragmentationTree <- R6::R6Class(
  'FragmentationTree',
  public = list(
    `fragments` = NULL,
    `losses` = NULL,
    `treeScore` = NULL,
    `root` = NULL,
    initialize = function(`fragments`, `losses`, `treeScore`, `root`){
      if (!missing(`fragments`)) {
        stopifnot(is.list(`fragments`), length(`fragments`) != 0)
        lapply(`fragments`, function(x) stopifnot(R6::is.R6(x)))
        self$`fragments` <- `fragments`
      }
      if (!missing(`losses`)) {
        stopifnot(is.list(`losses`), length(`losses`) != 0)
        lapply(`losses`, function(x) stopifnot(R6::is.R6(x)))
        self$`losses` <- `losses`
      }
      if (!missing(`treeScore`)) {
        stopifnot(is.numeric(`treeScore`), length(`treeScore`) == 1)
        self$`treeScore` <- `treeScore`
      }
      if (!missing(`root`)) {
        stopifnot(R6::is.R6(`root`))
        self$`root` <- `root`
      }
    },
    toJSON = function() {
      FragmentationTreeObject <- list()
      if (!is.null(self$`fragments`)) {
        FragmentationTreeObject[['fragments']] <- lapply(self$`fragments`, function(x) x$toJSON())
      }
      if (!is.null(self$`losses`)) {
        FragmentationTreeObject[['losses']] <- lapply(self$`losses`, function(x) x$toJSON())
      }
      if (!is.null(self$`treeScore`)) {
        FragmentationTreeObject[['treeScore']] <- self$`treeScore`
      }
      if (!is.null(self$`root`)) {
        FragmentationTreeObject[['root']] <- self$`root`$toJSON()
      }

      FragmentationTreeObject
    },
    fromJSON = function(FragmentationTreeJson) {
      FragmentationTreeObject <- jsonlite::fromJSON(FragmentationTreeJson)
      if (!is.null(FragmentationTreeObject$`fragments`)) {
        self$`fragments` <- lapply(FragmentationTreeObject$`fragments`, function(x) {
          fragmentsObject <- FragmentNode$new()
          fragmentsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          fragmentsObject
        })
      }
      if (!is.null(FragmentationTreeObject$`losses`)) {
        self$`losses` <- lapply(FragmentationTreeObject$`losses`, function(x) {
          lossesObject <- LossEdge$new()
          lossesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          lossesObject
        })
      }
      if (!is.null(FragmentationTreeObject$`treeScore`)) {
        self$`treeScore` <- FragmentationTreeObject$`treeScore`
      }
      if (!is.null(FragmentationTreeObject$`root`)) {
        rootObject <- FragmentNode$new()
        rootObject$fromJSON(jsonlite::toJSON(FragmentationTreeObject$root, auto_unbox = TRUE))
        self$`root` <- rootObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "fragments": [%s],
           "losses": [%s],
           "treeScore": %d,
           "root": %s
        }',
        lapply(self$`fragments`, function(x) paste(x$toJSON(), sep=",")),
        lapply(self$`losses`, function(x) paste(x$toJSON(), sep=",")),
        self$`treeScore`,
        self$`root`$toJSON()
      )
    },
    fromJSONString = function(FragmentationTreeJson) {
      FragmentationTreeObject <- jsonlite::fromJSON(FragmentationTreeJson)
      self$`fragments` <- lapply(FragmentationTreeObject$`fragments`, function(x) FragmentNode$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`losses` <- lapply(FragmentationTreeObject$`losses`, function(x) LossEdge$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`treeScore` <- FragmentationTreeObject$`treeScore`
      FragmentNodeObject <- FragmentNode$new()
      self$`root` <- FragmentNodeObject$fromJSON(jsonlite::toJSON(FragmentationTreeObject$root, auto_unbox = TRUE))
    }
  )
)
