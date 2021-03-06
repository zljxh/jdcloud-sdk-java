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

package com.jdcloud.sdk.service.jdfusion.model;


/**
 * 应用部署信息
 */
public class DeploymentApplyInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private String id;

    /**
     * 备注信息
     */
    private String comment;

    /**
     * 应用时间
     */
    private String applyTime;

    /**
     * 版本
     */
    private String version;

    /**
     * content
     */
    private DeploymentResourcesInfo content;


    /**
     * get ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 备注信息
     *
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     * set 备注信息
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * get 应用时间
     *
     * @return
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * set 应用时间
     *
     * @param applyTime
     */
    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * get 版本
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 版本
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get content
     *
     * @return
     */
    public DeploymentResourcesInfo getContent() {
        return content;
    }

    /**
     * set content
     *
     * @param content
     */
    public void setContent(DeploymentResourcesInfo content) {
        this.content = content;
    }


    /**
     * set ID
     *
     * @param id
     */
    public DeploymentApplyInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 备注信息
     *
     * @param comment
     */
    public DeploymentApplyInfo comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * set 应用时间
     *
     * @param applyTime
     */
    public DeploymentApplyInfo applyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * set 版本
     *
     * @param version
     */
    public DeploymentApplyInfo version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set content
     *
     * @param content
     */
    public DeploymentApplyInfo content(DeploymentResourcesInfo content) {
        this.content = content;
        return this;
    }


}