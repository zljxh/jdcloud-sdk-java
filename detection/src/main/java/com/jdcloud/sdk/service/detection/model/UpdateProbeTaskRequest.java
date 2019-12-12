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
 * Availability-Monitoring-APIs
 * 可用性监控相关接口，提供创建、查询、修改、删除可用性监控任务等功能
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.detection.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.detection.model.KeyValue;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.detection.model.Probe;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改可用性监控任务
 */
public class UpdateProbeTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * http body：选择探测类型为1&#x3D;http时有效，最长不超过1024字节
     */
    private String httpBody;

    /**
     * http cookie：选择探测类型为1&#x3D;http时有效，最大允许20个key、value对，最长不超过1024字节
     */
    private List<KeyValue> httpCookie;

    /**
     * http header：选择探测类型为1&#x3D;http时有效，最大允许20个key、value对，最长不超过1024字节
     */
    private List<KeyValue> httpHeader;

    /**
     * http探测方法,可选值：1:get、2:post、3:head
     */
    private Long httpType;

    /**
     * task名称，不允许重复，长度不超过32字符，只允许中英文、数字、下划线_、中划线-, [0-9][a-z] [A-Z] [- _ ]
     */
    private String name;

    /**
     * 探测源（发起对探测目标探测的云主机，需安装相应的agent才能探测）
     * Required:true
     */
    @Required
    private List<Probe> probes;

    /**
     * 探测任务的task_id
     * Required:true
     */
    @Required
    private String probeTaskID;


    /**
     * get http body：选择探测类型为1&#x3D;http时有效，最长不超过1024字节
     *
     * @return
     */
    public String getHttpBody() {
        return httpBody;
    }

    /**
     * set http body：选择探测类型为1&#x3D;http时有效，最长不超过1024字节
     *
     * @param httpBody
     */
    public void setHttpBody(String httpBody) {
        this.httpBody = httpBody;
    }

    /**
     * get http cookie：选择探测类型为1&#x3D;http时有效，最大允许20个key、value对，最长不超过1024字节
     *
     * @return
     */
    public List<KeyValue> getHttpCookie() {
        return httpCookie;
    }

    /**
     * set http cookie：选择探测类型为1&#x3D;http时有效，最大允许20个key、value对，最长不超过1024字节
     *
     * @param httpCookie
     */
    public void setHttpCookie(List<KeyValue> httpCookie) {
        this.httpCookie = httpCookie;
    }

    /**
     * get http header：选择探测类型为1&#x3D;http时有效，最大允许20个key、value对，最长不超过1024字节
     *
     * @return
     */
    public List<KeyValue> getHttpHeader() {
        return httpHeader;
    }

    /**
     * set http header：选择探测类型为1&#x3D;http时有效，最大允许20个key、value对，最长不超过1024字节
     *
     * @param httpHeader
     */
    public void setHttpHeader(List<KeyValue> httpHeader) {
        this.httpHeader = httpHeader;
    }

    /**
     * get http探测方法,可选值：1:get、2:post、3:head
     *
     * @return
     */
    public Long getHttpType() {
        return httpType;
    }

    /**
     * set http探测方法,可选值：1:get、2:post、3:head
     *
     * @param httpType
     */
    public void setHttpType(Long httpType) {
        this.httpType = httpType;
    }

    /**
     * get task名称，不允许重复，长度不超过32字符，只允许中英文、数字、下划线_、中划线-, [0-9][a-z] [A-Z] [- _ ]
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set task名称，不允许重复，长度不超过32字符，只允许中英文、数字、下划线_、中划线-, [0-9][a-z] [A-Z] [- _ ]
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 探测源（发起对探测目标探测的云主机，需安装相应的agent才能探测）
     *
     * @return
     */
    public List<Probe> getProbes() {
        return probes;
    }

    /**
     * set 探测源（发起对探测目标探测的云主机，需安装相应的agent才能探测）
     *
     * @param probes
     */
    public void setProbes(List<Probe> probes) {
        this.probes = probes;
    }

    /**
     * get 探测任务的task_id
     *
     * @return
     */
    public String getProbeTaskID() {
        return probeTaskID;
    }

    /**
     * set 探测任务的task_id
     *
     * @param probeTaskID
     */
    public void setProbeTaskID(String probeTaskID) {
        this.probeTaskID = probeTaskID;
    }


    /**
     * set http body：选择探测类型为1&#x3D;http时有效，最长不超过1024字节
     *
     * @param httpBody
     */
    public UpdateProbeTaskRequest httpBody(String httpBody) {
        this.httpBody = httpBody;
        return this;
    }

    /**
     * set http cookie：选择探测类型为1&#x3D;http时有效，最大允许20个key、value对，最长不超过1024字节
     *
     * @param httpCookie
     */
    public UpdateProbeTaskRequest httpCookie(List<KeyValue> httpCookie) {
        this.httpCookie = httpCookie;
        return this;
    }

    /**
     * set http header：选择探测类型为1&#x3D;http时有效，最大允许20个key、value对，最长不超过1024字节
     *
     * @param httpHeader
     */
    public UpdateProbeTaskRequest httpHeader(List<KeyValue> httpHeader) {
        this.httpHeader = httpHeader;
        return this;
    }

    /**
     * set http探测方法,可选值：1:get、2:post、3:head
     *
     * @param httpType
     */
    public UpdateProbeTaskRequest httpType(Long httpType) {
        this.httpType = httpType;
        return this;
    }

    /**
     * set task名称，不允许重复，长度不超过32字符，只允许中英文、数字、下划线_、中划线-, [0-9][a-z] [A-Z] [- _ ]
     *
     * @param name
     */
    public UpdateProbeTaskRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 探测源（发起对探测目标探测的云主机，需安装相应的agent才能探测）
     *
     * @param probes
     */
    public UpdateProbeTaskRequest probes(List<Probe> probes) {
        this.probes = probes;
        return this;
    }

    /**
     * set 探测任务的task_id
     *
     * @param probeTaskID
     */
    public UpdateProbeTaskRequest probeTaskID(String probeTaskID) {
        this.probeTaskID = probeTaskID;
        return this;
    }


    /**
     * add item to http cookie：选择探测类型为1&#x3D;http时有效，最大允许20个key、value对，最长不超过1024字节
     *
     * @param httpCookie
     */
    public void addHttpCookie(KeyValue httpCookie) {
        if (this.httpCookie == null) {
            this.httpCookie = new ArrayList<>();
        }
        this.httpCookie.add(httpCookie);
    }

    /**
     * add item to http header：选择探测类型为1&#x3D;http时有效，最大允许20个key、value对，最长不超过1024字节
     *
     * @param httpHeader
     */
    public void addHttpHeader(KeyValue httpHeader) {
        if (this.httpHeader == null) {
            this.httpHeader = new ArrayList<>();
        }
        this.httpHeader.add(httpHeader);
    }

    /**
     * add item to 探测源（发起对探测目标探测的云主机，需安装相应的agent才能探测）
     *
     * @param probe
     */
    public void addProbe(Probe probe) {
        if (this.probes == null) {
            this.probes = new ArrayList<>();
        }
        this.probes.add(probe);
    }

}