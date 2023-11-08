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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListProvisionedModelThroughputs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProvisionedModelThroughputsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Return provisioned capacities created after the specified time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Return provisioned capacities created before the specified time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Return the list of provisioned capacities that match the specified status.
     * </p>
     */
    private String statusEquals;
    /**
     * <p>
     * Return the list of provisioned capacities where their model ARN is equal to this parameter.
     * </p>
     */
    private String modelArnEquals;
    /**
     * <p>
     * Return the list of provisioned capacities if their name contains these characters.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * THe maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Continuation token from the previous response, for Bedrock to list the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The field to sort by in the returned list of provisioned capacities.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order of the results.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * Return provisioned capacities created after the specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Return provisioned capacities created after the specified time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Return provisioned capacities created after the specified time.
     * </p>
     * 
     * @return Return provisioned capacities created after the specified time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Return provisioned capacities created after the specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Return provisioned capacities created after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedModelThroughputsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Return provisioned capacities created before the specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Return provisioned capacities created before the specified time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Return provisioned capacities created before the specified time.
     * </p>
     * 
     * @return Return provisioned capacities created before the specified time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Return provisioned capacities created before the specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Return provisioned capacities created before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedModelThroughputsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Return the list of provisioned capacities that match the specified status.
     * </p>
     * 
     * @param statusEquals
     *        Return the list of provisioned capacities that match the specified status.
     * @see ProvisionedModelStatus
     */

    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * Return the list of provisioned capacities that match the specified status.
     * </p>
     * 
     * @return Return the list of provisioned capacities that match the specified status.
     * @see ProvisionedModelStatus
     */

    public String getStatusEquals() {
        return this.statusEquals;
    }

    /**
     * <p>
     * Return the list of provisioned capacities that match the specified status.
     * </p>
     * 
     * @param statusEquals
     *        Return the list of provisioned capacities that match the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedModelStatus
     */

    public ListProvisionedModelThroughputsRequest withStatusEquals(String statusEquals) {
        setStatusEquals(statusEquals);
        return this;
    }

    /**
     * <p>
     * Return the list of provisioned capacities that match the specified status.
     * </p>
     * 
     * @param statusEquals
     *        Return the list of provisioned capacities that match the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedModelStatus
     */

    public ListProvisionedModelThroughputsRequest withStatusEquals(ProvisionedModelStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * Return the list of provisioned capacities where their model ARN is equal to this parameter.
     * </p>
     * 
     * @param modelArnEquals
     *        Return the list of provisioned capacities where their model ARN is equal to this parameter.
     */

    public void setModelArnEquals(String modelArnEquals) {
        this.modelArnEquals = modelArnEquals;
    }

    /**
     * <p>
     * Return the list of provisioned capacities where their model ARN is equal to this parameter.
     * </p>
     * 
     * @return Return the list of provisioned capacities where their model ARN is equal to this parameter.
     */

    public String getModelArnEquals() {
        return this.modelArnEquals;
    }

    /**
     * <p>
     * Return the list of provisioned capacities where their model ARN is equal to this parameter.
     * </p>
     * 
     * @param modelArnEquals
     *        Return the list of provisioned capacities where their model ARN is equal to this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedModelThroughputsRequest withModelArnEquals(String modelArnEquals) {
        setModelArnEquals(modelArnEquals);
        return this;
    }

    /**
     * <p>
     * Return the list of provisioned capacities if their name contains these characters.
     * </p>
     * 
     * @param nameContains
     *        Return the list of provisioned capacities if their name contains these characters.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Return the list of provisioned capacities if their name contains these characters.
     * </p>
     * 
     * @return Return the list of provisioned capacities if their name contains these characters.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Return the list of provisioned capacities if their name contains these characters.
     * </p>
     * 
     * @param nameContains
     *        Return the list of provisioned capacities if their name contains these characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedModelThroughputsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * THe maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        THe maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * THe maximum number of results to return in the response.
     * </p>
     * 
     * @return THe maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * THe maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        THe maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedModelThroughputsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Continuation token from the previous response, for Bedrock to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Continuation token from the previous response, for Bedrock to list the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Continuation token from the previous response, for Bedrock to list the next set of results.
     * </p>
     * 
     * @return Continuation token from the previous response, for Bedrock to list the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Continuation token from the previous response, for Bedrock to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Continuation token from the previous response, for Bedrock to list the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedModelThroughputsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The field to sort by in the returned list of provisioned capacities.
     * </p>
     * 
     * @param sortBy
     *        The field to sort by in the returned list of provisioned capacities.
     * @see SortByProvisionedModels
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The field to sort by in the returned list of provisioned capacities.
     * </p>
     * 
     * @return The field to sort by in the returned list of provisioned capacities.
     * @see SortByProvisionedModels
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The field to sort by in the returned list of provisioned capacities.
     * </p>
     * 
     * @param sortBy
     *        The field to sort by in the returned list of provisioned capacities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortByProvisionedModels
     */

    public ListProvisionedModelThroughputsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The field to sort by in the returned list of provisioned capacities.
     * </p>
     * 
     * @param sortBy
     *        The field to sort by in the returned list of provisioned capacities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortByProvisionedModels
     */

    public ListProvisionedModelThroughputsRequest withSortBy(SortByProvisionedModels sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order of the results.
     * </p>
     * 
     * @param sortOrder
     *        The sort order of the results.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order of the results.
     * </p>
     * 
     * @return The sort order of the results.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order of the results.
     * </p>
     * 
     * @param sortOrder
     *        The sort order of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListProvisionedModelThroughputsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order of the results.
     * </p>
     * 
     * @param sortOrder
     *        The sort order of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListProvisionedModelThroughputsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: ").append(getStatusEquals()).append(",");
        if (getModelArnEquals() != null)
            sb.append("ModelArnEquals: ").append(getModelArnEquals()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProvisionedModelThroughputsRequest == false)
            return false;
        ListProvisionedModelThroughputsRequest other = (ListProvisionedModelThroughputsRequest) obj;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null && other.getStatusEquals().equals(this.getStatusEquals()) == false)
            return false;
        if (other.getModelArnEquals() == null ^ this.getModelArnEquals() == null)
            return false;
        if (other.getModelArnEquals() != null && other.getModelArnEquals().equals(this.getModelArnEquals()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getModelArnEquals() == null) ? 0 : getModelArnEquals().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListProvisionedModelThroughputsRequest clone() {
        return (ListProvisionedModelThroughputsRequest) super.clone();
    }

}
