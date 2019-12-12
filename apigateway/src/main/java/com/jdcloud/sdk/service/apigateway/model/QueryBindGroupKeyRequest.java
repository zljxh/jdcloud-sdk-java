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
 * API调用者密钥
 * 关于API调用者密钥操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.apigateway.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询绑定分组详情
 */
public class QueryBindGroupKeyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * access key id
     * Required:true
     */
    @Required
    private String accessKeyId;


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get access key id
     *
     * @return
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * set access key id
     *
     * @param accessKeyId
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public QueryBindGroupKeyRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set access key id
     *
     * @param accessKeyId
     */
    public QueryBindGroupKeyRequest accessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }


}