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

import java.util.List;
import java.util.ArrayList;

/**
 * batchUpdateVideosResp
 */
public class BatchUpdateVideosResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * updateVideoIds
     */
    private List<String> updateVideoIds;

    /**
     * notFoundVideoIds
     */
    private List<String> notFoundVideoIds;


    /**
     * get updateVideoIds
     *
     * @return
     */
    public List<String> getUpdateVideoIds() {
        return updateVideoIds;
    }

    /**
     * set updateVideoIds
     *
     * @param updateVideoIds
     */
    public void setUpdateVideoIds(List<String> updateVideoIds) {
        this.updateVideoIds = updateVideoIds;
    }

    /**
     * get notFoundVideoIds
     *
     * @return
     */
    public List<String> getNotFoundVideoIds() {
        return notFoundVideoIds;
    }

    /**
     * set notFoundVideoIds
     *
     * @param notFoundVideoIds
     */
    public void setNotFoundVideoIds(List<String> notFoundVideoIds) {
        this.notFoundVideoIds = notFoundVideoIds;
    }


    /**
     * set updateVideoIds
     *
     * @param updateVideoIds
     */
    public BatchUpdateVideosResp updateVideoIds(List<String> updateVideoIds) {
        this.updateVideoIds = updateVideoIds;
        return this;
    }

    /**
     * set notFoundVideoIds
     *
     * @param notFoundVideoIds
     */
    public BatchUpdateVideosResp notFoundVideoIds(List<String> notFoundVideoIds) {
        this.notFoundVideoIds = notFoundVideoIds;
        return this;
    }


    /**
     * add item to updateVideoIds
     *
     * @param updateVideoId
     */
    public void addUpdateVideoId(String updateVideoId) {
        if (this.updateVideoIds == null) {
            this.updateVideoIds = new ArrayList<>();
        }
        this.updateVideoIds.add(updateVideoId);
    }

    /**
     * add item to notFoundVideoIds
     *
     * @param notFoundVideoId
     */
    public void addNotFoundVideoId(String notFoundVideoId) {
        if (this.notFoundVideoIds == null) {
            this.notFoundVideoIds = new ArrayList<>();
        }
        this.notFoundVideoIds.add(notFoundVideoId);
    }

}