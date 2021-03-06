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

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * API分组
 */
public class BindJdsfGroup  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 微服务网关名称
     */
    private String jdsfName;

    /**
     * 微服务注册中心ID
     */
    private String jdsfRegistryName;

    /**
     * 环境信息
     * Required:true
     */
    @Required
    private String environment;

    /**
     * 微服务网关ID
     * Required:true
     */
    @Required
    private String jdsfId;

    /**
     * VPC类型时，传vpc对应的IP:port
     */
    private String jdsfParam;

    /**
     * 微服务网关region ID
     */
    private String jdsfRegion;

    /**
     * 分组类型：api_group（api分组）、jdsf_group（微服务分组）默认api_group
     */
    private String groupType;


    /**
     * get 微服务网关名称
     *
     * @return
     */
    public String getJdsfName() {
        return jdsfName;
    }

    /**
     * set 微服务网关名称
     *
     * @param jdsfName
     */
    public void setJdsfName(String jdsfName) {
        this.jdsfName = jdsfName;
    }

    /**
     * get 微服务注册中心ID
     *
     * @return
     */
    public String getJdsfRegistryName() {
        return jdsfRegistryName;
    }

    /**
     * set 微服务注册中心ID
     *
     * @param jdsfRegistryName
     */
    public void setJdsfRegistryName(String jdsfRegistryName) {
        this.jdsfRegistryName = jdsfRegistryName;
    }

    /**
     * get 环境信息
     *
     * @return
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * set 环境信息
     *
     * @param environment
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * get 微服务网关ID
     *
     * @return
     */
    public String getJdsfId() {
        return jdsfId;
    }

    /**
     * set 微服务网关ID
     *
     * @param jdsfId
     */
    public void setJdsfId(String jdsfId) {
        this.jdsfId = jdsfId;
    }

    /**
     * get VPC类型时，传vpc对应的IP:port
     *
     * @return
     */
    public String getJdsfParam() {
        return jdsfParam;
    }

    /**
     * set VPC类型时，传vpc对应的IP:port
     *
     * @param jdsfParam
     */
    public void setJdsfParam(String jdsfParam) {
        this.jdsfParam = jdsfParam;
    }

    /**
     * get 微服务网关region ID
     *
     * @return
     */
    public String getJdsfRegion() {
        return jdsfRegion;
    }

    /**
     * set 微服务网关region ID
     *
     * @param jdsfRegion
     */
    public void setJdsfRegion(String jdsfRegion) {
        this.jdsfRegion = jdsfRegion;
    }

    /**
     * get 分组类型：api_group（api分组）、jdsf_group（微服务分组）默认api_group
     *
     * @return
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * set 分组类型：api_group（api分组）、jdsf_group（微服务分组）默认api_group
     *
     * @param groupType
     */
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }


    /**
     * set 微服务网关名称
     *
     * @param jdsfName
     */
    public BindJdsfGroup jdsfName(String jdsfName) {
        this.jdsfName = jdsfName;
        return this;
    }

    /**
     * set 微服务注册中心ID
     *
     * @param jdsfRegistryName
     */
    public BindJdsfGroup jdsfRegistryName(String jdsfRegistryName) {
        this.jdsfRegistryName = jdsfRegistryName;
        return this;
    }

    /**
     * set 环境信息
     *
     * @param environment
     */
    public BindJdsfGroup environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * set 微服务网关ID
     *
     * @param jdsfId
     */
    public BindJdsfGroup jdsfId(String jdsfId) {
        this.jdsfId = jdsfId;
        return this;
    }

    /**
     * set VPC类型时，传vpc对应的IP:port
     *
     * @param jdsfParam
     */
    public BindJdsfGroup jdsfParam(String jdsfParam) {
        this.jdsfParam = jdsfParam;
        return this;
    }

    /**
     * set 微服务网关region ID
     *
     * @param jdsfRegion
     */
    public BindJdsfGroup jdsfRegion(String jdsfRegion) {
        this.jdsfRegion = jdsfRegion;
        return this;
    }

    /**
     * set 分组类型：api_group（api分组）、jdsf_group（微服务分组）默认api_group
     *
     * @param groupType
     */
    public BindJdsfGroup groupType(String groupType) {
        this.groupType = groupType;
        return this;
    }


}