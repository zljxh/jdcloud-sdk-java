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
 * updateVideoResp
 */
public class UpdateVideoResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 视频ID
     */
    private String id;

    /**
     * 视频名称
     */
    private String name;

    /**
     * 视频描述
     */
    private String description;

    /**
     * 封面图地址
     */
    private String coverUrl;

    /**
     * 视频状态
     */
    private String status;

    /**
     * 文件大小，单位字节
     */
    private Long fileSize;

    /**
     * 文件校验和
     */
    private String checksum;

    /**
     * 视频时长
     */
    private Long duration;

    /**
     * 标签
     */
    private List<String> tags;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * snapshots
     */
    private List<Snapshot> snapshots;

    /**
     * createTime
     */
    private String createTime;

    /**
     * updateTime
     */
    private String updateTime;


    /**
     * get 视频ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 视频ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 视频名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 视频名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 视频描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 视频描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 封面图地址
     *
     * @return
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    /**
     * set 封面图地址
     *
     * @param coverUrl
     */
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    /**
     * get 视频状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 视频状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 文件大小，单位字节
     *
     * @return
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * set 文件大小，单位字节
     *
     * @param fileSize
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * get 文件校验和
     *
     * @return
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * set 文件校验和
     *
     * @param checksum
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * get 视频时长
     *
     * @return
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * set 视频时长
     *
     * @param duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * get 标签
     *
     * @return
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * set 标签
     *
     * @param tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * get 分类ID
     *
     * @return
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * set 分类ID
     *
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * get 分类名称
     *
     * @return
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * set 分类名称
     *
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * get snapshots
     *
     * @return
     */
    public List<Snapshot> getSnapshots() {
        return snapshots;
    }

    /**
     * set snapshots
     *
     * @param snapshots
     */
    public void setSnapshots(List<Snapshot> snapshots) {
        this.snapshots = snapshots;
    }

    /**
     * get createTime
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 视频ID
     *
     * @param id
     */
    public UpdateVideoResp id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 视频名称
     *
     * @param name
     */
    public UpdateVideoResp name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 视频描述
     *
     * @param description
     */
    public UpdateVideoResp description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 封面图地址
     *
     * @param coverUrl
     */
    public UpdateVideoResp coverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }

    /**
     * set 视频状态
     *
     * @param status
     */
    public UpdateVideoResp status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 文件大小，单位字节
     *
     * @param fileSize
     */
    public UpdateVideoResp fileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * set 文件校验和
     *
     * @param checksum
     */
    public UpdateVideoResp checksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * set 视频时长
     *
     * @param duration
     */
    public UpdateVideoResp duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * set 标签
     *
     * @param tags
     */
    public UpdateVideoResp tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 分类ID
     *
     * @param categoryId
     */
    public UpdateVideoResp categoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * set 分类名称
     *
     * @param categoryName
     */
    public UpdateVideoResp categoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * set snapshots
     *
     * @param snapshots
     */
    public UpdateVideoResp snapshots(List<Snapshot> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public UpdateVideoResp createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public UpdateVideoResp updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * add item to 标签
     *
     * @param tag
     */
    public void addTag(String tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

    /**
     * add item to snapshots
     *
     * @param snapshot
     */
    public void addSnapshot(Snapshot snapshot) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        this.snapshots.add(snapshot);
    }

}