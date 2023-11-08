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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Reserved for future use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/ProvidedContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvidedContext implements Serializable, Cloneable {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String providerArn;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String contextAssertion;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param providerArn
     *        Reserved for future use.
     */

    public void setProviderArn(String providerArn) {
        this.providerArn = providerArn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getProviderArn() {
        return this.providerArn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param providerArn
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvidedContext withProviderArn(String providerArn) {
        setProviderArn(providerArn);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param contextAssertion
     *        Reserved for future use.
     */

    public void setContextAssertion(String contextAssertion) {
        this.contextAssertion = contextAssertion;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getContextAssertion() {
        return this.contextAssertion;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param contextAssertion
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvidedContext withContextAssertion(String contextAssertion) {
        setContextAssertion(contextAssertion);
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
        if (getProviderArn() != null)
            sb.append("ProviderArn: ").append(getProviderArn()).append(",");
        if (getContextAssertion() != null)
            sb.append("ContextAssertion: ").append(getContextAssertion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvidedContext == false)
            return false;
        ProvidedContext other = (ProvidedContext) obj;
        if (other.getProviderArn() == null ^ this.getProviderArn() == null)
            return false;
        if (other.getProviderArn() != null && other.getProviderArn().equals(this.getProviderArn()) == false)
            return false;
        if (other.getContextAssertion() == null ^ this.getContextAssertion() == null)
            return false;
        if (other.getContextAssertion() != null && other.getContextAssertion().equals(this.getContextAssertion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderArn() == null) ? 0 : getProviderArn().hashCode());
        hashCode = prime * hashCode + ((getContextAssertion() == null) ? 0 : getContextAssertion().hashCode());
        return hashCode;
    }

    @Override
    public ProvidedContext clone() {
        try {
            return (ProvidedContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
