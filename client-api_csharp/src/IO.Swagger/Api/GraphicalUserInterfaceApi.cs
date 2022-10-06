/* 
 * SIRIUS Nightsky API
 *
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public interface IGraphicalUserInterfaceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Apply given changes to the running GUI instance.
        /// </summary>
        /// <remarks>
        /// Apply given changes to the running GUI instance.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">parameters that should be applied.</param>
        /// <param name="projectId">of project-space the GUI instance is connected to.</param>
        /// <returns></returns>
        void ApplyToGui (GuiParameters body, string projectId);

        /// <summary>
        /// Apply given changes to the running GUI instance.
        /// </summary>
        /// <remarks>
        /// Apply given changes to the running GUI instance.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">parameters that should be applied.</param>
        /// <param name="projectId">of project-space the GUI instance is connected to.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> ApplyToGuiWithHttpInfo (GuiParameters body, string projectId);
        /// <summary>
        /// Close GUI instance of given project-space if available.
        /// </summary>
        /// <remarks>
        /// Close GUI instance of given project-space if available.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">if project-space the GUI instance is connected to.</param>
        /// <returns></returns>
        void CloseGui (string projectId);

        /// <summary>
        /// Close GUI instance of given project-space if available.
        /// </summary>
        /// <remarks>
        /// Close GUI instance of given project-space if available.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">if project-space the GUI instance is connected to.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> CloseGuiWithHttpInfo (string projectId);
        /// <summary>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </summary>
        /// <remarks>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">of project-space the GUI instance will connect to.</param>
        /// <param name="_readOnly">open in read-only mode. (optional, default to true)</param>
        /// <returns></returns>
        void OpenGui (string projectId, bool? _readOnly = null);

        /// <summary>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </summary>
        /// <remarks>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">of project-space the GUI instance will connect to.</param>
        /// <param name="_readOnly">open in read-only mode. (optional, default to true)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> OpenGuiWithHttpInfo (string projectId, bool? _readOnly = null);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Apply given changes to the running GUI instance.
        /// </summary>
        /// <remarks>
        /// Apply given changes to the running GUI instance.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">parameters that should be applied.</param>
        /// <param name="projectId">of project-space the GUI instance is connected to.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task ApplyToGuiAsync (GuiParameters body, string projectId);

        /// <summary>
        /// Apply given changes to the running GUI instance.
        /// </summary>
        /// <remarks>
        /// Apply given changes to the running GUI instance.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">parameters that should be applied.</param>
        /// <param name="projectId">of project-space the GUI instance is connected to.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> ApplyToGuiAsyncWithHttpInfo (GuiParameters body, string projectId);
        /// <summary>
        /// Close GUI instance of given project-space if available.
        /// </summary>
        /// <remarks>
        /// Close GUI instance of given project-space if available.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">if project-space the GUI instance is connected to.</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task CloseGuiAsync (string projectId);

        /// <summary>
        /// Close GUI instance of given project-space if available.
        /// </summary>
        /// <remarks>
        /// Close GUI instance of given project-space if available.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">if project-space the GUI instance is connected to.</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> CloseGuiAsyncWithHttpInfo (string projectId);
        /// <summary>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </summary>
        /// <remarks>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">of project-space the GUI instance will connect to.</param>
        /// <param name="_readOnly">open in read-only mode. (optional, default to true)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task OpenGuiAsync (string projectId, bool? _readOnly = null);

        /// <summary>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </summary>
        /// <remarks>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">of project-space the GUI instance will connect to.</param>
        /// <param name="_readOnly">open in read-only mode. (optional, default to true)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> OpenGuiAsyncWithHttpInfo (string projectId, bool? _readOnly = null);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class GraphicalUserInterfaceApi : IGraphicalUserInterfaceApi
    {
        private IO.Swagger.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="GraphicalUserInterfaceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public GraphicalUserInterfaceApi(String basePath)
        {
            this.Configuration = new IO.Swagger.Client.Configuration { BasePath = basePath };

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GraphicalUserInterfaceApi"/> class
        /// </summary>
        /// <returns></returns>
        public GraphicalUserInterfaceApi()
        {
            this.Configuration = IO.Swagger.Client.Configuration.Default;

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="GraphicalUserInterfaceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public GraphicalUserInterfaceApi(IO.Swagger.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = IO.Swagger.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public IO.Swagger.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public IO.Swagger.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Apply given changes to the running GUI instance. Apply given changes to the running GUI instance.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">parameters that should be applied.</param>
        /// <param name="projectId">of project-space the GUI instance is connected to.</param>
        /// <returns></returns>
        public void ApplyToGui (GuiParameters body, string projectId)
        {
             ApplyToGuiWithHttpInfo(body, projectId);
        }

        /// <summary>
        /// Apply given changes to the running GUI instance. Apply given changes to the running GUI instance.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">parameters that should be applied.</param>
        /// <param name="projectId">of project-space the GUI instance is connected to.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> ApplyToGuiWithHttpInfo (GuiParameters body, string projectId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling GraphicalUserInterfaceApi->ApplyToGui");
            // verify the required parameter 'projectId' is set
            if (projectId == null)
                throw new ApiException(400, "Missing required parameter 'projectId' when calling GraphicalUserInterfaceApi->ApplyToGui");

            var localVarPath = "/api/projects/{projectId}/gui";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (projectId != null) localVarPathParams.Add("projectId", this.Configuration.ApiClient.ParameterToString(projectId)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.PATCH, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ApplyToGui", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Apply given changes to the running GUI instance. Apply given changes to the running GUI instance.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">parameters that should be applied.</param>
        /// <param name="projectId">of project-space the GUI instance is connected to.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task ApplyToGuiAsync (GuiParameters body, string projectId)
        {
             await ApplyToGuiAsyncWithHttpInfo(body, projectId);

        }

        /// <summary>
        /// Apply given changes to the running GUI instance. Apply given changes to the running GUI instance.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="body">parameters that should be applied.</param>
        /// <param name="projectId">of project-space the GUI instance is connected to.</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> ApplyToGuiAsyncWithHttpInfo (GuiParameters body, string projectId)
        {
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling GraphicalUserInterfaceApi->ApplyToGui");
            // verify the required parameter 'projectId' is set
            if (projectId == null)
                throw new ApiException(400, "Missing required parameter 'projectId' when calling GraphicalUserInterfaceApi->ApplyToGui");

            var localVarPath = "/api/projects/{projectId}/gui";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (projectId != null) localVarPathParams.Add("projectId", this.Configuration.ApiClient.ParameterToString(projectId)); // path parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = this.Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PATCH, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ApplyToGui", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Close GUI instance of given project-space if available. Close GUI instance of given project-space if available.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">if project-space the GUI instance is connected to.</param>
        /// <returns></returns>
        public void CloseGui (string projectId)
        {
             CloseGuiWithHttpInfo(projectId);
        }

        /// <summary>
        /// Close GUI instance of given project-space if available. Close GUI instance of given project-space if available.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">if project-space the GUI instance is connected to.</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> CloseGuiWithHttpInfo (string projectId)
        {
            // verify the required parameter 'projectId' is set
            if (projectId == null)
                throw new ApiException(400, "Missing required parameter 'projectId' when calling GraphicalUserInterfaceApi->CloseGui");

            var localVarPath = "/api/projects/{projectId}/gui";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (projectId != null) localVarPathParams.Add("projectId", this.Configuration.ApiClient.ParameterToString(projectId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CloseGui", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Close GUI instance of given project-space if available. Close GUI instance of given project-space if available.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">if project-space the GUI instance is connected to.</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task CloseGuiAsync (string projectId)
        {
             await CloseGuiAsyncWithHttpInfo(projectId);

        }

        /// <summary>
        /// Close GUI instance of given project-space if available. Close GUI instance of given project-space if available.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">if project-space the GUI instance is connected to.</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> CloseGuiAsyncWithHttpInfo (string projectId)
        {
            // verify the required parameter 'projectId' is set
            if (projectId == null)
                throw new ApiException(400, "Missing required parameter 'projectId' when calling GraphicalUserInterfaceApi->CloseGui");

            var localVarPath = "/api/projects/{projectId}/gui";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (projectId != null) localVarPathParams.Add("projectId", this.Configuration.ApiClient.ParameterToString(projectId)); // path parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CloseGui", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground. Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">of project-space the GUI instance will connect to.</param>
        /// <param name="_readOnly">open in read-only mode. (optional, default to true)</param>
        /// <returns></returns>
        public void OpenGui (string projectId, bool? _readOnly = null)
        {
             OpenGuiWithHttpInfo(projectId, _readOnly);
        }

        /// <summary>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground. Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">of project-space the GUI instance will connect to.</param>
        /// <param name="_readOnly">open in read-only mode. (optional, default to true)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> OpenGuiWithHttpInfo (string projectId, bool? _readOnly = null)
        {
            // verify the required parameter 'projectId' is set
            if (projectId == null)
                throw new ApiException(400, "Missing required parameter 'projectId' when calling GraphicalUserInterfaceApi->OpenGui");

            var localVarPath = "/api/projects/{projectId}/gui";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (projectId != null) localVarPathParams.Add("projectId", this.Configuration.ApiClient.ParameterToString(projectId)); // path parameter
            if (_readOnly != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "readOnly", _readOnly)); // query parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("OpenGui", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground. Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">of project-space the GUI instance will connect to.</param>
        /// <param name="_readOnly">open in read-only mode. (optional, default to true)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task OpenGuiAsync (string projectId, bool? _readOnly = null)
        {
             await OpenGuiAsyncWithHttpInfo(projectId, _readOnly);

        }

        /// <summary>
        /// Open GUI instance on specified project-space and bring the GUI window to foreground. Open GUI instance on specified project-space and bring the GUI window to foreground.
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="projectId">of project-space the GUI instance will connect to.</param>
        /// <param name="_readOnly">open in read-only mode. (optional, default to true)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> OpenGuiAsyncWithHttpInfo (string projectId, bool? _readOnly = null)
        {
            // verify the required parameter 'projectId' is set
            if (projectId == null)
                throw new ApiException(400, "Missing required parameter 'projectId' when calling GraphicalUserInterfaceApi->OpenGui");

            var localVarPath = "/api/projects/{projectId}/gui";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (projectId != null) localVarPathParams.Add("projectId", this.Configuration.ApiClient.ParameterToString(projectId)); // path parameter
            if (_readOnly != null) localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "readOnly", _readOnly)); // query parameter

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("OpenGui", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}