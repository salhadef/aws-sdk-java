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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateProvisionedModelThroughput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProvisionedModelThroughputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique token value that you can provide. If this token matches a previous request, Bedrock ignores the request,
     * but does not return an error.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Number of model units to allocate.
     * </p>
     */
    private Integer modelUnits;
    /**
     * <p>
     * Unique name for this provisioned throughput.
     * </p>
     */
    private String provisionedModelName;
    /**
     * <p>
     * Name or ARN of the model to associate with this provisioned throughput.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * Commitment duration requested for the provisioned throughput.
     * </p>
     */
    private String commitmentDuration;
    /**
     * <p>
     * Tags to associate with this provisioned throughput.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Unique token value that you can provide. If this token matches a previous request, Bedrock ignores the request,
     * but does not return an error.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique token value that you can provide. If this token matches a previous request, Bedrock ignores the
     *        request, but does not return an error.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique token value that you can provide. If this token matches a previous request, Bedrock ignores the request,
     * but does not return an error.
     * </p>
     * 
     * @return Unique token value that you can provide. If this token matches a previous request, Bedrock ignores the
     *         request, but does not return an error.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique token value that you can provide. If this token matches a previous request, Bedrock ignores the request,
     * but does not return an error.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique token value that you can provide. If this token matches a previous request, Bedrock ignores the
     *        request, but does not return an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Number of model units to allocate.
     * </p>
     * 
     * @param modelUnits
     *        Number of model units to allocate.
     */

    public void setModelUnits(Integer modelUnits) {
        this.modelUnits = modelUnits;
    }

    /**
     * <p>
     * Number of model units to allocate.
     * </p>
     * 
     * @return Number of model units to allocate.
     */

    public Integer getModelUnits() {
        return this.modelUnits;
    }

    /**
     * <p>
     * Number of model units to allocate.
     * </p>
     * 
     * @param modelUnits
     *        Number of model units to allocate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withModelUnits(Integer modelUnits) {
        setModelUnits(modelUnits);
        return this;
    }

    /**
     * <p>
     * Unique name for this provisioned throughput.
     * </p>
     * 
     * @param provisionedModelName
     *        Unique name for this provisioned throughput.
     */

    public void setProvisionedModelName(String provisionedModelName) {
        this.provisionedModelName = provisionedModelName;
    }

    /**
     * <p>
     * Unique name for this provisioned throughput.
     * </p>
     * 
     * @return Unique name for this provisioned throughput.
     */

    public String getProvisionedModelName() {
        return this.provisionedModelName;
    }

    /**
     * <p>
     * Unique name for this provisioned throughput.
     * </p>
     * 
     * @param provisionedModelName
     *        Unique name for this provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withProvisionedModelName(String provisionedModelName) {
        setProvisionedModelName(provisionedModelName);
        return this;
    }

    /**
     * <p>
     * Name or ARN of the model to associate with this provisioned throughput.
     * </p>
     * 
     * @param modelId
     *        Name or ARN of the model to associate with this provisioned throughput.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * Name or ARN of the model to associate with this provisioned throughput.
     * </p>
     * 
     * @return Name or ARN of the model to associate with this provisioned throughput.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * Name or ARN of the model to associate with this provisioned throughput.
     * </p>
     * 
     * @param modelId
     *        Name or ARN of the model to associate with this provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * Commitment duration requested for the provisioned throughput.
     * </p>
     * 
     * @param commitmentDuration
     *        Commitment duration requested for the provisioned throughput.
     * @see CommitmentDuration
     */

    public void setCommitmentDuration(String commitmentDuration) {
        this.commitmentDuration = commitmentDuration;
    }

    /**
     * <p>
     * Commitment duration requested for the provisioned throughput.
     * </p>
     * 
     * @return Commitment duration requested for the provisioned throughput.
     * @see CommitmentDuration
     */

    public String getCommitmentDuration() {
        return this.commitmentDuration;
    }

    /**
     * <p>
     * Commitment duration requested for the provisioned throughput.
     * </p>
     * 
     * @param commitmentDuration
     *        Commitment duration requested for the provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommitmentDuration
     */

    public CreateProvisionedModelThroughputRequest withCommitmentDuration(String commitmentDuration) {
        setCommitmentDuration(commitmentDuration);
        return this;
    }

    /**
     * <p>
     * Commitment duration requested for the provisioned throughput.
     * </p>
     * 
     * @param commitmentDuration
     *        Commitment duration requested for the provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommitmentDuration
     */

    public CreateProvisionedModelThroughputRequest withCommitmentDuration(CommitmentDuration commitmentDuration) {
        this.commitmentDuration = commitmentDuration.toString();
        return this;
    }

    /**
     * <p>
     * Tags to associate with this provisioned throughput.
     * </p>
     * 
     * @return Tags to associate with this provisioned throughput.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to associate with this provisioned throughput.
     * </p>
     * 
     * @param tags
     *        Tags to associate with this provisioned throughput.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags to associate with this provisioned throughput.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to associate with this provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to associate with this provisioned throughput.
     * </p>
     * 
     * @param tags
     *        Tags to associate with this provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getModelUnits() != null)
            sb.append("ModelUnits: ").append(getModelUnits()).append(",");
        if (getProvisionedModelName() != null)
            sb.append("ProvisionedModelName: ").append(getProvisionedModelName()).append(",");
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getCommitmentDuration() != null)
            sb.append("CommitmentDuration: ").append(getCommitmentDuration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisionedModelThroughputRequest == false)
            return false;
        CreateProvisionedModelThroughputRequest other = (CreateProvisionedModelThroughputRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getModelUnits() == null ^ this.getModelUnits() == null)
            return false;
        if (other.getModelUnits() != null && other.getModelUnits().equals(this.getModelUnits()) == false)
            return false;
        if (other.getProvisionedModelName() == null ^ this.getProvisionedModelName() == null)
            return false;
        if (other.getProvisionedModelName() != null && other.getProvisionedModelName().equals(this.getProvisionedModelName()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getCommitmentDuration() == null ^ this.getCommitmentDuration() == null)
            return false;
        if (other.getCommitmentDuration() != null && other.getCommitmentDuration().equals(this.getCommitmentDuration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getModelUnits() == null) ? 0 : getModelUnits().hashCode());
        hashCode = prime * hashCode + ((getProvisionedModelName() == null) ? 0 : getProvisionedModelName().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getCommitmentDuration() == null) ? 0 : getCommitmentDuration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProvisionedModelThroughputRequest clone() {
        return (CreateProvisionedModelThroughputRequest) super.clone();
    }

}
