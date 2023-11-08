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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a share.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ShareDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShareDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for a share offer for an analytics store .
     * </p>
     */
    private String shareId;
    /**
     * <p>
     * The resource Arn of the analytics store being shared.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The principal subscriber is the account the analytics store data is being shared with.
     * </p>
     */
    private String principalSubscriber;
    /**
     * <p>
     * The account ID for the data owner. The owner creates the share offer.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The status of a share.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for a share. It provides more details on the status of the share.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The name of the share.
     * </p>
     */
    private String shareName;
    /**
     * <p>
     * The timestamp for when the share was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The timestamp of the share update.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The ID for a share offer for an analytics store .
     * </p>
     * 
     * @param shareId
     *        The ID for a share offer for an analytics store .
     */

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    /**
     * <p>
     * The ID for a share offer for an analytics store .
     * </p>
     * 
     * @return The ID for a share offer for an analytics store .
     */

    public String getShareId() {
        return this.shareId;
    }

    /**
     * <p>
     * The ID for a share offer for an analytics store .
     * </p>
     * 
     * @param shareId
     *        The ID for a share offer for an analytics store .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withShareId(String shareId) {
        setShareId(shareId);
        return this;
    }

    /**
     * <p>
     * The resource Arn of the analytics store being shared.
     * </p>
     * 
     * @param resourceArn
     *        The resource Arn of the analytics store being shared.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The resource Arn of the analytics store being shared.
     * </p>
     * 
     * @return The resource Arn of the analytics store being shared.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The resource Arn of the analytics store being shared.
     * </p>
     * 
     * @param resourceArn
     *        The resource Arn of the analytics store being shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The principal subscriber is the account the analytics store data is being shared with.
     * </p>
     * 
     * @param principalSubscriber
     *        The principal subscriber is the account the analytics store data is being shared with.
     */

    public void setPrincipalSubscriber(String principalSubscriber) {
        this.principalSubscriber = principalSubscriber;
    }

    /**
     * <p>
     * The principal subscriber is the account the analytics store data is being shared with.
     * </p>
     * 
     * @return The principal subscriber is the account the analytics store data is being shared with.
     */

    public String getPrincipalSubscriber() {
        return this.principalSubscriber;
    }

    /**
     * <p>
     * The principal subscriber is the account the analytics store data is being shared with.
     * </p>
     * 
     * @param principalSubscriber
     *        The principal subscriber is the account the analytics store data is being shared with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withPrincipalSubscriber(String principalSubscriber) {
        setPrincipalSubscriber(principalSubscriber);
        return this;
    }

    /**
     * <p>
     * The account ID for the data owner. The owner creates the share offer.
     * </p>
     * 
     * @param ownerId
     *        The account ID for the data owner. The owner creates the share offer.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The account ID for the data owner. The owner creates the share offer.
     * </p>
     * 
     * @return The account ID for the data owner. The owner creates the share offer.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The account ID for the data owner. The owner creates the share offer.
     * </p>
     * 
     * @param ownerId
     *        The account ID for the data owner. The owner creates the share offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The status of a share.
     * </p>
     * 
     * @param status
     *        The status of a share.
     * @see ShareStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a share.
     * </p>
     * 
     * @return The status of a share.
     * @see ShareStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a share.
     * </p>
     * 
     * @param status
     *        The status of a share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public ShareDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a share.
     * </p>
     * 
     * @param status
     *        The status of a share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareStatus
     */

    public ShareDetails withStatus(ShareStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message for a share. It provides more details on the status of the share.
     * </p>
     * 
     * @param statusMessage
     *        The status message for a share. It provides more details on the status of the share.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for a share. It provides more details on the status of the share.
     * </p>
     * 
     * @return The status message for a share. It provides more details on the status of the share.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for a share. It provides more details on the status of the share.
     * </p>
     * 
     * @param statusMessage
     *        The status message for a share. It provides more details on the status of the share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The name of the share.
     * </p>
     * 
     * @param shareName
     *        The name of the share.
     */

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    /**
     * <p>
     * The name of the share.
     * </p>
     * 
     * @return The name of the share.
     */

    public String getShareName() {
        return this.shareName;
    }

    /**
     * <p>
     * The name of the share.
     * </p>
     * 
     * @param shareName
     *        The name of the share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withShareName(String shareName) {
        setShareName(shareName);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the share was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp for when the share was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp for when the share was created.
     * </p>
     * 
     * @return The timestamp for when the share was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp for when the share was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp for when the share was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of the share update.
     * </p>
     * 
     * @param updateTime
     *        The timestamp of the share update.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp of the share update.
     * </p>
     * 
     * @return The timestamp of the share update.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The timestamp of the share update.
     * </p>
     * 
     * @param updateTime
     *        The timestamp of the share update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareDetails withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getShareId() != null)
            sb.append("ShareId: ").append(getShareId()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPrincipalSubscriber() != null)
            sb.append("PrincipalSubscriber: ").append(getPrincipalSubscriber()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getShareName() != null)
            sb.append("ShareName: ").append(getShareName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareDetails == false)
            return false;
        ShareDetails other = (ShareDetails) obj;
        if (other.getShareId() == null ^ this.getShareId() == null)
            return false;
        if (other.getShareId() != null && other.getShareId().equals(this.getShareId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPrincipalSubscriber() == null ^ this.getPrincipalSubscriber() == null)
            return false;
        if (other.getPrincipalSubscriber() != null && other.getPrincipalSubscriber().equals(this.getPrincipalSubscriber()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getShareName() == null ^ this.getShareName() == null)
            return false;
        if (other.getShareName() != null && other.getShareName().equals(this.getShareName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareId() == null) ? 0 : getShareId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipalSubscriber() == null) ? 0 : getPrincipalSubscriber().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getShareName() == null) ? 0 : getShareName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public ShareDetails clone() {
        try {
            return (ShareDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ShareDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
