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
 * Interface for accessing AWSEntityResolution asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.entityresolution.AbstractAWSEntityResolutionAsync} instead.
 * </p>
 * <p>
 * <p>
 * Welcome to the <i>Entity Resolution API Reference</i>.
 * </p>
 * <p>
 * Entity Resolution is an Amazon Web Services service that provides pre-configured entity resolution capabilities that
 * enable developers and analysts at advertising and marketing companies to build an accurate and complete view of their
 * consumers.
 * </p>
 * <p>
 * With Entity Resolution, you can match source records containing consumer identifiers, such as name, email address,
 * and phone number. This is true even when these records have incomplete or conflicting identifiers. For example,
 * Entity Resolution can effectively match a source record from a customer relationship management (CRM) system with a
 * source record from a marketing system containing campaign information.
 * </p>
 * <p>
 * To learn more about Entity Resolution concepts, procedures, and best practices, see the <a
 * href="https://docs.aws.amazon.com/entityresolution/latest/userguide/what-is-service.html">Entity Resolution User
 * Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSEntityResolutionAsync extends AWSEntityResolution {

    /**
     * <p>
     * Creates an <code>IdMappingWorkflow</code> object which stores the configuration of the data processing job to be
     * run. Each <code>IdMappingWorkflow</code> must have a unique workflow name. To modify an existing workflow, use
     * the <code>UpdateIdMappingWorkflow</code> API.
     * </p>
     * 
     * @param createIdMappingWorkflowRequest
     * @return A Java Future containing the result of the CreateIdMappingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsync.CreateIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIdMappingWorkflowResult> createIdMappingWorkflowAsync(CreateIdMappingWorkflowRequest createIdMappingWorkflowRequest);

    /**
     * <p>
     * Creates an <code>IdMappingWorkflow</code> object which stores the configuration of the data processing job to be
     * run. Each <code>IdMappingWorkflow</code> must have a unique workflow name. To modify an existing workflow, use
     * the <code>UpdateIdMappingWorkflow</code> API.
     * </p>
     * 
     * @param createIdMappingWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIdMappingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.CreateIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIdMappingWorkflowResult> createIdMappingWorkflowAsync(CreateIdMappingWorkflowRequest createIdMappingWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIdMappingWorkflowRequest, CreateIdMappingWorkflowResult> asyncHandler);

    /**
     * <p>
     * Creates a <code>MatchingWorkflow</code> object which stores the configuration of the data processing job to be
     * run. It is important to note that there should not be a pre-existing <code>MatchingWorkflow</code> with the same
     * name. To modify an existing workflow, utilize the <code>UpdateMatchingWorkflow</code> API.
     * </p>
     * 
     * @param createMatchingWorkflowRequest
     * @return A Java Future containing the result of the CreateMatchingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsync.CreateMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMatchingWorkflowResult> createMatchingWorkflowAsync(CreateMatchingWorkflowRequest createMatchingWorkflowRequest);

    /**
     * <p>
     * Creates a <code>MatchingWorkflow</code> object which stores the configuration of the data processing job to be
     * run. It is important to note that there should not be a pre-existing <code>MatchingWorkflow</code> with the same
     * name. To modify an existing workflow, utilize the <code>UpdateMatchingWorkflow</code> API.
     * </p>
     * 
     * @param createMatchingWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMatchingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.CreateMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMatchingWorkflowResult> createMatchingWorkflowAsync(CreateMatchingWorkflowRequest createMatchingWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMatchingWorkflowRequest, CreateMatchingWorkflowResult> asyncHandler);

    /**
     * <p>
     * Creates a schema mapping, which defines the schema of the input customer records table. The
     * <code>SchemaMapping</code> also provides Entity Resolution with some metadata about the table, such as the
     * attribute types of the columns and which columns to match on.
     * </p>
     * 
     * @param createSchemaMappingRequest
     * @return A Java Future containing the result of the CreateSchemaMapping operation returned by the service.
     * @sample AWSEntityResolutionAsync.CreateSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSchemaMappingResult> createSchemaMappingAsync(CreateSchemaMappingRequest createSchemaMappingRequest);

    /**
     * <p>
     * Creates a schema mapping, which defines the schema of the input customer records table. The
     * <code>SchemaMapping</code> also provides Entity Resolution with some metadata about the table, such as the
     * attribute types of the columns and which columns to match on.
     * </p>
     * 
     * @param createSchemaMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSchemaMapping operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.CreateSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/CreateSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSchemaMappingResult> createSchemaMappingAsync(CreateSchemaMappingRequest createSchemaMappingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSchemaMappingRequest, CreateSchemaMappingResult> asyncHandler);

    /**
     * <p>
     * Deletes the <code>IdMappingWorkflow</code> with a given name. This operation will succeed even if a workflow with
     * the given name does not exist.
     * </p>
     * 
     * @param deleteIdMappingWorkflowRequest
     * @return A Java Future containing the result of the DeleteIdMappingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsync.DeleteIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdMappingWorkflowResult> deleteIdMappingWorkflowAsync(DeleteIdMappingWorkflowRequest deleteIdMappingWorkflowRequest);

    /**
     * <p>
     * Deletes the <code>IdMappingWorkflow</code> with a given name. This operation will succeed even if a workflow with
     * the given name does not exist.
     * </p>
     * 
     * @param deleteIdMappingWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIdMappingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.DeleteIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdMappingWorkflowResult> deleteIdMappingWorkflowAsync(DeleteIdMappingWorkflowRequest deleteIdMappingWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIdMappingWorkflowRequest, DeleteIdMappingWorkflowResult> asyncHandler);

    /**
     * <p>
     * Deletes the <code>MatchingWorkflow</code> with a given name. This operation will succeed even if a workflow with
     * the given name does not exist.
     * </p>
     * 
     * @param deleteMatchingWorkflowRequest
     * @return A Java Future containing the result of the DeleteMatchingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsync.DeleteMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMatchingWorkflowResult> deleteMatchingWorkflowAsync(DeleteMatchingWorkflowRequest deleteMatchingWorkflowRequest);

    /**
     * <p>
     * Deletes the <code>MatchingWorkflow</code> with a given name. This operation will succeed even if a workflow with
     * the given name does not exist.
     * </p>
     * 
     * @param deleteMatchingWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMatchingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.DeleteMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMatchingWorkflowResult> deleteMatchingWorkflowAsync(DeleteMatchingWorkflowRequest deleteMatchingWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMatchingWorkflowRequest, DeleteMatchingWorkflowResult> asyncHandler);

    /**
     * <p>
     * Deletes the <code>SchemaMapping</code> with a given name. This operation will succeed even if a schema with the
     * given name does not exist. This operation will fail if there is a <code>MatchingWorkflow</code> object that
     * references the <code>SchemaMapping</code> in the workflow's <code>InputSourceConfig</code>.
     * </p>
     * 
     * @param deleteSchemaMappingRequest
     * @return A Java Future containing the result of the DeleteSchemaMapping operation returned by the service.
     * @sample AWSEntityResolutionAsync.DeleteSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSchemaMappingResult> deleteSchemaMappingAsync(DeleteSchemaMappingRequest deleteSchemaMappingRequest);

    /**
     * <p>
     * Deletes the <code>SchemaMapping</code> with a given name. This operation will succeed even if a schema with the
     * given name does not exist. This operation will fail if there is a <code>MatchingWorkflow</code> object that
     * references the <code>SchemaMapping</code> in the workflow's <code>InputSourceConfig</code>.
     * </p>
     * 
     * @param deleteSchemaMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSchemaMapping operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.DeleteSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSchemaMappingResult> deleteSchemaMappingAsync(DeleteSchemaMappingRequest deleteSchemaMappingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSchemaMappingRequest, DeleteSchemaMappingResult> asyncHandler);

    /**
     * <p>
     * Gets the status, metrics, and errors (if there are any) that are associated with a job.
     * </p>
     * 
     * @param getIdMappingJobRequest
     * @return A Java Future containing the result of the GetIdMappingJob operation returned by the service.
     * @sample AWSEntityResolutionAsync.GetIdMappingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetIdMappingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdMappingJobResult> getIdMappingJobAsync(GetIdMappingJobRequest getIdMappingJobRequest);

    /**
     * <p>
     * Gets the status, metrics, and errors (if there are any) that are associated with a job.
     * </p>
     * 
     * @param getIdMappingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdMappingJob operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.GetIdMappingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetIdMappingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdMappingJobResult> getIdMappingJobAsync(GetIdMappingJobRequest getIdMappingJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdMappingJobRequest, GetIdMappingJobResult> asyncHandler);

    /**
     * <p>
     * Returns the <code>IdMappingWorkflow</code> with a given name, if it exists.
     * </p>
     * 
     * @param getIdMappingWorkflowRequest
     * @return A Java Future containing the result of the GetIdMappingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsync.GetIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdMappingWorkflowResult> getIdMappingWorkflowAsync(GetIdMappingWorkflowRequest getIdMappingWorkflowRequest);

    /**
     * <p>
     * Returns the <code>IdMappingWorkflow</code> with a given name, if it exists.
     * </p>
     * 
     * @param getIdMappingWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdMappingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.GetIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdMappingWorkflowResult> getIdMappingWorkflowAsync(GetIdMappingWorkflowRequest getIdMappingWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdMappingWorkflowRequest, GetIdMappingWorkflowResult> asyncHandler);

    /**
     * <p>
     * Returns the corresponding Match ID of a customer record if the record has been processed.
     * </p>
     * 
     * @param getMatchIdRequest
     * @return A Java Future containing the result of the GetMatchId operation returned by the service.
     * @sample AWSEntityResolutionAsync.GetMatchId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchId" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMatchIdResult> getMatchIdAsync(GetMatchIdRequest getMatchIdRequest);

    /**
     * <p>
     * Returns the corresponding Match ID of a customer record if the record has been processed.
     * </p>
     * 
     * @param getMatchIdRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMatchId operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.GetMatchId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchId" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMatchIdResult> getMatchIdAsync(GetMatchIdRequest getMatchIdRequest,
            com.amazonaws.handlers.AsyncHandler<GetMatchIdRequest, GetMatchIdResult> asyncHandler);

    /**
     * <p>
     * Gets the status, metrics, and errors (if there are any) that are associated with a job.
     * </p>
     * 
     * @param getMatchingJobRequest
     * @return A Java Future containing the result of the GetMatchingJob operation returned by the service.
     * @sample AWSEntityResolutionAsync.GetMatchingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMatchingJobResult> getMatchingJobAsync(GetMatchingJobRequest getMatchingJobRequest);

    /**
     * <p>
     * Gets the status, metrics, and errors (if there are any) that are associated with a job.
     * </p>
     * 
     * @param getMatchingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMatchingJob operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.GetMatchingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMatchingJobResult> getMatchingJobAsync(GetMatchingJobRequest getMatchingJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetMatchingJobRequest, GetMatchingJobResult> asyncHandler);

    /**
     * <p>
     * Returns the <code>MatchingWorkflow</code> with a given name, if it exists.
     * </p>
     * 
     * @param getMatchingWorkflowRequest
     * @return A Java Future containing the result of the GetMatchingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsync.GetMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMatchingWorkflowResult> getMatchingWorkflowAsync(GetMatchingWorkflowRequest getMatchingWorkflowRequest);

    /**
     * <p>
     * Returns the <code>MatchingWorkflow</code> with a given name, if it exists.
     * </p>
     * 
     * @param getMatchingWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMatchingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.GetMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMatchingWorkflowResult> getMatchingWorkflowAsync(GetMatchingWorkflowRequest getMatchingWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<GetMatchingWorkflowRequest, GetMatchingWorkflowResult> asyncHandler);

    /**
     * <p>
     * Returns the SchemaMapping of a given name.
     * </p>
     * 
     * @param getSchemaMappingRequest
     * @return A Java Future containing the result of the GetSchemaMapping operation returned by the service.
     * @sample AWSEntityResolutionAsync.GetSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaMappingResult> getSchemaMappingAsync(GetSchemaMappingRequest getSchemaMappingRequest);

    /**
     * <p>
     * Returns the SchemaMapping of a given name.
     * </p>
     * 
     * @param getSchemaMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSchemaMapping operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.GetSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSchemaMappingResult> getSchemaMappingAsync(GetSchemaMappingRequest getSchemaMappingRequest,
            com.amazonaws.handlers.AsyncHandler<GetSchemaMappingRequest, GetSchemaMappingResult> asyncHandler);

    /**
     * <p>
     * Lists all ID mapping jobs for a given workflow.
     * </p>
     * 
     * @param listIdMappingJobsRequest
     * @return A Java Future containing the result of the ListIdMappingJobs operation returned by the service.
     * @sample AWSEntityResolutionAsync.ListIdMappingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListIdMappingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdMappingJobsResult> listIdMappingJobsAsync(ListIdMappingJobsRequest listIdMappingJobsRequest);

    /**
     * <p>
     * Lists all ID mapping jobs for a given workflow.
     * </p>
     * 
     * @param listIdMappingJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdMappingJobs operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.ListIdMappingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListIdMappingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdMappingJobsResult> listIdMappingJobsAsync(ListIdMappingJobsRequest listIdMappingJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdMappingJobsRequest, ListIdMappingJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the <code>IdMappingWorkflows</code> that have been created for an Amazon Web Services
     * account.
     * </p>
     * 
     * @param listIdMappingWorkflowsRequest
     * @return A Java Future containing the result of the ListIdMappingWorkflows operation returned by the service.
     * @sample AWSEntityResolutionAsync.ListIdMappingWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListIdMappingWorkflows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdMappingWorkflowsResult> listIdMappingWorkflowsAsync(ListIdMappingWorkflowsRequest listIdMappingWorkflowsRequest);

    /**
     * <p>
     * Returns a list of all the <code>IdMappingWorkflows</code> that have been created for an Amazon Web Services
     * account.
     * </p>
     * 
     * @param listIdMappingWorkflowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdMappingWorkflows operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.ListIdMappingWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListIdMappingWorkflows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdMappingWorkflowsResult> listIdMappingWorkflowsAsync(ListIdMappingWorkflowsRequest listIdMappingWorkflowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdMappingWorkflowsRequest, ListIdMappingWorkflowsResult> asyncHandler);

    /**
     * <p>
     * Lists all jobs for a given workflow.
     * </p>
     * 
     * @param listMatchingJobsRequest
     * @return A Java Future containing the result of the ListMatchingJobs operation returned by the service.
     * @sample AWSEntityResolutionAsync.ListMatchingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListMatchingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMatchingJobsResult> listMatchingJobsAsync(ListMatchingJobsRequest listMatchingJobsRequest);

    /**
     * <p>
     * Lists all jobs for a given workflow.
     * </p>
     * 
     * @param listMatchingJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMatchingJobs operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.ListMatchingJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListMatchingJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMatchingJobsResult> listMatchingJobsAsync(ListMatchingJobsRequest listMatchingJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMatchingJobsRequest, ListMatchingJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the <code>MatchingWorkflows</code> that have been created for an Amazon Web Services
     * account.
     * </p>
     * 
     * @param listMatchingWorkflowsRequest
     * @return A Java Future containing the result of the ListMatchingWorkflows operation returned by the service.
     * @sample AWSEntityResolutionAsync.ListMatchingWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListMatchingWorkflows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMatchingWorkflowsResult> listMatchingWorkflowsAsync(ListMatchingWorkflowsRequest listMatchingWorkflowsRequest);

    /**
     * <p>
     * Returns a list of all the <code>MatchingWorkflows</code> that have been created for an Amazon Web Services
     * account.
     * </p>
     * 
     * @param listMatchingWorkflowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMatchingWorkflows operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.ListMatchingWorkflows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListMatchingWorkflows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMatchingWorkflowsResult> listMatchingWorkflowsAsync(ListMatchingWorkflowsRequest listMatchingWorkflowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMatchingWorkflowsRequest, ListMatchingWorkflowsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the <code>ProviderServices</code> that are available in this Amazon Web Services Region.
     * </p>
     * 
     * @param listProviderServicesRequest
     * @return A Java Future containing the result of the ListProviderServices operation returned by the service.
     * @sample AWSEntityResolutionAsync.ListProviderServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListProviderServices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProviderServicesResult> listProviderServicesAsync(ListProviderServicesRequest listProviderServicesRequest);

    /**
     * <p>
     * Returns a list of all the <code>ProviderServices</code> that are available in this Amazon Web Services Region.
     * </p>
     * 
     * @param listProviderServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProviderServices operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.ListProviderServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListProviderServices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProviderServicesResult> listProviderServicesAsync(ListProviderServicesRequest listProviderServicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProviderServicesRequest, ListProviderServicesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the <code>SchemaMappings</code> that have been created for an Amazon Web Services account.
     * </p>
     * 
     * @param listSchemaMappingsRequest
     * @return A Java Future containing the result of the ListSchemaMappings operation returned by the service.
     * @sample AWSEntityResolutionAsync.ListSchemaMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListSchemaMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSchemaMappingsResult> listSchemaMappingsAsync(ListSchemaMappingsRequest listSchemaMappingsRequest);

    /**
     * <p>
     * Returns a list of all the <code>SchemaMappings</code> that have been created for an Amazon Web Services account.
     * </p>
     * 
     * @param listSchemaMappingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSchemaMappings operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.ListSchemaMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListSchemaMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSchemaMappingsResult> listSchemaMappingsAsync(ListSchemaMappingsRequest listSchemaMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSchemaMappingsRequest, ListSchemaMappingsResult> asyncHandler);

    /**
     * <p>
     * Displays the tags associated with an Entity Resolution resource. In Entity Resolution, <code>SchemaMapping</code>
     * , and <code>MatchingWorkflow</code> can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSEntityResolutionAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Displays the tags associated with an Entity Resolution resource. In Entity Resolution, <code>SchemaMapping</code>
     * , and <code>MatchingWorkflow</code> can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts the <code>IdMappingJob</code> of a workflow. The workflow must have previously been created using the
     * <code>CreateIdMappingWorkflow</code> endpoint.
     * </p>
     * 
     * @param startIdMappingJobRequest
     * @return A Java Future containing the result of the StartIdMappingJob operation returned by the service.
     * @sample AWSEntityResolutionAsync.StartIdMappingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/StartIdMappingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartIdMappingJobResult> startIdMappingJobAsync(StartIdMappingJobRequest startIdMappingJobRequest);

    /**
     * <p>
     * Starts the <code>IdMappingJob</code> of a workflow. The workflow must have previously been created using the
     * <code>CreateIdMappingWorkflow</code> endpoint.
     * </p>
     * 
     * @param startIdMappingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartIdMappingJob operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.StartIdMappingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/StartIdMappingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartIdMappingJobResult> startIdMappingJobAsync(StartIdMappingJobRequest startIdMappingJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartIdMappingJobRequest, StartIdMappingJobResult> asyncHandler);

    /**
     * <p>
     * Starts the <code>MatchingJob</code> of a workflow. The workflow must have previously been created using the
     * <code>CreateMatchingWorkflow</code> endpoint.
     * </p>
     * 
     * @param startMatchingJobRequest
     * @return A Java Future containing the result of the StartMatchingJob operation returned by the service.
     * @sample AWSEntityResolutionAsync.StartMatchingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/StartMatchingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMatchingJobResult> startMatchingJobAsync(StartMatchingJobRequest startMatchingJobRequest);

    /**
     * <p>
     * Starts the <code>MatchingJob</code> of a workflow. The workflow must have previously been created using the
     * <code>CreateMatchingWorkflow</code> endpoint.
     * </p>
     * 
     * @param startMatchingJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMatchingJob operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.StartMatchingJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/StartMatchingJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMatchingJobResult> startMatchingJobAsync(StartMatchingJobRequest startMatchingJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartMatchingJobRequest, StartMatchingJobResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Entity Resolution resource. Tags can help you
     * organize and categorize your resources. You can also use them to scope user permissions by granting a user
     * permission to access or change only resources with certain tag values. In Entity Resolution,
     * <code>SchemaMapping</code> and <code>MatchingWorkflow</code> can be tagged. Tags don't have any semantic meaning
     * to Amazon Web Services and are interpreted strictly as strings of characters. You can use the
     * <code>TagResource</code> action with a resource that already has tags. If you specify a new tag key, this tag is
     * appended to the list of tags associated with the resource. If you specify a tag key that is already associated
     * with the resource, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSEntityResolutionAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified Entity Resolution resource. Tags can help you
     * organize and categorize your resources. You can also use them to scope user permissions by granting a user
     * permission to access or change only resources with certain tag values. In Entity Resolution,
     * <code>SchemaMapping</code> and <code>MatchingWorkflow</code> can be tagged. Tags don't have any semantic meaning
     * to Amazon Web Services and are interpreted strictly as strings of characters. You can use the
     * <code>TagResource</code> action with a resource that already has tags. If you specify a new tag key, this tag is
     * appended to the list of tags associated with the resource. If you specify a tag key that is already associated
     * with the resource, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified Entity Resolution resource. In Entity Resolution,
     * <code>SchemaMapping</code>, and <code>MatchingWorkflow</code> can be tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSEntityResolutionAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified Entity Resolution resource. In Entity Resolution,
     * <code>SchemaMapping</code>, and <code>MatchingWorkflow</code> can be tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing <code>IdMappingWorkflow</code>. This method is identical to
     * <code>CreateIdMappingWorkflow</code>, except it uses an HTTP <code>PUT</code> request instead of a
     * <code>POST</code> request, and the <code>IdMappingWorkflow</code> must already exist for the method to succeed.
     * </p>
     * 
     * @param updateIdMappingWorkflowRequest
     * @return A Java Future containing the result of the UpdateIdMappingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsync.UpdateIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdMappingWorkflowResult> updateIdMappingWorkflowAsync(UpdateIdMappingWorkflowRequest updateIdMappingWorkflowRequest);

    /**
     * <p>
     * Updates an existing <code>IdMappingWorkflow</code>. This method is identical to
     * <code>CreateIdMappingWorkflow</code>, except it uses an HTTP <code>PUT</code> request instead of a
     * <code>POST</code> request, and the <code>IdMappingWorkflow</code> must already exist for the method to succeed.
     * </p>
     * 
     * @param updateIdMappingWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIdMappingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.UpdateIdMappingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateIdMappingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdMappingWorkflowResult> updateIdMappingWorkflowAsync(UpdateIdMappingWorkflowRequest updateIdMappingWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIdMappingWorkflowRequest, UpdateIdMappingWorkflowResult> asyncHandler);

    /**
     * <p>
     * Updates an existing <code>MatchingWorkflow</code>. This method is identical to
     * <code>CreateMatchingWorkflow</code>, except it uses an HTTP <code>PUT</code> request instead of a
     * <code>POST</code> request, and the <code>MatchingWorkflow</code> must already exist for the method to succeed.
     * </p>
     * 
     * @param updateMatchingWorkflowRequest
     * @return A Java Future containing the result of the UpdateMatchingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsync.UpdateMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMatchingWorkflowResult> updateMatchingWorkflowAsync(UpdateMatchingWorkflowRequest updateMatchingWorkflowRequest);

    /**
     * <p>
     * Updates an existing <code>MatchingWorkflow</code>. This method is identical to
     * <code>CreateMatchingWorkflow</code>, except it uses an HTTP <code>PUT</code> request instead of a
     * <code>POST</code> request, and the <code>MatchingWorkflow</code> must already exist for the method to succeed.
     * </p>
     * 
     * @param updateMatchingWorkflowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMatchingWorkflow operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.UpdateMatchingWorkflow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateMatchingWorkflow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMatchingWorkflowResult> updateMatchingWorkflowAsync(UpdateMatchingWorkflowRequest updateMatchingWorkflowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMatchingWorkflowRequest, UpdateMatchingWorkflowResult> asyncHandler);

    /**
     * <p>
     * Updates a schema mapping.
     * </p>
     * <note>
     * <p>
     * A schema is immutable if it is being used by a workflow. Therefore, you can't update a schema mapping if it's
     * associated with a workflow.
     * </p>
     * </note>
     * 
     * @param updateSchemaMappingRequest
     * @return A Java Future containing the result of the UpdateSchemaMapping operation returned by the service.
     * @sample AWSEntityResolutionAsync.UpdateSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSchemaMappingResult> updateSchemaMappingAsync(UpdateSchemaMappingRequest updateSchemaMappingRequest);

    /**
     * <p>
     * Updates a schema mapping.
     * </p>
     * <note>
     * <p>
     * A schema is immutable if it is being used by a workflow. Therefore, you can't update a schema mapping if it's
     * associated with a workflow.
     * </p>
     * </note>
     * 
     * @param updateSchemaMappingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSchemaMapping operation returned by the service.
     * @sample AWSEntityResolutionAsyncHandler.UpdateSchemaMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/UpdateSchemaMapping"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSchemaMappingResult> updateSchemaMappingAsync(UpdateSchemaMappingRequest updateSchemaMappingRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSchemaMappingRequest, UpdateSchemaMappingResult> asyncHandler);

}
