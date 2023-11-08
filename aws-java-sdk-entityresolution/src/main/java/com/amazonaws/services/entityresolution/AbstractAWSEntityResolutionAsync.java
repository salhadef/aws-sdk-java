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
package com.amazonaws.services.entityresolution;

import javax.annotation.Generated;

import com.amazonaws.services.entityresolution.model.*;

/**
 * Abstract implementation of {@code AWSEntityResolutionAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSEntityResolutionAsync extends AbstractAWSEntityResolution implements AWSEntityResolutionAsync {

    protected AbstractAWSEntityResolutionAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateIdMappingWorkflowResult> createIdMappingWorkflowAsync(CreateIdMappingWorkflowRequest request) {

        return createIdMappingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIdMappingWorkflowResult> createIdMappingWorkflowAsync(CreateIdMappingWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateIdMappingWorkflowRequest, CreateIdMappingWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMatchingWorkflowResult> createMatchingWorkflowAsync(CreateMatchingWorkflowRequest request) {

        return createMatchingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMatchingWorkflowResult> createMatchingWorkflowAsync(CreateMatchingWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMatchingWorkflowRequest, CreateMatchingWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSchemaMappingResult> createSchemaMappingAsync(CreateSchemaMappingRequest request) {

        return createSchemaMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSchemaMappingResult> createSchemaMappingAsync(CreateSchemaMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSchemaMappingRequest, CreateSchemaMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteIdMappingWorkflowResult> deleteIdMappingWorkflowAsync(DeleteIdMappingWorkflowRequest request) {

        return deleteIdMappingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdMappingWorkflowResult> deleteIdMappingWorkflowAsync(DeleteIdMappingWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteIdMappingWorkflowRequest, DeleteIdMappingWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMatchingWorkflowResult> deleteMatchingWorkflowAsync(DeleteMatchingWorkflowRequest request) {

        return deleteMatchingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMatchingWorkflowResult> deleteMatchingWorkflowAsync(DeleteMatchingWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMatchingWorkflowRequest, DeleteMatchingWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaMappingResult> deleteSchemaMappingAsync(DeleteSchemaMappingRequest request) {

        return deleteSchemaMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSchemaMappingResult> deleteSchemaMappingAsync(DeleteSchemaMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSchemaMappingRequest, DeleteSchemaMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIdMappingJobResult> getIdMappingJobAsync(GetIdMappingJobRequest request) {

        return getIdMappingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdMappingJobResult> getIdMappingJobAsync(GetIdMappingJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIdMappingJobRequest, GetIdMappingJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIdMappingWorkflowResult> getIdMappingWorkflowAsync(GetIdMappingWorkflowRequest request) {

        return getIdMappingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdMappingWorkflowResult> getIdMappingWorkflowAsync(GetIdMappingWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIdMappingWorkflowRequest, GetIdMappingWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMatchIdResult> getMatchIdAsync(GetMatchIdRequest request) {

        return getMatchIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMatchIdResult> getMatchIdAsync(GetMatchIdRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMatchIdRequest, GetMatchIdResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMatchingJobResult> getMatchingJobAsync(GetMatchingJobRequest request) {

        return getMatchingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMatchingJobResult> getMatchingJobAsync(GetMatchingJobRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMatchingJobRequest, GetMatchingJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMatchingWorkflowResult> getMatchingWorkflowAsync(GetMatchingWorkflowRequest request) {

        return getMatchingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMatchingWorkflowResult> getMatchingWorkflowAsync(GetMatchingWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMatchingWorkflowRequest, GetMatchingWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSchemaMappingResult> getSchemaMappingAsync(GetSchemaMappingRequest request) {

        return getSchemaMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaMappingResult> getSchemaMappingAsync(GetSchemaMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSchemaMappingRequest, GetSchemaMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListIdMappingJobsResult> listIdMappingJobsAsync(ListIdMappingJobsRequest request) {

        return listIdMappingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdMappingJobsResult> listIdMappingJobsAsync(ListIdMappingJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListIdMappingJobsRequest, ListIdMappingJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListIdMappingWorkflowsResult> listIdMappingWorkflowsAsync(ListIdMappingWorkflowsRequest request) {

        return listIdMappingWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdMappingWorkflowsResult> listIdMappingWorkflowsAsync(ListIdMappingWorkflowsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListIdMappingWorkflowsRequest, ListIdMappingWorkflowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMatchingJobsResult> listMatchingJobsAsync(ListMatchingJobsRequest request) {

        return listMatchingJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMatchingJobsResult> listMatchingJobsAsync(ListMatchingJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMatchingJobsRequest, ListMatchingJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMatchingWorkflowsResult> listMatchingWorkflowsAsync(ListMatchingWorkflowsRequest request) {

        return listMatchingWorkflowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMatchingWorkflowsResult> listMatchingWorkflowsAsync(ListMatchingWorkflowsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMatchingWorkflowsRequest, ListMatchingWorkflowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProviderServicesResult> listProviderServicesAsync(ListProviderServicesRequest request) {

        return listProviderServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProviderServicesResult> listProviderServicesAsync(ListProviderServicesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProviderServicesRequest, ListProviderServicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSchemaMappingsResult> listSchemaMappingsAsync(ListSchemaMappingsRequest request) {

        return listSchemaMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchemaMappingsResult> listSchemaMappingsAsync(ListSchemaMappingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSchemaMappingsRequest, ListSchemaMappingsResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartIdMappingJobResult> startIdMappingJobAsync(StartIdMappingJobRequest request) {

        return startIdMappingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartIdMappingJobResult> startIdMappingJobAsync(StartIdMappingJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartIdMappingJobRequest, StartIdMappingJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartMatchingJobResult> startMatchingJobAsync(StartMatchingJobRequest request) {

        return startMatchingJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMatchingJobResult> startMatchingJobAsync(StartMatchingJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartMatchingJobRequest, StartMatchingJobResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateIdMappingWorkflowResult> updateIdMappingWorkflowAsync(UpdateIdMappingWorkflowRequest request) {

        return updateIdMappingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdMappingWorkflowResult> updateIdMappingWorkflowAsync(UpdateIdMappingWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateIdMappingWorkflowRequest, UpdateIdMappingWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMatchingWorkflowResult> updateMatchingWorkflowAsync(UpdateMatchingWorkflowRequest request) {

        return updateMatchingWorkflowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMatchingWorkflowResult> updateMatchingWorkflowAsync(UpdateMatchingWorkflowRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMatchingWorkflowRequest, UpdateMatchingWorkflowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSchemaMappingResult> updateSchemaMappingAsync(UpdateSchemaMappingRequest request) {

        return updateSchemaMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSchemaMappingResult> updateSchemaMappingAsync(UpdateSchemaMappingRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSchemaMappingRequest, UpdateSchemaMappingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
