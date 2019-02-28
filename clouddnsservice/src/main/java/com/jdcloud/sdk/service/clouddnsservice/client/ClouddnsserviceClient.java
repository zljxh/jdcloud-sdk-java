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
 * 京东云解析OpenAPI接口
 * 京东云解析OpenAPI接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clouddnsservice.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.clouddnsservice.model.DelDomainRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.DelDomainResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.DelDomainExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.GetDomainQueryCountRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.GetDomainQueryCountResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.GetDomainQueryCountExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.BatchSetDnsResolveRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.BatchSetDnsResolveResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.BatchSetDnsResolveExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.GetActionLogRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.GetActionLogResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.GetActionLogExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.GetDomainQueryTrafficRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.GetDomainQueryTrafficResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.GetDomainQueryTrafficExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.OperateMonitorRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.OperateMonitorResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.OperateMonitorExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.AddUserViewIPRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.AddUserViewIPResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.AddUserViewIPExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.AddMonitorTargetRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.AddMonitorTargetResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.AddMonitorTargetExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.AddRRRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.AddRRResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.AddRRExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.DelUserViewRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.DelUserViewResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.DelUserViewExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.OperateRRRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.OperateRRResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.OperateRRExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.DelUserViewIPRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.DelUserViewIPResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.DelUserViewIPExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.GetMonitorRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.GetMonitorResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.GetMonitorExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.UpdateMonitorRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.UpdateMonitorResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.UpdateMonitorExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.GetUserViewIPRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.GetUserViewIPResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.GetUserViewIPExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.GetTargetsRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.GetTargetsResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.GetTargetsExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.GetMonitorAlarmInfoRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.GetMonitorAlarmInfoResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.GetMonitorAlarmInfoExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.AddMonitorRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.AddMonitorResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.AddMonitorExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.UpdateDomainRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.UpdateDomainResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.UpdateDomainExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.UpdateRRRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.UpdateRRResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.UpdateRRExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.AddUserViewRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.AddUserViewResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.AddUserViewExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.SearchRRRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.SearchRRResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.SearchRRExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.GetUserViewRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.GetUserViewResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.GetUserViewExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.GetDomainsRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.GetDomainsResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.GetDomainsExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.AddDomainRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.AddDomainResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.AddDomainExecutor;
import com.jdcloud.sdk.service.clouddnsservice.model.GetViewTreeRequest;
import com.jdcloud.sdk.service.clouddnsservice.model.GetViewTreeResponse;
import com.jdcloud.sdk.service.clouddnsservice.client.GetViewTreeExecutor;

/**
 * clouddnsserviceClient
 */
