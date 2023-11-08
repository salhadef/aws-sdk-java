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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.cleanrooms.AWSCleanRoomsClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.services.cleanrooms.model.transform.*;

/**
 * Client for accessing AWS Clean Rooms Service. All service calls made using this client are blocking, and will not
 * return until the service call completes.
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
public class AWSCleanRoomsClient extends AmazonWebServiceClient implements AWSCleanRooms {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCleanRooms.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cleanrooms";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanrooms.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanrooms.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanrooms.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanrooms.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanrooms.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanrooms.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cleanrooms.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cleanrooms.model.AWSCleanRoomsException.class));

    public static AWSCleanRoomsClientBuilder builder() {
        return AWSCleanRoomsClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Clean Rooms Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCleanRoomsClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Clean Rooms Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSCleanRoomsClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("cleanrooms.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cleanrooms/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cleanrooms/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Retrieves multiple analysis templates within a collaboration by their Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param batchGetCollaborationAnalysisTemplateRequest
     * @return Result of the BatchGetCollaborationAnalysisTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.BatchGetCollaborationAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetCollaborationAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public BatchGetCollaborationAnalysisTemplateResult batchGetCollaborationAnalysisTemplate(BatchGetCollaborationAnalysisTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetCollaborationAnalysisTemplate(request);
    }

    @SdkInternalApi
    final BatchGetCollaborationAnalysisTemplateResult executeBatchGetCollaborationAnalysisTemplate(
            BatchGetCollaborationAnalysisTemplateRequest batchGetCollaborationAnalysisTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetCollaborationAnalysisTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetCollaborationAnalysisTemplateRequest> request = null;
        Response<BatchGetCollaborationAnalysisTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetCollaborationAnalysisTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(batchGetCollaborationAnalysisTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetCollaborationAnalysisTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetCollaborationAnalysisTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new BatchGetCollaborationAnalysisTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves multiple schemas by their identifiers.
     * </p>
     * 
     * @param batchGetSchemaRequest
     * @return Result of the BatchGetSchema operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.BatchGetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetSchema" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public BatchGetSchemaResult batchGetSchema(BatchGetSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeBatchGetSchema(request);
    }

    @SdkInternalApi
    final BatchGetSchemaResult executeBatchGetSchema(BatchGetSchemaRequest batchGetSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(batchGetSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetSchemaRequest> request = null;
        Response<BatchGetSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(batchGetSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "BatchGetSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<BatchGetSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new BatchGetSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new analysis template.
     * </p>
     * 
     * @param createAnalysisTemplateRequest
     * @return Result of the CreateAnalysisTemplate operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAnalysisTemplateResult createAnalysisTemplate(CreateAnalysisTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAnalysisTemplate(request);
    }

    @SdkInternalApi
    final CreateAnalysisTemplateResult executeCreateAnalysisTemplate(CreateAnalysisTemplateRequest createAnalysisTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(createAnalysisTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAnalysisTemplateRequest> request = null;
        Response<CreateAnalysisTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAnalysisTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAnalysisTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAnalysisTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAnalysisTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAnalysisTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new collaboration.
     * </p>
     * 
     * @param createCollaborationRequest
     * @return Result of the CreateCollaboration operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateCollaborationResult createCollaboration(CreateCollaborationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCollaboration(request);
    }

    @SdkInternalApi
    final CreateCollaborationResult executeCreateCollaboration(CreateCollaborationRequest createCollaborationRequest) {

        ExecutionContext executionContext = createExecutionContext(createCollaborationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCollaborationRequest> request = null;
        Response<CreateCollaborationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCollaborationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCollaborationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCollaboration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCollaborationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCollaborationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new configured table resource.
     * </p>
     * 
     * @param createConfiguredTableRequest
     * @return Result of the CreateConfiguredTable operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfiguredTableResult createConfiguredTable(CreateConfiguredTableRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfiguredTable(request);
    }

    @SdkInternalApi
    final CreateConfiguredTableResult executeCreateConfiguredTable(CreateConfiguredTableRequest createConfiguredTableRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfiguredTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfiguredTableRequest> request = null;
        Response<CreateConfiguredTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfiguredTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConfiguredTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfiguredTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConfiguredTableResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateConfiguredTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new analysis rule for a configured table. Currently, only one analysis rule can be created for a given
     * configured table.
     * </p>
     * 
     * @param createConfiguredTableAnalysisRuleRequest
     * @return Result of the CreateConfiguredTableAnalysisRule operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfiguredTableAnalysisRuleResult createConfiguredTableAnalysisRule(CreateConfiguredTableAnalysisRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfiguredTableAnalysisRule(request);
    }

    @SdkInternalApi
    final CreateConfiguredTableAnalysisRuleResult executeCreateConfiguredTableAnalysisRule(
            CreateConfiguredTableAnalysisRuleRequest createConfiguredTableAnalysisRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfiguredTableAnalysisRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfiguredTableAnalysisRuleRequest> request = null;
        Response<CreateConfiguredTableAnalysisRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfiguredTableAnalysisRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createConfiguredTableAnalysisRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfiguredTableAnalysisRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConfiguredTableAnalysisRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateConfiguredTableAnalysisRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a configured table association. A configured table association links a configured table with a
     * collaboration.
     * </p>
     * 
     * @param createConfiguredTableAssociationRequest
     * @return Result of the CreateConfiguredTableAssociation operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConfiguredTableAssociationResult createConfiguredTableAssociation(CreateConfiguredTableAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConfiguredTableAssociation(request);
    }

    @SdkInternalApi
    final CreateConfiguredTableAssociationResult executeCreateConfiguredTableAssociation(
            CreateConfiguredTableAssociationRequest createConfiguredTableAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createConfiguredTableAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConfiguredTableAssociationRequest> request = null;
        Response<CreateConfiguredTableAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConfiguredTableAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createConfiguredTableAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConfiguredTableAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConfiguredTableAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateConfiguredTableAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a membership for a specific collaboration identifier and joins the collaboration.
     * </p>
     * 
     * @param createMembershipRequest
     * @return Result of the CreateMembership operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.CreateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateMembership" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateMembershipResult createMembership(CreateMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMembership(request);
    }

    @SdkInternalApi
    final CreateMembershipResult executeCreateMembership(CreateMembershipRequest createMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(createMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMembershipRequest> request = null;
        Response<CreateMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMembershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an analysis template.
     * </p>
     * 
     * @param deleteAnalysisTemplateRequest
     * @return Result of the DeleteAnalysisTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAnalysisTemplateResult deleteAnalysisTemplate(DeleteAnalysisTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAnalysisTemplate(request);
    }

    @SdkInternalApi
    final DeleteAnalysisTemplateResult executeDeleteAnalysisTemplate(DeleteAnalysisTemplateRequest deleteAnalysisTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAnalysisTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAnalysisTemplateRequest> request = null;
        Response<DeleteAnalysisTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAnalysisTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAnalysisTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAnalysisTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAnalysisTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAnalysisTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a collaboration. It can only be called by the collaboration owner.
     * </p>
     * 
     * @param deleteCollaborationRequest
     * @return Result of the DeleteCollaboration operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteCollaborationResult deleteCollaboration(DeleteCollaborationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCollaboration(request);
    }

    @SdkInternalApi
    final DeleteCollaborationResult executeDeleteCollaboration(DeleteCollaborationRequest deleteCollaborationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCollaborationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCollaborationRequest> request = null;
        Response<DeleteCollaborationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCollaborationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCollaborationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCollaboration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCollaborationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCollaborationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a configured table.
     * </p>
     * 
     * @param deleteConfiguredTableRequest
     * @return Result of the DeleteConfiguredTable operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfiguredTableResult deleteConfiguredTable(DeleteConfiguredTableRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfiguredTable(request);
    }

    @SdkInternalApi
    final DeleteConfiguredTableResult executeDeleteConfiguredTable(DeleteConfiguredTableRequest deleteConfiguredTableRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfiguredTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfiguredTableRequest> request = null;
        Response<DeleteConfiguredTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfiguredTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConfiguredTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfiguredTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfiguredTableResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteConfiguredTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a configured table analysis rule.
     * </p>
     * 
     * @param deleteConfiguredTableAnalysisRuleRequest
     * @return Result of the DeleteConfiguredTableAnalysisRule operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfiguredTableAnalysisRuleResult deleteConfiguredTableAnalysisRule(DeleteConfiguredTableAnalysisRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfiguredTableAnalysisRule(request);
    }

    @SdkInternalApi
    final DeleteConfiguredTableAnalysisRuleResult executeDeleteConfiguredTableAnalysisRule(
            DeleteConfiguredTableAnalysisRuleRequest deleteConfiguredTableAnalysisRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfiguredTableAnalysisRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfiguredTableAnalysisRuleRequest> request = null;
        Response<DeleteConfiguredTableAnalysisRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfiguredTableAnalysisRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConfiguredTableAnalysisRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfiguredTableAnalysisRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfiguredTableAnalysisRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConfiguredTableAnalysisRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a configured table association.
     * </p>
     * 
     * @param deleteConfiguredTableAssociationRequest
     * @return Result of the DeleteConfiguredTableAssociation operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConfiguredTableAssociationResult deleteConfiguredTableAssociation(DeleteConfiguredTableAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConfiguredTableAssociation(request);
    }

    @SdkInternalApi
    final DeleteConfiguredTableAssociationResult executeDeleteConfiguredTableAssociation(
            DeleteConfiguredTableAssociationRequest deleteConfiguredTableAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConfiguredTableAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConfiguredTableAssociationRequest> request = null;
        Response<DeleteConfiguredTableAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConfiguredTableAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConfiguredTableAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConfiguredTableAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConfiguredTableAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConfiguredTableAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified member from a collaboration. The removed member is placed in the Removed status and can't
     * interact with the collaboration. The removed member's data is inaccessible to active members of the
     * collaboration.
     * </p>
     * 
     * @param deleteMemberRequest
     * @return Result of the DeleteMember operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteMember" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMemberResult deleteMember(DeleteMemberRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMember(request);
    }

    @SdkInternalApi
    final DeleteMemberResult executeDeleteMember(DeleteMemberRequest deleteMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMemberRequest> request = null;
        Response<DeleteMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified membership. All resources under a membership must be deleted.
     * </p>
     * 
     * @param deleteMembershipRequest
     * @return Result of the DeleteMembership operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.DeleteMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteMembership" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteMembershipResult deleteMembership(DeleteMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMembership(request);
    }

    @SdkInternalApi
    final DeleteMembershipResult executeDeleteMembership(DeleteMembershipRequest deleteMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMembershipRequest> request = null;
        Response<DeleteMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMembershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an analysis template.
     * </p>
     * 
     * @param getAnalysisTemplateRequest
     * @return Result of the GetAnalysisTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetAnalysisTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAnalysisTemplateResult getAnalysisTemplate(GetAnalysisTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetAnalysisTemplate(request);
    }

    @SdkInternalApi
    final GetAnalysisTemplateResult executeGetAnalysisTemplate(GetAnalysisTemplateRequest getAnalysisTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getAnalysisTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAnalysisTemplateRequest> request = null;
        Response<GetAnalysisTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAnalysisTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAnalysisTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAnalysisTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAnalysisTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAnalysisTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata about a collaboration.
     * </p>
     * 
     * @param getCollaborationRequest
     * @return Result of the GetCollaboration operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCollaborationResult getCollaboration(GetCollaborationRequest request) {
        request = beforeClientExecution(request);
        return executeGetCollaboration(request);
    }

    @SdkInternalApi
    final GetCollaborationResult executeGetCollaboration(GetCollaborationRequest getCollaborationRequest) {

        ExecutionContext executionContext = createExecutionContext(getCollaborationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCollaborationRequest> request = null;
        Response<GetCollaborationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCollaborationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCollaborationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCollaboration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCollaborationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCollaborationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves an analysis template within a collaboration.
     * </p>
     * 
     * @param getCollaborationAnalysisTemplateRequest
     * @return Result of the GetCollaborationAnalysisTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetCollaborationAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetCollaborationAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCollaborationAnalysisTemplateResult getCollaborationAnalysisTemplate(GetCollaborationAnalysisTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeGetCollaborationAnalysisTemplate(request);
    }

    @SdkInternalApi
    final GetCollaborationAnalysisTemplateResult executeGetCollaborationAnalysisTemplate(
            GetCollaborationAnalysisTemplateRequest getCollaborationAnalysisTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(getCollaborationAnalysisTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCollaborationAnalysisTemplateRequest> request = null;
        Response<GetCollaborationAnalysisTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCollaborationAnalysisTemplateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCollaborationAnalysisTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCollaborationAnalysisTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCollaborationAnalysisTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCollaborationAnalysisTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a configured table.
     * </p>
     * 
     * @param getConfiguredTableRequest
     * @return Result of the GetConfiguredTable operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTable" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetConfiguredTableResult getConfiguredTable(GetConfiguredTableRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfiguredTable(request);
    }

    @SdkInternalApi
    final GetConfiguredTableResult executeGetConfiguredTable(GetConfiguredTableRequest getConfiguredTableRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfiguredTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfiguredTableRequest> request = null;
        Response<GetConfiguredTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfiguredTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConfiguredTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfiguredTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfiguredTableResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConfiguredTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a configured table analysis rule.
     * </p>
     * 
     * @param getConfiguredTableAnalysisRuleRequest
     * @return Result of the GetConfiguredTableAnalysisRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConfiguredTableAnalysisRuleResult getConfiguredTableAnalysisRule(GetConfiguredTableAnalysisRuleRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfiguredTableAnalysisRule(request);
    }

    @SdkInternalApi
    final GetConfiguredTableAnalysisRuleResult executeGetConfiguredTableAnalysisRule(GetConfiguredTableAnalysisRuleRequest getConfiguredTableAnalysisRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfiguredTableAnalysisRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfiguredTableAnalysisRuleRequest> request = null;
        Response<GetConfiguredTableAnalysisRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfiguredTableAnalysisRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConfiguredTableAnalysisRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfiguredTableAnalysisRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfiguredTableAnalysisRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConfiguredTableAnalysisRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a configured table association.
     * </p>
     * 
     * @param getConfiguredTableAssociationRequest
     * @return Result of the GetConfiguredTableAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConfiguredTableAssociationResult getConfiguredTableAssociation(GetConfiguredTableAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetConfiguredTableAssociation(request);
    }

    @SdkInternalApi
    final GetConfiguredTableAssociationResult executeGetConfiguredTableAssociation(GetConfiguredTableAssociationRequest getConfiguredTableAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getConfiguredTableAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConfiguredTableAssociationRequest> request = null;
        Response<GetConfiguredTableAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConfiguredTableAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConfiguredTableAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConfiguredTableAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConfiguredTableAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConfiguredTableAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a specified membership for an identifier.
     * </p>
     * 
     * @param getMembershipRequest
     * @return Result of the GetMembership operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetMembership" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMembershipResult getMembership(GetMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeGetMembership(request);
    }

    @SdkInternalApi
    final GetMembershipResult executeGetMembership(GetMembershipRequest getMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(getMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMembershipRequest> request = null;
        Response<GetMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMembershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns query processing metadata.
     * </p>
     * 
     * @param getProtectedQueryRequest
     * @return Result of the GetProtectedQuery operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetProtectedQuery" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetProtectedQueryResult getProtectedQuery(GetProtectedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeGetProtectedQuery(request);
    }

    @SdkInternalApi
    final GetProtectedQueryResult executeGetProtectedQuery(GetProtectedQueryRequest getProtectedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(getProtectedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProtectedQueryRequest> request = null;
        Response<GetProtectedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProtectedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProtectedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProtectedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetProtectedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProtectedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the schema for a relation within a collaboration.
     * </p>
     * 
     * @param getSchemaRequest
     * @return Result of the GetSchema operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetSchema" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSchemaResult getSchema(GetSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeGetSchema(request);
    }

    @SdkInternalApi
    final GetSchemaResult executeGetSchema(GetSchemaRequest getSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(getSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSchemaRequest> request = null;
        Response<GetSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSchemaResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a schema analysis rule.
     * </p>
     * 
     * @param getSchemaAnalysisRuleRequest
     * @return Result of the GetSchemaAnalysisRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.GetSchemaAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/GetSchemaAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSchemaAnalysisRuleResult getSchemaAnalysisRule(GetSchemaAnalysisRuleRequest request) {
        request = beforeClientExecution(request);
        return executeGetSchemaAnalysisRule(request);
    }

    @SdkInternalApi
    final GetSchemaAnalysisRuleResult executeGetSchemaAnalysisRule(GetSchemaAnalysisRuleRequest getSchemaAnalysisRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getSchemaAnalysisRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSchemaAnalysisRuleRequest> request = null;
        Response<GetSchemaAnalysisRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSchemaAnalysisRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSchemaAnalysisRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSchemaAnalysisRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSchemaAnalysisRuleResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetSchemaAnalysisRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists analysis templates that the caller owns.
     * </p>
     * 
     * @param listAnalysisTemplatesRequest
     * @return Result of the ListAnalysisTemplates operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListAnalysisTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListAnalysisTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAnalysisTemplatesResult listAnalysisTemplates(ListAnalysisTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListAnalysisTemplates(request);
    }

    @SdkInternalApi
    final ListAnalysisTemplatesResult executeListAnalysisTemplates(ListAnalysisTemplatesRequest listAnalysisTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listAnalysisTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAnalysisTemplatesRequest> request = null;
        Response<ListAnalysisTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAnalysisTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAnalysisTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAnalysisTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAnalysisTemplatesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAnalysisTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists analysis templates within a collaboration.
     * </p>
     * 
     * @param listCollaborationAnalysisTemplatesRequest
     * @return Result of the ListCollaborationAnalysisTemplates operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListCollaborationAnalysisTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborationAnalysisTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCollaborationAnalysisTemplatesResult listCollaborationAnalysisTemplates(ListCollaborationAnalysisTemplatesRequest request) {
        request = beforeClientExecution(request);
        return executeListCollaborationAnalysisTemplates(request);
    }

    @SdkInternalApi
    final ListCollaborationAnalysisTemplatesResult executeListCollaborationAnalysisTemplates(
            ListCollaborationAnalysisTemplatesRequest listCollaborationAnalysisTemplatesRequest) {

        ExecutionContext executionContext = createExecutionContext(listCollaborationAnalysisTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCollaborationAnalysisTemplatesRequest> request = null;
        Response<ListCollaborationAnalysisTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCollaborationAnalysisTemplatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCollaborationAnalysisTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCollaborationAnalysisTemplates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCollaborationAnalysisTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCollaborationAnalysisTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists collaborations the caller owns, is active in, or has been invited to.
     * </p>
     * 
     * @param listCollaborationsRequest
     * @return Result of the ListCollaborations operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListCollaborations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListCollaborations" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListCollaborationsResult listCollaborations(ListCollaborationsRequest request) {
        request = beforeClientExecution(request);
        return executeListCollaborations(request);
    }

    @SdkInternalApi
    final ListCollaborationsResult executeListCollaborations(ListCollaborationsRequest listCollaborationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCollaborationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCollaborationsRequest> request = null;
        Response<ListCollaborationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCollaborationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCollaborationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCollaborations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCollaborationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCollaborationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists configured table associations for a membership.
     * </p>
     * 
     * @param listConfiguredTableAssociationsRequest
     * @return Result of the ListConfiguredTableAssociations operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListConfiguredTableAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredTableAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConfiguredTableAssociationsResult listConfiguredTableAssociations(ListConfiguredTableAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListConfiguredTableAssociations(request);
    }

    @SdkInternalApi
    final ListConfiguredTableAssociationsResult executeListConfiguredTableAssociations(
            ListConfiguredTableAssociationsRequest listConfiguredTableAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfiguredTableAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfiguredTableAssociationsRequest> request = null;
        Response<ListConfiguredTableAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfiguredTableAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listConfiguredTableAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfiguredTableAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfiguredTableAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListConfiguredTableAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists configured tables.
     * </p>
     * 
     * @param listConfiguredTablesRequest
     * @return Result of the ListConfiguredTables operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListConfiguredTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListConfiguredTables"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConfiguredTablesResult listConfiguredTables(ListConfiguredTablesRequest request) {
        request = beforeClientExecution(request);
        return executeListConfiguredTables(request);
    }

    @SdkInternalApi
    final ListConfiguredTablesResult executeListConfiguredTables(ListConfiguredTablesRequest listConfiguredTablesRequest) {

        ExecutionContext executionContext = createExecutionContext(listConfiguredTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConfiguredTablesRequest> request = null;
        Response<ListConfiguredTablesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConfiguredTablesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConfiguredTablesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConfiguredTables");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConfiguredTablesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConfiguredTablesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all members within a collaboration.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMembersResult listMembers(ListMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListMembers(request);
    }

    @SdkInternalApi
    final ListMembersResult executeListMembers(ListMembersRequest listMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMembersRequest> request = null;
        Response<ListMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all memberships resources within the caller's account.
     * </p>
     * 
     * @param listMembershipsRequest
     * @return Result of the ListMemberships operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListMemberships" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMembershipsResult listMemberships(ListMembershipsRequest request) {
        request = beforeClientExecution(request);
        return executeListMemberships(request);
    }

    @SdkInternalApi
    final ListMembershipsResult executeListMemberships(ListMembershipsRequest listMembershipsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMembershipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMembershipsRequest> request = null;
        Response<ListMembershipsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMembershipsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMembershipsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMemberships");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMembershipsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMembershipsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists protected queries, sorted by the most recent query.
     * </p>
     * 
     * @param listProtectedQueriesRequest
     * @return Result of the ListProtectedQueries operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListProtectedQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListProtectedQueries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProtectedQueriesResult listProtectedQueries(ListProtectedQueriesRequest request) {
        request = beforeClientExecution(request);
        return executeListProtectedQueries(request);
    }

    @SdkInternalApi
    final ListProtectedQueriesResult executeListProtectedQueries(ListProtectedQueriesRequest listProtectedQueriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listProtectedQueriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProtectedQueriesRequest> request = null;
        Response<ListProtectedQueriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProtectedQueriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listProtectedQueriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProtectedQueries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProtectedQueriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListProtectedQueriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the schemas for relations within a collaboration.
     * </p>
     * 
     * @param listSchemasRequest
     * @return Result of the ListSchemas operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSchemasResult listSchemas(ListSchemasRequest request) {
        request = beforeClientExecution(request);
        return executeListSchemas(request);
    }

    @SdkInternalApi
    final ListSchemasResult executeListSchemas(ListSchemasRequest listSchemasRequest) {

        ExecutionContext executionContext = createExecutionContext(listSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchemasRequest> request = null;
        Response<ListSchemasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchemasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSchemasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSchemas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSchemasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSchemasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the tags that have been added to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @sample AWSCleanRooms.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a protected query that is started by Clean Rooms.
     * </p>
     * 
     * @param startProtectedQueryRequest
     * @return Result of the StartProtectedQuery operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Request denied because service quota has been exceeded.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.StartProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/StartProtectedQuery" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartProtectedQueryResult startProtectedQuery(StartProtectedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeStartProtectedQuery(request);
    }

    @SdkInternalApi
    final StartProtectedQueryResult executeStartProtectedQuery(StartProtectedQueryRequest startProtectedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(startProtectedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartProtectedQueryRequest> request = null;
        Response<StartProtectedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartProtectedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startProtectedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartProtectedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartProtectedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartProtectedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @sample AWSCleanRooms.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a tag or list of tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @sample AWSCleanRooms.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the analysis template metadata.
     * </p>
     * 
     * @param updateAnalysisTemplateRequest
     * @return Result of the UpdateAnalysisTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateAnalysisTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateAnalysisTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAnalysisTemplateResult updateAnalysisTemplate(UpdateAnalysisTemplateRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAnalysisTemplate(request);
    }

    @SdkInternalApi
    final UpdateAnalysisTemplateResult executeUpdateAnalysisTemplate(UpdateAnalysisTemplateRequest updateAnalysisTemplateRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAnalysisTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAnalysisTemplateRequest> request = null;
        Response<UpdateAnalysisTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAnalysisTemplateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAnalysisTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAnalysisTemplate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAnalysisTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAnalysisTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates collaboration metadata and can only be called by the collaboration owner.
     * </p>
     * 
     * @param updateCollaborationRequest
     * @return Result of the UpdateCollaboration operation returned by the service.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateCollaboration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateCollaboration" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateCollaborationResult updateCollaboration(UpdateCollaborationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCollaboration(request);
    }

    @SdkInternalApi
    final UpdateCollaborationResult executeUpdateCollaboration(UpdateCollaborationRequest updateCollaborationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCollaborationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCollaborationRequest> request = null;
        Response<UpdateCollaborationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCollaborationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCollaborationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCollaboration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCollaborationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCollaborationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a configured table.
     * </p>
     * 
     * @param updateConfiguredTableRequest
     * @return Result of the UpdateConfiguredTable operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateConfiguredTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTable"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfiguredTableResult updateConfiguredTable(UpdateConfiguredTableRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfiguredTable(request);
    }

    @SdkInternalApi
    final UpdateConfiguredTableResult executeUpdateConfiguredTable(UpdateConfiguredTableRequest updateConfiguredTableRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfiguredTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfiguredTableRequest> request = null;
        Response<UpdateConfiguredTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfiguredTableRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateConfiguredTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfiguredTable");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConfiguredTableResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateConfiguredTableResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a configured table analysis rule.
     * </p>
     * 
     * @param updateConfiguredTableAnalysisRuleRequest
     * @return Result of the UpdateConfiguredTableAnalysisRule operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateConfiguredTableAnalysisRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTableAnalysisRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfiguredTableAnalysisRuleResult updateConfiguredTableAnalysisRule(UpdateConfiguredTableAnalysisRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfiguredTableAnalysisRule(request);
    }

    @SdkInternalApi
    final UpdateConfiguredTableAnalysisRuleResult executeUpdateConfiguredTableAnalysisRule(
            UpdateConfiguredTableAnalysisRuleRequest updateConfiguredTableAnalysisRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfiguredTableAnalysisRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfiguredTableAnalysisRuleRequest> request = null;
        Response<UpdateConfiguredTableAnalysisRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfiguredTableAnalysisRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateConfiguredTableAnalysisRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfiguredTableAnalysisRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConfiguredTableAnalysisRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateConfiguredTableAnalysisRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a configured table association.
     * </p>
     * 
     * @param updateConfiguredTableAssociationRequest
     * @return Result of the UpdateConfiguredTableAssociation operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateConfiguredTableAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTableAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConfiguredTableAssociationResult updateConfiguredTableAssociation(UpdateConfiguredTableAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConfiguredTableAssociation(request);
    }

    @SdkInternalApi
    final UpdateConfiguredTableAssociationResult executeUpdateConfiguredTableAssociation(
            UpdateConfiguredTableAssociationRequest updateConfiguredTableAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConfiguredTableAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConfiguredTableAssociationRequest> request = null;
        Response<UpdateConfiguredTableAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConfiguredTableAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateConfiguredTableAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConfiguredTableAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConfiguredTableAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateConfiguredTableAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a membership.
     * </p>
     * 
     * @param updateMembershipRequest
     * @return Result of the UpdateMembership operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateMembership" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateMembershipResult updateMembership(UpdateMembershipRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMembership(request);
    }

    @SdkInternalApi
    final UpdateMembershipResult executeUpdateMembership(UpdateMembershipRequest updateMembershipRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMembershipRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMembershipRequest> request = null;
        Response<UpdateMembershipResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMembershipRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMembershipRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMembership");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMembershipResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMembershipResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the processing of a currently running query.
     * </p>
     * 
     * @param updateProtectedQueryRequest
     * @return Result of the UpdateProtectedQuery operation returned by the service.
     * @throws ConflictException
     *         Updating or deleting a resource can cause an inconsistent state.
     * @throws ResourceNotFoundException
     *         Request references a resource which does not exist.
     * @throws InternalServerException
     *         Unexpected error during processing of request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         Request was denied due to request throttling.
     * @throws AccessDeniedException
     *         Caller does not have sufficient access to perform this action.
     * @sample AWSCleanRooms.UpdateProtectedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateProtectedQuery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateProtectedQueryResult updateProtectedQuery(UpdateProtectedQueryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProtectedQuery(request);
    }

    @SdkInternalApi
    final UpdateProtectedQueryResult executeUpdateProtectedQuery(UpdateProtectedQueryRequest updateProtectedQueryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProtectedQueryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProtectedQueryRequest> request = null;
        Response<UpdateProtectedQueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProtectedQueryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProtectedQueryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CleanRooms");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProtectedQuery");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProtectedQueryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProtectedQueryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
