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

import java.util.List;
import java.util.ArrayList;

/**
 * rankingUrlResultData
 */
public class RankingUrlResultData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * URL

     */
    private String url;

    /**
     * 排行序号

     */
    private Integer rank;

    /**
     * 文件md5

     */
    private String md5;

    /**
     * 排行依据字段对应的数值

     */
    private Long value;

    /**
     * data
     */
    private List<RankingUrlResultRankData> data;


    /**
     * get URL

     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set URL

     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get 排行序号

     *
     * @return
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * set 排行序号

     *
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * get 文件md5

     *
     * @return
     */
    public String getMd5() {
        return md5;
    }

    /**
     * set 文件md5

     *
     * @param md5
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * get 排行依据字段对应的数值

     *
     * @return
     */
    public Long getValue() {
        return value;
    }

    /**
     * set 排行依据字段对应的数值

     *
     * @param value
     */
    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * get data
     *
     * @return
     */
    public List<RankingUrlResultRankData> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<RankingUrlResultRankData> data) {
        this.data = data;
    }


    /**
     * set URL

     *
     * @param url
     */
    public RankingUrlResultData url(String url) {
        this.url = url;
        return this;
    }

    /**
     * set 排行序号

     *
     * @param rank
     */
    public RankingUrlResultData rank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * set 文件md5

     *
     * @param md5
     */
    public RankingUrlResultData md5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * set 排行依据字段对应的数值

     *
     * @param value
     */
    public RankingUrlResultData value(Long value) {
        this.value = value;
        return this;
    }

    /**
     * set data
     *
     * @param data
     */
    public RankingUrlResultData data(List<RankingUrlResultRankData> data) {
        this.data = data;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(RankingUrlResultRankData data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}