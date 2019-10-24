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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * instanceSpec
 */
public class InstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 可用区, 如 cn-east-tz1
     * Required:true
     */
    @Required
    private String az;

    /**
     * 实例类型, 如 edcps.c.normal1
     * Required:true
     */
    @Required
    private String deviceType;

    /**
     * 主机名
     */
    private String hostname;

    /**
     * 镜像类型, 取值范围：standard
     * Required:true
     */
    @Required
    private String imageType;

    /**
     * 操作系统类型ID
     * Required:true
     */
    @Required
    private String osTypeId;

    /**
     * 系统盘RAID类型ID
     * Required:true
     */
    @Required
    private String sysRaidTypeId;

    /**
     * 数据盘RAID类型ID
     * Required:true
     */
    @Required
    private String dataRaidTypeId;

    /**
     * 子网编号
     */
    private String subnetId;

    /**
     * 是否启用外网，取值范围：yes、no
     */
    private String enableInternet;

    /**
     * 网络类型，取值范围：vpc
     * Required:true
     */
    @Required
    private String networkType;

    /**
     * 网络CIDR
     */
    private String cidr;

    /**
     * 内网IP
     */
    private String privateIp;

    /**
     * 外网链路类型, 目前支持联通un、电信ct、移动cm
     */
    private String lineType;

    /**
     * 外网带宽, 范围[1,10240] 单位Mbps
     */
    private Integer bandwidth;

    /**
     * 额外上行带宽, 范围[0,10240] 单位Mbps
     */
    private Integer extraUplinkBandwidth;

    /**
     * 云物理服务器名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 云物理服务器描述
     */
    private String description;

    /**
     * 密码，不传值会随机生成密码
     */
    private String password;

    /**
     * 购买数量
     * Required:true
     */
    @Required
    private Integer count;

    /**
     * 可执行脚本Base64编码后的内容，支持shell和python脚本
     */
    private String userData;

    /**
     * 密钥对id
     */
    private String keypairId;

    /**
     * 计费配置
     * Required:true
     */
    @Required
    private ChargeSpec charge;


    /**
     * get 可用区, 如 cn-east-tz1
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区, 如 cn-east-tz1
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
     * get 主机名
     *
     * @return
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * set 主机名
     *
     * @param hostname
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * get 镜像类型, 取值范围：standard
     *
     * @return
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * set 镜像类型, 取值范围：standard
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
     * get 是否启用外网，取值范围：yes、no
     *
     * @return
     */
    public String getEnableInternet() {
        return enableInternet;
    }

    /**
     * set 是否启用外网，取值范围：yes、no
     *
     * @param enableInternet
     */
    public void setEnableInternet(String enableInternet) {
        this.enableInternet = enableInternet;
    }

    /**
     * get 网络类型，取值范围：vpc
     *
     * @return
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * set 网络类型，取值范围：vpc
     *
     * @param networkType
     */
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * get 网络CIDR
     *
     * @return
     */
    public String getCidr() {
        return cidr;
    }

    /**
     * set 网络CIDR
     *
     * @param cidr
     */
    public void setCidr(String cidr) {
        this.cidr = cidr;
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
     * get 外网链路类型, 目前支持联通un、电信ct、移动cm
     *
     * @return
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * set 外网链路类型, 目前支持联通un、电信ct、移动cm
     *
     * @param lineType
     */
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    /**
     * get 外网带宽, 范围[1,10240] 单位Mbps
     *
     * @return
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * set 外网带宽, 范围[1,10240] 单位Mbps
     *
     * @param bandwidth
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * get 额外上行带宽, 范围[0,10240] 单位Mbps
     *
     * @return
     */
    public Integer getExtraUplinkBandwidth() {
        return extraUplinkBandwidth;
    }

    /**
     * set 额外上行带宽, 范围[0,10240] 单位Mbps
     *
     * @param extraUplinkBandwidth
     */
    public void setExtraUplinkBandwidth(Integer extraUplinkBandwidth) {
        this.extraUplinkBandwidth = extraUplinkBandwidth;
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
     * get 密码，不传值会随机生成密码
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 密码，不传值会随机生成密码
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get 购买数量
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 购买数量
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * get 可执行脚本Base64编码后的内容，支持shell和python脚本
     *
     * @return
     */
    public String getUserData() {
        return userData;
    }

    /**
     * set 可执行脚本Base64编码后的内容，支持shell和python脚本
     *
     * @param userData
     */
    public void setUserData(String userData) {
        this.userData = userData;
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
     * get 计费配置
     *
     * @return
     */
    public ChargeSpec getCharge() {
        return charge;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public void setCharge(ChargeSpec charge) {
        this.charge = charge;
    }


    /**
     * set 可用区, 如 cn-east-tz1
     *
     * @param az
     */
    public InstanceSpec az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 实例类型, 如 edcps.c.normal1
     *
     * @param deviceType
     */
    public InstanceSpec deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * set 主机名
     *
     * @param hostname
     */
    public InstanceSpec hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * set 镜像类型, 取值范围：standard
     *
     * @param imageType
     */
    public InstanceSpec imageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * set 操作系统类型ID
     *
     * @param osTypeId
     */
    public InstanceSpec osTypeId(String osTypeId) {
        this.osTypeId = osTypeId;
        return this;
    }

    /**
     * set 系统盘RAID类型ID
     *
     * @param sysRaidTypeId
     */
    public InstanceSpec sysRaidTypeId(String sysRaidTypeId) {
        this.sysRaidTypeId = sysRaidTypeId;
        return this;
    }

    /**
     * set 数据盘RAID类型ID
     *
     * @param dataRaidTypeId
     */
    public InstanceSpec dataRaidTypeId(String dataRaidTypeId) {
        this.dataRaidTypeId = dataRaidTypeId;
        return this;
    }

    /**
     * set 子网编号
     *
     * @param subnetId
     */
    public InstanceSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 是否启用外网，取值范围：yes、no
     *
     * @param enableInternet
     */
    public InstanceSpec enableInternet(String enableInternet) {
        this.enableInternet = enableInternet;
        return this;
    }

    /**
     * set 网络类型，取值范围：vpc
     *
     * @param networkType
     */
    public InstanceSpec networkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * set 网络CIDR
     *
     * @param cidr
     */
    public InstanceSpec cidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * set 内网IP
     *
     * @param privateIp
     */
    public InstanceSpec privateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * set 外网链路类型, 目前支持联通un、电信ct、移动cm
     *
     * @param lineType
     */
    public InstanceSpec lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    /**
     * set 外网带宽, 范围[1,10240] 单位Mbps
     *
     * @param bandwidth
     */
    public InstanceSpec bandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set 额外上行带宽, 范围[0,10240] 单位Mbps
     *
     * @param extraUplinkBandwidth
     */
    public InstanceSpec extraUplinkBandwidth(Integer extraUplinkBandwidth) {
        this.extraUplinkBandwidth = extraUplinkBandwidth;
        return this;
    }

    /**
     * set 云物理服务器名称
     *
     * @param name
     */
    public InstanceSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 云物理服务器描述
     *
     * @param description
     */
    public InstanceSpec description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 密码，不传值会随机生成密码
     *
     * @param password
     */
    public InstanceSpec password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 购买数量
     *
     * @param count
     */
    public InstanceSpec count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * set 可执行脚本Base64编码后的内容，支持shell和python脚本
     *
     * @param userData
     */
    public InstanceSpec userData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * set 密钥对id
     *
     * @param keypairId
     */
    public InstanceSpec keypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public InstanceSpec charge(ChargeSpec charge) {
        this.charge = charge;
        return this;
    }


}