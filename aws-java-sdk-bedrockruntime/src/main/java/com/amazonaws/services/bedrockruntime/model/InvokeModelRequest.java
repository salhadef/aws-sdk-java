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
package com.amazonaws.services.bedrockruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/InvokeModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The desired MIME type of the inference body in the response. The default value is <code>application/json</code>.
     * </p>
     */
    private String accept;
    /**
     * <p>
     * Input data in the format specified in the content-type request header. To see the format and content of this
     * field for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>.
     * </p>
     */
    private java.nio.ByteBuffer body;
    /**
     * <p>
     * The MIME type of the input data in the request. The default value is <code>application/json</code>.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * Identifier of the model.
     * </p>
     */
    private String modelId;

    /**
     * <p>
     * The desired MIME type of the inference body in the response. The default value is <code>application/json</code>.
     * </p>
     * 
     * @param accept
     *        The desired MIME type of the inference body in the response. The default value is
     *        <code>application/json</code>.
     */

    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * The desired MIME type of the inference body in the response. The default value is <code>application/json</code>.
     * </p>
     * 
     * @return The desired MIME type of the inference body in the response. The default value is
     *         <code>application/json</code>.
     */

    public String getAccept() {
        return this.accept;
    }

    /**
     * <p>
     * The desired MIME type of the inference body in the response. The default value is <code>application/json</code>.
     * </p>
     * 
     * @param accept
     *        The desired MIME type of the inference body in the response. The default value is
     *        <code>application/json</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelRequest withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * <p>
     * Input data in the format specified in the content-type request header. To see the format and content of this
     * field for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param body
     *        Input data in the format specified in the content-type request header. To see the format and content of
     *        this field for different models, refer to <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference
     *        parameters</a>.
     */

    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * Input data in the format specified in the content-type request header. To see the format and content of this
     * field for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Input data in the format specified in the content-type request header. To see the format and content of
     *         this field for different models, refer to <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference
     *         parameters</a>.
     */

    public java.nio.ByteBuffer getBody() {
        return this.body;
    }

    /**
     * <p>
     * Input data in the format specified in the content-type request header. To see the format and content of this
     * field for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param body
     *        Input data in the format specified in the content-type request header. To see the format and content of
     *        this field for different models, refer to <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference
     *        parameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelRequest withBody(java.nio.ByteBuffer body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The MIME type of the input data in the request. The default value is <code>application/json</code>.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the input data in the request. The default value is <code>application/json</code>.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The MIME type of the input data in the request. The default value is <code>application/json</code>.
     * </p>
     * 
     * @return The MIME type of the input data in the request. The default value is <code>application/json</code>.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The MIME type of the input data in the request. The default value is <code>application/json</code>.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the input data in the request. The default value is <code>application/json</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Identifier of the model.
     * </p>
     * 
     * @param modelId
     *        Identifier of the model.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * Identifier of the model.
     * </p>
     * 
     * @return Identifier of the model.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * Identifier of the model.
     * </p>
     * 
     * @param modelId
     *        Identifier of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelRequest withModelId(String modelId) {
        setModelId(modelId);
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
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append("***Sensitive Data Redacted***").append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeModelRequest == false)
            return false;
        InvokeModelRequest other = (InvokeModelRequest) obj;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        return hashCode;
    }

    @Override
    public InvokeModelRequest clone() {
        return (InvokeModelRequest) super.clone();
    }

}
