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
 * Vm-Image
 * 关于主机镜像操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.jdfusion.model.ImageInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据过滤条件，取得镜像资源的信息
 */
public class GetVmImagesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * images
     */
    private List<ImageInfo> images;


    /**
     * get images
     *
     * @return
     */
    public List<ImageInfo> getImages() {
        return images;
    }

    /**
     * set images
     *
     * @param images
     */
    public void setImages(List<ImageInfo> images) {
        this.images = images;
    }


    /**
     * set images
     *
     * @param images
     */
    public GetVmImagesResult images(List<ImageInfo> images) {
        this.images = images;
        return this;
    }


    /**
     * add item to images
     *
     * @param image
     */
    public void addImage(ImageInfo image) {
        if (this.images == null) {
            this.images = new ArrayList<>();
        }
        this.images.add(image);
    }

}