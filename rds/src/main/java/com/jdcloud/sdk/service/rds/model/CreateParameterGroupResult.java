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
 * 参数组管理
 * 参数组管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建一个参数组&lt;br&gt;- 仅支持MySQL
 */
public class CreateParameterGroupResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * parameterGroupId
     */
    private String parameterGroupId;


    /**
     * get parameterGroupId
     *
     * @return
     */
    public String getParameterGroupId() {
        return parameterGroupId;
    }

    /**
     * set parameterGroupId
     *
     * @param parameterGroupId
     */
    public void setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
    }


    /**
     * set parameterGroupId
     *
     * @param parameterGroupId
     */
    public CreateParameterGroupResult parameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }


}