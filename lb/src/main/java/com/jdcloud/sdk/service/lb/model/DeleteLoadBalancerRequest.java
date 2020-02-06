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
 * LoadBalancer
 * 负载均衡器相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除负载均衡，负载均衡下的监听器，转发规则组(仅alb支持)，后端服务，服务器组会一起删除
 */
public class DeleteLoadBalancerRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * LB ID
     * Required:true
     */
    @Required
    private String loadBalancerId;


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get LB ID
     *
     * @return
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * set LB ID
     *
     * @param loadBalancerId
     */
    public void setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public DeleteLoadBalancerRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set LB ID
     *
     * @param loadBalancerId
     */
    public DeleteLoadBalancerRequest loadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }


}