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
 * 分布式云物理服务器
 * 分布式云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询分布式云物理服务器支持的操作系统
 */
public class DescribeOSRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例类型，可调用接口（describeDeviceTypes）获取指定地域的实例类型，例如：edcps.c.normal1
     * Required:true
     */
    @Required
    private String deviceType;

    /**
     * 操作系统类型，取值范围：CentOS、Ubuntu
     */
    private String osType;

    /**
     * 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 实例类型，可调用接口（describeDeviceTypes）获取指定地域的实例类型，例如：edcps.c.normal1
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 实例类型，可调用接口（describeDeviceTypes）获取指定地域的实例类型，例如：edcps.c.normal1
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * get 操作系统类型，取值范围：CentOS、Ubuntu
     *
     * @return
     */
    public String getOsType() {
        return osType;
    }

    /**
     * set 操作系统类型，取值范围：CentOS、Ubuntu
     *
     * @param osType
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * get 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 实例类型，可调用接口（describeDeviceTypes）获取指定地域的实例类型，例如：edcps.c.normal1
     *
     * @param deviceType
     */
    public DescribeOSRequest deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * set 操作系统类型，取值范围：CentOS、Ubuntu
     *
     * @param osType
     */
    public DescribeOSRequest osType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @param regionId
     */
    public DescribeOSRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}