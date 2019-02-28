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
 * reverseDeploymentInfo
 */
public class ReverseDeploymentInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 版本
     */
    private String version;

    /**
     * 是否只读 0：否 1：是
     */
    private Integer readOnly;

    /**
     * resources
     */
    private ReverseDeploymentResourcesInfo resources;


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
     * get 描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * get 是否只读 0：否 1：是
     *
     * @return
     */
    public Integer getReadOnly() {
        return readOnly;
    }

    /**
     * set 是否只读 0：否 1：是
     *
     * @param readOnly
     */
    public void setReadOnly(Integer readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * get resources
     *
     * @return
     */
    public ReverseDeploymentResourcesInfo getResources() {
        return resources;
    }

    /**
     * set resources
     *
     * @param resources
     */
    public void setResources(ReverseDeploymentResourcesInfo resources) {
        this.resources = resources;
    }


    /**
     * set 模板名称
     *
     * @param name
     */
    public ReverseDeploymentInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public ReverseDeploymentInfo description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 版本
     *
     * @param version
     */
    public ReverseDeploymentInfo version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set 是否只读 0：否 1：是
     *
     * @param readOnly
     */
    public ReverseDeploymentInfo readOnly(Integer readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * set resources
     *
     * @param resources
     */
    public ReverseDeploymentInfo resources(ReverseDeploymentResourcesInfo resources) {
        this.resources = resources;
        return this;
    }


}