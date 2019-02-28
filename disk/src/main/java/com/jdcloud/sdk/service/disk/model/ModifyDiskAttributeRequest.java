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
 * 云硬盘相关接口
 * 云硬盘相关接口，提供批量创建云硬盘，查询云硬盘，删除云硬盘，对云硬盘进行扩容，修改云硬盘信息以及使用快照恢复云硬盘等功能。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改云硬盘的名字或描述信息，名字或描述信息至少要指定一个。
 */
public class ModifyDiskAttributeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     */
    private String name;

    /**
     * 云硬盘描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     */
    private String description;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云硬盘ID
     * Required:true
     */
    @Required
    private String diskId;


    /**
     * get 云硬盘名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 云硬盘名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 云硬盘描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 云硬盘描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * get 云硬盘ID
     *
     * @return
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }


    /**
     * set 云硬盘名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param name
     */
    public ModifyDiskAttributeRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 云硬盘描述，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public ModifyDiskAttributeRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public ModifyDiskAttributeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public ModifyDiskAttributeRequest diskId(String diskId) {
        this.diskId = diskId;
        return this;
    }


}