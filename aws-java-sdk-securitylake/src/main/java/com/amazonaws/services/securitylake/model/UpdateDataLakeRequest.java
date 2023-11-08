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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDataLake" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataLakeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the Region or Regions that will contribute data to the rollup region.
     * </p>
     */
    private java.util.List<DataLakeConfiguration> configurations;

    /**
     * <p>
     * Specify the Region or Regions that will contribute data to the rollup region.
     * </p>
     * 
     * @return Specify the Region or Regions that will contribute data to the rollup region.
     */

    public java.util.List<DataLakeConfiguration> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * Specify the Region or Regions that will contribute data to the rollup region.
     * </p>
     * 
     * @param configurations
     *        Specify the Region or Regions that will contribute data to the rollup region.
     */

    public void setConfigurations(java.util.Collection<DataLakeConfiguration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new java.util.ArrayList<DataLakeConfiguration>(configurations);
    }

    /**
     * <p>
     * Specify the Region or Regions that will contribute data to the rollup region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        Specify the Region or Regions that will contribute data to the rollup region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataLakeRequest withConfigurations(DataLakeConfiguration... configurations) {
        if (this.configurations == null) {
            setConfigurations(new java.util.ArrayList<DataLakeConfiguration>(configurations.length));
        }
        for (DataLakeConfiguration ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the Region or Regions that will contribute data to the rollup region.
     * </p>
     * 
     * @param configurations
     *        Specify the Region or Regions that will contribute data to the rollup region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataLakeRequest withConfigurations(java.util.Collection<DataLakeConfiguration> configurations) {
        setConfigurations(configurations);
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
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataLakeRequest == false)
            return false;
        UpdateDataLakeRequest other = (UpdateDataLakeRequest) obj;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataLakeRequest clone() {
        return (UpdateDataLakeRequest) super.clone();
    }

}
