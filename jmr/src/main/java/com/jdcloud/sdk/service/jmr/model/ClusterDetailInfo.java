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

package com.jdcloud.sdk.service.jmr.model;


/**
 * clusterDetailInfo
 */
public class ClusterDetailInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Master节点数量
     */
    private Integer materNum;

    /**
     * Master节点CPU
     */
    private Integer masterCore;

    /**
     * Master节点内存（推荐至少8G内存，否则服务可能会部署失败）
     */
    private Integer masterMemory;

    /**
     * &quot;Master节点云盘类型，可传类型为（以下以“/”分割各类型）&quot;
&quot;NBD/NBD_SATA&quot;
&quot;分别代表：性能型/容量型&quot;

     */
    private String masterDiskType;

    /**
     * Master节点云盘容量，必须是10的整数倍，且大于20小于3000
     */
    private Integer masterDiskVolume;

    /**
     * Master节点规格，比如：g.n1.xlarge，更多规格请参考[文档](https://www.jdcloud.com/help/detail/296/isCatalog/1)
     */
    private String masterInstanceType;

    /**
     * master节点实例信息
     */
    private String masterInstanceInfo;

    /**
     * Slave节点数量
     */
    private Integer slaveNum;

    /**
     * Slave节点CPU
     */
    private Integer slaveCore;

    /**
     * Slave节点内存(推荐至少4G内存，否则服务可能会部署失败)
     */
    private Integer slaveMemory;

    /**
     * &quot;Slave节点云盘类型，可传类型为（以下以“/”分割各类型）&quot;
&quot;NBD/NBD_SATA&quot;
&quot;分别代表：性能型/容量型&quot;

     */
    private String slaveDiskType;

    /**
     * Slave节点云盘容量，必须是10的整数倍，且大于20小于3000
     */
    private Integer slaveDiskVolume;

    /**
     * Slave节点规格，比如：g.n1.xlarge，更多规格请参考[文档](https://www.jdcloud.com/help/detail/296/isCatalog/1)
     */
    private String slaveInstanceType;

    /**
     * Slave节点实例信息
     */
    private String slaveInstanceInfo;


    /**
     * get Master节点数量
     *
     * @return
     */
    public Integer getMaterNum() {
        return materNum;
    }

    /**
     * set Master节点数量
     *
     * @param materNum
     */
    public void setMaterNum(Integer materNum) {
        this.materNum = materNum;
    }

    /**
     * get Master节点CPU
     *
     * @return
     */
    public Integer getMasterCore() {
        return masterCore;
    }

    /**
     * set Master节点CPU
     *
     * @param masterCore
     */
    public void setMasterCore(Integer masterCore) {
        this.masterCore = masterCore;
    }

    /**
     * get Master节点内存（推荐至少8G内存，否则服务可能会部署失败）
     *
     * @return
     */
    public Integer getMasterMemory() {
        return masterMemory;
    }

    /**
     * set Master节点内存（推荐至少8G内存，否则服务可能会部署失败）
     *
     * @param masterMemory
     */
    public void setMasterMemory(Integer masterMemory) {
        this.masterMemory = masterMemory;
    }

    /**
     * get &quot;Master节点云盘类型，可传类型为（以下以“/”分割各类型）&quot;
&quot;NBD/NBD_SATA&quot;
&quot;分别代表：性能型/容量型&quot;

     *
     * @return
     */
    public String getMasterDiskType() {
        return masterDiskType;
    }

    /**
     * set &quot;Master节点云盘类型，可传类型为（以下以“/”分割各类型）&quot;
&quot;NBD/NBD_SATA&quot;
&quot;分别代表：性能型/容量型&quot;

     *
     * @param masterDiskType
     */
    public void setMasterDiskType(String masterDiskType) {
        this.masterDiskType = masterDiskType;
    }

    /**
     * get Master节点云盘容量，必须是10的整数倍，且大于20小于3000
     *
     * @return
     */
    public Integer getMasterDiskVolume() {
        return masterDiskVolume;
    }

    /**
     * set Master节点云盘容量，必须是10的整数倍，且大于20小于3000
     *
     * @param masterDiskVolume
     */
    public void setMasterDiskVolume(Integer masterDiskVolume) {
        this.masterDiskVolume = masterDiskVolume;
    }

    /**
     * get Master节点规格，比如：g.n1.xlarge，更多规格请参考[文档](https://www.jdcloud.com/help/detail/296/isCatalog/1)
     *
     * @return
     */
    public String getMasterInstanceType() {
        return masterInstanceType;
    }

    /**
     * set Master节点规格，比如：g.n1.xlarge，更多规格请参考[文档](https://www.jdcloud.com/help/detail/296/isCatalog/1)
     *
     * @param masterInstanceType
     */
    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }

    /**
     * get master节点实例信息
     *
     * @return
     */
    public String getMasterInstanceInfo() {
        return masterInstanceInfo;
    }

    /**
     * set master节点实例信息
     *
     * @param masterInstanceInfo
     */
    public void setMasterInstanceInfo(String masterInstanceInfo) {
        this.masterInstanceInfo = masterInstanceInfo;
    }

    /**
     * get Slave节点数量
     *
     * @return
     */
    public Integer getSlaveNum() {
        return slaveNum;
    }

    /**
     * set Slave节点数量
     *
     * @param slaveNum
     */
    public void setSlaveNum(Integer slaveNum) {
        this.slaveNum = slaveNum;
    }

    /**
     * get Slave节点CPU
     *
     * @return
     */
    public Integer getSlaveCore() {
        return slaveCore;
    }

    /**
     * set Slave节点CPU
     *
     * @param slaveCore
     */
    public void setSlaveCore(Integer slaveCore) {
        this.slaveCore = slaveCore;
    }

    /**
     * get Slave节点内存(推荐至少4G内存，否则服务可能会部署失败)
     *
     * @return
     */
    public Integer getSlaveMemory() {
        return slaveMemory;
    }

    /**
     * set Slave节点内存(推荐至少4G内存，否则服务可能会部署失败)
     *
     * @param slaveMemory
     */
    public void setSlaveMemory(Integer slaveMemory) {
        this.slaveMemory = slaveMemory;
    }

    /**
     * get &quot;Slave节点云盘类型，可传类型为（以下以“/”分割各类型）&quot;
&quot;NBD/NBD_SATA&quot;
&quot;分别代表：性能型/容量型&quot;

     *
     * @return
     */
    public String getSlaveDiskType() {
        return slaveDiskType;
    }

    /**
     * set &quot;Slave节点云盘类型，可传类型为（以下以“/”分割各类型）&quot;
&quot;NBD/NBD_SATA&quot;
&quot;分别代表：性能型/容量型&quot;

     *
     * @param slaveDiskType
     */
    public void setSlaveDiskType(String slaveDiskType) {
        this.slaveDiskType = slaveDiskType;
    }

    /**
     * get Slave节点云盘容量，必须是10的整数倍，且大于20小于3000
     *
     * @return
     */
    public Integer getSlaveDiskVolume() {
        return slaveDiskVolume;
    }

    /**
     * set Slave节点云盘容量，必须是10的整数倍，且大于20小于3000
     *
     * @param slaveDiskVolume
     */
    public void setSlaveDiskVolume(Integer slaveDiskVolume) {
        this.slaveDiskVolume = slaveDiskVolume;
    }

    /**
     * get Slave节点规格，比如：g.n1.xlarge，更多规格请参考[文档](https://www.jdcloud.com/help/detail/296/isCatalog/1)
     *
     * @return
     */
    public String getSlaveInstanceType() {
        return slaveInstanceType;
    }

    /**
     * set Slave节点规格，比如：g.n1.xlarge，更多规格请参考[文档](https://www.jdcloud.com/help/detail/296/isCatalog/1)
     *
     * @param slaveInstanceType
     */
    public void setSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
    }

    /**
     * get Slave节点实例信息
     *
     * @return
     */
    public String getSlaveInstanceInfo() {
        return slaveInstanceInfo;
    }

    /**
     * set Slave节点实例信息
     *
     * @param slaveInstanceInfo
     */
    public void setSlaveInstanceInfo(String slaveInstanceInfo) {
        this.slaveInstanceInfo = slaveInstanceInfo;
    }


    /**
     * set Master节点数量
     *
     * @param materNum
     */
    public ClusterDetailInfo materNum(Integer materNum) {
        this.materNum = materNum;
        return this;
    }

    /**
     * set Master节点CPU
     *
     * @param masterCore
     */
    public ClusterDetailInfo masterCore(Integer masterCore) {
        this.masterCore = masterCore;
        return this;
    }

    /**
     * set Master节点内存（推荐至少8G内存，否则服务可能会部署失败）
     *
     * @param masterMemory
     */
    public ClusterDetailInfo masterMemory(Integer masterMemory) {
        this.masterMemory = masterMemory;
        return this;
    }

    /**
     * set &quot;Master节点云盘类型，可传类型为（以下以“/”分割各类型）&quot;
&quot;NBD/NBD_SATA&quot;
&quot;分别代表：性能型/容量型&quot;

     *
     * @param masterDiskType
     */
    public ClusterDetailInfo masterDiskType(String masterDiskType) {
        this.masterDiskType = masterDiskType;
        return this;
    }

    /**
     * set Master节点云盘容量，必须是10的整数倍，且大于20小于3000
     *
     * @param masterDiskVolume
     */
    public ClusterDetailInfo masterDiskVolume(Integer masterDiskVolume) {
        this.masterDiskVolume = masterDiskVolume;
        return this;
    }

    /**
     * set Master节点规格，比如：g.n1.xlarge，更多规格请参考[文档](https://www.jdcloud.com/help/detail/296/isCatalog/1)
     *
     * @param masterInstanceType
     */
    public ClusterDetailInfo masterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }

    /**
     * set master节点实例信息
     *
     * @param masterInstanceInfo
     */
    public ClusterDetailInfo masterInstanceInfo(String masterInstanceInfo) {
        this.masterInstanceInfo = masterInstanceInfo;
        return this;
    }

    /**
     * set Slave节点数量
     *
     * @param slaveNum
     */
    public ClusterDetailInfo slaveNum(Integer slaveNum) {
        this.slaveNum = slaveNum;
        return this;
    }

    /**
     * set Slave节点CPU
     *
     * @param slaveCore
     */
    public ClusterDetailInfo slaveCore(Integer slaveCore) {
        this.slaveCore = slaveCore;
        return this;
    }

    /**
     * set Slave节点内存(推荐至少4G内存，否则服务可能会部署失败)
     *
     * @param slaveMemory
     */
    public ClusterDetailInfo slaveMemory(Integer slaveMemory) {
        this.slaveMemory = slaveMemory;
        return this;
    }

    /**
     * set &quot;Slave节点云盘类型，可传类型为（以下以“/”分割各类型）&quot;
&quot;NBD/NBD_SATA&quot;
&quot;分别代表：性能型/容量型&quot;

     *
     * @param slaveDiskType
     */
    public ClusterDetailInfo slaveDiskType(String slaveDiskType) {
        this.slaveDiskType = slaveDiskType;
        return this;
    }

    /**
     * set Slave节点云盘容量，必须是10的整数倍，且大于20小于3000
     *
     * @param slaveDiskVolume
     */
    public ClusterDetailInfo slaveDiskVolume(Integer slaveDiskVolume) {
        this.slaveDiskVolume = slaveDiskVolume;
        return this;
    }

    /**
     * set Slave节点规格，比如：g.n1.xlarge，更多规格请参考[文档](https://www.jdcloud.com/help/detail/296/isCatalog/1)
     *
     * @param slaveInstanceType
     */
    public ClusterDetailInfo slaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
        return this;
    }

    /**
     * set Slave节点实例信息
     *
     * @param slaveInstanceInfo
     */
    public ClusterDetailInfo slaveInstanceInfo(String slaveInstanceInfo) {
        this.slaveInstanceInfo = slaveInstanceInfo;
        return this;
    }


}