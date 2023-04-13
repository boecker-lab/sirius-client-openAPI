/*
 * SIRIUS Nightsky API
 * OpenAPI REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.The provided OpenAPI specification allows to autogenerate clients for different programming languages.
 *
 * The version of the OpenAPI document: 0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package JSirius.api;

import JSirius.ApiException;
import JSirius.model.JobId;
import JSirius.model.JobSubmission;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ComputationsApi
 */
@Disabled
public class ComputationsApiTest {

    private final ComputationsApi api = new ComputationsApi();

    /**
     * Delete job.
     *
     * Delete job. Specify how to behave for running jobs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteJobTest() throws ApiException {
        String projectId = null;
        String jobId = null;
        Boolean cancelIfRunning = null;
        Boolean awaitDeletion = null;
        api.deleteJob(projectId, jobId, cancelIfRunning, awaitDeletion);
        // TODO: test validations
    }

    /**
     * Delete job configuration with given name.
     *
     * Delete job configuration with given name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteJobConfigTest() throws ApiException {
        String name = null;
        api.deleteJobConfig(name);
        // TODO: test validations
    }

    /**
     * Request default job configuration
     *
     * Request default job configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDefaultJobConfigTest() throws ApiException {
        Boolean includeConfigMap = null;
        JobSubmission response = api.getDefaultJobConfig(includeConfigMap);
        // TODO: test validations
    }

    /**
     * Get job information and its current state and progress (if available).
     *
     * Get job information and its current state and progress (if available).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getJobTest() throws ApiException {
        String projectId = null;
        String jobId = null;
        Boolean includeState = null;
        Boolean includeCommand = null;
        Boolean includeAffectedCompounds = null;
        JobId response = api.getJob(projectId, jobId, includeState, includeCommand, includeAffectedCompounds);
        // TODO: test validations
    }

    /**
     * Request job configuration with given name.
     *
     * Request job configuration with given name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getJobConfigTest() throws ApiException {
        String name = null;
        Boolean includeConfigMap = null;
        JobSubmission response = api.getJobConfig(name, includeConfigMap);
        // TODO: test validations
    }

    /**
     * Request all available job configurations
     *
     * Request all available job configurations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getJobConfigsTest() throws ApiException {
        Boolean includeConfigMap = null;
        List<JobSubmission> response = api.getJobConfigs(includeConfigMap);
        // TODO: test validations
    }

    /**
     * Get job information and its current state and progress (if available).
     *
     * Get job information and its current state and progress (if available).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getJobsTest() throws ApiException {
        String projectId = null;
        Boolean includeState = null;
        Boolean includeCommand = null;
        Boolean includeAffectedCompounds = null;
        List<JobId> response = api.getJobs(projectId, includeState, includeCommand, includeAffectedCompounds);
        // TODO: test validations
    }

    /**
     * Add new job configuration with given name.
     *
     * Add new job configuration with given name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postJobConfigTest() throws ApiException {
        String name = null;
        JobSubmission jobSubmission = null;
        Boolean overrideExisting = null;
        String response = api.postJobConfig(name, jobSubmission, overrideExisting);
        // TODO: test validations
    }

    /**
     * Start computation for given compounds and with given parameters.
     *
     * Start computation for given compounds and with given parameters.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void startJobTest() throws ApiException {
        String projectId = null;
        JobSubmission jobSubmission = null;
        Boolean includeState = null;
        Boolean includeCommand = null;
        Boolean includeAffectedCompounds = null;
        JobId response = api.startJob(projectId, jobSubmission, includeState, includeCommand, includeAffectedCompounds);
        // TODO: test validations
    }

    /**
     * Start computation for given compounds and with parameters from a stored job-config.
     *
     * Start computation for given compounds and with parameters from a stored job-config.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void startJobFromConfigTest() throws ApiException {
        String projectId = null;
        String jobConfigName = null;
        List<String> requestBody = null;
        Boolean recompute = null;
        Boolean includeState = null;
        Boolean includeCommand = null;
        Boolean includeAffectedCompounds = null;
        JobId response = api.startJobFromConfig(projectId, jobConfigName, requestBody, recompute, includeState, includeCommand, includeAffectedCompounds);
        // TODO: test validations
    }

}
