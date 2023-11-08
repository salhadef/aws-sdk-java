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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutAccountPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccountPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the policy. This must be unique within the account.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * Specify the data protection policy, in JSON.
     * </p>
     * <p>
     * This policy must include two JSON blocks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of sensitive data that you
     * want to mask. For more information about the available options, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types of data
     * that you can mask</a>.
     * </p>
     * <p>
     * The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive data
     * terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can optionally
     * use that <code>FindingsDestination</code> object to list one or more destinations to send audit findings to. If
     * you specify destinations such as log groups, Kinesis Data Firehose streams, and S3 buckets, they must already
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match the
     * <code>DataIdentifer</code> array in the first block of the policy.
     * </p>
     * <p>
     * The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the data, and
     * it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code> object must be
     * empty.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an example data protection policy, see the <b>Examples</b> section on this page.
     * </p>
     * <important>
     * <p>
     * The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     * </p>
     * </important>
     * <p>
     * In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     * <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is different than the
     * operation's <code>policyName</code> parameter, and is used as a dimension when CloudWatch Logs reports audit
     * findings metrics to CloudWatch.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * Currently the only valid value for this parameter is <code>DATA_PROTECTION_POLICY</code>.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * Currently the only valid value for this parameter is <code>ALL</code>, which specifies that the data protection
     * policy applies to all log groups in the account. If you omit this parameter, the default of <code>ALL</code> is
     * used.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * A name for the policy. This must be unique within the account.
     * </p>
     * 
     * @param policyName
     *        A name for the policy. This must be unique within the account.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * A name for the policy. This must be unique within the account.
     * </p>
     * 
     * @return A name for the policy. This must be unique within the account.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * A name for the policy. This must be unique within the account.
     * </p>
     * 
     * @param policyName
     *        A name for the policy. This must be unique within the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * Specify the data protection policy, in JSON.
     * </p>
     * <p>
     * This policy must include two JSON blocks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of sensitive data that you
     * want to mask. For more information about the available options, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types of data
     * that you can mask</a>.
     * </p>
     * <p>
     * The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive data
     * terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can optionally
     * use that <code>FindingsDestination</code> object to list one or more destinations to send audit findings to. If
     * you specify destinations such as log groups, Kinesis Data Firehose streams, and S3 buckets, they must already
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match the
     * <code>DataIdentifer</code> array in the first block of the policy.
     * </p>
     * <p>
     * The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the data, and
     * it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code> object must be
     * empty.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an example data protection policy, see the <b>Examples</b> section on this page.
     * </p>
     * <important>
     * <p>
     * The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     * </p>
     * </important>
     * <p>
     * In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     * <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is different than the
     * operation's <code>policyName</code> parameter, and is used as a dimension when CloudWatch Logs reports audit
     * findings metrics to CloudWatch.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     * 
     * @param policyDocument
     *        Specify the data protection policy, in JSON.</p>
     *        <p>
     *        This policy must include two JSON blocks:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *        property with an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of
     *        sensitive data that you want to mask. For more information about the available options, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types
     *        of data that you can mask</a>.
     *        </p>
     *        <p>
     *        The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive
     *        data terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can
     *        optionally use that <code>FindingsDestination</code> object to list one or more destinations to send audit
     *        findings to. If you specify destinations such as log groups, Kinesis Data Firehose streams, and S3
     *        buckets, they must already exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *        property with an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match
     *        the <code>DataIdentifer</code> array in the first block of the policy.
     *        </p>
     *        <p>
     *        The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the
     *        data, and it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code>
     *        object must be empty.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an example data protection policy, see the <b>Examples</b> section on this page.
     *        </p>
     *        <important>
     *        <p>
     *        The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     *        </p>
     *        </important>
     *        <p>
     *        In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     *        <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is different than the
     *        operation's <code>policyName</code> parameter, and is used as a dimension when CloudWatch Logs reports
     *        audit findings metrics to CloudWatch.
     *        </p>
     *        <p>
     *        The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * Specify the data protection policy, in JSON.
     * </p>
     * <p>
     * This policy must include two JSON blocks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of sensitive data that you
     * want to mask. For more information about the available options, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types of data
     * that you can mask</a>.
     * </p>
     * <p>
     * The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive data
     * terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can optionally
     * use that <code>FindingsDestination</code> object to list one or more destinations to send audit findings to. If
     * you specify destinations such as log groups, Kinesis Data Firehose streams, and S3 buckets, they must already
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match the
     * <code>DataIdentifer</code> array in the first block of the policy.
     * </p>
     * <p>
     * The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the data, and
     * it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code> object must be
     * empty.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an example data protection policy, see the <b>Examples</b> section on this page.
     * </p>
     * <important>
     * <p>
     * The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     * </p>
     * </important>
     * <p>
     * In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     * <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is different than the
     * operation's <code>policyName</code> parameter, and is used as a dimension when CloudWatch Logs reports audit
     * findings metrics to CloudWatch.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     * 
     * @return Specify the data protection policy, in JSON.</p>
     *         <p>
     *         This policy must include two JSON blocks:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *         property with an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of
     *         sensitive data that you want to mask. For more information about the available options, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types
     *         of data that you can mask</a>.
     *         </p>
     *         <p>
     *         The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive
     *         data terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You
     *         can optionally use that <code>FindingsDestination</code> object to list one or more destinations to send
     *         audit findings to. If you specify destinations such as log groups, Kinesis Data Firehose streams, and S3
     *         buckets, they must already exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *         property with an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match
     *         the <code>DataIdentifer</code> array in the first block of the policy.
     *         </p>
     *         <p>
     *         The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the
     *         data, and it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code>
     *         object must be empty.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For an example data protection policy, see the <b>Examples</b> section on this page.
     *         </p>
     *         <important>
     *         <p>
     *         The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     *         </p>
     *         </important>
     *         <p>
     *         In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     *         <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is different than the
     *         operation's <code>policyName</code> parameter, and is used as a dimension when CloudWatch Logs reports
     *         audit findings metrics to CloudWatch.
     *         </p>
     *         <p>
     *         The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * Specify the data protection policy, in JSON.
     * </p>
     * <p>
     * This policy must include two JSON blocks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of sensitive data that you
     * want to mask. For more information about the available options, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types of data
     * that you can mask</a>.
     * </p>
     * <p>
     * The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive data
     * terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can optionally
     * use that <code>FindingsDestination</code> object to list one or more destinations to send audit findings to. If
     * you specify destinations such as log groups, Kinesis Data Firehose streams, and S3 buckets, they must already
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code> property with
     * an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match the
     * <code>DataIdentifer</code> array in the first block of the policy.
     * </p>
     * <p>
     * The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the data, and
     * it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code> object must be
     * empty.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For an example data protection policy, see the <b>Examples</b> section on this page.
     * </p>
     * <important>
     * <p>
     * The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     * </p>
     * </important>
     * <p>
     * In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     * <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is different than the
     * operation's <code>policyName</code> parameter, and is used as a dimension when CloudWatch Logs reports audit
     * findings metrics to CloudWatch.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     * 
     * @param policyDocument
     *        Specify the data protection policy, in JSON.</p>
     *        <p>
     *        This policy must include two JSON blocks:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The first block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *        property with an <code>Audit</code> action. The <code>DataIdentifer</code> array lists the types of
     *        sensitive data that you want to mask. For more information about the available options, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-types.html">Types
     *        of data that you can mask</a>.
     *        </p>
     *        <p>
     *        The <code>Operation</code> property with an <code>Audit</code> action is required to find the sensitive
     *        data terms. This <code>Audit</code> action must contain a <code>FindingsDestination</code> object. You can
     *        optionally use that <code>FindingsDestination</code> object to list one or more destinations to send audit
     *        findings to. If you specify destinations such as log groups, Kinesis Data Firehose streams, and S3
     *        buckets, they must already exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The second block must include both a <code>DataIdentifer</code> array and an <code>Operation</code>
     *        property with an <code>Deidentify</code> action. The <code>DataIdentifer</code> array must exactly match
     *        the <code>DataIdentifer</code> array in the first block of the policy.
     *        </p>
     *        <p>
     *        The <code>Operation</code> property with the <code>Deidentify</code> action is what actually masks the
     *        data, and it must contain the <code> "MaskConfig": {}</code> object. The <code> "MaskConfig": {}</code>
     *        object must be empty.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For an example data protection policy, see the <b>Examples</b> section on this page.
     *        </p>
     *        <important>
     *        <p>
     *        The contents of the two <code>DataIdentifer</code> arrays must match exactly.
     *        </p>
     *        </important>
     *        <p>
     *        In addition to the two JSON blocks, the <code>policyDocument</code> can also include <code>Name</code>,
     *        <code>Description</code>, and <code>Version</code> fields. The <code>Name</code> is different than the
     *        operation's <code>policyName</code> parameter, and is used as a dimension when CloudWatch Logs reports
     *        audit findings metrics to CloudWatch.
     *        </p>
     *        <p>
     *        The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountPolicyRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * Currently the only valid value for this parameter is <code>DATA_PROTECTION_POLICY</code>.
     * </p>
     * 
     * @param policyType
     *        Currently the only valid value for this parameter is <code>DATA_PROTECTION_POLICY</code>.
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * Currently the only valid value for this parameter is <code>DATA_PROTECTION_POLICY</code>.
     * </p>
     * 
     * @return Currently the only valid value for this parameter is <code>DATA_PROTECTION_POLICY</code>.
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * Currently the only valid value for this parameter is <code>DATA_PROTECTION_POLICY</code>.
     * </p>
     * 
     * @param policyType
     *        Currently the only valid value for this parameter is <code>DATA_PROTECTION_POLICY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PutAccountPolicyRequest withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * Currently the only valid value for this parameter is <code>DATA_PROTECTION_POLICY</code>.
     * </p>
     * 
     * @param policyType
     *        Currently the only valid value for this parameter is <code>DATA_PROTECTION_POLICY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PutAccountPolicyRequest withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * Currently the only valid value for this parameter is <code>ALL</code>, which specifies that the data protection
     * policy applies to all log groups in the account. If you omit this parameter, the default of <code>ALL</code> is
     * used.
     * </p>
     * 
     * @param scope
     *        Currently the only valid value for this parameter is <code>ALL</code>, which specifies that the data
     *        protection policy applies to all log groups in the account. If you omit this parameter, the default of
     *        <code>ALL</code> is used.
     * @see Scope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Currently the only valid value for this parameter is <code>ALL</code>, which specifies that the data protection
     * policy applies to all log groups in the account. If you omit this parameter, the default of <code>ALL</code> is
     * used.
     * </p>
     * 
     * @return Currently the only valid value for this parameter is <code>ALL</code>, which specifies that the data
     *         protection policy applies to all log groups in the account. If you omit this parameter, the default of
     *         <code>ALL</code> is used.
     * @see Scope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Currently the only valid value for this parameter is <code>ALL</code>, which specifies that the data protection
     * policy applies to all log groups in the account. If you omit this parameter, the default of <code>ALL</code> is
     * used.
     * </p>
     * 
     * @param scope
     *        Currently the only valid value for this parameter is <code>ALL</code>, which specifies that the data
     *        protection policy applies to all log groups in the account. If you omit this parameter, the default of
     *        <code>ALL</code> is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public PutAccountPolicyRequest withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Currently the only valid value for this parameter is <code>ALL</code>, which specifies that the data protection
     * policy applies to all log groups in the account. If you omit this parameter, the default of <code>ALL</code> is
     * used.
     * </p>
     * 
     * @param scope
     *        Currently the only valid value for this parameter is <code>ALL</code>, which specifies that the data
     *        protection policy applies to all log groups in the account. If you omit this parameter, the default of
     *        <code>ALL</code> is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public PutAccountPolicyRequest withScope(Scope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccountPolicyRequest == false)
            return false;
        PutAccountPolicyRequest other = (PutAccountPolicyRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public PutAccountPolicyRequest clone() {
        return (PutAccountPolicyRequest) super.clone();
    }

}
