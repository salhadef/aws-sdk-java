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
package com.amazonaws.services.controltower;

import javax.annotation.Generated;

import com.amazonaws.services.controltower.model.*;

/**
 * Interface for accessing AWS Control Tower asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.controltower.AbstractAWSControlTowerAsync} instead.
 * </p>
 * <p>
 * <p>
 * These interfaces allow you to apply the AWS library of pre-defined <i>controls</i> to your organizational units,
 * programmatically. In AWS Control Tower, the terms "control" and "guardrail" are synonyms. .
 * </p>
 * <p>
 * To call these APIs, you'll need to know:
 * </p>
 * <ul>
 * <li>
 * <p>
 * the <code>controlIdentifier</code> for the control--or guardrail--you are targeting.
 * </p>
 * </li>
 * <li>
 * <p>
 * the ARN associated with the target organizational unit (OU), which we call the <code>targetIdentifier</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>To get the <code>controlIdentifier</code> for your AWS Control Tower control:</b>
 * </p>
 * <p>
 * The <code>controlIdentifier</code> is an ARN that is specified for each control. You can view the
 * <code>controlIdentifier</code> in the console on the <b>Control details</b> page, as well as in the documentation.
 * </p>
 * <p>
 * The <code>controlIdentifier</code> is unique in each AWS Region for each control. You can find the
 * <code>controlIdentifier</code> for each Region and control in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-metadata-tables.html">Tables of control
 * metadata</a> in the <i>AWS Control Tower User Guide.</i>
 * </p>
 * <p>
 * A quick-reference list of control identifers for the AWS Control Tower legacy <i>Strongly recommended</i> and
 * <i>Elective</i> controls is given in <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html.html">Resource identifiers
 * for APIs and guardrails</a> in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">Controls reference guide
 * section</a> of the <i>AWS Control Tower User Guide</i>. Remember that <i>Mandatory</i> controls cannot be added or
 * removed.
 * </p>
 * <note>
 * <p>
 * <b>ARN format:</b> <code>arn:aws:controltower:{REGION}::control/{CONTROL_NAME}</code>
 * </p>
 * <p>
 * <b>Example:</b>
 * </p>
 * <p>
 * <code>arn:aws:controltower:us-west-2::control/AWS-GR_AUTOSCALING_LAUNCH_CONFIG_PUBLIC_IP_DISABLED</code>
 * </p>
 * </note>
 * <p>
 * <b>To get the <code>targetIdentifier</code>:</b>
 * </p>
 * <p>
 * The <code>targetIdentifier</code> is the ARN for an OU.
 * </p>
 * <p>
 * In the AWS Organizations console, you can find the ARN for the OU on the <b>Organizational unit details</b> page
 * associated with that OU.
 * </p>
 * <note>
 * <p>
 * <b>OU ARN format:</b>
 * </p>
 * <p>
 * <code>arn:${Partition}:organizations::${MasterAccountId}:ou/o-${OrganizationId}/ou-${OrganizationalUnitId}</code>
 * </p>
 * </note>
 * <p class="title">
 * <b>Details and examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html">Control API input
 * and output examples with CLI</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/enable-controls.html">Enable controls with
 * CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-metadata-tables.html">Control metadata
 * tables</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">List of identifiers for
 * legacy controls</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls.html">Controls reference guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls-reference.html">Controls library
 * groupings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/creating-resources-with-cloudformation.html">
 * Creating AWS Control Tower resources with AWS CloudFormation</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * To view the open source resource repository on GitHub, see <a
 * href="https://github.com/aws-cloudformation/aws-cloudformation-resource-providers-controltower"
 * >aws-cloudformation/aws-cloudformation-resource-providers-controltower</a>
 * </p>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * AWS Control Tower supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers log
 * files to an Amazon S3 bucket. By using information collected by CloudTrail, you can determine which requests the AWS
 * Control Tower service received, who made the request and when, and so on. For more about AWS Control Tower and its
 * support for CloudTrail, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/logging-using-cloudtrail.html">Logging AWS Control
 * Tower Actions with AWS CloudTrail</a> in the AWS Control Tower User Guide. To learn more about CloudTrail, including
 * how to turn it on and find your log files, see the AWS CloudTrail User Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSControlTowerAsync extends AWSControlTower {

    /**
     * <p>
     * This API call turns off a control. It starts an asynchronous operation that deletes AWS resources on the
     * specified organizational unit and the accounts it contains. The resources will vary according to the control that
     * you specify. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the AWS
     * Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param disableControlRequest
     * @return A Java Future containing the result of the DisableControl operation returned by the service.
     * @sample AWSControlTowerAsync.DisableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DisableControl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableControlResult> disableControlAsync(DisableControlRequest disableControlRequest);

    /**
     * <p>
     * This API call turns off a control. It starts an asynchronous operation that deletes AWS resources on the
     * specified organizational unit and the accounts it contains. The resources will vary according to the control that
     * you specify. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the AWS
     * Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param disableControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableControl operation returned by the service.
     * @sample AWSControlTowerAsyncHandler.DisableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DisableControl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableControlResult> disableControlAsync(DisableControlRequest disableControlRequest,
            com.amazonaws.handlers.AsyncHandler<DisableControlRequest, DisableControlResult> asyncHandler);

    /**
     * <p>
     * This API call activates a control. It starts an asynchronous operation that creates AWS resources on the
     * specified organizational unit and the accounts it contains. The resources created will vary according to the
     * control that you specify. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the AWS
     * Control Tower User Guide</i> </a>
     * </p>
     * 
     * @param enableControlRequest
     * @return A Java Future containing the result of the EnableControl operation returned by the service.
     * @sample AWSControlTowerAsync.EnableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnableControl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableControlResult> enableControlAsync(EnableControlRequest enableControlRequest);

    /**
     * <p>
     * This API call activates a control. It starts an asynchronous operation that creates AWS resources on the
     * specified organizational unit and the accounts it contains. The resources created will vary according to the
     * control that you specify. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the AWS
     * Control Tower User Guide</i> </a>
     * </p>
     * 
     * @param enableControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableControl operation returned by the service.
     * @sample AWSControlTowerAsyncHandler.EnableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnableControl" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableControlResult> enableControlAsync(EnableControlRequest enableControlRequest,
            com.amazonaws.handlers.AsyncHandler<EnableControlRequest, EnableControlResult> asyncHandler);

    /**
     * <p>
     * Returns the status of a particular <code>EnableControl</code> or <code>DisableControl</code> operation. Displays
     * a message in case of error. Details for an operation are available for 90 days. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the AWS
     * Control Tower User Guide</i> </a>
     * </p>
     * 
     * @param getControlOperationRequest
     * @return A Java Future containing the result of the GetControlOperation operation returned by the service.
     * @sample AWSControlTowerAsync.GetControlOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetControlOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetControlOperationResult> getControlOperationAsync(GetControlOperationRequest getControlOperationRequest);

    /**
     * <p>
     * Returns the status of a particular <code>EnableControl</code> or <code>DisableControl</code> operation. Displays
     * a message in case of error. Details for an operation are available for 90 days. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the AWS
     * Control Tower User Guide</i> </a>
     * </p>
     * 
     * @param getControlOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetControlOperation operation returned by the service.
     * @sample AWSControlTowerAsyncHandler.GetControlOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetControlOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetControlOperationResult> getControlOperationAsync(GetControlOperationRequest getControlOperationRequest,
            com.amazonaws.handlers.AsyncHandler<GetControlOperationRequest, GetControlOperationResult> asyncHandler);

    /**
     * <p>
     * Provides details about the enabled control. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the AWS
     * Control Tower User Guide</i> </a>.
     * </p>
     * <p class="title">
     * <b>Returned values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * TargetRegions: Shows target AWS Regions where the enabled control is available to be deployed.
     * </p>
     * </li>
     * <li>
     * <p>
     * StatusSummary: Provides a detailed summary of the deployment status.
     * </p>
     * </li>
     * <li>
     * <p>
     * DriftSummary: Provides a detailed summary of the drifted status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getEnabledControlRequest
     * @return A Java Future containing the result of the GetEnabledControl operation returned by the service.
     * @sample AWSControlTowerAsync.GetEnabledControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetEnabledControl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEnabledControlResult> getEnabledControlAsync(GetEnabledControlRequest getEnabledControlRequest);

    /**
     * <p>
     * Provides details about the enabled control. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the AWS
     * Control Tower User Guide</i> </a>.
     * </p>
     * <p class="title">
     * <b>Returned values</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * TargetRegions: Shows target AWS Regions where the enabled control is available to be deployed.
     * </p>
     * </li>
     * <li>
     * <p>
     * StatusSummary: Provides a detailed summary of the deployment status.
     * </p>
     * </li>
     * <li>
     * <p>
     * DriftSummary: Provides a detailed summary of the drifted status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getEnabledControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnabledControl operation returned by the service.
     * @sample AWSControlTowerAsyncHandler.GetEnabledControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetEnabledControl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEnabledControlResult> getEnabledControlAsync(GetEnabledControlRequest getEnabledControlRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnabledControlRequest, GetEnabledControlResult> asyncHandler);

    /**
     * <p>
     * Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     * contains. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the AWS
     * Control Tower User Guide</i> </a>
     * </p>
     * 
     * @param listEnabledControlsRequest
     * @return A Java Future containing the result of the ListEnabledControls operation returned by the service.
     * @sample AWSControlTowerAsync.ListEnabledControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListEnabledControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnabledControlsResult> listEnabledControlsAsync(ListEnabledControlsRequest listEnabledControlsRequest);

    /**
     * <p>
     * Lists the controls enabled by AWS Control Tower on the specified organizational unit and the accounts it
     * contains. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the AWS
     * Control Tower User Guide</i> </a>
     * </p>
     * 
     * @param listEnabledControlsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnabledControls operation returned by the service.
     * @sample AWSControlTowerAsyncHandler.ListEnabledControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListEnabledControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnabledControlsResult> listEnabledControlsAsync(ListEnabledControlsRequest listEnabledControlsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnabledControlsRequest, ListEnabledControlsResult> asyncHandler);

}
