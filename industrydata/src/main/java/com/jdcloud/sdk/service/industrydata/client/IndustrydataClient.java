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
 * 产业数据服务API
 * 产业数据服务API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.industrydata.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.industrydata.model.GetLargeScreenDataRequest;
import com.jdcloud.sdk.service.industrydata.model.GetLargeScreenDataResponse;
import com.jdcloud.sdk.service.industrydata.client.GetLargeScreenDataExecutor;

/**
 * industrydataClient
 */
public class IndustrydataClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.0";
    public final static String DefaultEndpoint = "industrydata.cn-south-1.jdcloud-api.com";
    public final static String ServiceName = "industrydata";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private IndustrydataClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 根据区域、行业、一级指标、二级指标、起始时间等条件查询数据
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetLargeScreenDataResponse getLargeScreenData(GetLargeScreenDataRequest request) throws JdcloudSdkException {
        return new GetLargeScreenDataExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public IndustrydataClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private IndustrydataClient industrydataClient;

        public DefaultBuilder() {
            industrydataClient = new IndustrydataClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            industrydataClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            industrydataClient.httpRequestConfig = config;
            return this;
        }

        public IndustrydataClient build() throws JdcloudSdkException {

            if (industrydataClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                industrydataClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (industrydataClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("IndustrydataClient build error: jdcloud credentials provider not set");
                }
            }
            if (industrydataClient.httpRequestConfig == null) {
                industrydataClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (industrydataClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("IndustrydataClient build error: http request config not set");
                }
            }
            return industrydataClient;
        }

        public Builder environment(Environment environment) {
            industrydataClient.environment = environment;
            return this;
        }
    }
}
