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
 * elite交付服务相关接口
 * elite交付服务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.elite.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据交付单号查询交付单信息
 */
public class GetSaleServiceByDeliverNumberRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 交付单号
     * Required:true
     */
    @Required
    private String deliverNumber;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 交付单号
     *
     * @return
     */
    public String getDeliverNumber() {
        return deliverNumber;
    }

    /**
     * set 交付单号
     *
     * @param deliverNumber
     */
    public void setDeliverNumber(String deliverNumber) {
        this.deliverNumber = deliverNumber;
    }

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
     * set 交付单号
     *
     * @param deliverNumber
     */
    public GetSaleServiceByDeliverNumberRequest deliverNumber(String deliverNumber) {
        this.deliverNumber = deliverNumber;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GetSaleServiceByDeliverNumberRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}