public class ClouddnsserviceClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.0.9";
    public final static String DefaultEndpoint = "clouddnsservice.jdcloud-api.com";
    public final static String ServiceName = "clouddnsservice";
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

    private ClouddnsserviceClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 删除主域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DelDomainResponse delDomain(DelDomainRequest request) throws JdcloudSdkException {
        return new DelDomainExecutor().client(this).execute(request);
    }

    /**
     * 查看域名的解析次数
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetDomainQueryCountResponse getDomainQueryCount(GetDomainQueryCountRequest request) throws JdcloudSdkException {
        return new GetDomainQueryCountExecutor().client(this).execute(request);
    }

    /**
     * 同一个主域名下，批量新增、更新导入解析记录&lt;br&gt;
如果解析记录的ID为0，是新增解析记录，如果不为0，则是更新解析记录。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public BatchSetDnsResolveResponse batchSetDnsResolve(BatchSetDnsResolveRequest request) throws JdcloudSdkException {
        return new BatchSetDnsResolveExecutor().client(this).execute(request);
    }

    /**
     * 查看用户在云解析服务下的操作记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetActionLogResponse getActionLog(GetActionLogRequest request) throws JdcloudSdkException {
        return new GetActionLogExecutor().client(this).execute(request);
    }

    /**
     * 查看域名的查询流量
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetDomainQueryTrafficResponse getDomainQueryTraffic(GetDomainQueryTrafficRequest request) throws JdcloudSdkException {
        return new GetDomainQueryTrafficExecutor().client(this).execute(request);
    }

    /**
     * 监控项的操作集合，包括：删除，暂停，启动, 手动恢复, 手动切换
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public OperateMonitorResponse operateMonitor(OperateMonitorRequest request) throws JdcloudSdkException {
        return new OperateMonitorExecutor().client(this).execute(request);
    }

    /**
     * 添加域名的自定义解析线路的IP段
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddUserViewIPResponse addUserViewIP(AddUserViewIPRequest request) throws JdcloudSdkException {
        return new AddUserViewIPExecutor().client(this).execute(request);
    }

    /**
     * 添加子域名的某些特定监控对象为监控项
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddMonitorTargetResponse addMonitorTarget(AddMonitorTargetRequest request) throws JdcloudSdkException {
        return new AddMonitorTargetExecutor().client(this).execute(request);
    }

    /**
     * 添加域名的解析记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddRRResponse addRR(AddRRRequest request) throws JdcloudSdkException {
        return new AddRRExecutor().client(this).execute(request);
    }

    /**
     * 删除域名的自定义解析线路
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DelUserViewResponse delUserView(DelUserViewRequest request) throws JdcloudSdkException {
        return new DelUserViewExecutor().client(this).execute(request);
    }

    /**
     * 启用、停用、删除主域名下的解析记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public OperateRRResponse operateRR(OperateRRRequest request) throws JdcloudSdkException {
        return new OperateRRExecutor().client(this).execute(request);
    }

    /**
     * 删除域名的自定义解析线路的IP段
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DelUserViewIPResponse delUserViewIP(DelUserViewIPRequest request) throws JdcloudSdkException {
        return new DelUserViewIPExecutor().client(this).execute(request);
    }

    /**
     * 查看主域名的监控项的配置以及状态
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetMonitorResponse getMonitor(GetMonitorRequest request) throws JdcloudSdkException {
        return new GetMonitorExecutor().client(this).execute(request);
    }

    /**
     * 域名的监控项修改
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateMonitorResponse updateMonitor(UpdateMonitorRequest request) throws JdcloudSdkException {
        return new UpdateMonitorExecutor().client(this).execute(request);
    }

    /**
     * 查询域名的自定义解析线路的IP段
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetUserViewIPResponse getUserViewIP(GetUserViewIPRequest request) throws JdcloudSdkException {
        return new GetUserViewIPExecutor().client(this).execute(request);
    }

    /**
     * 查询子域名的可用监控对象
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetTargetsResponse getTargets(GetTargetsRequest request) throws JdcloudSdkException {
        return new GetTargetsExecutor().client(this).execute(request);
    }

    /**
     * 主域名的监控项的报警信息
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetMonitorAlarmInfoResponse getMonitorAlarmInfo(GetMonitorAlarmInfoRequest request) throws JdcloudSdkException {
        return new GetMonitorAlarmInfoExecutor().client(this).execute(request);
    }

    /**
     * 添加子域名的监控项，默认把子域名的所有监控项都添加上监控
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddMonitorResponse addMonitor(AddMonitorRequest request) throws JdcloudSdkException {
        return new AddMonitorExecutor().client(this).execute(request);
    }

    /**
     * 修改主域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateDomainResponse updateDomain(UpdateDomainRequest request) throws JdcloudSdkException {
        return new UpdateDomainExecutor().client(this).execute(request);
    }

    /**
     * 修改主域名的某个解析记录
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UpdateRRResponse updateRR(UpdateRRRequest request) throws JdcloudSdkException {
        return new UpdateRRExecutor().client(this).execute(request);
    }

    /**
     * 添加域名的自定义解析线路
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddUserViewResponse addUserView(AddUserViewRequest request) throws JdcloudSdkException {
        return new AddUserViewExecutor().client(this).execute(request);
    }

    /**
     * 查询主域名的解析记录。&lt;br&gt;
在使用解析记录相关的接口之前，请调用此接口获取解析记录的列表。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public SearchRRResponse searchRR(SearchRRRequest request) throws JdcloudSdkException {
        return new SearchRRExecutor().client(this).execute(request);
    }

    /**
     * 查询域名的自定义解析线路
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetUserViewResponse getUserView(GetUserViewRequest request) throws JdcloudSdkException {
        return new GetUserViewExecutor().client(this).execute(request);
    }

    /**
     * 查询用户名下的主域名列表。&lt;br&gt;    
请在调用域名相关的API之前，调用此API获取相关的domainId和domainName。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetDomainsResponse getDomains(GetDomainsRequest request) throws JdcloudSdkException {
        return new GetDomainsExecutor().client(this).execute(request);
    }

    /**
     * 添加主域名
     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public AddDomainResponse addDomain(AddDomainRequest request) throws JdcloudSdkException {
        return new AddDomainExecutor().client(this).execute(request);
    }

    /**
     * 查询云解析所有的基础解析线路。&lt;br&gt;
在使用解析线路的参数之前，请调用此接口获取解析线路的ID。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public GetViewTreeResponse getViewTree(GetViewTreeRequest request) throws JdcloudSdkException {
        return new GetViewTreeExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public ClouddnsserviceClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private ClouddnsserviceClient clouddnsserviceClient;

        public DefaultBuilder() {
            clouddnsserviceClient = new ClouddnsserviceClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            clouddnsserviceClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            clouddnsserviceClient.httpRequestConfig = config;
            return this;
        }

        public ClouddnsserviceClient build() throws JdcloudSdkException {

            if (clouddnsserviceClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                clouddnsserviceClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (clouddnsserviceClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("ClouddnsserviceClient build error: jdcloud credentials provider not set");
                }
            }
            if (clouddnsserviceClient.httpRequestConfig == null) {
                clouddnsserviceClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (clouddnsserviceClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("ClouddnsserviceClient build error: http request config not set");
                }
            }
            return clouddnsserviceClient;
        }

        public Builder environment(Environment environment) {
            clouddnsserviceClient.environment = environment;
            return this;
        }
    }
}
