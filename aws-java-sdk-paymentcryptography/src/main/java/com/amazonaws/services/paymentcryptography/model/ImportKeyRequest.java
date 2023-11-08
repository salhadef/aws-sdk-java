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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ImportKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether import key is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV) for DES
     * and AES keys.
     * </p>
     * <p>
     * For DES key, the KCV is computed by encrypting 8 bytes, each with value '00', with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES key, the KCV is computed by encrypting 8
     * bytes, each with value '01', with the key to be checked and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     */
    private String keyCheckValueAlgorithm;
    /**
     * <p>
     * The key or public key certificate type to use during key material import, for example TR-34 or
     * RootCertificatePublicKey.
     * </p>
     */
    private ImportKeyMaterial keyMaterial;
    /**
     * <p>
     * The tags to attach to the key. Each tag consists of a tag key and a tag value. Both the tag key and the tag value
     * are required, but the tag value can be an empty (null) string. You can't have more than one tag on an Amazon Web
     * Services Payment Cryptography key with the same tag key.
     * </p>
     * <p>
     * You can't have more than one tag on an Amazon Web Services Payment Cryptography key with the same tag key. If you
     * specify an existing tag key with a different tag value, Amazon Web Services Payment Cryptography replaces the
     * current tag value with the specified one.
     * </p>
     * <p>
     * To use this parameter, you must have <code>TagResource</code> permission.
     * </p>
     * <important>
     * <p>
     * Don't include confidential or sensitive information in this field. This field may be displayed in plaintext in
     * CloudTrail logs and other output.
     * </p>
     * </important> <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies whether import key is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether import key is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether import key is enabled.
     * </p>
     * 
     * @return Specifies whether import key is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether import key is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether import key is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether import key is enabled.
     * </p>
     * 
     * @return Specifies whether import key is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV) for DES
     * and AES keys.
     * </p>
     * <p>
     * For DES key, the KCV is computed by encrypting 8 bytes, each with value '00', with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES key, the KCV is computed by encrypting 8
     * bytes, each with value '01', with the key to be checked and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @param keyCheckValueAlgorithm
     *        The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV)
     *        for DES and AES keys.</p>
     *        <p>
     *        For DES key, the KCV is computed by encrypting 8 bytes, each with value '00', with the key to be checked
     *        and retaining the 3 highest order bytes of the encrypted result. For AES key, the KCV is computed by
     *        encrypting 8 bytes, each with value '01', with the key to be checked and retaining the 3 highest order
     *        bytes of the encrypted result.
     * @see KeyCheckValueAlgorithm
     */

    public void setKeyCheckValueAlgorithm(String keyCheckValueAlgorithm) {
        this.keyCheckValueAlgorithm = keyCheckValueAlgorithm;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV) for DES
     * and AES keys.
     * </p>
     * <p>
     * For DES key, the KCV is computed by encrypting 8 bytes, each with value '00', with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES key, the KCV is computed by encrypting 8
     * bytes, each with value '01', with the key to be checked and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @return The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV)
     *         for DES and AES keys.</p>
     *         <p>
     *         For DES key, the KCV is computed by encrypting 8 bytes, each with value '00', with the key to be checked
     *         and retaining the 3 highest order bytes of the encrypted result. For AES key, the KCV is computed by
     *         encrypting 8 bytes, each with value '01', with the key to be checked and retaining the 3 highest order
     *         bytes of the encrypted result.
     * @see KeyCheckValueAlgorithm
     */

    public String getKeyCheckValueAlgorithm() {
        return this.keyCheckValueAlgorithm;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV) for DES
     * and AES keys.
     * </p>
     * <p>
     * For DES key, the KCV is computed by encrypting 8 bytes, each with value '00', with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES key, the KCV is computed by encrypting 8
     * bytes, each with value '01', with the key to be checked and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @param keyCheckValueAlgorithm
     *        The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV)
     *        for DES and AES keys.</p>
     *        <p>
     *        For DES key, the KCV is computed by encrypting 8 bytes, each with value '00', with the key to be checked
     *        and retaining the 3 highest order bytes of the encrypted result. For AES key, the KCV is computed by
     *        encrypting 8 bytes, each with value '01', with the key to be checked and retaining the 3 highest order
     *        bytes of the encrypted result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyCheckValueAlgorithm
     */

    public ImportKeyRequest withKeyCheckValueAlgorithm(String keyCheckValueAlgorithm) {
        setKeyCheckValueAlgorithm(keyCheckValueAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV) for DES
     * and AES keys.
     * </p>
     * <p>
     * For DES key, the KCV is computed by encrypting 8 bytes, each with value '00', with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES key, the KCV is computed by encrypting 8
     * bytes, each with value '01', with the key to be checked and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @param keyCheckValueAlgorithm
     *        The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV)
     *        for DES and AES keys.</p>
     *        <p>
     *        For DES key, the KCV is computed by encrypting 8 bytes, each with value '00', with the key to be checked
     *        and retaining the 3 highest order bytes of the encrypted result. For AES key, the KCV is computed by
     *        encrypting 8 bytes, each with value '01', with the key to be checked and retaining the 3 highest order
     *        bytes of the encrypted result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyCheckValueAlgorithm
     */

    public ImportKeyRequest withKeyCheckValueAlgorithm(KeyCheckValueAlgorithm keyCheckValueAlgorithm) {
        this.keyCheckValueAlgorithm = keyCheckValueAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The key or public key certificate type to use during key material import, for example TR-34 or
     * RootCertificatePublicKey.
     * </p>
     * 
     * @param keyMaterial
     *        The key or public key certificate type to use during key material import, for example TR-34 or
     *        RootCertificatePublicKey.
     */

    public void setKeyMaterial(ImportKeyMaterial keyMaterial) {
        this.keyMaterial = keyMaterial;
    }

    /**
     * <p>
     * The key or public key certificate type to use during key material import, for example TR-34 or
     * RootCertificatePublicKey.
     * </p>
     * 
     * @return The key or public key certificate type to use during key material import, for example TR-34 or
     *         RootCertificatePublicKey.
     */

    public ImportKeyMaterial getKeyMaterial() {
        return this.keyMaterial;
    }

    /**
     * <p>
     * The key or public key certificate type to use during key material import, for example TR-34 or
     * RootCertificatePublicKey.
     * </p>
     * 
     * @param keyMaterial
     *        The key or public key certificate type to use during key material import, for example TR-34 or
     *        RootCertificatePublicKey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyRequest withKeyMaterial(ImportKeyMaterial keyMaterial) {
        setKeyMaterial(keyMaterial);
        return this;
    }

    /**
     * <p>
     * The tags to attach to the key. Each tag consists of a tag key and a tag value. Both the tag key and the tag value
     * are required, but the tag value can be an empty (null) string. You can't have more than one tag on an Amazon Web
     * Services Payment Cryptography key with the same tag key.
     * </p>
     * <p>
     * You can't have more than one tag on an Amazon Web Services Payment Cryptography key with the same tag key. If you
     * specify an existing tag key with a different tag value, Amazon Web Services Payment Cryptography replaces the
     * current tag value with the specified one.
     * </p>
     * <p>
     * To use this parameter, you must have <code>TagResource</code> permission.
     * </p>
     * <important>
     * <p>
     * Don't include confidential or sensitive information in this field. This field may be displayed in plaintext in
     * CloudTrail logs and other output.
     * </p>
     * </important> <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * 
     * @return The tags to attach to the key. Each tag consists of a tag key and a tag value. Both the tag key and the
     *         tag value are required, but the tag value can be an empty (null) string. You can't have more than one tag
     *         on an Amazon Web Services Payment Cryptography key with the same tag key. </p>
     *         <p>
     *         You can't have more than one tag on an Amazon Web Services Payment Cryptography key with the same tag
     *         key. If you specify an existing tag key with a different tag value, Amazon Web Services Payment
     *         Cryptography replaces the current tag value with the specified one.
     *         </p>
     *         <p>
     *         To use this parameter, you must have <code>TagResource</code> permission.
     *         </p>
     *         <important>
     *         <p>
     *         Don't include confidential or sensitive information in this field. This field may be displayed in
     *         plaintext in CloudTrail logs and other output.
     *         </p>
     *         </important> <note>
     *         <p>
     *         Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the
     *         key.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to attach to the key. Each tag consists of a tag key and a tag value. Both the tag key and the tag value
     * are required, but the tag value can be an empty (null) string. You can't have more than one tag on an Amazon Web
     * Services Payment Cryptography key with the same tag key.
     * </p>
     * <p>
     * You can't have more than one tag on an Amazon Web Services Payment Cryptography key with the same tag key. If you
     * specify an existing tag key with a different tag value, Amazon Web Services Payment Cryptography replaces the
     * current tag value with the specified one.
     * </p>
     * <p>
     * To use this parameter, you must have <code>TagResource</code> permission.
     * </p>
     * <important>
     * <p>
     * Don't include confidential or sensitive information in this field. This field may be displayed in plaintext in
     * CloudTrail logs and other output.
     * </p>
     * </important> <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * 
     * @param tags
     *        The tags to attach to the key. Each tag consists of a tag key and a tag value. Both the tag key and the
     *        tag value are required, but the tag value can be an empty (null) string. You can't have more than one tag
     *        on an Amazon Web Services Payment Cryptography key with the same tag key. </p>
     *        <p>
     *        You can't have more than one tag on an Amazon Web Services Payment Cryptography key with the same tag key.
     *        If you specify an existing tag key with a different tag value, Amazon Web Services Payment Cryptography
     *        replaces the current tag value with the specified one.
     *        </p>
     *        <p>
     *        To use this parameter, you must have <code>TagResource</code> permission.
     *        </p>
     *        <important>
     *        <p>
     *        Don't include confidential or sensitive information in this field. This field may be displayed in
     *        plaintext in CloudTrail logs and other output.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the
     *        key.
     *        </p>
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
     * The tags to attach to the key. Each tag consists of a tag key and a tag value. Both the tag key and the tag value
     * are required, but the tag value can be an empty (null) string. You can't have more than one tag on an Amazon Web
     * Services Payment Cryptography key with the same tag key.
     * </p>
     * <p>
     * You can't have more than one tag on an Amazon Web Services Payment Cryptography key with the same tag key. If you
     * specify an existing tag key with a different tag value, Amazon Web Services Payment Cryptography replaces the
     * current tag value with the specified one.
     * </p>
     * <p>
     * To use this parameter, you must have <code>TagResource</code> permission.
     * </p>
     * <important>
     * <p>
     * Don't include confidential or sensitive information in this field. This field may be displayed in plaintext in
     * CloudTrail logs and other output.
     * </p>
     * </important> <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to attach to the key. Each tag consists of a tag key and a tag value. Both the tag key and the
     *        tag value are required, but the tag value can be an empty (null) string. You can't have more than one tag
     *        on an Amazon Web Services Payment Cryptography key with the same tag key. </p>
     *        <p>
     *        You can't have more than one tag on an Amazon Web Services Payment Cryptography key with the same tag key.
     *        If you specify an existing tag key with a different tag value, Amazon Web Services Payment Cryptography
     *        replaces the current tag value with the specified one.
     *        </p>
     *        <p>
     *        To use this parameter, you must have <code>TagResource</code> permission.
     *        </p>
     *        <important>
     *        <p>
     *        Don't include confidential or sensitive information in this field. This field may be displayed in
     *        plaintext in CloudTrail logs and other output.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the
     *        key.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyRequest withTags(Tag... tags) {
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
     * The tags to attach to the key. Each tag consists of a tag key and a tag value. Both the tag key and the tag value
     * are required, but the tag value can be an empty (null) string. You can't have more than one tag on an Amazon Web
     * Services Payment Cryptography key with the same tag key.
     * </p>
     * <p>
     * You can't have more than one tag on an Amazon Web Services Payment Cryptography key with the same tag key. If you
     * specify an existing tag key with a different tag value, Amazon Web Services Payment Cryptography replaces the
     * current tag value with the specified one.
     * </p>
     * <p>
     * To use this parameter, you must have <code>TagResource</code> permission.
     * </p>
     * <important>
     * <p>
     * Don't include confidential or sensitive information in this field. This field may be displayed in plaintext in
     * CloudTrail logs and other output.
     * </p>
     * </important> <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * 
     * @param tags
     *        The tags to attach to the key. Each tag consists of a tag key and a tag value. Both the tag key and the
     *        tag value are required, but the tag value can be an empty (null) string. You can't have more than one tag
     *        on an Amazon Web Services Payment Cryptography key with the same tag key. </p>
     *        <p>
     *        You can't have more than one tag on an Amazon Web Services Payment Cryptography key with the same tag key.
     *        If you specify an existing tag key with a different tag value, Amazon Web Services Payment Cryptography
     *        replaces the current tag value with the specified one.
     *        </p>
     *        <p>
     *        To use this parameter, you must have <code>TagResource</code> permission.
     *        </p>
     *        <important>
     *        <p>
     *        Don't include confidential or sensitive information in this field. This field may be displayed in
     *        plaintext in CloudTrail logs and other output.
     *        </p>
     *        </important> <note>
     *        <p>
     *        Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the
     *        key.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getKeyCheckValueAlgorithm() != null)
            sb.append("KeyCheckValueAlgorithm: ").append(getKeyCheckValueAlgorithm()).append(",");
        if (getKeyMaterial() != null)
            sb.append("KeyMaterial: ").append(getKeyMaterial()).append(",");
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

        if (obj instanceof ImportKeyRequest == false)
            return false;
        ImportKeyRequest other = (ImportKeyRequest) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getKeyCheckValueAlgorithm() == null ^ this.getKeyCheckValueAlgorithm() == null)
            return false;
        if (other.getKeyCheckValueAlgorithm() != null && other.getKeyCheckValueAlgorithm().equals(this.getKeyCheckValueAlgorithm()) == false)
            return false;
        if (other.getKeyMaterial() == null ^ this.getKeyMaterial() == null)
            return false;
        if (other.getKeyMaterial() != null && other.getKeyMaterial().equals(this.getKeyMaterial()) == false)
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

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getKeyCheckValueAlgorithm() == null) ? 0 : getKeyCheckValueAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKeyMaterial() == null) ? 0 : getKeyMaterial().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImportKeyRequest clone() {
        return (ImportKeyRequest) super.clone();
    }

}
