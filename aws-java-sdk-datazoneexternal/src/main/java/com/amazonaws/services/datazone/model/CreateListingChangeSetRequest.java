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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateListingChangeSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateListingChangeSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private String action;
    /** <p/> */
    private String clientToken;
    /** <p/> */
    private String domainIdentifier;
    /** <p/> */
    private String entityIdentifier;
    /** <p/> */
    private String entityRevision;
    /** <p/> */
    private String entityType;

    /**
     * <p/>
     * 
     * @param action
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p/>
     * 
     * @param action
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public CreateListingChangeSetRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p/>
     * 
     * @param action
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public CreateListingChangeSetRequest withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param clientToken
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p/>
     * 
     * @param clientToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListingChangeSetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p/>
     * 
     * @param domainIdentifier
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p/>
     * 
     * @param domainIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListingChangeSetRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p/>
     * 
     * @param entityIdentifier
     */

    public void setEntityIdentifier(String entityIdentifier) {
        this.entityIdentifier = entityIdentifier;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getEntityIdentifier() {
        return this.entityIdentifier;
    }

    /**
     * <p/>
     * 
     * @param entityIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListingChangeSetRequest withEntityIdentifier(String entityIdentifier) {
        setEntityIdentifier(entityIdentifier);
        return this;
    }

    /**
     * <p/>
     * 
     * @param entityRevision
     */

    public void setEntityRevision(String entityRevision) {
        this.entityRevision = entityRevision;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getEntityRevision() {
        return this.entityRevision;
    }

    /**
     * <p/>
     * 
     * @param entityRevision
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListingChangeSetRequest withEntityRevision(String entityRevision) {
        setEntityRevision(entityRevision);
        return this;
    }

    /**
     * <p/>
     * 
     * @param entityType
     * @see EntityType
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p/>
     * 
     * @return
     * @see EntityType
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p/>
     * 
     * @param entityType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public CreateListingChangeSetRequest withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param entityType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public CreateListingChangeSetRequest withEntityType(EntityType entityType) {
        this.entityType = entityType.toString();
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEntityIdentifier() != null)
            sb.append("EntityIdentifier: ").append(getEntityIdentifier()).append(",");
        if (getEntityRevision() != null)
            sb.append("EntityRevision: ").append(getEntityRevision()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateListingChangeSetRequest == false)
            return false;
        CreateListingChangeSetRequest other = (CreateListingChangeSetRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEntityIdentifier() == null ^ this.getEntityIdentifier() == null)
            return false;
        if (other.getEntityIdentifier() != null && other.getEntityIdentifier().equals(this.getEntityIdentifier()) == false)
            return false;
        if (other.getEntityRevision() == null ^ this.getEntityRevision() == null)
            return false;
        if (other.getEntityRevision() != null && other.getEntityRevision().equals(this.getEntityRevision()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEntityIdentifier() == null) ? 0 : getEntityIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEntityRevision() == null) ? 0 : getEntityRevision().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        return hashCode;
    }

    @Override
    public CreateListingChangeSetRequest clone() {
        return (CreateListingChangeSetRequest) super.clone();
    }

}
