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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a policy.
 * </p>
 * <p>
 * This data type is used as a response parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListPolicies.html">ListPolicies</a>
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/PolicyItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the PolicyStore where the policy you want information about is stored.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * The identifier of the policy you want information about.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The type of the policy. This is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>static</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>templateLinked</code>
     * </p>
     * </li>
     * </ul>
     */
    private String policyType;
    /**
     * <p>
     * The principal associated with the policy.
     * </p>
     */
    private EntityIdentifier principal;
    /**
     * <p>
     * The resource associated with the policy.
     * </p>
     */
    private EntityIdentifier resource;
    /**
     * <p>
     * The policy definition of an item in the list of policies returned.
     * </p>
     */
    private PolicyDefinitionItem definition;
    /**
     * <p>
     * The date and time the policy was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date and time the policy was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedDate;

    /**
     * <p>
     * The identifier of the PolicyStore where the policy you want information about is stored.
     * </p>
     * 
     * @param policyStoreId
     *        The identifier of the PolicyStore where the policy you want information about is stored.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * The identifier of the PolicyStore where the policy you want information about is stored.
     * </p>
     * 
     * @return The identifier of the PolicyStore where the policy you want information about is stored.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * The identifier of the PolicyStore where the policy you want information about is stored.
     * </p>
     * 
     * @param policyStoreId
     *        The identifier of the PolicyStore where the policy you want information about is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyItem withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * The identifier of the policy you want information about.
     * </p>
     * 
     * @param policyId
     *        The identifier of the policy you want information about.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The identifier of the policy you want information about.
     * </p>
     * 
     * @return The identifier of the policy you want information about.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The identifier of the policy you want information about.
     * </p>
     * 
     * @param policyId
     *        The identifier of the policy you want information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyItem withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The type of the policy. This is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>static</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>templateLinked</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyType
     *        The type of the policy. This is one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>static</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>templateLinked</code>
     *        </p>
     *        </li>
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The type of the policy. This is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>static</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>templateLinked</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the policy. This is one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>static</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>templateLinked</code>
     *         </p>
     *         </li>
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The type of the policy. This is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>static</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>templateLinked</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyType
     *        The type of the policy. This is one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>static</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>templateLinked</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PolicyItem withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The type of the policy. This is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>static</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>templateLinked</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyType
     *        The type of the policy. This is one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>static</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>templateLinked</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public PolicyItem withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * The principal associated with the policy.
     * </p>
     * 
     * @param principal
     *        The principal associated with the policy.
     */

    public void setPrincipal(EntityIdentifier principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal associated with the policy.
     * </p>
     * 
     * @return The principal associated with the policy.
     */

    public EntityIdentifier getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The principal associated with the policy.
     * </p>
     * 
     * @param principal
     *        The principal associated with the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyItem withPrincipal(EntityIdentifier principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The resource associated with the policy.
     * </p>
     * 
     * @param resource
     *        The resource associated with the policy.
     */

    public void setResource(EntityIdentifier resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource associated with the policy.
     * </p>
     * 
     * @return The resource associated with the policy.
     */

    public EntityIdentifier getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource associated with the policy.
     * </p>
     * 
     * @param resource
     *        The resource associated with the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyItem withResource(EntityIdentifier resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The policy definition of an item in the list of policies returned.
     * </p>
     * 
     * @param definition
     *        The policy definition of an item in the list of policies returned.
     */

    public void setDefinition(PolicyDefinitionItem definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The policy definition of an item in the list of policies returned.
     * </p>
     * 
     * @return The policy definition of an item in the list of policies returned.
     */

    public PolicyDefinitionItem getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The policy definition of an item in the list of policies returned.
     * </p>
     * 
     * @param definition
     *        The policy definition of an item in the list of policies returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyItem withDefinition(PolicyDefinitionItem definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The date and time the policy was created.
     * </p>
     * 
     * @param createdDate
     *        The date and time the policy was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time the policy was created.
     * </p>
     * 
     * @return The date and time the policy was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time the policy was created.
     * </p>
     * 
     * @param createdDate
     *        The date and time the policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyItem withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date and time the policy was most recently updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time the policy was most recently updated.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time the policy was most recently updated.
     * </p>
     * 
     * @return The date and time the policy was most recently updated.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time the policy was most recently updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time the policy was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyItem withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
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
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyItem == false)
            return false;
        PolicyItem other = (PolicyItem) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public PolicyItem clone() {
        try {
            return (PolicyItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.PolicyItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
