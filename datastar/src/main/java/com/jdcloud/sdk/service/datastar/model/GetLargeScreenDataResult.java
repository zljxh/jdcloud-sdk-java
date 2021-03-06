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
 * 大屏数据查询接口
 * 陕西苹果大屏数据查询接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.datastar.model;

import com.jdcloud.sdk.service.datastar.model.RegionIndustryDataList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据区域、行业、一级指标、二级指标、起始时间等条件查询数据
 */
public class GetLargeScreenDataResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * true为成功，false为失败
     */
    private Boolean status;

    /**
     * 描述信息
     */
    private String message;

    /**
     * 查询数据结果
     */
    private RegionIndustryDataList data;


    /**
     * get true为成功，false为失败
     *
     * @return
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * set true为成功，false为失败
     *
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * get 描述信息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 描述信息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get 查询数据结果
     *
     * @return
     */
    public RegionIndustryDataList getData() {
        return data;
    }

    /**
     * set 查询数据结果
     *
     * @param data
     */
    public void setData(RegionIndustryDataList data) {
        this.data = data;
    }


    /**
     * set true为成功，false为失败
     *
     * @param status
     */
    public GetLargeScreenDataResult status(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * set 描述信息
     *
     * @param message
     */
    public GetLargeScreenDataResult message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set 查询数据结果
     *
     * @param data
     */
    public GetLargeScreenDataResult data(RegionIndustryDataList data) {
        this.data = data;
        return this;
    }


}