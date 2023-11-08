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
package com.amazonaws.services.cleanrooms;

import javax.annotation.Generated;

import com.amazonaws.services.cleanrooms.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Clean Rooms Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the <i>Clean Rooms API Reference</i>.
 * </p>
 * <p>
 * Clean Rooms is an Amazon Web Services service that helps multiple parties to join their data together in a secure
 * collaboration workspace. In the collaboration, members who can query and receive results can get insights into the
 * collective datasets without either party getting access to the other party's raw data.
 * </p>
 * <p>
 * To learn more about Clean Rooms concepts, procedures, and best practices, see the <a
 * href="https://docs.aws.amazon.com/clean-rooms/latest/userguide/what-is.html">Clean Rooms User Guide</a>.
 * </p>
 * <p>
 * To learn more about SQL commands, functions, and conditions supported in Clean Rooms, see the <a
 * href="https://docs.aws.amazon.com/clean-rooms/latest/sql-reference/sql-reference.html">Clean Rooms SQL Reference</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCleanRoomsAsyncClient extends AWSCleanRoomsClient implements AWSCleanRoomsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCleanRoomsAsyncClientBuilder asyncBuilder() {
        return AWSCleanRoomsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Clean Rooms Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCleanRoomsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Clean Rooms Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCleanRoomsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<BatchGetCollaborationAnalysisTemplateResult> batchGetCollaborationAnalysisTemplateAsync(
            BatchGetCollaborationAnalysisTemplateRequest request) {

        return batchGetCollaborationAnalysisTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetCollaborationAnalysisTemplateResult> batchGetCollaborationAnalysisTemplateAsync(
            final BatchGetCollaborationAnalysisTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetCollaborationAnalysisTemplateRequest, BatchGetCollaborationAnalysisTemplateResult> asyncHandler) {
        final BatchGetCollaborationAnalysisTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetCollaborationAnalysisTemplateResult>() {
            @Override
            public BatchGetCollaborationAnalysisTemplateResult call() throws Exception {
                BatchGetCollaborationAnalysisTemplateResult result = null;

                try {
                    result = executeBatchGetCollaborationAnalysisTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetSchemaResult> batchGetSchemaAsync(BatchGetSchemaRequest request) {

        return batchGetSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetSchemaResult> batchGetSchemaAsync(final BatchGetSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetSchemaRequest, BatchGetSchemaResult> asyncHandler) {
        final BatchGetSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetSchemaResult>() {
            @Override
            public BatchGetSchemaResult call() throws Exception {
                BatchGetSchemaResult result = null;

                try {
                    result = executeBatchGetSchema(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAnalysisTemplateResult> createAnalysisTemplateAsync(CreateAnalysisTemplateRequest request) {

        return createAnalysisTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnalysisTemplateResult> createAnalysisTemplateAsync(final CreateAnalysisTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAnalysisTemplateRequest, CreateAnalysisTemplateResult> asyncHandler) {
        final CreateAnalysisTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAnalysisTemplateResult>() {
            @Override
            public CreateAnalysisTemplateResult call() throws Exception {
                CreateAnalysisTemplateResult result = null;

                try {
                    result = executeCreateAnalysisTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCollaborationResult> createCollaborationAsync(CreateCollaborationRequest request) {

        return createCollaborationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCollaborationResult> createCollaborationAsync(final CreateCollaborationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCollaborationRequest, CreateCollaborationResult> asyncHandler) {
        final CreateCollaborationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCollaborationResult>() {
            @Override
            public CreateCollaborationResult call() throws Exception {
                CreateCollaborationResult result = null;

                try {
                    result = executeCreateCollaboration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfiguredTableResult> createConfiguredTableAsync(CreateConfiguredTableRequest request) {

        return createConfiguredTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfiguredTableResult> createConfiguredTableAsync(final CreateConfiguredTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfiguredTableRequest, CreateConfiguredTableResult> asyncHandler) {
        final CreateConfiguredTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfiguredTableResult>() {
            @Override
            public CreateConfiguredTableResult call() throws Exception {
                CreateConfiguredTableResult result = null;

                try {
                    result = executeCreateConfiguredTable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfiguredTableAnalysisRuleResult> createConfiguredTableAnalysisRuleAsync(
            CreateConfiguredTableAnalysisRuleRequest request) {

        return createConfiguredTableAnalysisRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfiguredTableAnalysisRuleResult> createConfiguredTableAnalysisRuleAsync(
            final CreateConfiguredTableAnalysisRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfiguredTableAnalysisRuleRequest, CreateConfiguredTableAnalysisRuleResult> asyncHandler) {
        final CreateConfiguredTableAnalysisRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfiguredTableAnalysisRuleResult>() {
            @Override
            public CreateConfiguredTableAnalysisRuleResult call() throws Exception {
                CreateConfiguredTableAnalysisRuleResult result = null;

                try {
                    result = executeCreateConfiguredTableAnalysisRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfiguredTableAssociationResult> createConfiguredTableAssociationAsync(
            CreateConfiguredTableAssociationRequest request) {

        return createConfiguredTableAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfiguredTableAssociationResult> createConfiguredTableAssociationAsync(
            final CreateConfiguredTableAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfiguredTableAssociationRequest, CreateConfiguredTableAssociationResult> asyncHandler) {
        final CreateConfiguredTableAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfiguredTableAssociationResult>() {
            @Override
            public CreateConfiguredTableAssociationResult call() throws Exception {
                CreateConfiguredTableAssociationResult result = null;

                try {
                    result = executeCreateConfiguredTableAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMembershipResult> createMembershipAsync(CreateMembershipRequest request) {

        return createMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMembershipResult> createMembershipAsync(final CreateMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMembershipRequest, CreateMembershipResult> asyncHandler) {
        final CreateMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMembershipResult>() {
            @Override
            public CreateMembershipResult call() throws Exception {
                CreateMembershipResult result = null;

                try {
                    result = executeCreateMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAnalysisTemplateResult> deleteAnalysisTemplateAsync(DeleteAnalysisTemplateRequest request) {

        return deleteAnalysisTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnalysisTemplateResult> deleteAnalysisTemplateAsync(final DeleteAnalysisTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAnalysisTemplateRequest, DeleteAnalysisTemplateResult> asyncHandler) {
        final DeleteAnalysisTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAnalysisTemplateResult>() {
            @Override
            public DeleteAnalysisTemplateResult call() throws Exception {
                DeleteAnalysisTemplateResult result = null;

                try {
                    result = executeDeleteAnalysisTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCollaborationResult> deleteCollaborationAsync(DeleteCollaborationRequest request) {

        return deleteCollaborationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCollaborationResult> deleteCollaborationAsync(final DeleteCollaborationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCollaborationRequest, DeleteCollaborationResult> asyncHandler) {
        final DeleteCollaborationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCollaborationResult>() {
            @Override
            public DeleteCollaborationResult call() throws Exception {
                DeleteCollaborationResult result = null;

                try {
                    result = executeDeleteCollaboration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfiguredTableResult> deleteConfiguredTableAsync(DeleteConfiguredTableRequest request) {

        return deleteConfiguredTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfiguredTableResult> deleteConfiguredTableAsync(final DeleteConfiguredTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfiguredTableRequest, DeleteConfiguredTableResult> asyncHandler) {
        final DeleteConfiguredTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfiguredTableResult>() {
            @Override
            public DeleteConfiguredTableResult call() throws Exception {
                DeleteConfiguredTableResult result = null;

                try {
                    result = executeDeleteConfiguredTable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfiguredTableAnalysisRuleResult> deleteConfiguredTableAnalysisRuleAsync(
            DeleteConfiguredTableAnalysisRuleRequest request) {

        return deleteConfiguredTableAnalysisRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfiguredTableAnalysisRuleResult> deleteConfiguredTableAnalysisRuleAsync(
            final DeleteConfiguredTableAnalysisRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfiguredTableAnalysisRuleRequest, DeleteConfiguredTableAnalysisRuleResult> asyncHandler) {
        final DeleteConfiguredTableAnalysisRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfiguredTableAnalysisRuleResult>() {
            @Override
            public DeleteConfiguredTableAnalysisRuleResult call() throws Exception {
                DeleteConfiguredTableAnalysisRuleResult result = null;

                try {
                    result = executeDeleteConfiguredTableAnalysisRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfiguredTableAssociationResult> deleteConfiguredTableAssociationAsync(
            DeleteConfiguredTableAssociationRequest request) {

        return deleteConfiguredTableAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfiguredTableAssociationResult> deleteConfiguredTableAssociationAsync(
            final DeleteConfiguredTableAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfiguredTableAssociationRequest, DeleteConfiguredTableAssociationResult> asyncHandler) {
        final DeleteConfiguredTableAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfiguredTableAssociationResult>() {
            @Override
            public DeleteConfiguredTableAssociationResult call() throws Exception {
                DeleteConfiguredTableAssociationResult result = null;

                try {
                    result = executeDeleteConfiguredTableAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest request) {

        return deleteMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(final DeleteMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMemberRequest, DeleteMemberResult> asyncHandler) {
        final DeleteMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMemberResult>() {
            @Override
            public DeleteMemberResult call() throws Exception {
                DeleteMemberResult result = null;

                try {
                    result = executeDeleteMember(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMembershipResult> deleteMembershipAsync(DeleteMembershipRequest request) {

        return deleteMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMembershipResult> deleteMembershipAsync(final DeleteMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMembershipRequest, DeleteMembershipResult> asyncHandler) {
        final DeleteMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMembershipResult>() {
            @Override
            public DeleteMembershipResult call() throws Exception {
                DeleteMembershipResult result = null;

                try {
                    result = executeDeleteMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAnalysisTemplateResult> getAnalysisTemplateAsync(GetAnalysisTemplateRequest request) {

        return getAnalysisTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnalysisTemplateResult> getAnalysisTemplateAsync(final GetAnalysisTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAnalysisTemplateRequest, GetAnalysisTemplateResult> asyncHandler) {
        final GetAnalysisTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAnalysisTemplateResult>() {
            @Override
            public GetAnalysisTemplateResult call() throws Exception {
                GetAnalysisTemplateResult result = null;

                try {
                    result = executeGetAnalysisTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCollaborationResult> getCollaborationAsync(GetCollaborationRequest request) {

        return getCollaborationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCollaborationResult> getCollaborationAsync(final GetCollaborationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCollaborationRequest, GetCollaborationResult> asyncHandler) {
        final GetCollaborationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCollaborationResult>() {
            @Override
            public GetCollaborationResult call() throws Exception {
                GetCollaborationResult result = null;

                try {
                    result = executeGetCollaboration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCollaborationAnalysisTemplateResult> getCollaborationAnalysisTemplateAsync(
            GetCollaborationAnalysisTemplateRequest request) {

        return getCollaborationAnalysisTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCollaborationAnalysisTemplateResult> getCollaborationAnalysisTemplateAsync(
            final GetCollaborationAnalysisTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCollaborationAnalysisTemplateRequest, GetCollaborationAnalysisTemplateResult> asyncHandler) {
        final GetCollaborationAnalysisTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCollaborationAnalysisTemplateResult>() {
            @Override
            public GetCollaborationAnalysisTemplateResult call() throws Exception {
                GetCollaborationAnalysisTemplateResult result = null;

                try {
                    result = executeGetCollaborationAnalysisTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConfiguredTableResult> getConfiguredTableAsync(GetConfiguredTableRequest request) {

        return getConfiguredTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfiguredTableResult> getConfiguredTableAsync(final GetConfiguredTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfiguredTableRequest, GetConfiguredTableResult> asyncHandler) {
        final GetConfiguredTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfiguredTableResult>() {
            @Override
            public GetConfiguredTableResult call() throws Exception {
                GetConfiguredTableResult result = null;

                try {
                    result = executeGetConfiguredTable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConfiguredTableAnalysisRuleResult> getConfiguredTableAnalysisRuleAsync(GetConfiguredTableAnalysisRuleRequest request) {

        return getConfiguredTableAnalysisRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfiguredTableAnalysisRuleResult> getConfiguredTableAnalysisRuleAsync(
            final GetConfiguredTableAnalysisRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfiguredTableAnalysisRuleRequest, GetConfiguredTableAnalysisRuleResult> asyncHandler) {
        final GetConfiguredTableAnalysisRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfiguredTableAnalysisRuleResult>() {
            @Override
            public GetConfiguredTableAnalysisRuleResult call() throws Exception {
                GetConfiguredTableAnalysisRuleResult result = null;

                try {
                    result = executeGetConfiguredTableAnalysisRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConfiguredTableAssociationResult> getConfiguredTableAssociationAsync(GetConfiguredTableAssociationRequest request) {

        return getConfiguredTableAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfiguredTableAssociationResult> getConfiguredTableAssociationAsync(
            final GetConfiguredTableAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfiguredTableAssociationRequest, GetConfiguredTableAssociationResult> asyncHandler) {
        final GetConfiguredTableAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfiguredTableAssociationResult>() {
            @Override
            public GetConfiguredTableAssociationResult call() throws Exception {
                GetConfiguredTableAssociationResult result = null;

                try {
                    result = executeGetConfiguredTableAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMembershipResult> getMembershipAsync(GetMembershipRequest request) {

        return getMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMembershipResult> getMembershipAsync(final GetMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMembershipRequest, GetMembershipResult> asyncHandler) {
        final GetMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMembershipResult>() {
            @Override
            public GetMembershipResult call() throws Exception {
                GetMembershipResult result = null;

                try {
                    result = executeGetMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProtectedQueryResult> getProtectedQueryAsync(GetProtectedQueryRequest request) {

        return getProtectedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProtectedQueryResult> getProtectedQueryAsync(final GetProtectedQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProtectedQueryRequest, GetProtectedQueryResult> asyncHandler) {
        final GetProtectedQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProtectedQueryResult>() {
            @Override
            public GetProtectedQueryResult call() throws Exception {
                GetProtectedQueryResult result = null;

                try {
                    result = executeGetProtectedQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(GetSchemaRequest request) {

        return getSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaResult> getSchemaAsync(final GetSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSchemaRequest, GetSchemaResult> asyncHandler) {
        final GetSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSchemaResult>() {
            @Override
            public GetSchemaResult call() throws Exception {
                GetSchemaResult result = null;

                try {
                    result = executeGetSchema(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSchemaAnalysisRuleResult> getSchemaAnalysisRuleAsync(GetSchemaAnalysisRuleRequest request) {

        return getSchemaAnalysisRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaAnalysisRuleResult> getSchemaAnalysisRuleAsync(final GetSchemaAnalysisRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSchemaAnalysisRuleRequest, GetSchemaAnalysisRuleResult> asyncHandler) {
        final GetSchemaAnalysisRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSchemaAnalysisRuleResult>() {
            @Override
            public GetSchemaAnalysisRuleResult call() throws Exception {
                GetSchemaAnalysisRuleResult result = null;

                try {
                    result = executeGetSchemaAnalysisRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAnalysisTemplatesResult> listAnalysisTemplatesAsync(ListAnalysisTemplatesRequest request) {

        return listAnalysisTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnalysisTemplatesResult> listAnalysisTemplatesAsync(final ListAnalysisTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnalysisTemplatesRequest, ListAnalysisTemplatesResult> asyncHandler) {
        final ListAnalysisTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnalysisTemplatesResult>() {
            @Override
            public ListAnalysisTemplatesResult call() throws Exception {
                ListAnalysisTemplatesResult result = null;

                try {
                    result = executeListAnalysisTemplates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCollaborationAnalysisTemplatesResult> listCollaborationAnalysisTemplatesAsync(
            ListCollaborationAnalysisTemplatesRequest request) {

        return listCollaborationAnalysisTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCollaborationAnalysisTemplatesResult> listCollaborationAnalysisTemplatesAsync(
            final ListCollaborationAnalysisTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCollaborationAnalysisTemplatesRequest, ListCollaborationAnalysisTemplatesResult> asyncHandler) {
        final ListCollaborationAnalysisTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCollaborationAnalysisTemplatesResult>() {
            @Override
            public ListCollaborationAnalysisTemplatesResult call() throws Exception {
                ListCollaborationAnalysisTemplatesResult result = null;

                try {
                    result = executeListCollaborationAnalysisTemplates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCollaborationsResult> listCollaborationsAsync(ListCollaborationsRequest request) {

        return listCollaborationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCollaborationsResult> listCollaborationsAsync(final ListCollaborationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCollaborationsRequest, ListCollaborationsResult> asyncHandler) {
        final ListCollaborationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCollaborationsResult>() {
            @Override
            public ListCollaborationsResult call() throws Exception {
                ListCollaborationsResult result = null;

                try {
                    result = executeListCollaborations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConfiguredTableAssociationsResult> listConfiguredTableAssociationsAsync(
            ListConfiguredTableAssociationsRequest request) {

        return listConfiguredTableAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfiguredTableAssociationsResult> listConfiguredTableAssociationsAsync(
            final ListConfiguredTableAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfiguredTableAssociationsRequest, ListConfiguredTableAssociationsResult> asyncHandler) {
        final ListConfiguredTableAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfiguredTableAssociationsResult>() {
            @Override
            public ListConfiguredTableAssociationsResult call() throws Exception {
                ListConfiguredTableAssociationsResult result = null;

                try {
                    result = executeListConfiguredTableAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConfiguredTablesResult> listConfiguredTablesAsync(ListConfiguredTablesRequest request) {

        return listConfiguredTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfiguredTablesResult> listConfiguredTablesAsync(final ListConfiguredTablesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfiguredTablesRequest, ListConfiguredTablesResult> asyncHandler) {
        final ListConfiguredTablesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfiguredTablesResult>() {
            @Override
            public ListConfiguredTablesResult call() throws Exception {
                ListConfiguredTablesResult result = null;

                try {
                    result = executeListConfiguredTables(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest request) {

        return listMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(final ListMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler) {
        final ListMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMembersResult>() {
            @Override
            public ListMembersResult call() throws Exception {
                ListMembersResult result = null;

                try {
                    result = executeListMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMembershipsResult> listMembershipsAsync(ListMembershipsRequest request) {

        return listMembershipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMembershipsResult> listMembershipsAsync(final ListMembershipsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMembershipsRequest, ListMembershipsResult> asyncHandler) {
        final ListMembershipsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMembershipsResult>() {
            @Override
            public ListMembershipsResult call() throws Exception {
                ListMembershipsResult result = null;

                try {
                    result = executeListMemberships(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProtectedQueriesResult> listProtectedQueriesAsync(ListProtectedQueriesRequest request) {

        return listProtectedQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProtectedQueriesResult> listProtectedQueriesAsync(final ListProtectedQueriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProtectedQueriesRequest, ListProtectedQueriesResult> asyncHandler) {
        final ListProtectedQueriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProtectedQueriesResult>() {
            @Override
            public ListProtectedQueriesResult call() throws Exception {
                ListProtectedQueriesResult result = null;

                try {
                    result = executeListProtectedQueries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest request) {

        return listSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(final ListSchemasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSchemasRequest, ListSchemasResult> asyncHandler) {
        final ListSchemasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSchemasResult>() {
            @Override
            public ListSchemasResult call() throws Exception {
                ListSchemasResult result = null;

                try {
                    result = executeListSchemas(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartProtectedQueryResult> startProtectedQueryAsync(StartProtectedQueryRequest request) {

        return startProtectedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartProtectedQueryResult> startProtectedQueryAsync(final StartProtectedQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartProtectedQueryRequest, StartProtectedQueryResult> asyncHandler) {
        final StartProtectedQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartProtectedQueryResult>() {
            @Override
            public StartProtectedQueryResult call() throws Exception {
                StartProtectedQueryResult result = null;

                try {
                    result = executeStartProtectedQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAnalysisTemplateResult> updateAnalysisTemplateAsync(UpdateAnalysisTemplateRequest request) {

        return updateAnalysisTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnalysisTemplateResult> updateAnalysisTemplateAsync(final UpdateAnalysisTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAnalysisTemplateRequest, UpdateAnalysisTemplateResult> asyncHandler) {
        final UpdateAnalysisTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAnalysisTemplateResult>() {
            @Override
            public UpdateAnalysisTemplateResult call() throws Exception {
                UpdateAnalysisTemplateResult result = null;

                try {
                    result = executeUpdateAnalysisTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateCollaborationResult> updateCollaborationAsync(UpdateCollaborationRequest request) {

        return updateCollaborationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCollaborationResult> updateCollaborationAsync(final UpdateCollaborationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCollaborationRequest, UpdateCollaborationResult> asyncHandler) {
        final UpdateCollaborationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCollaborationResult>() {
            @Override
            public UpdateCollaborationResult call() throws Exception {
                UpdateCollaborationResult result = null;

                try {
                    result = executeUpdateCollaboration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConfiguredTableResult> updateConfiguredTableAsync(UpdateConfiguredTableRequest request) {

        return updateConfiguredTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfiguredTableResult> updateConfiguredTableAsync(final UpdateConfiguredTableRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfiguredTableRequest, UpdateConfiguredTableResult> asyncHandler) {
        final UpdateConfiguredTableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfiguredTableResult>() {
            @Override
            public UpdateConfiguredTableResult call() throws Exception {
                UpdateConfiguredTableResult result = null;

                try {
                    result = executeUpdateConfiguredTable(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConfiguredTableAnalysisRuleResult> updateConfiguredTableAnalysisRuleAsync(
            UpdateConfiguredTableAnalysisRuleRequest request) {

        return updateConfiguredTableAnalysisRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfiguredTableAnalysisRuleResult> updateConfiguredTableAnalysisRuleAsync(
            final UpdateConfiguredTableAnalysisRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfiguredTableAnalysisRuleRequest, UpdateConfiguredTableAnalysisRuleResult> asyncHandler) {
        final UpdateConfiguredTableAnalysisRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfiguredTableAnalysisRuleResult>() {
            @Override
            public UpdateConfiguredTableAnalysisRuleResult call() throws Exception {
                UpdateConfiguredTableAnalysisRuleResult result = null;

                try {
                    result = executeUpdateConfiguredTableAnalysisRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConfiguredTableAssociationResult> updateConfiguredTableAssociationAsync(
            UpdateConfiguredTableAssociationRequest request) {

        return updateConfiguredTableAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfiguredTableAssociationResult> updateConfiguredTableAssociationAsync(
            final UpdateConfiguredTableAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfiguredTableAssociationRequest, UpdateConfiguredTableAssociationResult> asyncHandler) {
        final UpdateConfiguredTableAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfiguredTableAssociationResult>() {
            @Override
            public UpdateConfiguredTableAssociationResult call() throws Exception {
                UpdateConfiguredTableAssociationResult result = null;

                try {
                    result = executeUpdateConfiguredTableAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateMembershipResult> updateMembershipAsync(UpdateMembershipRequest request) {

        return updateMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMembershipResult> updateMembershipAsync(final UpdateMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMembershipRequest, UpdateMembershipResult> asyncHandler) {
        final UpdateMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMembershipResult>() {
            @Override
            public UpdateMembershipResult call() throws Exception {
                UpdateMembershipResult result = null;

                try {
                    result = executeUpdateMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateProtectedQueryResult> updateProtectedQueryAsync(UpdateProtectedQueryRequest request) {

        return updateProtectedQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProtectedQueryResult> updateProtectedQueryAsync(final UpdateProtectedQueryRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProtectedQueryRequest, UpdateProtectedQueryResult> asyncHandler) {
        final UpdateProtectedQueryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProtectedQueryResult>() {
            @Override
            public UpdateProtectedQueryResult call() throws Exception {
                UpdateProtectedQueryResult result = null;

                try {
                    result = executeUpdateProtectedQuery(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
