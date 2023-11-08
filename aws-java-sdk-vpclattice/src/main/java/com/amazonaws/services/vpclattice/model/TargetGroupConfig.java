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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of a target group. Lambda functions don't support target group configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/TargetGroupConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetGroupConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The health check configuration.
     * </p>
     */
    private HealthCheckConfig healthCheck;
    /**
     * <p>
     * The type of IP address used for the target group. The possible values are <code>ipv4</code> and <code>ipv6</code>
     * . This is an optional parameter. If not specified, the IP address type defaults to <code>ipv4</code>.
     * </p>
     */
    private String ipAddressType;
    /**
     * <p>
     * Lambda event structure version
     * </p>
     */
    private String lambdaEventStructureVersion;
    /**
     * <p>
     * The port on which the targets are listening. For HTTP, the default is <code>80</code>. For HTTPS, the default is
     * <code>443</code>
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The protocol to use for routing traffic to the targets. Default is the protocol of a target group.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The protocol version. Default value is <code>HTTP1</code>.
     * </p>
     */
    private String protocolVersion;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcIdentifier;

    /**
     * <p>
     * The health check configuration.
     * </p>
     * 
     * @param healthCheck
     *        The health check configuration.
     */

    public void setHealthCheck(HealthCheckConfig healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * The health check configuration.
     * </p>
     * 
     * @return The health check configuration.
     */

    public HealthCheckConfig getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * The health check configuration.
     * </p>
     * 
     * @param healthCheck
     *        The health check configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupConfig withHealthCheck(HealthCheckConfig healthCheck) {
        setHealthCheck(healthCheck);
        return this;
    }

    /**
     * <p>
     * The type of IP address used for the target group. The possible values are <code>ipv4</code> and <code>ipv6</code>
     * . This is an optional parameter. If not specified, the IP address type defaults to <code>ipv4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP address used for the target group. The possible values are <code>ipv4</code> and
     *        <code>ipv6</code>. This is an optional parameter. If not specified, the IP address type defaults to
     *        <code>ipv4</code>.
     * @see IpAddressType
     */

    public void setIpAddressType(String ipAddressType) {
        this.ipAddressType = ipAddressType;
    }

    /**
     * <p>
     * The type of IP address used for the target group. The possible values are <code>ipv4</code> and <code>ipv6</code>
     * . This is an optional parameter. If not specified, the IP address type defaults to <code>ipv4</code>.
     * </p>
     * 
     * @return The type of IP address used for the target group. The possible values are <code>ipv4</code> and
     *         <code>ipv6</code>. This is an optional parameter. If not specified, the IP address type defaults to
     *         <code>ipv4</code>.
     * @see IpAddressType
     */

    public String getIpAddressType() {
        return this.ipAddressType;
    }

    /**
     * <p>
     * The type of IP address used for the target group. The possible values are <code>ipv4</code> and <code>ipv6</code>
     * . This is an optional parameter. If not specified, the IP address type defaults to <code>ipv4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP address used for the target group. The possible values are <code>ipv4</code> and
     *        <code>ipv6</code>. This is an optional parameter. If not specified, the IP address type defaults to
     *        <code>ipv4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public TargetGroupConfig withIpAddressType(String ipAddressType) {
        setIpAddressType(ipAddressType);
        return this;
    }

    /**
     * <p>
     * The type of IP address used for the target group. The possible values are <code>ipv4</code> and <code>ipv6</code>
     * . This is an optional parameter. If not specified, the IP address type defaults to <code>ipv4</code>.
     * </p>
     * 
     * @param ipAddressType
     *        The type of IP address used for the target group. The possible values are <code>ipv4</code> and
     *        <code>ipv6</code>. This is an optional parameter. If not specified, the IP address type defaults to
     *        <code>ipv4</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressType
     */

    public TargetGroupConfig withIpAddressType(IpAddressType ipAddressType) {
        this.ipAddressType = ipAddressType.toString();
        return this;
    }

    /**
     * <p>
     * Lambda event structure version
     * </p>
     * 
     * @param lambdaEventStructureVersion
     *        Lambda event structure version
     * @see LambdaEventStructureVersion
     */

    public void setLambdaEventStructureVersion(String lambdaEventStructureVersion) {
        this.lambdaEventStructureVersion = lambdaEventStructureVersion;
    }

    /**
     * <p>
     * Lambda event structure version
     * </p>
     * 
     * @return Lambda event structure version
     * @see LambdaEventStructureVersion
     */

    public String getLambdaEventStructureVersion() {
        return this.lambdaEventStructureVersion;
    }

    /**
     * <p>
     * Lambda event structure version
     * </p>
     * 
     * @param lambdaEventStructureVersion
     *        Lambda event structure version
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaEventStructureVersion
     */

    public TargetGroupConfig withLambdaEventStructureVersion(String lambdaEventStructureVersion) {
        setLambdaEventStructureVersion(lambdaEventStructureVersion);
        return this;
    }

    /**
     * <p>
     * Lambda event structure version
     * </p>
     * 
     * @param lambdaEventStructureVersion
     *        Lambda event structure version
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaEventStructureVersion
     */

    public TargetGroupConfig withLambdaEventStructureVersion(LambdaEventStructureVersion lambdaEventStructureVersion) {
        this.lambdaEventStructureVersion = lambdaEventStructureVersion.toString();
        return this;
    }

    /**
     * <p>
     * The port on which the targets are listening. For HTTP, the default is <code>80</code>. For HTTPS, the default is
     * <code>443</code>
     * </p>
     * 
     * @param port
     *        The port on which the targets are listening. For HTTP, the default is <code>80</code>. For HTTPS, the
     *        default is <code>443</code>
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the targets are listening. For HTTP, the default is <code>80</code>. For HTTPS, the default is
     * <code>443</code>
     * </p>
     * 
     * @return The port on which the targets are listening. For HTTP, the default is <code>80</code>. For HTTPS, the
     *         default is <code>443</code>
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the targets are listening. For HTTP, the default is <code>80</code>. For HTTPS, the default is
     * <code>443</code>
     * </p>
     * 
     * @param port
     *        The port on which the targets are listening. For HTTP, the default is <code>80</code>. For HTTPS, the
     *        default is <code>443</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupConfig withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. Default is the protocol of a target group.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets. Default is the protocol of a target group.
     * @see TargetGroupProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. Default is the protocol of a target group.
     * </p>
     * 
     * @return The protocol to use for routing traffic to the targets. Default is the protocol of a target group.
     * @see TargetGroupProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. Default is the protocol of a target group.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets. Default is the protocol of a target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocol
     */

    public TargetGroupConfig withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol to use for routing traffic to the targets. Default is the protocol of a target group.
     * </p>
     * 
     * @param protocol
     *        The protocol to use for routing traffic to the targets. Default is the protocol of a target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocol
     */

    public TargetGroupConfig withProtocol(TargetGroupProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The protocol version. Default value is <code>HTTP1</code>.
     * </p>
     * 
     * @param protocolVersion
     *        The protocol version. Default value is <code>HTTP1</code>.
     * @see TargetGroupProtocolVersion
     */

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    /**
     * <p>
     * The protocol version. Default value is <code>HTTP1</code>.
     * </p>
     * 
     * @return The protocol version. Default value is <code>HTTP1</code>.
     * @see TargetGroupProtocolVersion
     */

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    /**
     * <p>
     * The protocol version. Default value is <code>HTTP1</code>.
     * </p>
     * 
     * @param protocolVersion
     *        The protocol version. Default value is <code>HTTP1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocolVersion
     */

    public TargetGroupConfig withProtocolVersion(String protocolVersion) {
        setProtocolVersion(protocolVersion);
        return this;
    }

    /**
     * <p>
     * The protocol version. Default value is <code>HTTP1</code>.
     * </p>
     * 
     * @param protocolVersion
     *        The protocol version. Default value is <code>HTTP1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupProtocolVersion
     */

    public TargetGroupConfig withProtocolVersion(TargetGroupProtocolVersion protocolVersion) {
        this.protocolVersion = protocolVersion.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcIdentifier
     *        The ID of the VPC.
     */

    public void setVpcIdentifier(String vpcIdentifier) {
        this.vpcIdentifier = vpcIdentifier;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcIdentifier() {
        return this.vpcIdentifier;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcIdentifier
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetGroupConfig withVpcIdentifier(String vpcIdentifier) {
        setVpcIdentifier(vpcIdentifier);
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
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck()).append(",");
        if (getIpAddressType() != null)
            sb.append("IpAddressType: ").append(getIpAddressType()).append(",");
        if (getLambdaEventStructureVersion() != null)
            sb.append("LambdaEventStructureVersion: ").append(getLambdaEventStructureVersion()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getProtocolVersion() != null)
            sb.append("ProtocolVersion: ").append(getProtocolVersion()).append(",");
        if (getVpcIdentifier() != null)
            sb.append("VpcIdentifier: ").append(getVpcIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetGroupConfig == false)
            return false;
        TargetGroupConfig other = (TargetGroupConfig) obj;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getIpAddressType() == null ^ this.getIpAddressType() == null)
            return false;
        if (other.getIpAddressType() != null && other.getIpAddressType().equals(this.getIpAddressType()) == false)
            return false;
        if (other.getLambdaEventStructureVersion() == null ^ this.getLambdaEventStructureVersion() == null)
            return false;
        if (other.getLambdaEventStructureVersion() != null && other.getLambdaEventStructureVersion().equals(this.getLambdaEventStructureVersion()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getProtocolVersion() == null ^ this.getProtocolVersion() == null)
            return false;
        if (other.getProtocolVersion() != null && other.getProtocolVersion().equals(this.getProtocolVersion()) == false)
            return false;
        if (other.getVpcIdentifier() == null ^ this.getVpcIdentifier() == null)
            return false;
        if (other.getVpcIdentifier() != null && other.getVpcIdentifier().equals(this.getVpcIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        hashCode = prime * hashCode + ((getIpAddressType() == null) ? 0 : getIpAddressType().hashCode());
        hashCode = prime * hashCode + ((getLambdaEventStructureVersion() == null) ? 0 : getLambdaEventStructureVersion().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getProtocolVersion() == null) ? 0 : getProtocolVersion().hashCode());
        hashCode = prime * hashCode + ((getVpcIdentifier() == null) ? 0 : getVpcIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public TargetGroupConfig clone() {
        try {
            return (TargetGroupConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.TargetGroupConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
