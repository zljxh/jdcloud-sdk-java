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

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * createShipperSpec
 */
public class CreateShipperSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 压缩格式，为空不压缩
     */
    private String compress;

    /**
     * 投递格式 json,  origin(原始日志格式), 默认origin
     */
    private String fileFormat;

    /**
     * 投递文件大小，单位MB，支持200,300,400,500,1000
     * Required:true
     */
    @Required
    private Long fileSize;

    /**
     * 转储任务名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 目的地 配置
     * Required:true
     */
    @Required
    private Object targetConf;

    /**
     * 转储目的地类型 0: oss, 目前只支持oss
     */
    private Long targetType;

    /**
     * 投递时间间隔单位分钟，5分钟整数倍，支持5,10,15,20,30,60
     * Required:true
     */
    @Required
    private Long timeInterval;


    /**
     * get 压缩格式，为空不压缩
     *
     * @return
     */
    public String getCompress() {
        return compress;
    }

    /**
     * set 压缩格式，为空不压缩
     *
     * @param compress
     */
    public void setCompress(String compress) {
        this.compress = compress;
    }

    /**
     * get 投递格式 json,  origin(原始日志格式), 默认origin
     *
     * @return
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * set 投递格式 json,  origin(原始日志格式), 默认origin
     *
     * @param fileFormat
     */
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * get 投递文件大小，单位MB，支持200,300,400,500,1000
     *
     * @return
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * set 投递文件大小，单位MB，支持200,300,400,500,1000
     *
     * @param fileSize
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * get 转储任务名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 转储任务名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 目的地 配置
     *
     * @return
     */
    public Object getTargetConf() {
        return targetConf;
    }

    /**
     * set 目的地 配置
     *
     * @param targetConf
     */
    public void setTargetConf(Object targetConf) {
        this.targetConf = targetConf;
    }

    /**
     * get 转储目的地类型 0: oss, 目前只支持oss
     *
     * @return
     */
    public Long getTargetType() {
        return targetType;
    }

    /**
     * set 转储目的地类型 0: oss, 目前只支持oss
     *
     * @param targetType
     */
    public void setTargetType(Long targetType) {
        this.targetType = targetType;
    }

    /**
     * get 投递时间间隔单位分钟，5分钟整数倍，支持5,10,15,20,30,60
     *
     * @return
     */
    public Long getTimeInterval() {
        return timeInterval;
    }

    /**
     * set 投递时间间隔单位分钟，5分钟整数倍，支持5,10,15,20,30,60
     *
     * @param timeInterval
     */
    public void setTimeInterval(Long timeInterval) {
        this.timeInterval = timeInterval;
    }


    /**
     * set 压缩格式，为空不压缩
     *
     * @param compress
     */
    public CreateShipperSpec compress(String compress) {
        this.compress = compress;
        return this;
    }

    /**
     * set 投递格式 json,  origin(原始日志格式), 默认origin
     *
     * @param fileFormat
     */
    public CreateShipperSpec fileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }

    /**
     * set 投递文件大小，单位MB，支持200,300,400,500,1000
     *
     * @param fileSize
     */
    public CreateShipperSpec fileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * set 转储任务名称
     *
     * @param name
     */
    public CreateShipperSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 目的地 配置
     *
     * @param targetConf
     */
    public CreateShipperSpec targetConf(Object targetConf) {
        this.targetConf = targetConf;
        return this;
    }

    /**
     * set 转储目的地类型 0: oss, 目前只支持oss
     *
     * @param targetType
     */
    public CreateShipperSpec targetType(Long targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * set 投递时间间隔单位分钟，5分钟整数倍，支持5,10,15,20,30,60
     *
     * @param timeInterval
     */
    public CreateShipperSpec timeInterval(Long timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }


}