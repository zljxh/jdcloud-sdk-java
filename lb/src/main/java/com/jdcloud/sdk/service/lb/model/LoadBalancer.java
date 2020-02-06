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

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * loadBalancer
 */
public class LoadBalancer  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * LoadBalancer的Id
     */
    private String loadBalancerId;

    /**
     * LoadBalancer的名称
     */
    private String loadBalancerName;

    /**
     * LoadBalancer所属子网的Id
     */
    private String subnetId;

    /**
     * 负载均衡所属vpc Id
     */
    private String vpcId;

    /**
     * LoadBalancer的类型
     */
    private String type;

    /**
     * LoadBalancer的状态
     */
    private LoadBalancerState state;

    /**
     * LoadBalancer所属availability Zone列表
     */
    private List<String> azs;

    /**
     * LoadBalancer绑定的安全组列表
     */
    private List<String> securityGroupIds;

    /**
     * LoadBalancer的IP地址信息
     */
    private PrivateIpAddress privateIp;

    /**
     * 计费配置
     */
    private Charge charge;

    /**
     * LoadBalancer的描述信息
     */
    private String description;

    /**
     * 删除保护，取值为True(开启)或False(关闭)
     */
    private Boolean deleteProtection;

    /**
     * LoadBalancer的创建时间
     */
    private String createdTime;


    /**
     * get LoadBalancer的Id
     *
     * @return
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * set LoadBalancer的Id
     *
     * @param loadBalancerId
     */
    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }

    /**
     * get LoadBalancer的名称
     *
     * @return
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * set LoadBalancer的名称
     *
     * @param loadBalancerName
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * get LoadBalancer所属子网的Id
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set LoadBalancer所属子网的Id
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 负载均衡所属vpc Id
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 负载均衡所属vpc Id
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get LoadBalancer的类型
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set LoadBalancer的类型
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get LoadBalancer的状态
     *
     * @return
     */
    public LoadBalancerState getState() {
        return state;
    }

    /**
     * set LoadBalancer的状态
     *
     * @param state
     */
    public void setState(LoadBalancerState state) {
        this.state = state;
    }

    /**
     * get LoadBalancer所属availability Zone列表
     *
     * @return
     */
    public List<String> getAzs() {
        return azs;
    }

    /**
     * set LoadBalancer所属availability Zone列表
     *
     * @param azs
     */
    public void setAzs(List<String> azs) {
        this.azs = azs;
    }

    /**
     * get LoadBalancer绑定的安全组列表
     *
     * @return
     */
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * set LoadBalancer绑定的安全组列表
     *
     * @param securityGroupIds
     */
    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    /**
     * get LoadBalancer的IP地址信息
     *
     * @return
     */
    public PrivateIpAddress getPrivateIp() {
        return privateIp;
    }

    /**
     * set LoadBalancer的IP地址信息
     *
     * @param privateIp
     */
    public void setPrivateIp(PrivateIpAddress privateIp) {
        this.privateIp = privateIp;
    }

    /**
     * get 计费配置
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    /**
     * get LoadBalancer的描述信息
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set LoadBalancer的描述信息
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 删除保护，取值为True(开启)或False(关闭)
     *
     * @return
     */
    public Boolean getDeleteProtection() {
        return deleteProtection;
    }

    /**
     * set 删除保护，取值为True(开启)或False(关闭)
     *
     * @param deleteProtection
     */
    public void setDeleteProtection(Boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
    }

    /**
     * get LoadBalancer的创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set LoadBalancer的创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * set LoadBalancer的Id
     *
     * @param loadBalancerId
     */
    public LoadBalancer loadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }

    /**
     * set LoadBalancer的名称
     *
     * @param loadBalancerName
     */
    public LoadBalancer loadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * set LoadBalancer所属子网的Id
     *
     * @param subnetId
     */
    public LoadBalancer subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 负载均衡所属vpc Id
     *
     * @param vpcId
     */
    public LoadBalancer vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set LoadBalancer的类型
     *
     * @param type
     */
    public LoadBalancer type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set LoadBalancer的状态
     *
     * @param state
     */
    public LoadBalancer state(LoadBalancerState state) {
        this.state = state;
        return this;
    }

    /**
     * set LoadBalancer所属availability Zone列表
     *
     * @param azs
     */
    public LoadBalancer azs(List<String> azs) {
        this.azs = azs;
        return this;
    }

    /**
     * set LoadBalancer绑定的安全组列表
     *
     * @param securityGroupIds
     */
    public LoadBalancer securityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * set LoadBalancer的IP地址信息
     *
     * @param privateIp
     */
    public LoadBalancer privateIp(PrivateIpAddress privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public LoadBalancer charge(Charge charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set LoadBalancer的描述信息
     *
     * @param description
     */
    public LoadBalancer description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 删除保护，取值为True(开启)或False(关闭)
     *
     * @param deleteProtection
     */
    public LoadBalancer deleteProtection(Boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }

    /**
     * set LoadBalancer的创建时间
     *
     * @param createdTime
     */
    public LoadBalancer createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * add item to LoadBalancer所属availability Zone列表
     *
     * @param az
     */
    public void addAz(String az) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(az);
    }

    /**
     * add item to LoadBalancer绑定的安全组列表
     *
     * @param securityGroupId
     */
    public void addSecurityGroupId(String securityGroupId) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupId);
    }

}