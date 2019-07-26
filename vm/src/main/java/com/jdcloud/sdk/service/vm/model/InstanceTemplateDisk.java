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

package com.jdcloud.sdk.service.vm.model;


/**
 * instanceTemplateDisk
 */
public class InstanceTemplateDisk  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘类型，取值为 ssd、premium-hdd、hdd.std1、ssd.gp1、ssd.io1
     */
    private String diskType;

    /**
     * 云硬盘大小，单位为 GiB；ssd 类型取值范围[20,1000]GB，步长为10G，premium-hdd 类型取值范围[20,3000]GB，步长为10G，hdd.std1、ssd.gp1、ssd.io1 类型取值范围[20-16000]GB，步长为10GB
     */
    private Integer diskSizeGB;

    /**
     * 用于创建云硬盘的快照ID
     */
    private String snapshotId;


    /**
     * get 云硬盘类型，取值为 ssd、premium-hdd、hdd.std1、ssd.gp1、ssd.io1
     *
     * @return
     */
    public String getDiskType() {
        return diskType;
    }

    /**
     * set 云硬盘类型，取值为 ssd、premium-hdd、hdd.std1、ssd.gp1、ssd.io1
     *
     * @param diskType
     */
    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    /**
     * get 云硬盘大小，单位为 GiB；ssd 类型取值范围[20,1000]GB，步长为10G，premium-hdd 类型取值范围[20,3000]GB，步长为10G，hdd.std1、ssd.gp1、ssd.io1 类型取值范围[20-16000]GB，步长为10GB
     *
     * @return
     */
    public Integer getDiskSizeGB() {
        return diskSizeGB;
    }

    /**
     * set 云硬盘大小，单位为 GiB；ssd 类型取值范围[20,1000]GB，步长为10G，premium-hdd 类型取值范围[20,3000]GB，步长为10G，hdd.std1、ssd.gp1、ssd.io1 类型取值范围[20-16000]GB，步长为10GB
     *
     * @param diskSizeGB
     */
    public void setDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
    }

    /**
     * get 用于创建云硬盘的快照ID
     *
     * @return
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * set 用于创建云硬盘的快照ID
     *
     * @param snapshotId
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }


    /**
     * set 云硬盘类型，取值为 ssd、premium-hdd、hdd.std1、ssd.gp1、ssd.io1
     *
     * @param diskType
     */
    public InstanceTemplateDisk diskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set 云硬盘大小，单位为 GiB；ssd 类型取值范围[20,1000]GB，步长为10G，premium-hdd 类型取值范围[20,3000]GB，步长为10G，hdd.std1、ssd.gp1、ssd.io1 类型取值范围[20-16000]GB，步长为10GB
     *
     * @param diskSizeGB
     */
    public InstanceTemplateDisk diskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * set 用于创建云硬盘的快照ID
     *
     * @param snapshotId
     */
    public InstanceTemplateDisk snapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }


}