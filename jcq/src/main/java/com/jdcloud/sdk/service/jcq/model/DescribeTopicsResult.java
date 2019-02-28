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
 * Topic
 * Topic相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jcq.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.jcq.model.Topic;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询topic列表
 */
public class DescribeTopicsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * topics
     */
    private List<Topic> topics;

    /**
     * 总数
     */
    private Integer totalCount;


    /**
     * get topics
     *
     * @return
     */
    public List<Topic> getTopics() {
        return topics;
    }

    /**
     * set topics
     *
     * @param topics
     */
    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    /**
     * get 总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set topics
     *
     * @param topics
     */
    public DescribeTopicsResult topics(List<Topic> topics) {
        this.topics = topics;
        return this;
    }

    /**
     * set 总数
     *
     * @param totalCount
     */
    public DescribeTopicsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to topics
     *
     * @param topic
     */
    public void addTopic(Topic topic) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topic);
    }

}