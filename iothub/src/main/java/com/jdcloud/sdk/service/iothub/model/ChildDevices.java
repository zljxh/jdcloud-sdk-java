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


/**
 * childDevices
 */
public class ChildDevices  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备编号
     */
    private String deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * devvice-service名称
     */
    private String deviceServiceName;

    /**
     * 在线状态
     */
    private String online;


    /**
     * get 设备编号
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 设备编号
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * get 设备名称
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get devvice-service名称
     *
     * @return
     */
    public String getDeviceServiceName() {
        return deviceServiceName;
    }

    /**
     * set devvice-service名称
     *
     * @param deviceServiceName
     */
    public void setDeviceServiceName(String deviceServiceName) {
        this.deviceServiceName = deviceServiceName;
    }

    /**
     * get 在线状态
     *
     * @return
     */
    public String getOnline() {
        return online;
    }

    /**
     * set 在线状态
     *
     * @param online
     */
    public void setOnline(String online) {
        this.online = online;
    }


    /**
     * set 设备编号
     *
     * @param deviceId
     */
    public ChildDevices deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public ChildDevices deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set devvice-service名称
     *
     * @param deviceServiceName
     */
    public ChildDevices deviceServiceName(String deviceServiceName) {
        this.deviceServiceName = deviceServiceName;
        return this;
    }

    /**
     * set 在线状态
     *
     * @param online
     */
    public ChildDevices online(String online) {
        this.online = online;
        return this;
    }


}