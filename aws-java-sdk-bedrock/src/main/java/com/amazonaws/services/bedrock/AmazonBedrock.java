/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.bedrock;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.bedrock.model.*;

/**
 * Interface for accessing Amazon Bedrock.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrock.AbstractAmazonBedrock} instead.
 * </p>
 * <p>
 * <p>
 * Describes the API operations for creating and managing Bedrock models.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonBedrock {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "bedrock";

    /**
     * <p>
     * Creates a fine-tuning job to customize a base model.
     * </p>
     * <p>
     * You specify the base foundation model and the location of the training data. After the model-customization job
     * completes successfully, your custom model resource will be ready to use. Training data contains input and output
     * text for each record in a JSONL format. Optionally, you can specify validation data in the same format as the
     * training data. Bedrock returns validation loss metrics and output generations after the job completes.
     * </p>
     * <p>
     * Model-customization jobs are asynchronous and the completion time depends on the base model and the
     * training/validation data size. To monitor a job, use the <code>GetModelCustomizationJob</code> operation to
     * retrieve the job status.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Bedrock
     * User Guide.
     * </p>
     * 
     * @param createModelCustomizationJobRequest
     * @return Result of the CreateModelCustomizationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateModelCustomizationJobResult createModelCustomizationJob(CreateModelCustomizationJobRequest createModelCustomizationJobRequest);

    /**
     * <p>
     * Creates a provisioned throughput with dedicated capacity for a foundation model or a fine-tuned model.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Provisioned throughput</a> in
     * the Bedrock User Guide.
     * </p>
     * 
     * @param createProvisionedModelThroughputRequest
     * @return Result of the CreateProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws ServiceQuotaExceededException
     *         The number of requests exceeds the service quota. Resubmit your request later.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.CreateProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProvisionedModelThroughputResult createProvisionedModelThroughput(CreateProvisionedModelThroughputRequest createProvisionedModelThroughputRequest);

    /**
     * <p>
     * Deletes a custom model that you created earlier. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Bedrock
     * User Guide.
     * </p>
     * 
     * @param deleteCustomModelRequest
     * @return Result of the DeleteCustomModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.DeleteCustomModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteCustomModel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCustomModelResult deleteCustomModel(DeleteCustomModelRequest deleteCustomModelRequest);

    /**
     * <p>
     * Delete the invocation logging.
     * </p>
     * 
     * @param deleteModelInvocationLoggingConfigurationRequest
     * @return Result of the DeleteModelInvocationLoggingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.DeleteModelInvocationLoggingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteModelInvocationLoggingConfigurationResult deleteModelInvocationLoggingConfiguration(
            DeleteModelInvocationLoggingConfigurationRequest deleteModelInvocationLoggingConfigurationRequest);

    /**
     * <p>
     * Deletes a provisioned throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Provisioned throughput</a> in
     * the Bedrock User Guide.
     * </p>
     * 
     * @param deleteProvisionedModelThroughputRequest
     * @return Result of the DeleteProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.DeleteProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/DeleteProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProvisionedModelThroughputResult deleteProvisionedModelThroughput(DeleteProvisionedModelThroughputRequest deleteProvisionedModelThroughputRequest);

    /**
     * <p>
     * Get the properties associated with a Bedrock custom model that you have created.For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Bedrock
     * User Guide.
     * </p>
     * 
     * @param getCustomModelRequest
     * @return Result of the GetCustomModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetCustomModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetCustomModel" target="_top">AWS API
     *      Documentation</a>
     */
    GetCustomModelResult getCustomModel(GetCustomModelRequest getCustomModelRequest);

    /**
     * <p>
     * Get details about a Bedrock foundation model.
     * </p>
     * 
     * @param getFoundationModelRequest
     * @return Result of the GetFoundationModel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetFoundationModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetFoundationModel" target="_top">AWS API
     *      Documentation</a>
     */
    GetFoundationModelResult getFoundationModel(GetFoundationModelRequest getFoundationModelRequest);

    /**
     * <p>
     * Retrieves the properties associated with a model-customization job, including the status of the job. For more
     * information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom
     * models</a> in the Bedrock User Guide.
     * </p>
     * 
     * @param getModelCustomizationJobRequest
     * @return Result of the GetModelCustomizationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    GetModelCustomizationJobResult getModelCustomizationJob(GetModelCustomizationJobRequest getModelCustomizationJobRequest);

    /**
     * <p>
     * Get the current configuration values for model invocation logging.
     * </p>
     * 
     * @param getModelInvocationLoggingConfigurationRequest
     * @return Result of the GetModelInvocationLoggingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetModelInvocationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetModelInvocationLoggingConfigurationResult getModelInvocationLoggingConfiguration(
            GetModelInvocationLoggingConfigurationRequest getModelInvocationLoggingConfigurationRequest);

    /**
     * <p>
     * Get details for a provisioned throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Provisioned throughput</a> in
     * the Bedrock User Guide.
     * </p>
     * 
     * @param getProvisionedModelThroughputRequest
     * @return Result of the GetProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.GetProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    GetProvisionedModelThroughputResult getProvisionedModelThroughput(GetProvisionedModelThroughputRequest getProvisionedModelThroughputRequest);

    /**
     * <p>
     * Returns a list of the custom models that you have created with the <code>CreateModelCustomizationJob</code>
     * operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Bedrock
     * User Guide.
     * </p>
     * 
     * @param listCustomModelsRequest
     * @return Result of the ListCustomModels operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListCustomModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListCustomModels" target="_top">AWS API
     *      Documentation</a>
     */
    ListCustomModelsResult listCustomModels(ListCustomModelsRequest listCustomModelsRequest);

    /**
     * <p>
     * List of Bedrock foundation models that you can use. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/foundation-models.html">Foundation models</a> in the
     * Bedrock User Guide.
     * </p>
     * 
     * @param listFoundationModelsRequest
     * @return Result of the ListFoundationModels operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListFoundationModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListFoundationModels" target="_top">AWS
     *      API Documentation</a>
     */
    ListFoundationModelsResult listFoundationModels(ListFoundationModelsRequest listFoundationModelsRequest);

    /**
     * <p>
     * Returns a list of model customization jobs that you have submitted. You can filter the jobs to return based on
     * one or more criteria.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Bedrock
     * User Guide.
     * </p>
     * 
     * @param listModelCustomizationJobsRequest
     * @return Result of the ListModelCustomizationJobs operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListModelCustomizationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListModelCustomizationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListModelCustomizationJobsResult listModelCustomizationJobs(ListModelCustomizationJobsRequest listModelCustomizationJobsRequest);

    /**
     * <p>
     * List the provisioned capacities. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Provisioned throughput</a> in
     * the Bedrock User Guide.
     * </p>
     * 
     * @param listProvisionedModelThroughputsRequest
     * @return Result of the ListProvisionedModelThroughputs operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListProvisionedModelThroughputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListProvisionedModelThroughputs"
     *      target="_top">AWS API Documentation</a>
     */
    ListProvisionedModelThroughputsResult listProvisionedModelThroughputs(ListProvisionedModelThroughputsRequest listProvisionedModelThroughputsRequest);

    /**
     * <p>
     * List the tags associated with the specified resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Tagging resources</a> in the
     * Bedrock User Guide.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Set the configuration values for model invocation logging.
     * </p>
     * 
     * @param putModelInvocationLoggingConfigurationRequest
     * @return Result of the PutModelInvocationLoggingConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.PutModelInvocationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/PutModelInvocationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutModelInvocationLoggingConfigurationResult putModelInvocationLoggingConfiguration(
            PutModelInvocationLoggingConfigurationRequest putModelInvocationLoggingConfigurationRequest);

    /**
     * <p>
     * Stops an active model customization job. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/custom-models.html">Custom models</a> in the Bedrock
     * User Guide.
     * </p>
     * 
     * @param stopModelCustomizationJobRequest
     * @return Result of the StopModelCustomizationJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws ConflictException
     *         Error occurred because of a conflict while performing an operation.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.StopModelCustomizationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/StopModelCustomizationJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopModelCustomizationJobResult stopModelCustomizationJob(StopModelCustomizationJobRequest stopModelCustomizationJobRequest);

    /**
     * <p>
     * Associate tags with a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Tagging resources</a> in the
     * Bedrock User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove one or more tags from a resource. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Tagging resources</a> in the
     * Bedrock User Guide.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update a provisioned throughput. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/what-is-service.html">Provisioned throughput</a> in
     * the Bedrock User Guide.
     * </p>
     * 
     * @param updateProvisionedModelThroughputRequest
     * @return Result of the UpdateProvisionedModelThroughput operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws AccessDeniedException
     *         The request is denied because of missing access permissions.
     * @throws ValidationException
     *         Input validation failed. Check your request parameters and retry the request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @throws ThrottlingException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @sample AmazonBedrock.UpdateProvisionedModelThroughput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateProvisionedModelThroughput"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProvisionedModelThroughputResult updateProvisionedModelThroughput(UpdateProvisionedModelThroughputRequest updateProvisionedModelThroughputRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
