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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ivsrealtime.model.*;

/**
 * Interface for accessing ivsrealtime.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ivsrealtime.AbstractAmazonIVSRealTime} instead.
 * </p>
 * <p>
 * <p>
 * <b>Introduction</b>
 * </p>
 * <p>
 * The Amazon Interactive Video Service (IVS) real-time API is REST compatible, using a standard HTTP API and an AWS
 * EventBridge event stream for responses. JSON is used for both requests and responses, including errors.
 * </p>
 * <p>
 * Terminology:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A <i>stage</i> is a virtual space where participants can exchange video in real time.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <i>participant token</i> is a token that authenticates a participant when they join a stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <i>participant object</i> represents participants (people) in the stage and contains information about them. When a
 * token is created, it includes a participant ID; when a participant uses that token to join a stage, the participant
 * is associated with that participant ID There is a 1:1 mapping between participant tokens and participants.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Resources</b>
 * </p>
 * <p>
 * The following resources contain information about your IVS live stream (see <a
 * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/getting-started.html">Getting Started with Amazon IVS
 * Real-Time Streaming</a>):
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Stage</b> — A stage is a virtual space where participants can exchange video in real time.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tagging</b>
 * </p>
 * <p>
 * A <i>tag</i> is a metadata label that you assign to an AWS resource. A tag comprises a <i>key</i> and a <i>value</i>,
 * both set by you. For example, you might set a tag as <code>topic:nature</code> to label a particular video category.
 * See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for more
 * information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS stages
 * has no service-specific constraints beyond what is documented there.
 * </p>
 * <p>
 * Tags can help you identify and organize your AWS resources. For example, you can use the same tag for different
 * resources to indicate that they are related. You can also use tags to manage access (see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Access Tags</a>).
 * </p>
 * <p>
 * The Amazon IVS real-time API has these tag-related endpoints: <a>TagResource</a>, <a>UntagResource</a>, and
 * <a>ListTagsForResource</a>. The following resource supports tagging: Stage.
 * </p>
 * <p>
 * At most 50 tags can be applied to a resource.
 * </p>
 * <p>
 * <b>Stages Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateParticipantToken</a> — Creates an additional token for a specified stage. This can be done after stage
 * creation or when tokens expire.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateStage</a> — Creates a new stage (and optionally participant tokens).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteStage</a> — Shuts down and deletes the specified stage (disconnecting all participants).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisconnectParticipant</a> — Disconnects a specified participant and revokes the participant permanently from a
 * specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetParticipant</a> — Gets information about the specified participant token.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStage</a> — Gets information for the specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStageSession</a> — Gets information for the specified stage session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListParticipantEvents</a> — Lists events for a specified participant that occurred during a specified stage
 * session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListParticipants</a> — Lists all participants in a specified stage session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStages</a> — Gets summary information about all stages in your account, in the AWS region where the API
 * request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStageSessions</a> — Gets all sessions for a specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateStage</a> — Updates a stage’s configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tags Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a> — Gets information about AWS tags for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a> — Adds or updates tags for the AWS resource with the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a> — Removes tags from the resource with the specified ARN.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonIVSRealTime {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ivsrealtime";

    /**
     * <p>
     * Creates an additional token for a specified stage. This can be done after stage creation or when tokens expire.
     * Tokens always are scoped to the stage for which they are created.
     * </p>
     * <p>
     * Encryption keys are owned by Amazon IVS and never used directly by your application.
     * </p>
     * 
     * @param createParticipantTokenRequest
     * @return Result of the CreateParticipantToken operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.CreateParticipantToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateParticipantToken"
     *      target="_top">AWS API Documentation</a>
     */
    CreateParticipantTokenResult createParticipantToken(CreateParticipantTokenRequest createParticipantTokenRequest);

    /**
     * <p>
     * Creates a new stage (and optionally participant tokens).
     * </p>
     * 
     * @param createStageRequest
     * @return Result of the CreateStage operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.CreateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateStage" target="_top">AWS API
     *      Documentation</a>
     */
    CreateStageResult createStage(CreateStageRequest createStageRequest);

    /**
     * <p>
     * Shuts down and deletes the specified stage (disconnecting all participants).
     * </p>
     * 
     * @param deleteStageRequest
     * @return Result of the DeleteStage operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.DeleteStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteStage" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStageResult deleteStage(DeleteStageRequest deleteStageRequest);

    /**
     * <p>
     * Disconnects a specified participant and revokes the participant permanently from a specified stage.
     * </p>
     * 
     * @param disconnectParticipantRequest
     * @return Result of the DisconnectParticipant operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.DisconnectParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DisconnectParticipant"
     *      target="_top">AWS API Documentation</a>
     */
    DisconnectParticipantResult disconnectParticipant(DisconnectParticipantRequest disconnectParticipantRequest);

    /**
     * <p>
     * Gets information about the specified participant token.
     * </p>
     * 
     * @param getParticipantRequest
     * @return Result of the GetParticipant operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.GetParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetParticipant" target="_top">AWS
     *      API Documentation</a>
     */
    GetParticipantResult getParticipant(GetParticipantRequest getParticipantRequest);

    /**
     * <p>
     * Gets information for the specified stage.
     * </p>
     * 
     * @param getStageRequest
     * @return Result of the GetStage operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.GetStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStage" target="_top">AWS API
     *      Documentation</a>
     */
    GetStageResult getStage(GetStageRequest getStageRequest);

    /**
     * <p>
     * Gets information for the specified stage session.
     * </p>
     * 
     * @param getStageSessionRequest
     * @return Result of the GetStageSession operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.GetStageSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStageSession" target="_top">AWS
     *      API Documentation</a>
     */
    GetStageSessionResult getStageSession(GetStageSessionRequest getStageSessionRequest);

    /**
     * <p>
     * Lists events for a specified participant that occurred during a specified stage session.
     * </p>
     * 
     * @param listParticipantEventsRequest
     * @return Result of the ListParticipantEvents operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.ListParticipantEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipantEvents"
     *      target="_top">AWS API Documentation</a>
     */
    ListParticipantEventsResult listParticipantEvents(ListParticipantEventsRequest listParticipantEventsRequest);

    /**
     * <p>
     * Lists all participants in a specified stage session.
     * </p>
     * 
     * @param listParticipantsRequest
     * @return Result of the ListParticipants operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.ListParticipants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipants" target="_top">AWS
     *      API Documentation</a>
     */
    ListParticipantsResult listParticipants(ListParticipantsRequest listParticipantsRequest);

    /**
     * <p>
     * Gets all sessions for a specified stage.
     * </p>
     * 
     * @param listStageSessionsRequest
     * @return Result of the ListStageSessions operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.ListStageSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStageSessions" target="_top">AWS
     *      API Documentation</a>
     */
    ListStageSessionsResult listStageSessions(ListStageSessionsRequest listStageSessionsRequest);

    /**
     * <p>
     * Gets summary information about all stages in your account, in the AWS region where the API request is processed.
     * </p>
     * 
     * @param listStagesRequest
     * @return Result of the ListStages operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.ListStages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStages" target="_top">AWS API
     *      Documentation</a>
     */
    ListStagesResult listStages(ListStagesRequest listStagesRequest);

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonIVSRealTime.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonIVSRealTime.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonIVSRealTime.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a stage’s configuration.
     * </p>
     * 
     * @param updateStageRequest
     * @return Result of the UpdateStage operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.UpdateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/UpdateStage" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateStageResult updateStage(UpdateStageRequest updateStageRequest);

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
