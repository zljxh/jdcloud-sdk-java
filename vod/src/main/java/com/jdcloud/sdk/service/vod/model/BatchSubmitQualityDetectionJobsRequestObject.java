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

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 批量提交质检作业请求对象
 */
public class BatchSubmitQualityDetectionJobsRequestObject  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * bulkItems
     */
    private List<SubmitQualityDetectionJobRequestObject> bulkItems;


    /**
     * get bulkItems
     *
     * @return
     */
    public List<SubmitQualityDetectionJobRequestObject> getBulkItems() {
        return bulkItems;
    }

    /**
     * set bulkItems
     *
     * @param bulkItems
     */
    public void setBulkItems(List<SubmitQualityDetectionJobRequestObject> bulkItems) {
        this.bulkItems = bulkItems;
    }


    /**
     * set bulkItems
     *
     * @param bulkItems
     */
    public BatchSubmitQualityDetectionJobsRequestObject bulkItems(List<SubmitQualityDetectionJobRequestObject> bulkItems) {
        this.bulkItems = bulkItems;
        return this;
    }


    /**
     * add item to bulkItems
     *
     * @param bulkItem
     */
    public void addBulkItem(SubmitQualityDetectionJobRequestObject bulkItem) {
        if (this.bulkItems == null) {
            this.bulkItems = new ArrayList<>();
        }
        this.bulkItems.add(bulkItem);
    }

}