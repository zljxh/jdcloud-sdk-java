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

package com.jdcloud.sdk.service.function.model;


/**
 * functionSpec
 */
public class FunctionSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 函数Id
     */
    private String functionId;

    /**
     * 函数名称
     */
    private String name;

    /**
     * 函数描述
     */
    private String description;

    /**
     * 函数运行环境，目前有python3
     */
    private String runtime;

    /**
     * 函数创建时间
     */
    private String createTime;

    /**
     * 函数最后更新时间
     */
    private String updateTime;

    /**
     * 函数版本名称
     */
    private String version;

    /**
     * 代码包下载的url地址
     */
    private String downloadUrl;


    /**
     * get 函数Id
     *
     * @return
     */
    public String getFunctionId() {
        return functionId;
    }

    /**
     * set 函数Id
     *
     * @param functionId
     */
    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    /**
     * get 函数名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 函数名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 函数描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 函数描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 函数运行环境，目前有python3
     *
     * @return
     */
    public String getRuntime() {
        return runtime;
    }

    /**
     * set 函数运行环境，目前有python3
     *
     * @param runtime
     */
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * get 函数创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 函数创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 函数最后更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 函数最后更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 函数版本名称
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 函数版本名称
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get 代码包下载的url地址
     *
     * @return
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * set 代码包下载的url地址
     *
     * @param downloadUrl
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }


    /**
     * set 函数Id
     *
     * @param functionId
     */
    public FunctionSpec functionId(String functionId) {
        this.functionId = functionId;
        return this;
    }

    /**
     * set 函数名称
     *
     * @param name
     */
    public FunctionSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 函数描述
     *
     * @param description
     */
    public FunctionSpec description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 函数运行环境，目前有python3
     *
     * @param runtime
     */
    public FunctionSpec runtime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * set 函数创建时间
     *
     * @param createTime
     */
    public FunctionSpec createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 函数最后更新时间
     *
     * @param updateTime
     */
    public FunctionSpec updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 函数版本名称
     *
     * @param version
     */
    public FunctionSpec version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set 代码包下载的url地址
     *
     * @param downloadUrl
     */
    public FunctionSpec downloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }


}