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
 * Video Management
 * 视频资源管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;


/**
 * snapshot
 */
public class Snapshot  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 截图ID
     */
    private Long imgId;

    /**
     * 截图URL
     */
    private String imgUrl;

    /**
     * 截图宽度
     */
    private Integer width;

    /**
     * 截图高度
     */
    private Integer height;


    /**
     * get 截图ID
     *
     * @return
     */
    public Long getImgId() {
        return imgId;
    }

    /**
     * set 截图ID
     *
     * @param imgId
     */
    public void setImgId(Long imgId) {
        this.imgId = imgId;
    }

    /**
     * get 截图URL
     *
     * @return
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * set 截图URL
     *
     * @param imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * get 截图宽度
     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set 截图宽度
     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get 截图高度
     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set 截图高度
     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }


    /**
     * set 截图ID
     *
     * @param imgId
     */
    public Snapshot imgId(Long imgId) {
        this.imgId = imgId;
        return this;
    }

    /**
     * set 截图URL
     *
     * @param imgUrl
     */
    public Snapshot imgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    /**
     * set 截图宽度
     *
     * @param width
     */
    public Snapshot width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set 截图高度
     *
     * @param height
     */
    public Snapshot height(Integer height) {
        this.height = height;
        return this;
    }


}