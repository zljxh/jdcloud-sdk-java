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
 * Transcode Template
 * 转码模板管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.client;

import com.jdcloud.sdk.client.JdcloudExecutor;
import com.jdcloud.sdk.service.JdcloudResponse;
import com.jdcloud.sdk.service.vod.model.ListTranscodeTemplatesResponse;

/**
 * 查询转码模板列表。允许通过条件过滤查询，支持的过滤字段如下：
- source 模板来源。枚举值，取值范围为：
  - system 系统预置
  - custom 用户自建
- templateType 模板类型。枚举值，取值范围：
  - jdchd 京享超清
  - jdchs 极速转码

 */
class ListTranscodeTemplatesExecutor extends JdcloudExecutor {

    @Override
    public String method() {
        return "GET";
    }

    @Override
    public String url() {
        return "/transcodeTemplates";
    }

    @Override
    public Class<? extends JdcloudResponse> returnType() {
        return ListTranscodeTemplatesResponse.class;
    }
}
