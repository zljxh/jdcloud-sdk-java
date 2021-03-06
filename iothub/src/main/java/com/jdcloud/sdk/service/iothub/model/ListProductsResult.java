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
 * Product
 * 关于产品基本信息操作的相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iothub.model.PageinfoVO;
import com.jdcloud.sdk.service.iothub.model.Product;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看产品列表接口
 */
public class ListProductsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分页信息
     */
    private PageinfoVO page;

    /**
     * products
     */
    private List<Product> products;


    /**
     * get 分页信息
     *
     * @return
     */
    public PageinfoVO getPage() {
        return page;
    }

    /**
     * set 分页信息
     *
     * @param page
     */
    public void setPage(PageinfoVO page) {
        this.page = page;
    }

    /**
     * get products
     *
     * @return
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * set products
     *
     * @param products
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }


    /**
     * set 分页信息
     *
     * @param page
     */
    public ListProductsResult page(PageinfoVO page) {
        this.page = page;
        return this;
    }

    /**
     * set products
     *
     * @param products
     */
    public ListProductsResult products(List<Product> products) {
        this.products = products;
        return this;
    }


    /**
     * add item to products
     *
     * @param product
     */
    public void addProduct(Product product) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(product);
    }

}