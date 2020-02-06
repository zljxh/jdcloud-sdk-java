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
 * Backend
 * 后端服务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import com.jdcloud.sdk.service.lb.model.Backend;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询后端服务详情
 */
public class DescribeBackendResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 后端服务的信息
     */
    private Backend backend;


    /**
     * get 后端服务的信息
     *
     * @return
     */
    public Backend getBackend() {
        return backend;
    }

    /**
     * set 后端服务的信息
     *
     * @param backend
     */
    public void setBackend(Backend backend) {
        this.backend = backend;
    }


    /**
     * set 后端服务的信息
     *
     * @param backend
     */
    public DescribeBackendResult backend(Backend backend) {
        this.backend = backend;
        return this;
    }


}