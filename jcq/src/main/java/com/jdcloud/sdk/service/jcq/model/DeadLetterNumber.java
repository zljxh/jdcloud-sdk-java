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

package com.jdcloud.sdk.service.jcq.model;


/**
 * deadLetterNumber
 */
public class DeadLetterNumber  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * topic的编号
     */
    private String topicId;

    /**
     * topic名称
     */
    private String topicName;

    /**
     * consumerGroupId
     */
    private String consumerGroupId;

    /**
     * 死信队列数
     */
    private Integer deadLetterNumber;


    /**
     * get topic的编号
     *
     * @return
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * set topic的编号
     *
     * @param topicId
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * get topic名称
     *
     * @return
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * set topic名称
     *
     * @param topicName
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * get consumerGroupId
     *
     * @return
     */
    public String getConsumerGroupId() {
        return consumerGroupId;
    }

    /**
     * set consumerGroupId
     *
     * @param consumerGroupId
     */
    public void setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
    }

    /**
     * get 死信队列数
     *
     * @return
     */
    public Integer getDeadLetterNumber() {
        return deadLetterNumber;
    }

    /**
     * set 死信队列数
     *
     * @param deadLetterNumber
     */
    public void setDeadLetterNumber(Integer deadLetterNumber) {
        this.deadLetterNumber = deadLetterNumber;
    }


    /**
     * set topic的编号
     *
     * @param topicId
     */
    public DeadLetterNumber topicId(String topicId) {
        this.topicId = topicId;
        return this;
    }

    /**
     * set topic名称
     *
     * @param topicName
     */
    public DeadLetterNumber topicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * set consumerGroupId
     *
     * @param consumerGroupId
     */
    public DeadLetterNumber consumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }

    /**
     * set 死信队列数
     *
     * @param deadLetterNumber
     */
    public DeadLetterNumber deadLetterNumber(Integer deadLetterNumber) {
        this.deadLetterNumber = deadLetterNumber;
        return this;
    }


}