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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameter information for generating a wrapped key using TR-31 or TR-34 standard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/WrappedKey" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WrappedKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameter information for generating a wrapped key using TR-31 or TR-34 standard.
     * </p>
     */
    private String keyMaterial;
    /**
     * <p>
     * The key block format of a wrapped key.
     * </p>
     */
    private String wrappedKeyMaterialFormat;
    /**
     * <p>
     * The <code>KeyARN</code> of the wrapped key.
     * </p>
     */
    private String wrappingKeyArn;

    /**
     * <p>
     * Parameter information for generating a wrapped key using TR-31 or TR-34 standard.
     * </p>
     * 
     * @param keyMaterial
     *        Parameter information for generating a wrapped key using TR-31 or TR-34 standard.
     */

    public void setKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
    }

    /**
     * <p>
     * Parameter information for generating a wrapped key using TR-31 or TR-34 standard.
     * </p>
     * 
     * @return Parameter information for generating a wrapped key using TR-31 or TR-34 standard.
     */

    public String getKeyMaterial() {
        return this.keyMaterial;
    }

    /**
     * <p>
     * Parameter information for generating a wrapped key using TR-31 or TR-34 standard.
     * </p>
     * 
     * @param keyMaterial
     *        Parameter information for generating a wrapped key using TR-31 or TR-34 standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WrappedKey withKeyMaterial(String keyMaterial) {
        setKeyMaterial(keyMaterial);
        return this;
    }

    /**
     * <p>
     * The key block format of a wrapped key.
     * </p>
     * 
     * @param wrappedKeyMaterialFormat
     *        The key block format of a wrapped key.
     * @see WrappedKeyMaterialFormat
     */

    public void setWrappedKeyMaterialFormat(String wrappedKeyMaterialFormat) {
        this.wrappedKeyMaterialFormat = wrappedKeyMaterialFormat;
    }

    /**
     * <p>
     * The key block format of a wrapped key.
     * </p>
     * 
     * @return The key block format of a wrapped key.
     * @see WrappedKeyMaterialFormat
     */

    public String getWrappedKeyMaterialFormat() {
        return this.wrappedKeyMaterialFormat;
    }

    /**
     * <p>
     * The key block format of a wrapped key.
     * </p>
     * 
     * @param wrappedKeyMaterialFormat
     *        The key block format of a wrapped key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WrappedKeyMaterialFormat
     */

    public WrappedKey withWrappedKeyMaterialFormat(String wrappedKeyMaterialFormat) {
        setWrappedKeyMaterialFormat(wrappedKeyMaterialFormat);
        return this;
    }

    /**
     * <p>
     * The key block format of a wrapped key.
     * </p>
     * 
     * @param wrappedKeyMaterialFormat
     *        The key block format of a wrapped key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WrappedKeyMaterialFormat
     */

    public WrappedKey withWrappedKeyMaterialFormat(WrappedKeyMaterialFormat wrappedKeyMaterialFormat) {
        this.wrappedKeyMaterialFormat = wrappedKeyMaterialFormat.toString();
        return this;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the wrapped key.
     * </p>
     * 
     * @param wrappingKeyArn
     *        The <code>KeyARN</code> of the wrapped key.
     */

    public void setWrappingKeyArn(String wrappingKeyArn) {
        this.wrappingKeyArn = wrappingKeyArn;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the wrapped key.
     * </p>
     * 
     * @return The <code>KeyARN</code> of the wrapped key.
     */

    public String getWrappingKeyArn() {
        return this.wrappingKeyArn;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the wrapped key.
     * </p>
     * 
     * @param wrappingKeyArn
     *        The <code>KeyARN</code> of the wrapped key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WrappedKey withWrappingKeyArn(String wrappingKeyArn) {
        setWrappingKeyArn(wrappingKeyArn);
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
        if (getKeyMaterial() != null)
            sb.append("KeyMaterial: ").append("***Sensitive Data Redacted***").append(",");
        if (getWrappedKeyMaterialFormat() != null)
            sb.append("WrappedKeyMaterialFormat: ").append(getWrappedKeyMaterialFormat()).append(",");
        if (getWrappingKeyArn() != null)
            sb.append("WrappingKeyArn: ").append(getWrappingKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WrappedKey == false)
            return false;
        WrappedKey other = (WrappedKey) obj;
        if (other.getKeyMaterial() == null ^ this.getKeyMaterial() == null)
            return false;
        if (other.getKeyMaterial() != null && other.getKeyMaterial().equals(this.getKeyMaterial()) == false)
            return false;
        if (other.getWrappedKeyMaterialFormat() == null ^ this.getWrappedKeyMaterialFormat() == null)
            return false;
        if (other.getWrappedKeyMaterialFormat() != null && other.getWrappedKeyMaterialFormat().equals(this.getWrappedKeyMaterialFormat()) == false)
            return false;
        if (other.getWrappingKeyArn() == null ^ this.getWrappingKeyArn() == null)
            return false;
        if (other.getWrappingKeyArn() != null && other.getWrappingKeyArn().equals(this.getWrappingKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyMaterial() == null) ? 0 : getKeyMaterial().hashCode());
        hashCode = prime * hashCode + ((getWrappedKeyMaterialFormat() == null) ? 0 : getWrappedKeyMaterialFormat().hashCode());
        hashCode = prime * hashCode + ((getWrappingKeyArn() == null) ? 0 : getWrappingKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public WrappedKey clone() {
        try {
            return (WrappedKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.WrappedKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
