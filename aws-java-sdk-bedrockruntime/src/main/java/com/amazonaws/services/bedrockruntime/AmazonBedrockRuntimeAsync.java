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
package com.amazonaws.services.bedrockruntime;

import javax.annotation.Generated;

import com.amazonaws.services.bedrockruntime.model.*;

/**
 * Interface for accessing Amazon Bedrock Runtime asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrockruntime.AbstractAmazonBedrockRuntimeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Describes the API operations for running inference using Bedrock models.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonBedrockRuntimeAsync extends AmazonBedrockRuntime {

    /**
     * <p>
     * Invokes the specified Bedrock model to run inference using the input provided in the request body. You use
     * InvokeModel to run inference for text models, image models, and embedding models.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html">Run
     * inference</a> in the Bedrock User Guide.
     * </p>
     * <p>
     * For example requests, see Examples (after the Errors section).
     * </p>
     * 
     * @param invokeModelRequest
     * @return A Java Future containing the result of the InvokeModel operation returned by the service.
     * @sample AmazonBedrockRuntimeAsync.InvokeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/InvokeModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InvokeModelResult> invokeModelAsync(InvokeModelRequest invokeModelRequest);

    /**
     * <p>
     * Invokes the specified Bedrock model to run inference using the input provided in the request body. You use
     * InvokeModel to run inference for text models, image models, and embedding models.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/api-methods-run.html">Run
     * inference</a> in the Bedrock User Guide.
     * </p>
     * <p>
     * For example requests, see Examples (after the Errors section).
     * </p>
     * 
     * @param invokeModelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InvokeModel operation returned by the service.
     * @sample AmazonBedrockRuntimeAsyncHandler.InvokeModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/InvokeModel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<InvokeModelResult> invokeModelAsync(InvokeModelRequest invokeModelRequest,
            com.amazonaws.handlers.AsyncHandler<InvokeModelRequest, InvokeModelResult> asyncHandler);

}
