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

package com.jdcloud.sdk.service.live.model;


/**
 * onlineStreamInfo
 */
public class OnlineStreamInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 您的加速域名
     */
    private String publishDomain;

    /**
     * 您的APP
     */
    private String appName;

    /**
     * 您的流名
     */
    private String streamName;

    /**
     * 您的推流时间
     */
    private String publishTime;

    /**
     * 您的推流地址
     */
    private String publishUrl;


    /**
     * get 您的加速域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 您的加速域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 您的APP
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 您的APP
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 您的流名
     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 您的流名
     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * get 您的推流时间
     *
     * @return
     */
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * set 您的推流时间
     *
     * @param publishTime
     */
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * get 您的推流地址
     *
     * @return
     */
    public String getPublishUrl() {
        return publishUrl;
    }

    /**
     * set 您的推流地址
     *
     * @param publishUrl
     */
    public void setPublishUrl(String publishUrl) {
        this.publishUrl = publishUrl;
    }


    /**
     * set 您的加速域名
     *
     * @param publishDomain
     */
    public OnlineStreamInfo publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 您的APP
     *
     * @param appName
     */
    public OnlineStreamInfo appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 您的流名
     *
     * @param streamName
     */
    public OnlineStreamInfo streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * set 您的推流时间
     *
     * @param publishTime
     */
    public OnlineStreamInfo publishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * set 您的推流地址
     *
     * @param publishUrl
     */
    public OnlineStreamInfo publishUrl(String publishUrl) {
        this.publishUrl = publishUrl;
        return this;
    }


}