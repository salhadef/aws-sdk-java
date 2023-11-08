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

import com.amazonaws.services.bedrock.model.*;

/**
 * Abstract implementation of {@code AmazonBedrockAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonBedrockAsync extends AbstractAmazonBedrock implements AmazonBedrockAsync {

    protected AbstractAmazonBedrockAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateModelCustomizationJobResult> createModelCustomizationJobAsync(CreateModelCustomizationJobRequest request) {

        return createModelCustomizationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelCustomizationJobResult> createModelCustomizationJobAsync(CreateModelCustomizationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateModelCustomizationJobRequest, CreateModelCustomizationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateProvisionedModelThroughputResult> createProvisionedModelThroughputAsync(
            CreateProvisionedModelThroughputRequest request) {

        return createProvisionedModelThroughputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProvisionedModelThroughputResult> createProvisionedModelThroughputAsync(
            CreateProvisionedModelThroughputRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateProvisionedModelThroughputRequest, CreateProvisionedModelThroughputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomModelResult> deleteCustomModelAsync(DeleteCustomModelRequest request) {

        return deleteCustomModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomModelResult> deleteCustomModelAsync(DeleteCustomModelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomModelRequest, DeleteCustomModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteModelInvocationLoggingConfigurationResult> deleteModelInvocationLoggingConfigurationAsync(
            DeleteModelInvocationLoggingConfigurationRequest request) {

        return deleteModelInvocationLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelInvocationLoggingConfigurationResult> deleteModelInvocationLoggingConfigurationAsync(
            DeleteModelInvocationLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteModelInvocationLoggingConfigurationRequest, DeleteModelInvocationLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisionedModelThroughputResult> deleteProvisionedModelThroughputAsync(
            DeleteProvisionedModelThroughputRequest request) {

        return deleteProvisionedModelThroughputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProvisionedModelThroughputResult> deleteProvisionedModelThroughputAsync(
            DeleteProvisionedModelThroughputRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteProvisionedModelThroughputRequest, DeleteProvisionedModelThroughputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCustomModelResult> getCustomModelAsync(GetCustomModelRequest request) {

        return getCustomModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCustomModelResult> getCustomModelAsync(GetCustomModelRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCustomModelRequest, GetCustomModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFoundationModelResult> getFoundationModelAsync(GetFoundationModelRequest request) {

        return getFoundationModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFoundationModelResult> getFoundationModelAsync(GetFoundationModelRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFoundationModelRequest, GetFoundationModelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetModelCustomizationJobResult> getModelCustomizationJobAsync(GetModelCustomizationJobRequest request) {

        return getModelCustomizationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelCustomizationJobResult> getModelCustomizationJobAsync(GetModelCustomizationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetModelCustomizationJobRequest, GetModelCustomizationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetModelInvocationLoggingConfigurationResult> getModelInvocationLoggingConfigurationAsync(
            GetModelInvocationLoggingConfigurationRequest request) {

        return getModelInvocationLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelInvocationLoggingConfigurationResult> getModelInvocationLoggingConfigurationAsync(
            GetModelInvocationLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetModelInvocationLoggingConfigurationRequest, GetModelInvocationLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProvisionedModelThroughputResult> getProvisionedModelThroughputAsync(GetProvisionedModelThroughputRequest request) {

        return getProvisionedModelThroughputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProvisionedModelThroughputResult> getProvisionedModelThroughputAsync(GetProvisionedModelThroughputRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProvisionedModelThroughputRequest, GetProvisionedModelThroughputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCustomModelsResult> listCustomModelsAsync(ListCustomModelsRequest request) {

        return listCustomModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomModelsResult> listCustomModelsAsync(ListCustomModelsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCustomModelsRequest, ListCustomModelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFoundationModelsResult> listFoundationModelsAsync(ListFoundationModelsRequest request) {

        return listFoundationModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFoundationModelsResult> listFoundationModelsAsync(ListFoundationModelsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFoundationModelsRequest, ListFoundationModelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListModelCustomizationJobsResult> listModelCustomizationJobsAsync(ListModelCustomizationJobsRequest request) {

        return listModelCustomizationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListModelCustomizationJobsResult> listModelCustomizationJobsAsync(ListModelCustomizationJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListModelCustomizationJobsRequest, ListModelCustomizationJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProvisionedModelThroughputsResult> listProvisionedModelThroughputsAsync(
            ListProvisionedModelThroughputsRequest request) {

        return listProvisionedModelThroughputsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProvisionedModelThroughputsResult> listProvisionedModelThroughputsAsync(
            ListProvisionedModelThroughputsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProvisionedModelThroughputsRequest, ListProvisionedModelThroughputsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutModelInvocationLoggingConfigurationResult> putModelInvocationLoggingConfigurationAsync(
            PutModelInvocationLoggingConfigurationRequest request) {

        return putModelInvocationLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutModelInvocationLoggingConfigurationResult> putModelInvocationLoggingConfigurationAsync(
            PutModelInvocationLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutModelInvocationLoggingConfigurationRequest, PutModelInvocationLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopModelCustomizationJobResult> stopModelCustomizationJobAsync(StopModelCustomizationJobRequest request) {

        return stopModelCustomizationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopModelCustomizationJobResult> stopModelCustomizationJobAsync(StopModelCustomizationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StopModelCustomizationJobRequest, StopModelCustomizationJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisionedModelThroughputResult> updateProvisionedModelThroughputAsync(
            UpdateProvisionedModelThroughputRequest request) {

        return updateProvisionedModelThroughputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProvisionedModelThroughputResult> updateProvisionedModelThroughputAsync(
            UpdateProvisionedModelThroughputRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateProvisionedModelThroughputRequest, UpdateProvisionedModelThroughputResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
