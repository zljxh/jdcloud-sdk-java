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

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * createRDSInstance
 */
public class CreateRDSInstance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * RDS实例ID
     */
    private String id;

    /**
     * RDS实例名称
     */
    private String name;

    /**
     * 计费信息,prepaid\postpaid
     * Required:true
     */
    @Required
    private String payType;

    /**
     * 可用区ID
     */
    private List<String> azs;

    /**
     * 实例引擎类型
     * Required:true
     */
    @Required
    private String engine;

    /**
     * 实例状态
     */
    private String status;

    /**
     * 实例类型
     */
    private String instanceType;

    /**
     * 所属云提供商ID
     */
    private String cloudID;

    /**
     * 数据库版本号
     * Required:true
     */
    @Required
    private String engineVersion;

    /**
     * 实例规格
     * Required:true
     */
    @Required
    private String instanceClass;

    /**
     * 磁盘大小，单位GB
     * Required:true
     */
    @Required
    private Integer storageGB;

    /**
     * VPC ID
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 子网ID
     * Required:true
     */
    @Required
    private String subnetId;


    /**
     * get RDS实例ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set RDS实例ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get RDS实例名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set RDS实例名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 计费信息,prepaid\postpaid
     *
     * @return
     */
    public String getPayType() {
        return payType;
    }

    /**
     * set 计费信息,prepaid\postpaid
     *
     * @param payType
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * get 可用区ID
     *
     * @return
     */
    public List<String> getAzs() {
        return azs;
    }

    /**
     * set 可用区ID
     *
     * @param azs
     */
    public void setAzs(List<String> azs) {
        this.azs = azs;
    }

    /**
     * get 实例引擎类型
     *
     * @return
     */
    public String getEngine() {
        return engine;
    }

    /**
     * set 实例引擎类型
     *
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * get 实例状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 实例状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 实例类型
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 所属云提供商ID
     *
     * @return
     */
    public String getCloudID() {
        return cloudID;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public void setCloudID(String cloudID) {
        this.cloudID = cloudID;
    }

    /**
     * get 数据库版本号
     *
     * @return
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * set 数据库版本号
     *
     * @param engineVersion
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * get 实例规格
     *
     * @return
     */
    public String getInstanceClass() {
        return instanceClass;
    }

    /**
     * set 实例规格
     *
     * @param instanceClass
     */
    public void setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
    }

    /**
     * get 磁盘大小，单位GB
     *
     * @return
     */
    public Integer getStorageGB() {
        return storageGB;
    }

    /**
     * set 磁盘大小，单位GB
     *
     * @param storageGB
     */
    public void setStorageGB(Integer storageGB) {
        this.storageGB = storageGB;
    }

    /**
     * get VPC ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set VPC ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }


    /**
     * set RDS实例ID
     *
     * @param id
     */
    public CreateRDSInstance id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set RDS实例名称
     *
     * @param name
     */
    public CreateRDSInstance name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 计费信息,prepaid\postpaid
     *
     * @param payType
     */
    public CreateRDSInstance payType(String payType) {
        this.payType = payType;
        return this;
    }

    /**
     * set 可用区ID
     *
     * @param azs
     */
    public CreateRDSInstance azs(List<String> azs) {
        this.azs = azs;
        return this;
    }

    /**
     * set 实例引擎类型
     *
     * @param engine
     */
    public CreateRDSInstance engine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * set 实例状态
     *
     * @param status
     */
    public CreateRDSInstance status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 实例类型
     *
     * @param instanceType
     */
    public CreateRDSInstance instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 所属云提供商ID
     *
     * @param cloudID
     */
    public CreateRDSInstance cloudID(String cloudID) {
        this.cloudID = cloudID;
        return this;
    }

    /**
     * set 数据库版本号
     *
     * @param engineVersion
     */
    public CreateRDSInstance engineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * set 实例规格
     *
     * @param instanceClass
     */
    public CreateRDSInstance instanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }

    /**
     * set 磁盘大小，单位GB
     *
     * @param storageGB
     */
    public CreateRDSInstance storageGB(Integer storageGB) {
        this.storageGB = storageGB;
        return this;
    }

    /**
     * set VPC ID
     *
     * @param vpcId
     */
    public CreateRDSInstance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public CreateRDSInstance subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }


    /**
     * add item to 可用区ID
     *
     * @param az
     */
    public void addAz(String az) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(az);
    }

}