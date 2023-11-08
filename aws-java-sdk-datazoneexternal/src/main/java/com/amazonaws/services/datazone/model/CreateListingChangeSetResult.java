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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateListingChangeSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateListingChangeSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** <p/> */
    private String listingId;
    /** <p/> */
    private String listingRevision;
    /** <p/> */
    private String status;

    /**
     * <p/>
     * 
     * @param listingId
     */

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getListingId() {
        return this.listingId;
    }

    /**
     * <p/>
     * 
     * @param listingId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListingChangeSetResult withListingId(String listingId) {
        setListingId(listingId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param listingRevision
     */

    public void setListingRevision(String listingRevision) {
        this.listingRevision = listingRevision;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getListingRevision() {
        return this.listingRevision;
    }

    /**
     * <p/>
     * 
     * @param listingRevision
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListingChangeSetResult withListingRevision(String listingRevision) {
        setListingRevision(listingRevision);
        return this;
    }

    /**
     * <p/>
     * 
     * @param status
     * @see ListingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ListingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p/>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListingStatus
     */

    public CreateListingChangeSetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p/>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListingStatus
     */

    public CreateListingChangeSetResult withStatus(ListingStatus status) {
        this.status = status.toString();
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
        if (getListingId() != null)
            sb.append("ListingId: ").append(getListingId()).append(",");
        if (getListingRevision() != null)
            sb.append("ListingRevision: ").append(getListingRevision()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateListingChangeSetResult == false)
            return false;
        CreateListingChangeSetResult other = (CreateListingChangeSetResult) obj;
        if (other.getListingId() == null ^ this.getListingId() == null)
            return false;
        if (other.getListingId() != null && other.getListingId().equals(this.getListingId()) == false)
            return false;
        if (other.getListingRevision() == null ^ this.getListingRevision() == null)
            return false;
        if (other.getListingRevision() != null && other.getListingRevision().equals(this.getListingRevision()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListingId() == null) ? 0 : getListingId().hashCode());
        hashCode = prime * hashCode + ((getListingRevision() == null) ? 0 : getListingRevision().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateListingChangeSetResult clone() {
        try {
            return (CreateListingChangeSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
