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

package com.jdcloud.sdk.service.lb.model;


/**
 * updateLoadBalancerSpec
 */
public class UpdateLoadBalancerSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * LoadBalancer的名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     */
    private String loadBalancerName;

    /**
     * 启用或停止LoadBalancer，取值为Start(启用)或Stop(停止)
     */
    private String action;

    /**
     * LoadBalancer的描述信息,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * 删除保护，取值为True(开启)或False(关闭)，默认为False
     */
    private Boolean deleteProtection;


    /**
     * get LoadBalancer的名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @return
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    /**
     * set LoadBalancer的名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param loadBalancerName
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * get 启用或停止LoadBalancer，取值为Start(启用)或Stop(停止)
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 启用或停止LoadBalancer，取值为Start(启用)或Stop(停止)
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get LoadBalancer的描述信息,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set LoadBalancer的描述信息,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 删除保护，取值为True(开启)或False(关闭)，默认为False
     *
     * @return
     */
    public Boolean getDeleteProtection() {
        return deleteProtection;
    }

    /**
     * set 删除保护，取值为True(开启)或False(关闭)，默认为False
     *
     * @param deleteProtection
     */
    public void setDeleteProtection(Boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
    }


    /**
     * set LoadBalancer的名称,只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符
     *
     * @param loadBalancerName
     */
    public UpdateLoadBalancerSpec loadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * set 启用或停止LoadBalancer，取值为Start(启用)或Stop(停止)
     *
     * @param action
     */
    public UpdateLoadBalancerSpec action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set LoadBalancer的描述信息,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public UpdateLoadBalancerSpec description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 删除保护，取值为True(开启)或False(关闭)，默认为False
     *
     * @param deleteProtection
     */
    public UpdateLoadBalancerSpec deleteProtection(Boolean deleteProtection) {
        this.deleteProtection = deleteProtection;
        return this;
    }


}