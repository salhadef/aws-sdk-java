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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Set of fields associated with a provisioned throughput.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ProvisionedModelSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedModelSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the provisioned throughput.
     * </p>
     */
    private String provisionedModelName;
    /**
     * <p>
     * The ARN of the provisioned throughput.
     * </p>
     */
    private String provisionedModelArn;
    /**
     * <p>
     * The ARN of the model associated with this provisioned throughput.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * Desired model ARN.
     * </p>
     */
    private String desiredModelArn;
    /**
     * <p>
     * Foundation model ARN.
     * </p>
     */
    private String foundationModelArn;
    /**
     * <p>
     * The number of model units allocated.
     * </p>
     */
    private Integer modelUnits;
    /**
     * <p>
     * Desired model units.
     * </p>
     */
    private Integer desiredModelUnits;
    /**
     * <p>
     * Status of the provisioned throughput.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Commitment duration for the provisioned throughput.
     * </p>
     */
    private String commitmentDuration;
    /**
     * <p>
     * Commitment expiration time for the provisioned throughput.
     * </p>
     */
    private java.util.Date commitmentExpirationTime;
    /**
     * <p>
     * The time that this provisioned throughput was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time that this provisioned throughput was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the provisioned throughput.
     * </p>
     * 
     * @param provisionedModelName
     *        The name of the provisioned throughput.
     */

    public void setProvisionedModelName(String provisionedModelName) {
        this.provisionedModelName = provisionedModelName;
    }

    /**
     * <p>
     * The name of the provisioned throughput.
     * </p>
     * 
     * @return The name of the provisioned throughput.
     */

    public String getProvisionedModelName() {
        return this.provisionedModelName;
    }

    /**
     * <p>
     * The name of the provisioned throughput.
     * </p>
     * 
     * @param provisionedModelName
     *        The name of the provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedModelSummary withProvisionedModelName(String provisionedModelName) {
        setProvisionedModelName(provisionedModelName);
        return this;
    }

    /**
     * <p>
     * The ARN of the provisioned throughput.
     * </p>
     * 
     * @param provisionedModelArn
     *        The ARN of the provisioned throughput.
     */

    public void setProvisionedModelArn(String provisionedModelArn) {
        this.provisionedModelArn = provisionedModelArn;
    }

    /**
     * <p>
     * The ARN of the provisioned throughput.
     * </p>
     * 
     * @return The ARN of the provisioned throughput.
     */

    public String getProvisionedModelArn() {
        return this.provisionedModelArn;
    }

    /**
     * <p>
     * The ARN of the provisioned throughput.
     * </p>
     * 
     * @param provisionedModelArn
     *        The ARN of the provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedModelSummary withProvisionedModelArn(String provisionedModelArn) {
        setProvisionedModelArn(provisionedModelArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the model associated with this provisioned throughput.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the model associated with this provisioned throughput.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The ARN of the model associated with this provisioned throughput.
     * </p>
     * 
     * @return The ARN of the model associated with this provisioned throughput.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The ARN of the model associated with this provisioned throughput.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the model associated with this provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedModelSummary withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * Desired model ARN.
     * </p>
     * 
     * @param desiredModelArn
     *        Desired model ARN.
     */

    public void setDesiredModelArn(String desiredModelArn) {
        this.desiredModelArn = desiredModelArn;
    }

    /**
     * <p>
     * Desired model ARN.
     * </p>
     * 
     * @return Desired model ARN.
     */

    public String getDesiredModelArn() {
        return this.desiredModelArn;
    }

    /**
     * <p>
     * Desired model ARN.
     * </p>
     * 
     * @param desiredModelArn
     *        Desired model ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedModelSummary withDesiredModelArn(String desiredModelArn) {
        setDesiredModelArn(desiredModelArn);
        return this;
    }

    /**
     * <p>
     * Foundation model ARN.
     * </p>
     * 
     * @param foundationModelArn
     *        Foundation model ARN.
     */

    public void setFoundationModelArn(String foundationModelArn) {
        this.foundationModelArn = foundationModelArn;
    }

    /**
     * <p>
     * Foundation model ARN.
     * </p>
     * 
     * @return Foundation model ARN.
     */

    public String getFoundationModelArn() {
        return this.foundationModelArn;
    }

    /**
     * <p>
     * Foundation model ARN.
     * </p>
     * 
     * @param foundationModelArn
     *        Foundation model ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedModelSummary withFoundationModelArn(String foundationModelArn) {
        setFoundationModelArn(foundationModelArn);
        return this;
    }

    /**
     * <p>
     * The number of model units allocated.
     * </p>
     * 
     * @param modelUnits
     *        The number of model units allocated.
     */

    public void setModelUnits(Integer modelUnits) {
        this.modelUnits = modelUnits;
    }

    /**
     * <p>
     * The number of model units allocated.
     * </p>
     * 
     * @return The number of model units allocated.
     */

    public Integer getModelUnits() {
        return this.modelUnits;
    }

    /**
     * <p>
     * The number of model units allocated.
     * </p>
     * 
     * @param modelUnits
     *        The number of model units allocated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedModelSummary withModelUnits(Integer modelUnits) {
        setModelUnits(modelUnits);
        return this;
    }

    /**
     * <p>
     * Desired model units.
     * </p>
     * 
     * @param desiredModelUnits
     *        Desired model units.
     */

    public void setDesiredModelUnits(Integer desiredModelUnits) {
        this.desiredModelUnits = desiredModelUnits;
    }

    /**
     * <p>
     * Desired model units.
     * </p>
     * 
     * @return Desired model units.
     */

    public Integer getDesiredModelUnits() {
        return this.desiredModelUnits;
    }

    /**
     * <p>
     * Desired model units.
     * </p>
     * 
     * @param desiredModelUnits
     *        Desired model units.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedModelSummary withDesiredModelUnits(Integer desiredModelUnits) {
        setDesiredModelUnits(desiredModelUnits);
        return this;
    }

    /**
     * <p>
     * Status of the provisioned throughput.
     * </p>
     * 
     * @param status
     *        Status of the provisioned throughput.
     * @see ProvisionedModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the provisioned throughput.
     * </p>
     * 
     * @return Status of the provisioned throughput.
     * @see ProvisionedModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the provisioned throughput.
     * </p>
     * 
     * @param status
     *        Status of the provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedModelStatus
     */

    public ProvisionedModelSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the provisioned throughput.
     * </p>
     * 
     * @param status
     *        Status of the provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedModelStatus
     */

    public ProvisionedModelSummary withStatus(ProvisionedModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Commitment duration for the provisioned throughput.
     * </p>
     * 
     * @param commitmentDuration
     *        Commitment duration for the provisioned throughput.
     * @see CommitmentDuration
     */

    public void setCommitmentDuration(String commitmentDuration) {
        this.commitmentDuration = commitmentDuration;
    }

    /**
     * <p>
     * Commitment duration for the provisioned throughput.
     * </p>
     * 
     * @return Commitment duration for the provisioned throughput.
     * @see CommitmentDuration
     */

    public String getCommitmentDuration() {
        return this.commitmentDuration;
    }

    /**
     * <p>
     * Commitment duration for the provisioned throughput.
     * </p>
     * 
     * @param commitmentDuration
     *        Commitment duration for the provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommitmentDuration
     */

    public ProvisionedModelSummary withCommitmentDuration(String commitmentDuration) {
        setCommitmentDuration(commitmentDuration);
        return this;
    }

    /**
     * <p>
     * Commitment duration for the provisioned throughput.
     * </p>
     * 
     * @param commitmentDuration
     *        Commitment duration for the provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommitmentDuration
     */

    public ProvisionedModelSummary withCommitmentDuration(CommitmentDuration commitmentDuration) {
        this.commitmentDuration = commitmentDuration.toString();
        return this;
    }

    /**
     * <p>
     * Commitment expiration time for the provisioned throughput.
     * </p>
     * 
     * @param commitmentExpirationTime
     *        Commitment expiration time for the provisioned throughput.
     */

    public void setCommitmentExpirationTime(java.util.Date commitmentExpirationTime) {
        this.commitmentExpirationTime = commitmentExpirationTime;
    }

    /**
     * <p>
     * Commitment expiration time for the provisioned throughput.
     * </p>
     * 
     * @return Commitment expiration time for the provisioned throughput.
     */

    public java.util.Date getCommitmentExpirationTime() {
        return this.commitmentExpirationTime;
    }

    /**
     * <p>
     * Commitment expiration time for the provisioned throughput.
     * </p>
     * 
     * @param commitmentExpirationTime
     *        Commitment expiration time for the provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedModelSummary withCommitmentExpirationTime(java.util.Date commitmentExpirationTime) {
        setCommitmentExpirationTime(commitmentExpirationTime);
        return this;
    }

    /**
     * <p>
     * The time that this provisioned throughput was created.
     * </p>
     * 
     * @param creationTime
     *        The time that this provisioned throughput was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that this provisioned throughput was created.
     * </p>
     * 
     * @return The time that this provisioned throughput was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that this provisioned throughput was created.
     * </p>
     * 
     * @param creationTime
     *        The time that this provisioned throughput was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedModelSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time that this provisioned throughput was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time that this provisioned throughput was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time that this provisioned throughput was last modified.
     * </p>
     * 
     * @return The time that this provisioned throughput was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time that this provisioned throughput was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time that this provisioned throughput was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedModelSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getProvisionedModelName() != null)
            sb.append("ProvisionedModelName: ").append(getProvisionedModelName()).append(",");
        if (getProvisionedModelArn() != null)
            sb.append("ProvisionedModelArn: ").append(getProvisionedModelArn()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getDesiredModelArn() != null)
            sb.append("DesiredModelArn: ").append(getDesiredModelArn()).append(",");
        if (getFoundationModelArn() != null)
            sb.append("FoundationModelArn: ").append(getFoundationModelArn()).append(",");
        if (getModelUnits() != null)
            sb.append("ModelUnits: ").append(getModelUnits()).append(",");
        if (getDesiredModelUnits() != null)
            sb.append("DesiredModelUnits: ").append(getDesiredModelUnits()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCommitmentDuration() != null)
            sb.append("CommitmentDuration: ").append(getCommitmentDuration()).append(",");
        if (getCommitmentExpirationTime() != null)
            sb.append("CommitmentExpirationTime: ").append(getCommitmentExpirationTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedModelSummary == false)
            return false;
        ProvisionedModelSummary other = (ProvisionedModelSummary) obj;
        if (other.getProvisionedModelName() == null ^ this.getProvisionedModelName() == null)
            return false;
        if (other.getProvisionedModelName() != null && other.getProvisionedModelName().equals(this.getProvisionedModelName()) == false)
            return false;
        if (other.getProvisionedModelArn() == null ^ this.getProvisionedModelArn() == null)
            return false;
        if (other.getProvisionedModelArn() != null && other.getProvisionedModelArn().equals(this.getProvisionedModelArn()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getDesiredModelArn() == null ^ this.getDesiredModelArn() == null)
            return false;
        if (other.getDesiredModelArn() != null && other.getDesiredModelArn().equals(this.getDesiredModelArn()) == false)
            return false;
        if (other.getFoundationModelArn() == null ^ this.getFoundationModelArn() == null)
            return false;
        if (other.getFoundationModelArn() != null && other.getFoundationModelArn().equals(this.getFoundationModelArn()) == false)
            return false;
        if (other.getModelUnits() == null ^ this.getModelUnits() == null)
            return false;
        if (other.getModelUnits() != null && other.getModelUnits().equals(this.getModelUnits()) == false)
            return false;
        if (other.getDesiredModelUnits() == null ^ this.getDesiredModelUnits() == null)
            return false;
        if (other.getDesiredModelUnits() != null && other.getDesiredModelUnits().equals(this.getDesiredModelUnits()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCommitmentDuration() == null ^ this.getCommitmentDuration() == null)
            return false;
        if (other.getCommitmentDuration() != null && other.getCommitmentDuration().equals(this.getCommitmentDuration()) == false)
            return false;
        if (other.getCommitmentExpirationTime() == null ^ this.getCommitmentExpirationTime() == null)
            return false;
        if (other.getCommitmentExpirationTime() != null && other.getCommitmentExpirationTime().equals(this.getCommitmentExpirationTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedModelName() == null) ? 0 : getProvisionedModelName().hashCode());
        hashCode = prime * hashCode + ((getProvisionedModelArn() == null) ? 0 : getProvisionedModelArn().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getDesiredModelArn() == null) ? 0 : getDesiredModelArn().hashCode());
        hashCode = prime * hashCode + ((getFoundationModelArn() == null) ? 0 : getFoundationModelArn().hashCode());
        hashCode = prime * hashCode + ((getModelUnits() == null) ? 0 : getModelUnits().hashCode());
        hashCode = prime * hashCode + ((getDesiredModelUnits() == null) ? 0 : getDesiredModelUnits().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCommitmentDuration() == null) ? 0 : getCommitmentDuration().hashCode());
        hashCode = prime * hashCode + ((getCommitmentExpirationTime() == null) ? 0 : getCommitmentExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedModelSummary clone() {
        try {
            return (ProvisionedModelSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.ProvisionedModelSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
