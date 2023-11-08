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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use filters to focus the returned annotation store versions on a specific parameter, such as the status of the
 * annotation store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/Filter" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Number (Arn) for an analytics store.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     */
    private java.util.List<String> status;

    /**
     * <p>
     * The Amazon Resource Number (Arn) for an analytics store.
     * </p>
     * 
     * @return The Amazon Resource Number (Arn) for an analytics store.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Number (Arn) for an analytics store.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Number (Arn) for an analytics store.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Number (Arn) for an analytics store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Number (Arn) for an analytics store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (Arn) for an analytics store.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Number (Arn) for an analytics store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * 
     * @return The status of an annotation store version.
     * @see ShareStatus
     */

    public java.util.List<String> getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * 
     * @param status
     *        The status of an annotation store version.
     * @see ShareStatus
     */

    public void setStatus(java.util.Collection<String> status) {
        if (status == null) {
            this.status = null;
            return;
        }

        this.status = new java.util.ArrayList<String>(status);
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatus(java.util.Collection)} or {@link #withStatus(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param status
     *        The status of an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public Filter withStatus(String... status) {
        if (this.status == null) {
            setStatus(new java.util.ArrayList<String>(status.length));
        }
        for (String ele : status) {
            this.status.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * 
     * @param status
     *        The status of an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public Filter withStatus(java.util.Collection<String> status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of an annotation store version.
     * </p>
     * 
     * @param status
     *        The status of an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public Filter withStatus(ShareStatus... status) {
        java.util.ArrayList<String> statusCopy = new java.util.ArrayList<String>(status.length);
        for (ShareStatus value : status) {
            statusCopy.add(value.toString());
        }
        if (getStatus() == null) {
            setStatus(statusCopy);
        } else {
            getStatus().addAll(statusCopy);
        }
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
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
