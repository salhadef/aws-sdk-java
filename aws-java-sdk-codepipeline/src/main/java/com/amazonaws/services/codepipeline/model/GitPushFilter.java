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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The event criteria that specify when a specified repository event will start the pipeline for the specified trigger
 * configuration, such as the lists of Git tags to include and exclude.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/GitPushFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitPushFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field that contains the details for the Git tags trigger configuration.
     * </p>
     */
    private GitTagFilterCriteria tags;

    /**
     * <p>
     * The field that contains the details for the Git tags trigger configuration.
     * </p>
     * 
     * @param tags
     *        The field that contains the details for the Git tags trigger configuration.
     */

    public void setTags(GitTagFilterCriteria tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The field that contains the details for the Git tags trigger configuration.
     * </p>
     * 
     * @return The field that contains the details for the Git tags trigger configuration.
     */

    public GitTagFilterCriteria getTags() {
        return this.tags;
    }

    /**
     * <p>
     * The field that contains the details for the Git tags trigger configuration.
     * </p>
     * 
     * @param tags
     *        The field that contains the details for the Git tags trigger configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitPushFilter withTags(GitTagFilterCriteria tags) {
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

        if (obj instanceof GitPushFilter == false)
            return false;
        GitPushFilter other = (GitPushFilter) obj;
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

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GitPushFilter clone() {
        try {
            return (GitPushFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.GitPushFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
