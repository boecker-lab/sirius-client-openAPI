# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' AccountInfo Class
#'
#' @field userID 
#' @field username 
#' @field userEmail 
#' @field gravatarURL 
#' @field subscriptions 
#' @field activeSubscriptionId 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AccountInfo <- R6::R6Class(
  'AccountInfo',
  public = list(
    `userID` = NULL,
    `username` = NULL,
    `userEmail` = NULL,
    `gravatarURL` = NULL,
    `subscriptions` = NULL,
    `activeSubscriptionId` = NULL,
    initialize = function(`userID`, `username`, `userEmail`, `gravatarURL`, `subscriptions`, `activeSubscriptionId`){
      if (!missing(`userID`)) {
        stopifnot(is.character(`userID`), length(`userID`) == 1)
        self$`userID` <- `userID`
      }
      if (!missing(`username`)) {
        stopifnot(is.character(`username`), length(`username`) == 1)
        self$`username` <- `username`
      }
      if (!missing(`userEmail`)) {
        stopifnot(is.character(`userEmail`), length(`userEmail`) == 1)
        self$`userEmail` <- `userEmail`
      }
      if (!missing(`gravatarURL`)) {
        stopifnot(is.character(`gravatarURL`), length(`gravatarURL`) == 1)
        self$`gravatarURL` <- `gravatarURL`
      }
      if (!missing(`subscriptions`)) {
        stopifnot(is.list(`subscriptions`), length(`subscriptions`) != 0)
        lapply(`subscriptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`subscriptions` <- `subscriptions`
      }
      if (!missing(`activeSubscriptionId`)) {
        stopifnot(is.character(`activeSubscriptionId`), length(`activeSubscriptionId`) == 1)
        self$`activeSubscriptionId` <- `activeSubscriptionId`
      }
    },
    toJSON = function() {
      AccountInfoObject <- list()
      if (!is.null(self$`userID`)) {
        AccountInfoObject[['userID']] <- self$`userID`
      }
      if (!is.null(self$`username`)) {
        AccountInfoObject[['username']] <- self$`username`
      }
      if (!is.null(self$`userEmail`)) {
        AccountInfoObject[['userEmail']] <- self$`userEmail`
      }
      if (!is.null(self$`gravatarURL`)) {
        AccountInfoObject[['gravatarURL']] <- self$`gravatarURL`
      }
      if (!is.null(self$`subscriptions`)) {
        AccountInfoObject[['subscriptions']] <- lapply(self$`subscriptions`, function(x) x$toJSON())
      }
      if (!is.null(self$`activeSubscriptionId`)) {
        AccountInfoObject[['activeSubscriptionId']] <- self$`activeSubscriptionId`
      }

      AccountInfoObject
    },
    fromJSON = function(AccountInfoJson) {
      AccountInfoObject <- jsonlite::fromJSON(AccountInfoJson)
      if (!is.null(AccountInfoObject$`userID`)) {
        self$`userID` <- AccountInfoObject$`userID`
      }
      if (!is.null(AccountInfoObject$`username`)) {
        self$`username` <- AccountInfoObject$`username`
      }
      if (!is.null(AccountInfoObject$`userEmail`)) {
        self$`userEmail` <- AccountInfoObject$`userEmail`
      }
      if (!is.null(AccountInfoObject$`gravatarURL`)) {
        self$`gravatarURL` <- AccountInfoObject$`gravatarURL`
      }
      if (!is.null(AccountInfoObject$`subscriptions`)) {
        self$`subscriptions` <- lapply(AccountInfoObject$`subscriptions`, function(x) {
          subscriptionsObject <- Subscription$new()
          subscriptionsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          subscriptionsObject
        })
      }
      if (!is.null(AccountInfoObject$`activeSubscriptionId`)) {
        self$`activeSubscriptionId` <- AccountInfoObject$`activeSubscriptionId`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "userID": %s,
           "username": %s,
           "userEmail": %s,
           "gravatarURL": %s,
           "subscriptions": [%s],
           "activeSubscriptionId": %s
        }',
        self$`userID`,
        self$`username`,
        self$`userEmail`,
        self$`gravatarURL`,
        lapply(self$`subscriptions`, function(x) paste(x$toJSON(), sep=",")),
        self$`activeSubscriptionId`
      )
    },
    fromJSONString = function(AccountInfoJson) {
      AccountInfoObject <- jsonlite::fromJSON(AccountInfoJson)
      self$`userID` <- AccountInfoObject$`userID`
      self$`username` <- AccountInfoObject$`username`
      self$`userEmail` <- AccountInfoObject$`userEmail`
      self$`gravatarURL` <- AccountInfoObject$`gravatarURL`
      self$`subscriptions` <- lapply(AccountInfoObject$`subscriptions`, function(x) Subscription$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`activeSubscriptionId` <- AccountInfoObject$`activeSubscriptionId`
    }
  )
)
