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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.model;

import java.util.List;
import java.util.ArrayList;

/**
 * regionInfo
 */
public class RegionInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * region编号
     */
    private String regionId;

    /**
     * region名称
     */
    private String regionName;

    /**
     * AZ集合
     */
    private List<Azs> azInfo;


    /**
     * get region编号
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set region编号
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get region名称
     *
     * @return
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * set region名称
     *
     * @param regionName
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * get AZ集合
     *
     * @return
     */
    public List<Azs> getAzInfo() {
        return azInfo;
    }

    /**
     * set AZ集合
     *
     * @param azInfo
     */
    public void setAzInfo(List<Azs> azInfo) {
        this.azInfo = azInfo;
    }


    /**
     * set region编号
     *
     * @param regionId
     */
    public RegionInfo regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set region名称
     *
     * @param regionName
     */
    public RegionInfo regionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * set AZ集合
     *
     * @param azInfo
     */
    public RegionInfo azInfo(List<Azs> azInfo) {
        this.azInfo = azInfo;
        return this;
    }


    /**
     * add item to AZ集合
     *
     * @param azInfo
     */
    public void addAzInfo(Azs azInfo) {
        if (this.azInfo == null) {
            this.azInfo = new ArrayList<>();
        }
        this.azInfo.add(azInfo);
    }

}