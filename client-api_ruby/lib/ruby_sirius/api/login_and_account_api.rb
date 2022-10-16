=begin
#SIRIUS Nightsky API

#REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.

OpenAPI spec version: v0.9 on SIRIUS 5.6.1-SNAPSHOT

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.35
=end

module RubySirius
  class LoginAndAccountApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get information about the account currently logged in.
    # Get information about the account currently logged in. Fails if not logged in.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :include_subs include available and active subscriptions in {@link AccountInfo AccountInfo}. (default to false)
    # @return [AccountInfo]
    def get_account_info(opts = {})
      data, _status_code, _headers = get_account_info_with_http_info(opts)
      data
    end

    # Get information about the account currently logged in.
    # Get information about the account currently logged in. Fails if not logged in.
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :include_subs include available and active subscriptions in {@link AccountInfo AccountInfo}.
    # @return [Array<(AccountInfo, Integer, Hash)>] AccountInfo data, response status code and response headers
    def get_account_info_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: LoginAndAccountApi.get_account_info ...'
      end
      # resource path
      local_var_path = '/api/account/'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'includeSubs'] = opts[:'include_subs'] if !opts[:'include_subs'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'AccountInfo' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: LoginAndAccountApi#get_account_info\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get SignUp URL (For signUp via web browser)
    # Get SignUp URL (For signUp via web browser)
    # @param [Hash] opts the optional parameters
    # @return [String]
    def get_sign_up_url(opts = {})
      data, _status_code, _headers = get_sign_up_url_with_http_info(opts)
      data
    end

    # Get SignUp URL (For signUp via web browser)
    # Get SignUp URL (For signUp via web browser)
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def get_sign_up_url_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: LoginAndAccountApi.get_sign_up_url ...'
      end
      # resource path
      local_var_path = '/api/account/signUpURL'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['text/plain'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'String' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: LoginAndAccountApi#get_sign_up_url\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get available subscriptions of the account currently logged in.
    # Get available subscriptions of the account currently logged in. Fails if not logged in.
    # @param [Hash] opts the optional parameters
    # @return [Array<Subscription>]
    def get_subscriptions(opts = {})
      data, _status_code, _headers = get_subscriptions_with_http_info(opts)
      data
    end

    # Get available subscriptions of the account currently logged in.
    # Get available subscriptions of the account currently logged in. Fails if not logged in.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<Subscription>, Integer, Hash)>] Array<Subscription> data, response status code and response headers
    def get_subscriptions_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: LoginAndAccountApi.get_subscriptions ...'
      end
      # resource path
      local_var_path = '/api/account/subscriptions'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'Array<Subscription>' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: LoginAndAccountApi#get_subscriptions\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Check if a user is logged in.
    # Check if a user is logged in.
    # @param [Hash] opts the optional parameters
    # @return [BOOLEAN]
    def is_logged_in(opts = {})
      data, _status_code, _headers = is_logged_in_with_http_info(opts)
      data
    end

    # Check if a user is logged in.
    # Check if a user is logged in.
    # @param [Hash] opts the optional parameters
    # @return [Array<(BOOLEAN, Integer, Hash)>] BOOLEAN data, response status code and response headers
    def is_logged_in_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: LoginAndAccountApi.is_logged_in ...'
      end
      # resource path
      local_var_path = '/api/account/isLoggedIn'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'BOOLEAN' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: LoginAndAccountApi#is_logged_in\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Login into SIRIUS web services.
    # Login into SIRIUS web services.
    # @param body used to log in.
    # @param accept_terms 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :fail_when_logged_in if true request fails if an active login already exists. (default to false)
    # @option opts [BOOLEAN] :include_subs include available and active subscriptions in {@link AccountInfo AccountInfo}. (default to false)
    # @return [AccountInfo]
    def login(body, accept_terms, opts = {})
      data, _status_code, _headers = login_with_http_info(body, accept_terms, opts)
      data
    end

    # Login into SIRIUS web services.
    # Login into SIRIUS web services.
    # @param body used to log in.
    # @param accept_terms 
    # @param [Hash] opts the optional parameters
    # @option opts [BOOLEAN] :fail_when_logged_in if true request fails if an active login already exists.
    # @option opts [BOOLEAN] :include_subs include available and active subscriptions in {@link AccountInfo AccountInfo}.
    # @return [Array<(AccountInfo, Integer, Hash)>] AccountInfo data, response status code and response headers
    def login_with_http_info(body, accept_terms, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: LoginAndAccountApi.login ...'
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling LoginAndAccountApi.login"
      end
      # verify the required parameter 'accept_terms' is set
      if @api_client.config.client_side_validation && accept_terms.nil?
        fail ArgumentError, "Missing the required parameter 'accept_terms' when calling LoginAndAccountApi.login"
      end
      # resource path
      local_var_path = '/api/account/login'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'acceptTerms'] = accept_terms
      query_params[:'failWhenLoggedIn'] = opts[:'fail_when_logged_in'] if !opts[:'fail_when_logged_in'].nil?
      query_params[:'includeSubs'] = opts[:'include_subs'] if !opts[:'include_subs'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(body) 

      return_type = opts[:return_type] || 'AccountInfo' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: LoginAndAccountApi#login\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Logout from SIRIUS web services.
    # Logout from SIRIUS web services.
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def logout(opts = {})
      logout_with_http_info(opts)
      nil
    end

    # Logout from SIRIUS web services.
    # Logout from SIRIUS web services.
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def logout_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: LoginAndAccountApi.logout ...'
      end
      # resource path
      local_var_path = '/api/account/logout'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: LoginAndAccountApi#logout\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Open SignUp window in system browser and return signUp link.
    # Open SignUp window in system browser and return signUp link.
    # @param [Hash] opts the optional parameters
    # @return [String]
    def sign_up(opts = {})
      data, _status_code, _headers = sign_up_with_http_info(opts)
      data
    end

    # Open SignUp window in system browser and return signUp link.
    # Open SignUp window in system browser and return signUp link.
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Integer, Hash)>] String data, response status code and response headers
    def sign_up_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: LoginAndAccountApi.sign_up ...'
      end
      # resource path
      local_var_path = '/api/account/signUp'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['text/plain'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'String' 

      auth_names = opts[:auth_names] || []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: LoginAndAccountApi#sign_up\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
