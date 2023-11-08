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
package com.amazonaws.services.paymentcryptographydata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/TranslatePinData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranslatePinDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to encrypt
     * outgoing PIN block data after translation.
     * </p>
     */
    private String keyArn;
    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed. Amazon Web Services Payment Cryptography calculates the KCV by
     * using standard algorithms, typically by encrypting 8 or 16 bytes or "00" or "01" and then truncating the result
     * to the first 3 bytes, or 6 hex digits, of the resulting cryptogram.
     * </p>
     */
    private String keyCheckValue;
    /**
     * <p>
     * The ougoing encrypted PIN block data after tranlation.
     * </p>
     */
    private String pinBlock;

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to encrypt
     * outgoing PIN block data after translation.
     * </p>
     * 
     * @param keyArn
     *        The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to
     *        encrypt outgoing PIN block data after translation.
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to encrypt
     * outgoing PIN block data after translation.
     * </p>
     * 
     * @return The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to
     *         encrypt outgoing PIN block data after translation.
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to encrypt
     * outgoing PIN block data after translation.
     * </p>
     * 
     * @param keyArn
     *        The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to
     *        encrypt outgoing PIN block data after translation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslatePinDataResult withKeyArn(String keyArn) {
        setKeyArn(keyArn);
        return this;
    }

    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed. Amazon Web Services Payment Cryptography calculates the KCV by
     * using standard algorithms, typically by encrypting 8 or 16 bytes or "00" or "01" and then truncating the result
     * to the first 3 bytes, or 6 hex digits, of the resulting cryptogram.
     * </p>
     * 
     * @param keyCheckValue
     *        The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given
     *        key have the same key or to detect that a key has changed. Amazon Web Services Payment Cryptography
     *        calculates the KCV by using standard algorithms, typically by encrypting 8 or 16 bytes or "00" or "01" and
     *        then truncating the result to the first 3 bytes, or 6 hex digits, of the resulting cryptogram.
     */

    public void setKeyCheckValue(String keyCheckValue) {
        this.keyCheckValue = keyCheckValue;
    }

    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed. Amazon Web Services Payment Cryptography calculates the KCV by
     * using standard algorithms, typically by encrypting 8 or 16 bytes or "00" or "01" and then truncating the result
     * to the first 3 bytes, or 6 hex digits, of the resulting cryptogram.
     * </p>
     * 
     * @return The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given
     *         key have the same key or to detect that a key has changed. Amazon Web Services Payment Cryptography
     *         calculates the KCV by using standard algorithms, typically by encrypting 8 or 16 bytes or "00" or "01"
     *         and then truncating the result to the first 3 bytes, or 6 hex digits, of the resulting cryptogram.
     */

    public String getKeyCheckValue() {
        return this.keyCheckValue;
    }

    /**
     * <p>
     * The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given key have
     * the same key or to detect that a key has changed. Amazon Web Services Payment Cryptography calculates the KCV by
     * using standard algorithms, typically by encrypting 8 or 16 bytes or "00" or "01" and then truncating the result
     * to the first 3 bytes, or 6 hex digits, of the resulting cryptogram.
     * </p>
     * 
     * @param keyCheckValue
     *        The key check value (KCV) of the encryption key. The KCV is used to check if all parties holding a given
     *        key have the same key or to detect that a key has changed. Amazon Web Services Payment Cryptography
     *        calculates the KCV by using standard algorithms, typically by encrypting 8 or 16 bytes or "00" or "01" and
     *        then truncating the result to the first 3 bytes, or 6 hex digits, of the resulting cryptogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslatePinDataResult withKeyCheckValue(String keyCheckValue) {
        setKeyCheckValue(keyCheckValue);
        return this;
    }

    /**
     * <p>
     * The ougoing encrypted PIN block data after tranlation.
     * </p>
     * 
     * @param pinBlock
     *        The ougoing encrypted PIN block data after tranlation.
     */

    public void setPinBlock(String pinBlock) {
        this.pinBlock = pinBlock;
    }

    /**
     * <p>
     * The ougoing encrypted PIN block data after tranlation.
     * </p>
     * 
     * @return The ougoing encrypted PIN block data after tranlation.
     */

    public String getPinBlock() {
        return this.pinBlock;
    }

    /**
     * <p>
     * The ougoing encrypted PIN block data after tranlation.
     * </p>
     * 
     * @param pinBlock
     *        The ougoing encrypted PIN block data after tranlation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslatePinDataResult withPinBlock(String pinBlock) {
        setPinBlock(pinBlock);
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
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn()).append(",");
        if (getKeyCheckValue() != null)
            sb.append("KeyCheckValue: ").append(getKeyCheckValue()).append(",");
        if (getPinBlock() != null)
            sb.append("PinBlock: ").append(getPinBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslatePinDataResult == false)
            return false;
        TranslatePinDataResult other = (TranslatePinDataResult) obj;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        if (other.getKeyCheckValue() == null ^ this.getKeyCheckValue() == null)
            return false;
        if (other.getKeyCheckValue() != null && other.getKeyCheckValue().equals(this.getKeyCheckValue()) == false)
            return false;
        if (other.getPinBlock() == null ^ this.getPinBlock() == null)
            return false;
        if (other.getPinBlock() != null && other.getPinBlock().equals(this.getPinBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        hashCode = prime * hashCode + ((getKeyCheckValue() == null) ? 0 : getKeyCheckValue().hashCode());
        hashCode = prime * hashCode + ((getPinBlock() == null) ? 0 : getPinBlock().hashCode());
        return hashCode;
    }

    @Override
    public TranslatePinDataResult clone() {
        try {
            return (TranslatePinDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
