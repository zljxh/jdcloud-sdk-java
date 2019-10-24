/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * instance
 */
public class Instance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云物理服务器实例ID
     */
    private String instanceId;

    /**
     * 区域代码, 如 cn-east-tz1
     */
    private String region;

    /**
     * 可用区, 如 cn-east-tz1a
     */
    private String az;

    /**
     * 实例类型, 如 edcps.c.normal1
     */
    private String deviceType;

    /**
     * 云物理服务器名称
     */
    private String name;

    /**
     * 云物理服务器描述
     */
    private String description;

    /**
     * 云物理服务器生命周期状态
     */
    private String status;

    /**
     * 是否启用外网, 如 yes/no
     */
    private String enableInternet;

    /**
     * 是否启用IPv6, 如 yes/no
     */
    private String enableIpv6;

    /**
     * 带宽, 单位Mbps
     */
    private Integer bandwidth;

    /**
     * 额外上行带宽, 单位Mbps
     */
    private Integer extraUplinkBandwidth;

    /**
     * 镜像类型, 如 standard
     */
    private String imageType;

    /**
     * 操作系统类型ID
     */
    private String osTypeId;

    /**
     * 操作系统名称
     */
    private String osName;

    /**
     * 操作系统类型, 如 ubuntu/centos
     */
    private String osType;

    /**
     * 操作系统版本, 如 16.04
     */
    private String osVersion;

    /**
     * 系统盘RAID类型ID
     */
    private String sysRaidTypeId;

    /**
     * 系统盘RAID类型, 如 NORAID, RAID0, RAID1
     */
    private String sysRaidType;

    /**
     * 数据盘RAID类型ID
     */
    private String dataRaidTypeId;

    /**
     * 数据盘RAID类型, 如 NORAID, RAID0, RAID1
     */
    private String dataRaidType;

    /**
     * 网络类型, 如 basic, vpc
     */
    private String networkType;

    /**
     * 私有网络ID
     */
    private String vpcId;

    /**
     * 私有网络名称
     */
    private String vpcName;

    /**
     * 子网编号
     */
    private String subnetId;

    /**
     * 子网名称
     */
    private String subnetName;

    /**
     * 内网IP
     */
    private String privateIp;

    /**
     * 外网链路类型, 如 bgp
     */
    private String lineType;

    /**
     * 弹性公网IPID
     */
    private String elasticIpId;

    /**
     * 公网IP
     */
    private String publicIp;

    /**
     * 公网IPv6
     */
    private String publicIpv6;

    /**
     * 密钥对id
     */
    private String keypairId;

    /**
     * agent状态
     */
    private String agentStatus;

    /**
     * 计费信息
     */
    private Charge charge;


    /**
     * get 云物理服务器实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云物理服务器实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 区域代码, 如 cn-east-tz1
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 区域代码, 如 cn-east-tz1
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 可用区, 如 cn-east-tz1a
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区, 如 cn-east-tz1a
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 实例类型, 如 edcps.c.normal1
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 实例类型, 如 edcps.c.normal1
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * get 云物理服务器名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 云物理服务器名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 云物理服务器描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 云物理服务器描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 云物理服务器生命周期状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 云物理服务器生命周期状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 是否启用外网, 如 yes/no
     *
     * @return
     */
    public String getEnableInternet() {
        return enableInternet;
    }

    /**
     * set 是否启用外网, 如 yes/no
     *
     * @param enableInternet
     */
    public void setEnableInternet(String enableInternet) {
        this.enableInternet = enableInternet;
    }

    /**
     * get 是否启用IPv6, 如 yes/no
     *
     * @return
     */
    public String getEnableIpv6() {
        return enableIpv6;
    }

    /**
     * set 是否启用IPv6, 如 yes/no
     *
     * @param enableIpv6
     */
    public void setEnableIpv6(String enableIpv6) {
        this.enableIpv6 = enableIpv6;
    }

    /**
     * get 带宽, 单位Mbps
     *
     * @return
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * set 带宽, 单位Mbps
     *
     * @param bandwidth
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * get 额外上行带宽, 单位Mbps
     *
     * @return
     */
    public Integer getExtraUplinkBandwidth() {
        return extraUplinkBandwidth;
    }

    /**
     * set 额外上行带宽, 单位Mbps
     *
     * @param extraUplinkBandwidth
     */
    public void setExtraUplinkBandwidth(Integer extraUplinkBandwidth) {
        this.extraUplinkBandwidth = extraUplinkBandwidth;
    }

    /**
     * get 镜像类型, 如 standard
     *
     * @return
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * set 镜像类型, 如 standard
     *
     * @param imageType
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    /**
     * get 操作系统类型ID
     *
     * @return
     */
    public String getOsTypeId() {
        return osTypeId;
    }

    /**
     * set 操作系统类型ID
     *
     * @param osTypeId
     */
    public void setOsTypeId(String osTypeId) {
        this.osTypeId = osTypeId;
    }

    /**
     * get 操作系统名称
     *
     * @return
     */
    public String getOsName() {
        return osName;
    }

    /**
     * set 操作系统名称
     *
     * @param osName
     */
    public void setOsName(String osName) {
        this.osName = osName;
    }

    /**
     * get 操作系统类型, 如 ubuntu/centos
     *
     * @return
     */
    public String getOsType() {
        return osType;
    }

    /**
     * set 操作系统类型, 如 ubuntu/centos
     *
     * @param osType
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * get 操作系统版本, 如 16.04
     *
     * @return
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * set 操作系统版本, 如 16.04
     *
     * @param osVersion
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * get 系统盘RAID类型ID
     *
     * @return
     */
    public String getSysRaidTypeId() {
        return sysRaidTypeId;
    }

    /**
     * set 系统盘RAID类型ID
     *
     * @param sysRaidTypeId
     */
    public void setSysRaidTypeId(String sysRaidTypeId) {
        this.sysRaidTypeId = sysRaidTypeId;
    }

    /**
     * get 系统盘RAID类型, 如 NORAID, RAID0, RAID1
     *
     * @return
     */
    public String getSysRaidType() {
        return sysRaidType;
    }

    /**
     * set 系统盘RAID类型, 如 NORAID, RAID0, RAID1
     *
     * @param sysRaidType
     */
    public void setSysRaidType(String sysRaidType) {
        this.sysRaidType = sysRaidType;
    }

    /**
     * get 数据盘RAID类型ID
     *
     * @return
     */
    public String getDataRaidTypeId() {
        return dataRaidTypeId;
    }

    /**
     * set 数据盘RAID类型ID
     *
     * @param dataRaidTypeId
     */
    public void setDataRaidTypeId(String dataRaidTypeId) {
        this.dataRaidTypeId = dataRaidTypeId;
    }

    /**
     * get 数据盘RAID类型, 如 NORAID, RAID0, RAID1
     *
     * @return
     */
    public String getDataRaidType() {
        return dataRaidType;
    }

    /**
     * set 数据盘RAID类型, 如 NORAID, RAID0, RAID1
     *
     * @param dataRaidType
     */
    public void setDataRaidType(String dataRaidType) {
        this.dataRaidType = dataRaidType;
    }

    /**
     * get 网络类型, 如 basic, vpc
     *
     * @return
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * set 网络类型, 如 basic, vpc
     *
     * @param networkType
     */
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * get 私有网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 私有网络名称
     *
     * @return
     */
    public String getVpcName() {
        return vpcName;
    }

    /**
     * set 私有网络名称
     *
     * @param vpcName
     */
    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    /**
     * get 子网编号
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网编号
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 子网名称
     *
     * @return
     */
    public String getSubnetName() {
        return subnetName;
    }

    /**
     * set 子网名称
     *
     * @param subnetName
     */
    public void setSubnetName(String subnetName) {
        this.subnetName = subnetName;
    }

    /**
     * get 内网IP
     *
     * @return
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * set 内网IP
     *
     * @param privateIp
     */
    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    /**
     * get 外网链路类型, 如 bgp
     *
     * @return
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * set 外网链路类型, 如 bgp
     *
     * @param lineType
     */
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    /**
     * get 弹性公网IPID
     *
     * @return
     */
    public String getElasticIpId() {
        return elasticIpId;
    }

    /**
     * set 弹性公网IPID
     *
     * @param elasticIpId
     */
    public void setElasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
    }

    /**
     * get 公网IP
     *
     * @return
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * set 公网IP
     *
     * @param publicIp
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * get 公网IPv6
     *
     * @return
     */
    public String getPublicIpv6() {
        return publicIpv6;
    }

    /**
     * set 公网IPv6
     *
     * @param publicIpv6
     */
    public void setPublicIpv6(String publicIpv6) {
        this.publicIpv6 = publicIpv6;
    }

    /**
     * get 密钥对id
     *
     * @return
     */
    public String getKeypairId() {
        return keypairId;
    }

    /**
     * set 密钥对id
     *
     * @param keypairId
     */
    public void setKeypairId(String keypairId) {
        this.keypairId = keypairId;
    }

    /**
     * get agent状态
     *
     * @return
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    /**
     * set agent状态
     *
     * @param agentStatus
     */
    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    /**
     * get 计费信息
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }


    /**
     * set 云物理服务器实例ID
     *
     * @param instanceId
     */
    public Instance instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 区域代码, 如 cn-east-tz1
     *
     * @param region
     */
    public Instance region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 可用区, 如 cn-east-tz1a
     *
     * @param az
     */
    public Instance az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 实例类型, 如 edcps.c.normal1
     *
     * @param deviceType
     */
    public Instance deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * set 云物理服务器名称
     *
     * @param name
     */
    public Instance name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 云物理服务器描述
     *
     * @param description
     */
    public Instance description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 云物理服务器生命周期状态
     *
     * @param status
     */
    public Instance status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 是否启用外网, 如 yes/no
     *
     * @param enableInternet
     */
    public Instance enableInternet(String enableInternet) {
        this.enableInternet = enableInternet;
        return this;
    }

    /**
     * set 是否启用IPv6, 如 yes/no
     *
     * @param enableIpv6
     */
    public Instance enableIpv6(String enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    /**
     * set 带宽, 单位Mbps
     *
     * @param bandwidth
     */
    public Instance bandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set 额外上行带宽, 单位Mbps
     *
     * @param extraUplinkBandwidth
     */
    public Instance extraUplinkBandwidth(Integer extraUplinkBandwidth) {
        this.extraUplinkBandwidth = extraUplinkBandwidth;
        return this;
    }

    /**
     * set 镜像类型, 如 standard
     *
     * @param imageType
     */
    public Instance imageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * set 操作系统类型ID
     *
     * @param osTypeId
     */
    public Instance osTypeId(String osTypeId) {
        this.osTypeId = osTypeId;
        return this;
    }

    /**
     * set 操作系统名称
     *
     * @param osName
     */
    public Instance osName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * set 操作系统类型, 如 ubuntu/centos
     *
     * @param osType
     */
    public Instance osType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set 操作系统版本, 如 16.04
     *
     * @param osVersion
     */
    public Instance osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * set 系统盘RAID类型ID
     *
     * @param sysRaidTypeId
     */
    public Instance sysRaidTypeId(String sysRaidTypeId) {
        this.sysRaidTypeId = sysRaidTypeId;
        return this;
    }

    /**
     * set 系统盘RAID类型, 如 NORAID, RAID0, RAID1
     *
     * @param sysRaidType
     */
    public Instance sysRaidType(String sysRaidType) {
        this.sysRaidType = sysRaidType;
        return this;
    }

    /**
     * set 数据盘RAID类型ID
     *
     * @param dataRaidTypeId
     */
    public Instance dataRaidTypeId(String dataRaidTypeId) {
        this.dataRaidTypeId = dataRaidTypeId;
        return this;
    }

    /**
     * set 数据盘RAID类型, 如 NORAID, RAID0, RAID1
     *
     * @param dataRaidType
     */
    public Instance dataRaidType(String dataRaidType) {
        this.dataRaidType = dataRaidType;
        return this;
    }

    /**
     * set 网络类型, 如 basic, vpc
     *
     * @param networkType
     */
    public Instance networkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public Instance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 私有网络名称
     *
     * @param vpcName
     */
    public Instance vpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set 子网编号
     *
     * @param subnetId
     */
    public Instance subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 子网名称
     *
     * @param subnetName
     */
    public Instance subnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }

    /**
     * set 内网IP
     *
     * @param privateIp
     */
    public Instance privateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * set 外网链路类型, 如 bgp
     *
     * @param lineType
     */
    public Instance lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    /**
     * set 弹性公网IPID
     *
     * @param elasticIpId
     */
    public Instance elasticIpId(String elasticIpId) {
        this.elasticIpId = elasticIpId;
        return this;
    }

    /**
     * set 公网IP
     *
     * @param publicIp
     */
    public Instance publicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * set 公网IPv6
     *
     * @param publicIpv6
     */
    public Instance publicIpv6(String publicIpv6) {
        this.publicIpv6 = publicIpv6;
        return this;
    }

    /**
     * set 密钥对id
     *
     * @param keypairId
     */
    public Instance keypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    /**
     * set agent状态
     *
     * @param agentStatus
     */
    public Instance agentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public Instance charge(Charge charge) {
        this.charge = charge;
        return this;
    }


}