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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ExportKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>KeyARN</code> of the key under export from Amazon Web Services Payment Cryptography.
     * </p>
     */
    private String exportKeyIdentifier;
    /**
     * <p>
     * The key block format type, for example, TR-34 or TR-31, to use during key material export.
     * </p>
     */
    private ExportKeyMaterial keyMaterial;

    /**
     * <p>
     * The <code>KeyARN</code> of the key under export from Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param exportKeyIdentifier
     *        The <code>KeyARN</code> of the key under export from Amazon Web Services Payment Cryptography.
     */

    public void setExportKeyIdentifier(String exportKeyIdentifier) {
        this.exportKeyIdentifier = exportKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the key under export from Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @return The <code>KeyARN</code> of the key under export from Amazon Web Services Payment Cryptography.
     */

    public String getExportKeyIdentifier() {
        return this.exportKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the key under export from Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param exportKeyIdentifier
     *        The <code>KeyARN</code> of the key under export from Amazon Web Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportKeyRequest withExportKeyIdentifier(String exportKeyIdentifier) {
        setExportKeyIdentifier(exportKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * The key block format type, for example, TR-34 or TR-31, to use during key material export.
     * </p>
     * 
     * @param keyMaterial
     *        The key block format type, for example, TR-34 or TR-31, to use during key material export.
     */

    public void setKeyMaterial(ExportKeyMaterial keyMaterial) {
        this.keyMaterial = keyMaterial;
    }

    /**
     * <p>
     * The key block format type, for example, TR-34 or TR-31, to use during key material export.
     * </p>
     * 
     * @return The key block format type, for example, TR-34 or TR-31, to use during key material export.
     */

    public ExportKeyMaterial getKeyMaterial() {
        return this.keyMaterial;
    }

    /**
     * <p>
     * The key block format type, for example, TR-34 or TR-31, to use during key material export.
     * </p>
     * 
     * @param keyMaterial
     *        The key block format type, for example, TR-34 or TR-31, to use during key material export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportKeyRequest withKeyMaterial(ExportKeyMaterial keyMaterial) {
        setKeyMaterial(keyMaterial);
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
        if (getExportKeyIdentifier() != null)
            sb.append("ExportKeyIdentifier: ").append(getExportKeyIdentifier()).append(",");
        if (getKeyMaterial() != null)
            sb.append("KeyMaterial: ").append(getKeyMaterial());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportKeyRequest == false)
            return false;
        ExportKeyRequest other = (ExportKeyRequest) obj;
        if (other.getExportKeyIdentifier() == null ^ this.getExportKeyIdentifier() == null)
            return false;
        if (other.getExportKeyIdentifier() != null && other.getExportKeyIdentifier().equals(this.getExportKeyIdentifier()) == false)
            return false;
        if (other.getKeyMaterial() == null ^ this.getKeyMaterial() == null)
            return false;
        if (other.getKeyMaterial() != null && other.getKeyMaterial().equals(this.getKeyMaterial()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportKeyIdentifier() == null) ? 0 : getExportKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getKeyMaterial() == null) ? 0 : getKeyMaterial().hashCode());
        return hashCode;
    }

    @Override
    public ExportKeyRequest clone() {
        return (ExportKeyRequest) super.clone();
    }

}
