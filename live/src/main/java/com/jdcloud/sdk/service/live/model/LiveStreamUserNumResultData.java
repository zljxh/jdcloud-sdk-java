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

package com.jdcloud.sdk.service.live.model;


/**
 * liveStreamUserNumResultData
 */
public class LiveStreamUserNumResultData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 人数

     */
    private Long count;


    /**
     * get 人数

     *
     * @return
     */
    public Long getCount() {
        return count;
    }

    /**
     * set 人数

     *
     * @param count
     */
    public void setCount(Long count) {
        this.count = count;
    }


    /**
     * set 人数

     *
     * @param count
     */
    public LiveStreamUserNumResultData count(Long count) {
        this.count = count;
        return this;
    }


}