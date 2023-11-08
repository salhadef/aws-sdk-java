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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An endpoint (Amazon Web Services resource) that is listed in a cross-account attachment and can be added to an
 * accelerator by specified principals, that are also listed in the attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CrossAccountResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrossAccountResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an accelerator
     * by specified principals.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment that specifies the endpoints (resources) that can
     * be added to accelerators and principals that have permission to add the endpoints to accelerators.
     * </p>
     */
    private String attachmentArn;

    /**
     * <p>
     * The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an accelerator
     * by specified principals.
     * </p>
     * 
     * @param endpointId
     *        The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an
     *        accelerator by specified principals.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an accelerator
     * by specified principals.
     * </p>
     * 
     * @return The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an
     *         accelerator by specified principals.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an accelerator
     * by specified principals.
     * </p>
     * 
     * @param endpointId
     *        The endpoint ID for the endpoint that is listed in a cross-account attachment and can be added to an
     *        accelerator by specified principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossAccountResource withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment that specifies the endpoints (resources) that can
     * be added to accelerators and principals that have permission to add the endpoints to accelerators.
     * </p>
     * 
     * @param attachmentArn
     *        The Amazon Resource Name (ARN) of the cross-account attachment that specifies the endpoints (resources)
     *        that can be added to accelerators and principals that have permission to add the endpoints to
     *        accelerators.
     */

    public void setAttachmentArn(String attachmentArn) {
        this.attachmentArn = attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment that specifies the endpoints (resources) that can
     * be added to accelerators and principals that have permission to add the endpoints to accelerators.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cross-account attachment that specifies the endpoints (resources)
     *         that can be added to accelerators and principals that have permission to add the endpoints to
     *         accelerators.
     */

    public String getAttachmentArn() {
        return this.attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cross-account attachment that specifies the endpoints (resources) that can
     * be added to accelerators and principals that have permission to add the endpoints to accelerators.
     * </p>
     * 
     * @param attachmentArn
     *        The Amazon Resource Name (ARN) of the cross-account attachment that specifies the endpoints (resources)
     *        that can be added to accelerators and principals that have permission to add the endpoints to
     *        accelerators.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrossAccountResource withAttachmentArn(String attachmentArn) {
        setAttachmentArn(attachmentArn);
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
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getAttachmentArn() != null)
            sb.append("AttachmentArn: ").append(getAttachmentArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrossAccountResource == false)
            return false;
        CrossAccountResource other = (CrossAccountResource) obj;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getAttachmentArn() == null ^ this.getAttachmentArn() == null)
            return false;
        if (other.getAttachmentArn() != null && other.getAttachmentArn().equals(this.getAttachmentArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getAttachmentArn() == null) ? 0 : getAttachmentArn().hashCode());
        return hashCode;
    }

    @Override
    public CrossAccountResource clone() {
        try {
            return (CrossAccountResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.CrossAccountResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
