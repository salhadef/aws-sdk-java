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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The collection of settings used by an AutoML job V2 for the text generation problem type.
 * </p>
 * <note>
 * <p>
 * The text generation models that support fine-tuning in Autopilot are currently accessible exclusively in regions
 * supported by Canvas. Refer to the documentation of Canvas for the <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/canvas.html">full list of its supported Regions</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TextGenerationJobConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextGenerationJobConfig implements Serializable, Cloneable, StructuredPojo {

    private AutoMLJobCompletionCriteria completionCriteria;
    /**
     * <p>
     * The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language models. For
     * information on the list of supported models, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/src/AWSIronmanApiDoc/build/server-root/sagemaker/latest/dg/llms-finetuning-models.html#llms-finetuning-supported-llms"
     * >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is provided,
     * the default model used is Falcon-7B-Instruct.
     * </p>
     */
    private String baseModelName;

    /**
     * @param completionCriteria
     */

    public void setCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
    }

    /**
     * @return
     */

    public AutoMLJobCompletionCriteria getCompletionCriteria() {
        return this.completionCriteria;
    }

    /**
     * @param completionCriteria
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextGenerationJobConfig withCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        setCompletionCriteria(completionCriteria);
        return this;
    }

    /**
     * <p>
     * The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language models. For
     * information on the list of supported models, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/src/AWSIronmanApiDoc/build/server-root/sagemaker/latest/dg/llms-finetuning-models.html#llms-finetuning-supported-llms"
     * >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is provided,
     * the default model used is Falcon-7B-Instruct.
     * </p>
     * 
     * @param baseModelName
     *        The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language
     *        models. For information on the list of supported models, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/src/AWSIronmanApiDoc/build/server-root/sagemaker/latest/dg/llms-finetuning-models.html#llms-finetuning-supported-llms"
     *        >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is
     *        provided, the default model used is Falcon-7B-Instruct.
     */

    public void setBaseModelName(String baseModelName) {
        this.baseModelName = baseModelName;
    }

    /**
     * <p>
     * The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language models. For
     * information on the list of supported models, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/src/AWSIronmanApiDoc/build/server-root/sagemaker/latest/dg/llms-finetuning-models.html#llms-finetuning-supported-llms"
     * >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is provided,
     * the default model used is Falcon-7B-Instruct.
     * </p>
     * 
     * @return The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language
     *         models. For information on the list of supported models, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/src/AWSIronmanApiDoc/build/server-root/sagemaker/latest/dg/llms-finetuning-models.html#llms-finetuning-supported-llms"
     *         >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is
     *         provided, the default model used is Falcon-7B-Instruct.
     */

    public String getBaseModelName() {
        return this.baseModelName;
    }

    /**
     * <p>
     * The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language models. For
     * information on the list of supported models, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/src/AWSIronmanApiDoc/build/server-root/sagemaker/latest/dg/llms-finetuning-models.html#llms-finetuning-supported-llms"
     * >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is provided,
     * the default model used is Falcon-7B-Instruct.
     * </p>
     * 
     * @param baseModelName
     *        The name of the base model to fine-tune. Autopilot supports fine-tuning a variety of large language
     *        models. For information on the list of supported models, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/src/AWSIronmanApiDoc/build/server-root/sagemaker/latest/dg/llms-finetuning-models.html#llms-finetuning-supported-llms"
     *        >Text generation models supporting fine-tuning in Autopilot</a>. If no <code>BaseModelName</code> is
     *        provided, the default model used is Falcon-7B-Instruct.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextGenerationJobConfig withBaseModelName(String baseModelName) {
        setBaseModelName(baseModelName);
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
        if (getCompletionCriteria() != null)
            sb.append("CompletionCriteria: ").append(getCompletionCriteria()).append(",");
        if (getBaseModelName() != null)
            sb.append("BaseModelName: ").append(getBaseModelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextGenerationJobConfig == false)
            return false;
        TextGenerationJobConfig other = (TextGenerationJobConfig) obj;
        if (other.getCompletionCriteria() == null ^ this.getCompletionCriteria() == null)
            return false;
        if (other.getCompletionCriteria() != null && other.getCompletionCriteria().equals(this.getCompletionCriteria()) == false)
            return false;
        if (other.getBaseModelName() == null ^ this.getBaseModelName() == null)
            return false;
        if (other.getBaseModelName() != null && other.getBaseModelName().equals(this.getBaseModelName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionCriteria() == null) ? 0 : getCompletionCriteria().hashCode());
        hashCode = prime * hashCode + ((getBaseModelName() == null) ? 0 : getBaseModelName().hashCode());
        return hashCode;
    }

    @Override
    public TextGenerationJobConfig clone() {
        try {
            return (TextGenerationJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TextGenerationJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
