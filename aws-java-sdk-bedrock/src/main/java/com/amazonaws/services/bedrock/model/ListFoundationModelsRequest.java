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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListFoundationModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFoundationModelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A Bedrock model provider.
     * </p>
     */
    private String byProvider;
    /**
     * <p>
     * List by customization type.
     * </p>
     */
    private String byCustomizationType;
    /**
     * <p>
     * List by output modality type.
     * </p>
     */
    private String byOutputModality;
    /**
     * <p>
     * List by inference type.
     * </p>
     */
    private String byInferenceType;

    /**
     * <p>
     * A Bedrock model provider.
     * </p>
     * 
     * @param byProvider
     *        A Bedrock model provider.
     */

    public void setByProvider(String byProvider) {
        this.byProvider = byProvider;
    }

    /**
     * <p>
     * A Bedrock model provider.
     * </p>
     * 
     * @return A Bedrock model provider.
     */

    public String getByProvider() {
        return this.byProvider;
    }

    /**
     * <p>
     * A Bedrock model provider.
     * </p>
     * 
     * @param byProvider
     *        A Bedrock model provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFoundationModelsRequest withByProvider(String byProvider) {
        setByProvider(byProvider);
        return this;
    }

    /**
     * <p>
     * List by customization type.
     * </p>
     * 
     * @param byCustomizationType
     *        List by customization type.
     * @see ModelCustomization
     */

    public void setByCustomizationType(String byCustomizationType) {
        this.byCustomizationType = byCustomizationType;
    }

    /**
     * <p>
     * List by customization type.
     * </p>
     * 
     * @return List by customization type.
     * @see ModelCustomization
     */

    public String getByCustomizationType() {
        return this.byCustomizationType;
    }

    /**
     * <p>
     * List by customization type.
     * </p>
     * 
     * @param byCustomizationType
     *        List by customization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCustomization
     */

    public ListFoundationModelsRequest withByCustomizationType(String byCustomizationType) {
        setByCustomizationType(byCustomizationType);
        return this;
    }

    /**
     * <p>
     * List by customization type.
     * </p>
     * 
     * @param byCustomizationType
     *        List by customization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCustomization
     */

    public ListFoundationModelsRequest withByCustomizationType(ModelCustomization byCustomizationType) {
        this.byCustomizationType = byCustomizationType.toString();
        return this;
    }

    /**
     * <p>
     * List by output modality type.
     * </p>
     * 
     * @param byOutputModality
     *        List by output modality type.
     * @see ModelModality
     */

    public void setByOutputModality(String byOutputModality) {
        this.byOutputModality = byOutputModality;
    }

    /**
     * <p>
     * List by output modality type.
     * </p>
     * 
     * @return List by output modality type.
     * @see ModelModality
     */

    public String getByOutputModality() {
        return this.byOutputModality;
    }

    /**
     * <p>
     * List by output modality type.
     * </p>
     * 
     * @param byOutputModality
     *        List by output modality type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelModality
     */

    public ListFoundationModelsRequest withByOutputModality(String byOutputModality) {
        setByOutputModality(byOutputModality);
        return this;
    }

    /**
     * <p>
     * List by output modality type.
     * </p>
     * 
     * @param byOutputModality
     *        List by output modality type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelModality
     */

    public ListFoundationModelsRequest withByOutputModality(ModelModality byOutputModality) {
        this.byOutputModality = byOutputModality.toString();
        return this;
    }

    /**
     * <p>
     * List by inference type.
     * </p>
     * 
     * @param byInferenceType
     *        List by inference type.
     * @see InferenceType
     */

    public void setByInferenceType(String byInferenceType) {
        this.byInferenceType = byInferenceType;
    }

    /**
     * <p>
     * List by inference type.
     * </p>
     * 
     * @return List by inference type.
     * @see InferenceType
     */

    public String getByInferenceType() {
        return this.byInferenceType;
    }

    /**
     * <p>
     * List by inference type.
     * </p>
     * 
     * @param byInferenceType
     *        List by inference type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceType
     */

    public ListFoundationModelsRequest withByInferenceType(String byInferenceType) {
        setByInferenceType(byInferenceType);
        return this;
    }

    /**
     * <p>
     * List by inference type.
     * </p>
     * 
     * @param byInferenceType
     *        List by inference type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceType
     */

    public ListFoundationModelsRequest withByInferenceType(InferenceType byInferenceType) {
        this.byInferenceType = byInferenceType.toString();
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
        if (getByProvider() != null)
            sb.append("ByProvider: ").append(getByProvider()).append(",");
        if (getByCustomizationType() != null)
            sb.append("ByCustomizationType: ").append(getByCustomizationType()).append(",");
        if (getByOutputModality() != null)
            sb.append("ByOutputModality: ").append(getByOutputModality()).append(",");
        if (getByInferenceType() != null)
            sb.append("ByInferenceType: ").append(getByInferenceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFoundationModelsRequest == false)
            return false;
        ListFoundationModelsRequest other = (ListFoundationModelsRequest) obj;
        if (other.getByProvider() == null ^ this.getByProvider() == null)
            return false;
        if (other.getByProvider() != null && other.getByProvider().equals(this.getByProvider()) == false)
            return false;
        if (other.getByCustomizationType() == null ^ this.getByCustomizationType() == null)
            return false;
        if (other.getByCustomizationType() != null && other.getByCustomizationType().equals(this.getByCustomizationType()) == false)
            return false;
        if (other.getByOutputModality() == null ^ this.getByOutputModality() == null)
            return false;
        if (other.getByOutputModality() != null && other.getByOutputModality().equals(this.getByOutputModality()) == false)
            return false;
        if (other.getByInferenceType() == null ^ this.getByInferenceType() == null)
            return false;
        if (other.getByInferenceType() != null && other.getByInferenceType().equals(this.getByInferenceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByProvider() == null) ? 0 : getByProvider().hashCode());
        hashCode = prime * hashCode + ((getByCustomizationType() == null) ? 0 : getByCustomizationType().hashCode());
        hashCode = prime * hashCode + ((getByOutputModality() == null) ? 0 : getByOutputModality().hashCode());
        hashCode = prime * hashCode + ((getByInferenceType() == null) ? 0 : getByInferenceType().hashCode());
        return hashCode;
    }

    @Override
    public ListFoundationModelsRequest clone() {
        return (ListFoundationModelsRequest) super.clone();
    }

}
