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
package com.amazonaws.services.ivsrealtime;

import javax.annotation.Generated;

import com.amazonaws.services.ivsrealtime.model.*;

/**
 * Abstract implementation of {@code AmazonIVSRealTimeAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonIVSRealTimeAsync extends AbstractAmazonIVSRealTime implements AmazonIVSRealTimeAsync {

    protected AbstractAmazonIVSRealTimeAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateParticipantTokenResult> createParticipantTokenAsync(CreateParticipantTokenRequest request) {

        return createParticipantTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateParticipantTokenResult> createParticipantTokenAsync(CreateParticipantTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateParticipantTokenRequest, CreateParticipantTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest request) {

        return createStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest request) {

        return deleteStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, DeleteStageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(DisconnectParticipantRequest request) {

        return disconnectParticipantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(DisconnectParticipantRequest request,
            com.amazonaws.handlers.AsyncHandler<DisconnectParticipantRequest, DisconnectParticipantResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetParticipantResult> getParticipantAsync(GetParticipantRequest request) {

        return getParticipantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParticipantResult> getParticipantAsync(GetParticipantRequest request,
            com.amazonaws.handlers.AsyncHandler<GetParticipantRequest, GetParticipantResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest request) {

        return getStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest request,
            com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetStageSessionResult> getStageSessionAsync(GetStageSessionRequest request) {

        return getStageSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStageSessionResult> getStageSessionAsync(GetStageSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetStageSessionRequest, GetStageSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListParticipantEventsResult> listParticipantEventsAsync(ListParticipantEventsRequest request) {

        return listParticipantEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListParticipantEventsResult> listParticipantEventsAsync(ListParticipantEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListParticipantEventsRequest, ListParticipantEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListParticipantsResult> listParticipantsAsync(ListParticipantsRequest request) {

        return listParticipantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListParticipantsResult> listParticipantsAsync(ListParticipantsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListParticipantsRequest, ListParticipantsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStageSessionsResult> listStageSessionsAsync(ListStageSessionsRequest request) {

        return listStageSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStageSessionsResult> listStageSessionsAsync(ListStageSessionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStageSessionsRequest, ListStageSessionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStagesResult> listStagesAsync(ListStagesRequest request) {

        return listStagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStagesResult> listStagesAsync(ListStagesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStagesRequest, ListStagesResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest request) {

        return updateStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
