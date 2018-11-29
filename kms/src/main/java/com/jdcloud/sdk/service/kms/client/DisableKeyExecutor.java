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

package com.jdcloud.sdk.service.kms.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.kms.model.DisableKeyResponse;

/**
 * 禁用当前状态为&#x60;已启用&#x60;的密钥
 */
class DisableKeyExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "PATCH";
    }

    @Override
    public String url() {
        return "/key/{keyId}:disable";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return DisableKeyResponse.class;
    }
}
