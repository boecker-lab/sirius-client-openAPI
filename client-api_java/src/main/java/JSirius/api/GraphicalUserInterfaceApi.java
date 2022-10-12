/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package JSirius.api;

import JSirius.ApiCallback;
import JSirius.ApiClient;
import JSirius.ApiException;
import JSirius.ApiResponse;
import JSirius.Configuration;
import JSirius.Pair;
import JSirius.ProgressRequestBody;
import JSirius.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import JSirius.model.GuiParameters;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphicalUserInterfaceApi {
    private ApiClient apiClient;

    public GraphicalUserInterfaceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GraphicalUserInterfaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for applyToGui
     * @param body parameters that should be applied. (required)
     * @param projectId of project-space the GUI instance is connected to. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call applyToGuiCall(GuiParameters body, String projectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/projects/{projectId}/gui"
            .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call applyToGuiValidateBeforeCall(GuiParameters body, String projectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling applyToGui(Async)");
        }
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling applyToGui(Async)");
        }
        
        com.squareup.okhttp.Call call = applyToGuiCall(body, projectId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Apply given changes to the running GUI instance.
     * Apply given changes to the running GUI instance.
     * @param body parameters that should be applied. (required)
     * @param projectId of project-space the GUI instance is connected to. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void applyToGui(GuiParameters body, String projectId) throws ApiException {
        applyToGuiWithHttpInfo(body, projectId);
    }

    /**
     * Apply given changes to the running GUI instance.
     * Apply given changes to the running GUI instance.
     * @param body parameters that should be applied. (required)
     * @param projectId of project-space the GUI instance is connected to. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> applyToGuiWithHttpInfo(GuiParameters body, String projectId) throws ApiException {
        com.squareup.okhttp.Call call = applyToGuiValidateBeforeCall(body, projectId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Apply given changes to the running GUI instance. (asynchronously)
     * Apply given changes to the running GUI instance.
     * @param body parameters that should be applied. (required)
     * @param projectId of project-space the GUI instance is connected to. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call applyToGuiAsync(GuiParameters body, String projectId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = applyToGuiValidateBeforeCall(body, projectId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for closeGui
     * @param projectId if project-space the GUI instance is connected to. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call closeGuiCall(String projectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/projects/{projectId}/gui"
            .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call closeGuiValidateBeforeCall(String projectId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling closeGui(Async)");
        }
        
        com.squareup.okhttp.Call call = closeGuiCall(projectId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Close GUI instance of given project-space if available.
     * Close GUI instance of given project-space if available.
     * @param projectId if project-space the GUI instance is connected to. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void closeGui(String projectId) throws ApiException {
        closeGuiWithHttpInfo(projectId);
    }

    /**
     * Close GUI instance of given project-space if available.
     * Close GUI instance of given project-space if available.
     * @param projectId if project-space the GUI instance is connected to. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> closeGuiWithHttpInfo(String projectId) throws ApiException {
        com.squareup.okhttp.Call call = closeGuiValidateBeforeCall(projectId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Close GUI instance of given project-space if available. (asynchronously)
     * Close GUI instance of given project-space if available.
     * @param projectId if project-space the GUI instance is connected to. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call closeGuiAsync(String projectId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = closeGuiValidateBeforeCall(projectId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for openGui
     * @param projectId of project-space the GUI instance will connect to. (required)
     * @param readOnly open in read-only mode. (optional, default to true)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call openGuiCall(String projectId, Boolean readOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/projects/{projectId}/gui"
            .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (readOnly != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("readOnly", readOnly));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call openGuiValidateBeforeCall(String projectId, Boolean readOnly, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling openGui(Async)");
        }
        
        com.squareup.okhttp.Call call = openGuiCall(projectId, readOnly, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Open GUI instance on specified project-space and bring the GUI window to foreground.
     * Open GUI instance on specified project-space and bring the GUI window to foreground.
     * @param projectId of project-space the GUI instance will connect to. (required)
     * @param readOnly open in read-only mode. (optional, default to true)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void openGui(String projectId, Boolean readOnly) throws ApiException {
        openGuiWithHttpInfo(projectId, readOnly);
    }

    /**
     * Open GUI instance on specified project-space and bring the GUI window to foreground.
     * Open GUI instance on specified project-space and bring the GUI window to foreground.
     * @param projectId of project-space the GUI instance will connect to. (required)
     * @param readOnly open in read-only mode. (optional, default to true)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> openGuiWithHttpInfo(String projectId, Boolean readOnly) throws ApiException {
        com.squareup.okhttp.Call call = openGuiValidateBeforeCall(projectId, readOnly, null, null);
        return apiClient.execute(call);
    }

    /**
     * Open GUI instance on specified project-space and bring the GUI window to foreground. (asynchronously)
     * Open GUI instance on specified project-space and bring the GUI window to foreground.
     * @param projectId of project-space the GUI instance will connect to. (required)
     * @param readOnly open in read-only mode. (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call openGuiAsync(String projectId, Boolean readOnly, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = openGuiValidateBeforeCall(projectId, readOnly, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}