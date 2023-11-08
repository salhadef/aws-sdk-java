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
package com.amazonaws.services.managedblockchainquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The container for the properties of a transaction event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-query-2023-05-04/TransactionEvent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactionEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     */
    private String network;
    /**
     * <p>
     * The hash of the transaction. It is generated whenever a transaction is verified and added to the blockchain.
     * </p>
     */
    private String transactionHash;
    /**
     * <p>
     * The type of transaction event.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The wallet address initiating the transaction. It can either be a public key or a contract.
     * </p>
     */
    private String from;
    /**
     * <p>
     * The wallet address receiving the transaction. It can either be a public key or a contract.
     * </p>
     */
    private String to;
    /**
     * <p>
     * The value that was transacted.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The blockchain address. for the contract
     * </p>
     */
    private String contractAddress;
    /**
     * <p>
     * The unique identifier for the token involved in the transaction.
     * </p>
     */
    private String tokenId;
    /**
     * <p>
     * The unique identifier of the transaction. It is generated whenever a transaction is verified and added to the
     * blockchain.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * The position of the vout in the transaction output list.
     * </p>
     */
    private Integer voutIndex;

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transaction occurred.
     * @see QueryNetwork
     */

    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     * 
     * @return The blockchain network where the transaction occurred.
     * @see QueryNetwork
     */

    public String getNetwork() {
        return this.network;
    }

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transaction occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public TransactionEvent withNetwork(String network) {
        setNetwork(network);
        return this;
    }

    /**
     * <p>
     * The blockchain network where the transaction occurred.
     * </p>
     * 
     * @param network
     *        The blockchain network where the transaction occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryNetwork
     */

    public TransactionEvent withNetwork(QueryNetwork network) {
        this.network = network.toString();
        return this;
    }

    /**
     * <p>
     * The hash of the transaction. It is generated whenever a transaction is verified and added to the blockchain.
     * </p>
     * 
     * @param transactionHash
     *        The hash of the transaction. It is generated whenever a transaction is verified and added to the
     *        blockchain.
     */

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    /**
     * <p>
     * The hash of the transaction. It is generated whenever a transaction is verified and added to the blockchain.
     * </p>
     * 
     * @return The hash of the transaction. It is generated whenever a transaction is verified and added to the
     *         blockchain.
     */

    public String getTransactionHash() {
        return this.transactionHash;
    }

    /**
     * <p>
     * The hash of the transaction. It is generated whenever a transaction is verified and added to the blockchain.
     * </p>
     * 
     * @param transactionHash
     *        The hash of the transaction. It is generated whenever a transaction is verified and added to the
     *        blockchain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionEvent withTransactionHash(String transactionHash) {
        setTransactionHash(transactionHash);
        return this;
    }

    /**
     * <p>
     * The type of transaction event.
     * </p>
     * 
     * @param eventType
     *        The type of transaction event.
     * @see QueryTransactionEventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of transaction event.
     * </p>
     * 
     * @return The type of transaction event.
     * @see QueryTransactionEventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of transaction event.
     * </p>
     * 
     * @param eventType
     *        The type of transaction event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryTransactionEventType
     */

    public TransactionEvent withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The type of transaction event.
     * </p>
     * 
     * @param eventType
     *        The type of transaction event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryTransactionEventType
     */

    public TransactionEvent withEventType(QueryTransactionEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The wallet address initiating the transaction. It can either be a public key or a contract.
     * </p>
     * 
     * @param from
     *        The wallet address initiating the transaction. It can either be a public key or a contract.
     */

    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * The wallet address initiating the transaction. It can either be a public key or a contract.
     * </p>
     * 
     * @return The wallet address initiating the transaction. It can either be a public key or a contract.
     */

    public String getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The wallet address initiating the transaction. It can either be a public key or a contract.
     * </p>
     * 
     * @param from
     *        The wallet address initiating the transaction. It can either be a public key or a contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionEvent withFrom(String from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The wallet address receiving the transaction. It can either be a public key or a contract.
     * </p>
     * 
     * @param to
     *        The wallet address receiving the transaction. It can either be a public key or a contract.
     */

    public void setTo(String to) {
        this.to = to;
    }

    /**
     * <p>
     * The wallet address receiving the transaction. It can either be a public key or a contract.
     * </p>
     * 
     * @return The wallet address receiving the transaction. It can either be a public key or a contract.
     */

    public String getTo() {
        return this.to;
    }

    /**
     * <p>
     * The wallet address receiving the transaction. It can either be a public key or a contract.
     * </p>
     * 
     * @param to
     *        The wallet address receiving the transaction. It can either be a public key or a contract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionEvent withTo(String to) {
        setTo(to);
        return this;
    }

    /**
     * <p>
     * The value that was transacted.
     * </p>
     * 
     * @param value
     *        The value that was transacted.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value that was transacted.
     * </p>
     * 
     * @return The value that was transacted.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value that was transacted.
     * </p>
     * 
     * @param value
     *        The value that was transacted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionEvent withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The blockchain address. for the contract
     * </p>
     * 
     * @param contractAddress
     *        The blockchain address. for the contract
     */

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    /**
     * <p>
     * The blockchain address. for the contract
     * </p>
     * 
     * @return The blockchain address. for the contract
     */

    public String getContractAddress() {
        return this.contractAddress;
    }

    /**
     * <p>
     * The blockchain address. for the contract
     * </p>
     * 
     * @param contractAddress
     *        The blockchain address. for the contract
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionEvent withContractAddress(String contractAddress) {
        setContractAddress(contractAddress);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the token involved in the transaction.
     * </p>
     * 
     * @param tokenId
     *        The unique identifier for the token involved in the transaction.
     */

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * <p>
     * The unique identifier for the token involved in the transaction.
     * </p>
     * 
     * @return The unique identifier for the token involved in the transaction.
     */

    public String getTokenId() {
        return this.tokenId;
    }

    /**
     * <p>
     * The unique identifier for the token involved in the transaction.
     * </p>
     * 
     * @param tokenId
     *        The unique identifier for the token involved in the transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionEvent withTokenId(String tokenId) {
        setTokenId(tokenId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the transaction. It is generated whenever a transaction is verified and added to the
     * blockchain.
     * </p>
     * 
     * @param transactionId
     *        The unique identifier of the transaction. It is generated whenever a transaction is verified and added to
     *        the blockchain.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The unique identifier of the transaction. It is generated whenever a transaction is verified and added to the
     * blockchain.
     * </p>
     * 
     * @return The unique identifier of the transaction. It is generated whenever a transaction is verified and added to
     *         the blockchain.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The unique identifier of the transaction. It is generated whenever a transaction is verified and added to the
     * blockchain.
     * </p>
     * 
     * @param transactionId
     *        The unique identifier of the transaction. It is generated whenever a transaction is verified and added to
     *        the blockchain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionEvent withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * The position of the vout in the transaction output list.
     * </p>
     * 
     * @param voutIndex
     *        The position of the vout in the transaction output list.
     */

    public void setVoutIndex(Integer voutIndex) {
        this.voutIndex = voutIndex;
    }

    /**
     * <p>
     * The position of the vout in the transaction output list.
     * </p>
     * 
     * @return The position of the vout in the transaction output list.
     */

    public Integer getVoutIndex() {
        return this.voutIndex;
    }

    /**
     * <p>
     * The position of the vout in the transaction output list.
     * </p>
     * 
     * @param voutIndex
     *        The position of the vout in the transaction output list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransactionEvent withVoutIndex(Integer voutIndex) {
        setVoutIndex(voutIndex);
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
        if (getNetwork() != null)
            sb.append("Network: ").append(getNetwork()).append(",");
        if (getTransactionHash() != null)
            sb.append("TransactionHash: ").append(getTransactionHash()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getTo() != null)
            sb.append("To: ").append(getTo()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getContractAddress() != null)
            sb.append("ContractAddress: ").append(getContractAddress()).append(",");
        if (getTokenId() != null)
            sb.append("TokenId: ").append(getTokenId()).append(",");
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
        if (getVoutIndex() != null)
            sb.append("VoutIndex: ").append(getVoutIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactionEvent == false)
            return false;
        TransactionEvent other = (TransactionEvent) obj;
        if (other.getNetwork() == null ^ this.getNetwork() == null)
            return false;
        if (other.getNetwork() != null && other.getNetwork().equals(this.getNetwork()) == false)
            return false;
        if (other.getTransactionHash() == null ^ this.getTransactionHash() == null)
            return false;
        if (other.getTransactionHash() != null && other.getTransactionHash().equals(this.getTransactionHash()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getContractAddress() == null ^ this.getContractAddress() == null)
            return false;
        if (other.getContractAddress() != null && other.getContractAddress().equals(this.getContractAddress()) == false)
            return false;
        if (other.getTokenId() == null ^ this.getTokenId() == null)
            return false;
        if (other.getTokenId() != null && other.getTokenId().equals(this.getTokenId()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getVoutIndex() == null ^ this.getVoutIndex() == null)
            return false;
        if (other.getVoutIndex() != null && other.getVoutIndex().equals(this.getVoutIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetwork() == null) ? 0 : getNetwork().hashCode());
        hashCode = prime * hashCode + ((getTransactionHash() == null) ? 0 : getTransactionHash().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getContractAddress() == null) ? 0 : getContractAddress().hashCode());
        hashCode = prime * hashCode + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getVoutIndex() == null) ? 0 : getVoutIndex().hashCode());
        return hashCode;
    }

    @Override
    public TransactionEvent clone() {
        try {
            return (TransactionEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchainquery.model.transform.TransactionEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
