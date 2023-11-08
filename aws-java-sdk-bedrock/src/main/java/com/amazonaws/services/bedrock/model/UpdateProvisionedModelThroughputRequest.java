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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/UpdateProvisionedModelThroughput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProvisionedModelThroughputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or name of the provisioned throughput to update.
     * </p>
     */
    private String provisionedModelId;
    /**
     * <p>
     * The new name for this provisioned throughput.
     * </p>
     */
    private String desiredProvisionedModelName;
    /**
     * <p>
     * The ARN of the new model to associate with this provisioned throughput.
     * </p>
     */
    private String desiredModelId;

    /**
     * <p>
     * The ARN or name of the provisioned throughput to update.
     * </p>
     * 
     * @param provisionedModelId
     *        The ARN or name of the provisioned throughput to update.
     */

    public void setProvisionedModelId(String provisionedModelId) {
        this.provisionedModelId = provisionedModelId;
    }

    /**
     * <p>
     * The ARN or name of the provisioned throughput to update.
     * </p>
     * 
     * @return The ARN or name of the provisioned throughput to update.
     */

    public String getProvisionedModelId() {
        return this.provisionedModelId;
    }

    /**
     * <p>
     * The ARN or name of the provisioned throughput to update.
     * </p>
     * 
     * @param provisionedModelId
     *        The ARN or name of the provisioned throughput to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedModelThroughputRequest withProvisionedModelId(String provisionedModelId) {
        setProvisionedModelId(provisionedModelId);
        return this;
    }

    /**
     * <p>
     * The new name for this provisioned throughput.
     * </p>
     * 
     * @param desiredProvisionedModelName
     *        The new name for this provisioned throughput.
     */

    public void setDesiredProvisionedModelName(String desiredProvisionedModelName) {
        this.desiredProvisionedModelName = desiredProvisionedModelName;
    }

    /**
     * <p>
     * The new name for this provisioned throughput.
     * </p>
     * 
     * @return The new name for this provisioned throughput.
     */

    public String getDesiredProvisionedModelName() {
        return this.desiredProvisionedModelName;
    }

    /**
     * <p>
     * The new name for this provisioned throughput.
     * </p>
     * 
     * @param desiredProvisionedModelName
     *        The new name for this provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedModelThroughputRequest withDesiredProvisionedModelName(String desiredProvisionedModelName) {
        setDesiredProvisionedModelName(desiredProvisionedModelName);
        return this;
    }

    /**
     * <p>
     * The ARN of the new model to associate with this provisioned throughput.
     * </p>
     * 
     * @param desiredModelId
     *        The ARN of the new model to associate with this provisioned throughput.
     */

    public void setDesiredModelId(String desiredModelId) {
        this.desiredModelId = desiredModelId;
    }

    /**
     * <p>
     * The ARN of the new model to associate with this provisioned throughput.
     * </p>
     * 
     * @return The ARN of the new model to associate with this provisioned throughput.
     */

    public String getDesiredModelId() {
        return this.desiredModelId;
    }

    /**
     * <p>
     * The ARN of the new model to associate with this provisioned throughput.
     * </p>
     * 
     * @param desiredModelId
     *        The ARN of the new model to associate with this provisioned throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedModelThroughputRequest withDesiredModelId(String desiredModelId) {
        setDesiredModelId(desiredModelId);
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
        if (getProvisionedModelId() != null)
            sb.append("ProvisionedModelId: ").append(getProvisionedModelId()).append(",");
        if (getDesiredProvisionedModelName() != null)
            sb.append("DesiredProvisionedModelName: ").append(getDesiredProvisionedModelName()).append(",");
        if (getDesiredModelId() != null)
            sb.append("DesiredModelId: ").append(getDesiredModelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisionedModelThroughputRequest == false)
            return false;
        UpdateProvisionedModelThroughputRequest other = (UpdateProvisionedModelThroughputRequest) obj;
        if (other.getProvisionedModelId() == null ^ this.getProvisionedModelId() == null)
            return false;
        if (other.getProvisionedModelId() != null && other.getProvisionedModelId().equals(this.getProvisionedModelId()) == false)
            return false;
        if (other.getDesiredProvisionedModelName() == null ^ this.getDesiredProvisionedModelName() == null)
            return false;
        if (other.getDesiredProvisionedModelName() != null && other.getDesiredProvisionedModelName().equals(this.getDesiredProvisionedModelName()) == false)
            return false;
        if (other.getDesiredModelId() == null ^ this.getDesiredModelId() == null)
            return false;
        if (other.getDesiredModelId() != null && other.getDesiredModelId().equals(this.getDesiredModelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedModelId() == null) ? 0 : getProvisionedModelId().hashCode());
        hashCode = prime * hashCode + ((getDesiredProvisionedModelName() == null) ? 0 : getDesiredProvisionedModelName().hashCode());
        hashCode = prime * hashCode + ((getDesiredModelId() == null) ? 0 : getDesiredModelId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProvisionedModelThroughputRequest clone() {
        return (UpdateProvisionedModelThroughputRequest) super.clone();
    }

}
