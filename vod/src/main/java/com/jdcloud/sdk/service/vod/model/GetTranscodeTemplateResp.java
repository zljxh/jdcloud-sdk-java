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
 * Video Transcode Template Management
 * 水印管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;


/**
 * 查询转码模板响应信息
 */
public class GetTranscodeTemplateResp  implements java.io.Serializable {

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
     * 视频参数
     */
    private Video video;

    /**
     * 音频参数
     */
    private Audio audio;

    /**
     * 封装配置
     */
    private Encapsulation encapsulation;

    /**
     * 清晰度规格
     */
    private String definition;

    /**
     * 模板来源
     */
    private String source;

    /**
     * createTime
     */
    private String createTime;

    /**
     * updateTime
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
     * get 视频参数
     *
     * @return
     */
    public Video getVideo() {
        return video;
    }

    /**
     * set 视频参数
     *
     * @param video
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * get 音频参数
     *
     * @return
     */
    public Audio getAudio() {
        return audio;
    }

    /**
     * set 音频参数
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
     * get 清晰度规格
     *
     * @return
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * set 清晰度规格
     *
     * @param definition
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * get 模板来源
     *
     * @return
     */
    public String getSource() {
        return source;
    }

    /**
     * set 模板来源
     *
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
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
     * set 模板ID
     *
     * @param id
     */
    public GetTranscodeTemplateResp id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set 模板名称
     *
     * @param name
     */
    public GetTranscodeTemplateResp name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 视频参数
     *
     * @param video
     */
    public GetTranscodeTemplateResp video(Video video) {
        this.video = video;
        return this;
    }

    /**
     * set 音频参数
     *
     * @param audio
     */
    public GetTranscodeTemplateResp audio(Audio audio) {
        this.audio = audio;
        return this;
    }

    /**
     * set 封装配置
     *
     * @param encapsulation
     */
    public GetTranscodeTemplateResp encapsulation(Encapsulation encapsulation) {
        this.encapsulation = encapsulation;
        return this;
    }

    /**
     * set 清晰度规格
     *
     * @param definition
     */
    public GetTranscodeTemplateResp definition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * set 模板来源
     *
     * @param source
     */
    public GetTranscodeTemplateResp source(String source) {
        this.source = source;
        return this;
    }

    /**
     * set createTime
     *
     * @param createTime
     */
    public GetTranscodeTemplateResp createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public GetTranscodeTemplateResp updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}