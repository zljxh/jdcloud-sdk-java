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
 * Key Management Service
 * 基于硬件保护密钥的安全数据托管服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kms.model;

import com.jdcloud.sdk.service.kms.model.KeyInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取密钥详情
 */
public class DescribeKeyResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * keyInfo
     */
    private KeyInfo keyInfo;


    /**
     * get keyInfo
     *
     * @return
     */
    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    /**
     * set keyInfo
     *
     * @param keyInfo
     */
    public void setKeyInfo(KeyInfo keyInfo) {
        this.keyInfo = keyInfo;
    }


    /**
     * set keyInfo
     *
     * @param keyInfo
     */
    public DescribeKeyResult keyInfo(KeyInfo keyInfo) {
        this.keyInfo = keyInfo;
        return this;
    }


}