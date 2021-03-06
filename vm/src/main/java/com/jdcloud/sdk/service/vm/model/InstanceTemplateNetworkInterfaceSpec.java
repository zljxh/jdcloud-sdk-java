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

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * instanceTemplateNetworkInterfaceSpec
 */
public class InstanceTemplateNetworkInterfaceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 子网ID
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * 安全组ID列表
     */
    private List<String> securityGroups;

    /**
     * PortSecurity，取值为0或者1，默认为1
     */
    private Integer sanityCheck;


    /**
     * get 子网ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 安全组ID列表
     *
     * @return
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * set 安全组ID列表
     *
     * @param securityGroups
     */
    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    /**
     * get PortSecurity，取值为0或者1，默认为1
     *
     * @return
     */
    public Integer getSanityCheck() {
        return sanityCheck;
    }

    /**
     * set PortSecurity，取值为0或者1，默认为1
     *
     * @param sanityCheck
     */
    public void setSanityCheck(Integer sanityCheck) {
        this.sanityCheck = sanityCheck;
    }


    /**
     * set 子网ID
     *
     * @param subnetId
     */
    public InstanceTemplateNetworkInterfaceSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 安全组ID列表
     *
     * @param securityGroups
     */
    public InstanceTemplateNetworkInterfaceSpec securityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * set PortSecurity，取值为0或者1，默认为1
     *
     * @param sanityCheck
     */
    public InstanceTemplateNetworkInterfaceSpec sanityCheck(Integer sanityCheck) {
        this.sanityCheck = sanityCheck;
        return this;
    }


    /**
     * add item to 安全组ID列表
     *
     * @param securityGroup
     */
    public void addSecurityGroup(String securityGroup) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroup);
    }

}