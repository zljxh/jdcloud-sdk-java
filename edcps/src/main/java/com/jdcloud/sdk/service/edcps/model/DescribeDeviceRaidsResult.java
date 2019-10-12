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
 * 分布式云物理服务器
 * 分布式云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.edcps.model.Raid;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询某种实例类型的分布式云物理服务器支持的RAID类型，可查询系统盘RAID类型和数据盘RAID类型
 */
public class DescribeDeviceRaidsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * raids
     */
    private List<Raid> raids;


    /**
     * get raids
     *
     * @return
     */
    public List<Raid> getRaids() {
        return raids;
    }

    /**
     * set raids
     *
     * @param raids
     */
    public void setRaids(List<Raid> raids) {
        this.raids = raids;
    }


    /**
     * set raids
     *
     * @param raids
     */
    public DescribeDeviceRaidsResult raids(List<Raid> raids) {
        this.raids = raids;
        return this;
    }


    /**
     * add item to raids
     *
     * @param raid
     */
    public void addRaid(Raid raid) {
        if (this.raids == null) {
            this.raids = new ArrayList<>();
        }
        this.raids.add(raid);
    }

}