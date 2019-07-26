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
 * Domain Management
 * 域名管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 查询域名头参数列表结果
 */
public class ListHeadersResultObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 头参数列表
     */
    private List<GetHeaderResultObject> headers;


    /**
     * get 头参数列表
     *
     * @return
     */
    public List<GetHeaderResultObject> getHeaders() {
        return headers;
    }

    /**
     * set 头参数列表
     *
     * @param headers
     */
    public void setHeaders(List<GetHeaderResultObject> headers) {
        this.headers = headers;
    }


    /**
     * set 头参数列表
     *
     * @param headers
     */
    public ListHeadersResultObject headers(List<GetHeaderResultObject> headers) {
        this.headers = headers;
        return this;
    }


    /**
     * add item to 头参数列表
     *
     * @param header
     */
    public void addHeader(GetHeaderResultObject header) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        this.headers.add(header);
    }

}