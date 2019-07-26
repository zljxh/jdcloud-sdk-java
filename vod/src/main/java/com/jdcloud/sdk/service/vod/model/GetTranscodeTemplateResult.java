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
 * Transcode Template
 * 转码模板管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.service.vod.model.Video;
import com.jdcloud.sdk.service.vod.model.Audio;
import com.jdcloud.sdk.service.vod.model.Encapsulation;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询转码模板
 */
public class GetTranscodeTemplateResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
    private Long id;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 视频参数配置
     */
    private Video video;

    /**
     * 音频参数配置
     */
    private Audio audio;

    /**
     * 封装配置
     */
    private Encapsulation encapsulation;

    /**
     * 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     */
    private String definition;

    /**
     * 模板来源。取值范围：
  system - 系统预置
  custom - 用户自建

     */
    private String source;

    /**
     * 模板类型。取值范围：
  jdchd - 京享超清
  jdchs - 极速转码

     */
    private String templateType;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;


    /**
     * get 模板ID
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 模板ID
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get 模板名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 模板名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 视频参数配置
     *
     * @return
     */
    public Video getVideo() {
        return video;
    }

    /**
     * set 视频参数配置
     *
     * @param video
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * get 音频参数配置
     *
     * @return
     */
    public Audio getAudio() {
        return audio;
    }

    /**
     * set 音频参数配置
     *
     * @param audio
     */
    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    /**
     * get 封装配置
     *
     * @return
     */
    public Encapsulation getEncapsulation() {
        return encapsulation;
    }

    /**
     * set 封装配置
     *
     * @param encapsulation
     */
    public void setEncapsulation(Encapsulation encapsulation) {
        this.encapsulation = encapsulation;
    }

    /**
     * get 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     *
     * @return
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * set 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     *
     * @param definition
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * get 模板来源。取值范围：
  system - 系统预置
  custom - 用户自建

     *
     * @return
     */
    public String getSource() {
        return source;
    }

    /**
     * set 模板来源。取值范围：
  system - 系统预置
  custom - 用户自建

     *
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * get 模板类型。取值范围：
  jdchd - 京享超清
  jdchs - 极速转码

     *
     * @return
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * set 模板类型。取值范围：
  jdchd - 京享超清
  jdchs - 极速转码

     *
     * @param templateType
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 模板ID
     *
     * @param id
     */
    public GetTranscodeTemplateResult id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set 模板名称
     *
     * @param name
     */
    public GetTranscodeTemplateResult name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 视频参数配置
     *
     * @param video
     */
    public GetTranscodeTemplateResult video(Video video) {
        this.video = video;
        return this;
    }

    /**
     * set 音频参数配置
     *
     * @param audio
     */
    public GetTranscodeTemplateResult audio(Audio audio) {
        this.audio = audio;
        return this;
    }

    /**
     * set 封装配置
     *
     * @param encapsulation
     */
    public GetTranscodeTemplateResult encapsulation(Encapsulation encapsulation) {
        this.encapsulation = encapsulation;
        return this;
    }

    /**
     * set 清晰度规格标记。取值范围：
  SD - 标清
  HD - 高清
  FHD - 超清
  2K
  4K

     *
     * @param definition
     */
    public GetTranscodeTemplateResult definition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * set 模板来源。取值范围：
  system - 系统预置
  custom - 用户自建

     *
     * @param source
     */
    public GetTranscodeTemplateResult source(String source) {
        this.source = source;
        return this;
    }

    /**
     * set 模板类型。取值范围：
  jdchd - 京享超清
  jdchs - 极速转码

     *
     * @param templateType
     */
    public GetTranscodeTemplateResult templateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public GetTranscodeTemplateResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public GetTranscodeTemplateResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}