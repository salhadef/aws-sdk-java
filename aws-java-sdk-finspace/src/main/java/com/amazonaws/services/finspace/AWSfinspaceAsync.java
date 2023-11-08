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
package com.amazonaws.services.finspace;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;

/**
 * Interface for accessing finspace asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.finspace.AbstractAWSfinspaceAsync} instead.
 * </p>
 * <p>
 * <p>
 * The FinSpace management service provides the APIs for managing FinSpace environments.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSfinspaceAsync extends AWSfinspace {

    /**
     * <p>
     * Create a new FinSpace environment.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AWSfinspaceAsync.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Create a new FinSpace environment.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Creates a changeset for a kdb database. A changeset allows you to add and delete existing files by using an
     * ordered list of change requests.
     * </p>
     * 
     * @param createKxChangesetRequest
     * @return A Java Future containing the result of the CreateKxChangeset operation returned by the service.
     * @sample AWSfinspaceAsync.CreateKxChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKxChangesetResult> createKxChangesetAsync(CreateKxChangesetRequest createKxChangesetRequest);

    /**
     * <p>
     * Creates a changeset for a kdb database. A changeset allows you to add and delete existing files by using an
     * ordered list of change requests.
     * </p>
     * 
     * @param createKxChangesetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKxChangeset operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.CreateKxChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKxChangesetResult> createKxChangesetAsync(CreateKxChangesetRequest createKxChangesetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKxChangesetRequest, CreateKxChangesetResult> asyncHandler);

    /**
     * <p>
     * Creates a new kdb cluster.
     * </p>
     * 
     * @param createKxClusterRequest
     * @return A Java Future containing the result of the CreateKxCluster operation returned by the service.
     * @sample AWSfinspaceAsync.CreateKxCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKxClusterResult> createKxClusterAsync(CreateKxClusterRequest createKxClusterRequest);

    /**
     * <p>
     * Creates a new kdb cluster.
     * </p>
     * 
     * @param createKxClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKxCluster operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.CreateKxCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKxClusterResult> createKxClusterAsync(CreateKxClusterRequest createKxClusterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKxClusterRequest, CreateKxClusterResult> asyncHandler);

    /**
     * <p>
     * Creates a new kdb database in the environment.
     * </p>
     * 
     * @param createKxDatabaseRequest
     * @return A Java Future containing the result of the CreateKxDatabase operation returned by the service.
     * @sample AWSfinspaceAsync.CreateKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKxDatabaseResult> createKxDatabaseAsync(CreateKxDatabaseRequest createKxDatabaseRequest);

    /**
     * <p>
     * Creates a new kdb database in the environment.
     * </p>
     * 
     * @param createKxDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKxDatabase operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.CreateKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKxDatabaseResult> createKxDatabaseAsync(CreateKxDatabaseRequest createKxDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKxDatabaseRequest, CreateKxDatabaseResult> asyncHandler);

    /**
     * <p>
     * Creates a managed kdb environment for the account.
     * </p>
     * 
     * @param createKxEnvironmentRequest
     * @return A Java Future containing the result of the CreateKxEnvironment operation returned by the service.
     * @sample AWSfinspaceAsync.CreateKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateKxEnvironmentResult> createKxEnvironmentAsync(CreateKxEnvironmentRequest createKxEnvironmentRequest);

    /**
     * <p>
     * Creates a managed kdb environment for the account.
     * </p>
     * 
     * @param createKxEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKxEnvironment operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.CreateKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateKxEnvironmentResult> createKxEnvironmentAsync(CreateKxEnvironmentRequest createKxEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKxEnvironmentRequest, CreateKxEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Creates a user in FinSpace kdb environment with an associated IAM role.
     * </p>
     * 
     * @param createKxUserRequest
     * @return A Java Future containing the result of the CreateKxUser operation returned by the service.
     * @sample AWSfinspaceAsync.CreateKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKxUserResult> createKxUserAsync(CreateKxUserRequest createKxUserRequest);

    /**
     * <p>
     * Creates a user in FinSpace kdb environment with an associated IAM role.
     * </p>
     * 
     * @param createKxUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKxUser operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.CreateKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKxUserResult> createKxUserAsync(CreateKxUserRequest createKxUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKxUserRequest, CreateKxUserResult> asyncHandler);

    /**
     * <p>
     * Delete an FinSpace environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AWSfinspaceAsync.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Delete an FinSpace environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deletes a kdb cluster.
     * </p>
     * 
     * @param deleteKxClusterRequest
     * @return A Java Future containing the result of the DeleteKxCluster operation returned by the service.
     * @sample AWSfinspaceAsync.DeleteKxCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKxClusterResult> deleteKxClusterAsync(DeleteKxClusterRequest deleteKxClusterRequest);

    /**
     * <p>
     * Deletes a kdb cluster.
     * </p>
     * 
     * @param deleteKxClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKxCluster operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.DeleteKxCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKxClusterResult> deleteKxClusterAsync(DeleteKxClusterRequest deleteKxClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKxClusterRequest, DeleteKxClusterResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified database and all of its associated data. This action is irreversible. You must copy any
     * data out of the database before deleting it if the data is to be retained.
     * </p>
     * 
     * @param deleteKxDatabaseRequest
     * @return A Java Future containing the result of the DeleteKxDatabase operation returned by the service.
     * @sample AWSfinspaceAsync.DeleteKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKxDatabaseResult> deleteKxDatabaseAsync(DeleteKxDatabaseRequest deleteKxDatabaseRequest);

    /**
     * <p>
     * Deletes the specified database and all of its associated data. This action is irreversible. You must copy any
     * data out of the database before deleting it if the data is to be retained.
     * </p>
     * 
     * @param deleteKxDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKxDatabase operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.DeleteKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKxDatabaseResult> deleteKxDatabaseAsync(DeleteKxDatabaseRequest deleteKxDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKxDatabaseRequest, DeleteKxDatabaseResult> asyncHandler);

    /**
     * <p>
     * Deletes the kdb environment. This action is irreversible. Deleting a kdb environment will remove all the
     * associated data and any services running in it.
     * </p>
     * 
     * @param deleteKxEnvironmentRequest
     * @return A Java Future containing the result of the DeleteKxEnvironment operation returned by the service.
     * @sample AWSfinspaceAsync.DeleteKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKxEnvironmentResult> deleteKxEnvironmentAsync(DeleteKxEnvironmentRequest deleteKxEnvironmentRequest);

    /**
     * <p>
     * Deletes the kdb environment. This action is irreversible. Deleting a kdb environment will remove all the
     * associated data and any services running in it.
     * </p>
     * 
     * @param deleteKxEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKxEnvironment operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.DeleteKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKxEnvironmentResult> deleteKxEnvironmentAsync(DeleteKxEnvironmentRequest deleteKxEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKxEnvironmentRequest, DeleteKxEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deletes a user in the specified kdb environment.
     * </p>
     * 
     * @param deleteKxUserRequest
     * @return A Java Future containing the result of the DeleteKxUser operation returned by the service.
     * @sample AWSfinspaceAsync.DeleteKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKxUserResult> deleteKxUserAsync(DeleteKxUserRequest deleteKxUserRequest);

    /**
     * <p>
     * Deletes a user in the specified kdb environment.
     * </p>
     * 
     * @param deleteKxUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKxUser operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.DeleteKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/DeleteKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKxUserResult> deleteKxUserAsync(DeleteKxUserRequest deleteKxUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKxUserRequest, DeleteKxUserResult> asyncHandler);

    /**
     * <p>
     * Returns the FinSpace environment object.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AWSfinspaceAsync.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Returns the FinSpace environment object.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Returns information about a kdb changeset.
     * </p>
     * 
     * @param getKxChangesetRequest
     * @return A Java Future containing the result of the GetKxChangeset operation returned by the service.
     * @sample AWSfinspaceAsync.GetKxChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKxChangesetResult> getKxChangesetAsync(GetKxChangesetRequest getKxChangesetRequest);

    /**
     * <p>
     * Returns information about a kdb changeset.
     * </p>
     * 
     * @param getKxChangesetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKxChangeset operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.GetKxChangeset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxChangeset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKxChangesetResult> getKxChangesetAsync(GetKxChangesetRequest getKxChangesetRequest,
            com.amazonaws.handlers.AsyncHandler<GetKxChangesetRequest, GetKxChangesetResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a kdb cluster.
     * </p>
     * 
     * @param getKxClusterRequest
     * @return A Java Future containing the result of the GetKxCluster operation returned by the service.
     * @sample AWSfinspaceAsync.GetKxCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKxClusterResult> getKxClusterAsync(GetKxClusterRequest getKxClusterRequest);

    /**
     * <p>
     * Retrieves information about a kdb cluster.
     * </p>
     * 
     * @param getKxClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKxCluster operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.GetKxCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxCluster" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKxClusterResult> getKxClusterAsync(GetKxClusterRequest getKxClusterRequest,
            com.amazonaws.handlers.AsyncHandler<GetKxClusterRequest, GetKxClusterResult> asyncHandler);

    /**
     * <p>
     * Retrieves a connection string for a user to connect to a kdb cluster. You must call this API using the same role
     * that you have defined while creating a user.
     * </p>
     * 
     * @param getKxConnectionStringRequest
     * @return A Java Future containing the result of the GetKxConnectionString operation returned by the service.
     * @sample AWSfinspaceAsync.GetKxConnectionString
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxConnectionString" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetKxConnectionStringResult> getKxConnectionStringAsync(GetKxConnectionStringRequest getKxConnectionStringRequest);

    /**
     * <p>
     * Retrieves a connection string for a user to connect to a kdb cluster. You must call this API using the same role
     * that you have defined while creating a user.
     * </p>
     * 
     * @param getKxConnectionStringRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKxConnectionString operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.GetKxConnectionString
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxConnectionString" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetKxConnectionStringResult> getKxConnectionStringAsync(GetKxConnectionStringRequest getKxConnectionStringRequest,
            com.amazonaws.handlers.AsyncHandler<GetKxConnectionStringRequest, GetKxConnectionStringResult> asyncHandler);

    /**
     * <p>
     * Returns database information for the specified environment ID.
     * </p>
     * 
     * @param getKxDatabaseRequest
     * @return A Java Future containing the result of the GetKxDatabase operation returned by the service.
     * @sample AWSfinspaceAsync.GetKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKxDatabaseResult> getKxDatabaseAsync(GetKxDatabaseRequest getKxDatabaseRequest);

    /**
     * <p>
     * Returns database information for the specified environment ID.
     * </p>
     * 
     * @param getKxDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKxDatabase operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.GetKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKxDatabaseResult> getKxDatabaseAsync(GetKxDatabaseRequest getKxDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetKxDatabaseRequest, GetKxDatabaseResult> asyncHandler);

    /**
     * <p>
     * Retrieves all the information for the specified kdb environment.
     * </p>
     * 
     * @param getKxEnvironmentRequest
     * @return A Java Future containing the result of the GetKxEnvironment operation returned by the service.
     * @sample AWSfinspaceAsync.GetKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKxEnvironmentResult> getKxEnvironmentAsync(GetKxEnvironmentRequest getKxEnvironmentRequest);

    /**
     * <p>
     * Retrieves all the information for the specified kdb environment.
     * </p>
     * 
     * @param getKxEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKxEnvironment operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.GetKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKxEnvironmentResult> getKxEnvironmentAsync(GetKxEnvironmentRequest getKxEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetKxEnvironmentRequest, GetKxEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified kdb user.
     * </p>
     * 
     * @param getKxUserRequest
     * @return A Java Future containing the result of the GetKxUser operation returned by the service.
     * @sample AWSfinspaceAsync.GetKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKxUserResult> getKxUserAsync(GetKxUserRequest getKxUserRequest);

    /**
     * <p>
     * Retrieves information about the specified kdb user.
     * </p>
     * 
     * @param getKxUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKxUser operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.GetKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKxUserResult> getKxUserAsync(GetKxUserRequest getKxUserRequest,
            com.amazonaws.handlers.AsyncHandler<GetKxUserRequest, GetKxUserResult> asyncHandler);

    /**
     * <p>
     * A list of all of your FinSpace environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AWSfinspaceAsync.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * A list of all of your FinSpace environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the changesets for a database.
     * </p>
     * 
     * @param listKxChangesetsRequest
     * @return A Java Future containing the result of the ListKxChangesets operation returned by the service.
     * @sample AWSfinspaceAsync.ListKxChangesets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxChangesets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKxChangesetsResult> listKxChangesetsAsync(ListKxChangesetsRequest listKxChangesetsRequest);

    /**
     * <p>
     * Returns a list of all the changesets for a database.
     * </p>
     * 
     * @param listKxChangesetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKxChangesets operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.ListKxChangesets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxChangesets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKxChangesetsResult> listKxChangesetsAsync(ListKxChangesetsRequest listKxChangesetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListKxChangesetsRequest, ListKxChangesetsResult> asyncHandler);

    /**
     * <p>
     * Lists all the nodes in a kdb cluster.
     * </p>
     * 
     * @param listKxClusterNodesRequest
     * @return A Java Future containing the result of the ListKxClusterNodes operation returned by the service.
     * @sample AWSfinspaceAsync.ListKxClusterNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxClusterNodes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListKxClusterNodesResult> listKxClusterNodesAsync(ListKxClusterNodesRequest listKxClusterNodesRequest);

    /**
     * <p>
     * Lists all the nodes in a kdb cluster.
     * </p>
     * 
     * @param listKxClusterNodesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKxClusterNodes operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.ListKxClusterNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxClusterNodes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListKxClusterNodesResult> listKxClusterNodesAsync(ListKxClusterNodesRequest listKxClusterNodesRequest,
            com.amazonaws.handlers.AsyncHandler<ListKxClusterNodesRequest, ListKxClusterNodesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of clusters.
     * </p>
     * 
     * @param listKxClustersRequest
     * @return A Java Future containing the result of the ListKxClusters operation returned by the service.
     * @sample AWSfinspaceAsync.ListKxClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKxClustersResult> listKxClustersAsync(ListKxClustersRequest listKxClustersRequest);

    /**
     * <p>
     * Returns a list of clusters.
     * </p>
     * 
     * @param listKxClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKxClusters operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.ListKxClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxClusters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKxClustersResult> listKxClustersAsync(ListKxClustersRequest listKxClustersRequest,
            com.amazonaws.handlers.AsyncHandler<ListKxClustersRequest, ListKxClustersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all the databases in the kdb environment.
     * </p>
     * 
     * @param listKxDatabasesRequest
     * @return A Java Future containing the result of the ListKxDatabases operation returned by the service.
     * @sample AWSfinspaceAsync.ListKxDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKxDatabasesResult> listKxDatabasesAsync(ListKxDatabasesRequest listKxDatabasesRequest);

    /**
     * <p>
     * Returns a list of all the databases in the kdb environment.
     * </p>
     * 
     * @param listKxDatabasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKxDatabases operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.ListKxDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKxDatabasesResult> listKxDatabasesAsync(ListKxDatabasesRequest listKxDatabasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListKxDatabasesRequest, ListKxDatabasesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of kdb environments created in an account.
     * </p>
     * 
     * @param listKxEnvironmentsRequest
     * @return A Java Future containing the result of the ListKxEnvironments operation returned by the service.
     * @sample AWSfinspaceAsync.ListKxEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListKxEnvironmentsResult> listKxEnvironmentsAsync(ListKxEnvironmentsRequest listKxEnvironmentsRequest);

    /**
     * <p>
     * Returns a list of kdb environments created in an account.
     * </p>
     * 
     * @param listKxEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKxEnvironments operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.ListKxEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListKxEnvironmentsResult> listKxEnvironmentsAsync(ListKxEnvironmentsRequest listKxEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListKxEnvironmentsRequest, ListKxEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Lists all the users in a kdb environment.
     * </p>
     * 
     * @param listKxUsersRequest
     * @return A Java Future containing the result of the ListKxUsers operation returned by the service.
     * @sample AWSfinspaceAsync.ListKxUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKxUsersResult> listKxUsersAsync(ListKxUsersRequest listKxUsersRequest);

    /**
     * <p>
     * Lists all the users in a kdb environment.
     * </p>
     * 
     * @param listKxUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKxUsers operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.ListKxUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKxUsersResult> listKxUsersAsync(ListKxUsersRequest listKxUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListKxUsersRequest, ListKxUsersResult> asyncHandler);

    /**
     * <p>
     * A list of all tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSfinspaceAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * A list of all tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds metadata tags to a FinSpace resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSfinspaceAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds metadata tags to a FinSpace resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes metadata tags from a FinSpace resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSfinspaceAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes metadata tags from a FinSpace resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update your FinSpace environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AWSfinspaceAsync.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Update your FinSpace environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Allows you to update code configuration on a running cluster. By using this API you can update the code, the
     * initialization script path, and the command line arguments for a specific cluster. The configuration that you
     * want to update will override any existing configurations on the cluster.
     * </p>
     * 
     * @param updateKxClusterCodeConfigurationRequest
     * @return A Java Future containing the result of the UpdateKxClusterCodeConfiguration operation returned by the
     *         service.
     * @sample AWSfinspaceAsync.UpdateKxClusterCodeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxClusterCodeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxClusterCodeConfigurationResult> updateKxClusterCodeConfigurationAsync(
            UpdateKxClusterCodeConfigurationRequest updateKxClusterCodeConfigurationRequest);

    /**
     * <p>
     * Allows you to update code configuration on a running cluster. By using this API you can update the code, the
     * initialization script path, and the command line arguments for a specific cluster. The configuration that you
     * want to update will override any existing configurations on the cluster.
     * </p>
     * 
     * @param updateKxClusterCodeConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKxClusterCodeConfiguration operation returned by the
     *         service.
     * @sample AWSfinspaceAsyncHandler.UpdateKxClusterCodeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxClusterCodeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxClusterCodeConfigurationResult> updateKxClusterCodeConfigurationAsync(
            UpdateKxClusterCodeConfigurationRequest updateKxClusterCodeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKxClusterCodeConfigurationRequest, UpdateKxClusterCodeConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the databases mounted on a kdb cluster, which includes the <code>changesetId</code> and all the dbPaths
     * to be cached. This API does not allow you to change a database name or add a database if you created a cluster
     * without one.
     * </p>
     * <p>
     * Using this API you can point a cluster to a different changeset and modify a list of partitions being cached.
     * </p>
     * 
     * @param updateKxClusterDatabasesRequest
     * @return A Java Future containing the result of the UpdateKxClusterDatabases operation returned by the service.
     * @sample AWSfinspaceAsync.UpdateKxClusterDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxClusterDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxClusterDatabasesResult> updateKxClusterDatabasesAsync(UpdateKxClusterDatabasesRequest updateKxClusterDatabasesRequest);

    /**
     * <p>
     * Updates the databases mounted on a kdb cluster, which includes the <code>changesetId</code> and all the dbPaths
     * to be cached. This API does not allow you to change a database name or add a database if you created a cluster
     * without one.
     * </p>
     * <p>
     * Using this API you can point a cluster to a different changeset and modify a list of partitions being cached.
     * </p>
     * 
     * @param updateKxClusterDatabasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKxClusterDatabases operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.UpdateKxClusterDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxClusterDatabases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxClusterDatabasesResult> updateKxClusterDatabasesAsync(UpdateKxClusterDatabasesRequest updateKxClusterDatabasesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKxClusterDatabasesRequest, UpdateKxClusterDatabasesResult> asyncHandler);

    /**
     * <p>
     * Updates information for the given kdb database.
     * </p>
     * 
     * @param updateKxDatabaseRequest
     * @return A Java Future containing the result of the UpdateKxDatabase operation returned by the service.
     * @sample AWSfinspaceAsync.UpdateKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxDatabaseResult> updateKxDatabaseAsync(UpdateKxDatabaseRequest updateKxDatabaseRequest);

    /**
     * <p>
     * Updates information for the given kdb database.
     * </p>
     * 
     * @param updateKxDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKxDatabase operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.UpdateKxDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxDatabaseResult> updateKxDatabaseAsync(UpdateKxDatabaseRequest updateKxDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKxDatabaseRequest, UpdateKxDatabaseResult> asyncHandler);

    /**
     * <p>
     * Updates information for the given kdb environment.
     * </p>
     * 
     * @param updateKxEnvironmentRequest
     * @return A Java Future containing the result of the UpdateKxEnvironment operation returned by the service.
     * @sample AWSfinspaceAsync.UpdateKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxEnvironmentResult> updateKxEnvironmentAsync(UpdateKxEnvironmentRequest updateKxEnvironmentRequest);

    /**
     * <p>
     * Updates information for the given kdb environment.
     * </p>
     * 
     * @param updateKxEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKxEnvironment operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.UpdateKxEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxEnvironmentResult> updateKxEnvironmentAsync(UpdateKxEnvironmentRequest updateKxEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKxEnvironmentRequest, UpdateKxEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Updates environment network to connect to your internal network by using a transit gateway. This API supports
     * request to create a transit gateway attachment from FinSpace VPC to your transit gateway ID and create a custom
     * Route-53 outbound resolvers.
     * </p>
     * <p>
     * Once you send a request to update a network, you cannot change it again. Network update might require termination
     * of any clusters that are running in the existing network.
     * </p>
     * 
     * @param updateKxEnvironmentNetworkRequest
     * @return A Java Future containing the result of the UpdateKxEnvironmentNetwork operation returned by the service.
     * @sample AWSfinspaceAsync.UpdateKxEnvironmentNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxEnvironmentNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxEnvironmentNetworkResult> updateKxEnvironmentNetworkAsync(
            UpdateKxEnvironmentNetworkRequest updateKxEnvironmentNetworkRequest);

    /**
     * <p>
     * Updates environment network to connect to your internal network by using a transit gateway. This API supports
     * request to create a transit gateway attachment from FinSpace VPC to your transit gateway ID and create a custom
     * Route-53 outbound resolvers.
     * </p>
     * <p>
     * Once you send a request to update a network, you cannot change it again. Network update might require termination
     * of any clusters that are running in the existing network.
     * </p>
     * 
     * @param updateKxEnvironmentNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKxEnvironmentNetwork operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.UpdateKxEnvironmentNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxEnvironmentNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxEnvironmentNetworkResult> updateKxEnvironmentNetworkAsync(
            UpdateKxEnvironmentNetworkRequest updateKxEnvironmentNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKxEnvironmentNetworkRequest, UpdateKxEnvironmentNetworkResult> asyncHandler);

    /**
     * <p>
     * Updates the user details. You can only update the IAM role associated with a user.
     * </p>
     * 
     * @param updateKxUserRequest
     * @return A Java Future containing the result of the UpdateKxUser operation returned by the service.
     * @sample AWSfinspaceAsync.UpdateKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxUserResult> updateKxUserAsync(UpdateKxUserRequest updateKxUserRequest);

    /**
     * <p>
     * Updates the user details. You can only update the IAM role associated with a user.
     * </p>
     * 
     * @param updateKxUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKxUser operation returned by the service.
     * @sample AWSfinspaceAsyncHandler.UpdateKxUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateKxUserResult> updateKxUserAsync(UpdateKxUserRequest updateKxUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKxUserRequest, UpdateKxUserResult> asyncHandler);

}
