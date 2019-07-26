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

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.vpc.model.ElasticIpSpec;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * instanceSpec
 */
public class InstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 高可用组Id。指定了此参数后，只能通过高可用组关联的实例模板创建虚机，并且实例模板中的参数不可覆盖替换。实例模板以外的参数还可以指定。
     */
    private String agId;

    /**
     * 实例模板id，如果没有使用高可用组，那么对于实例模板中没有的信息，需要使用创建虚机的参数进行补充，或者选择覆盖启动模板中的参数。
     */
    private String instanceTemplateId;

    /**
     * 云主机所属的可用区。
     */
    private String az;

    /**
     * 实例规格。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域或可用区的规格信息。
     */
    private String instanceType;

    /**
     * 镜像ID。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeimages&quot;&gt;DescribeImages&lt;/a&gt;接口获得指定地域的镜像信息。
     */
    private String imageId;

    /**
     * 云主机名称，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     * Required:true
     */
    @Required
    private String name;

    /**
     * 密码，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     */
    private String password;

    /**
     * 密钥对名称，当前只支持传入一个。
     */
    private List<String> keyNames;

    /**
     * 主网卡主IP关联的弹性IP规格
     */
    private ElasticIpSpec elasticIp;

    /**
     * 主网卡配置信息
     */
    private InstanceNetworkInterfaceAttachmentSpec primaryNetworkInterface;

    /**
     * 系统盘配置信息
     */
    private InstanceDiskAttachmentSpec systemDisk;

    /**
     * 数据盘配置信息，本地盘(local类型)做系统盘的云主机可挂载8块数据盘，云硬盘(cloud类型)做系统盘的云主机可挂载7块数据盘。
     */
    private List<InstanceDiskAttachmentSpec> dataDisks;

    /**
     * 计费配置
云主机不支持按用量方式计费，默认为按配置计费。
打包创建数据盘的情况下，数据盘的计费方式只能与云主机保持一致。
打包创建弹性公网IP的情况下，若公网IP的计费方式没有指定为按用量计费，那么公网IP计费方式只能与云主机保持一致。

     */
    private ChargeSpec charge;

    /**
     * 元数据信息，目前只支持传入一个key为&quot;launch-script&quot;，表示首次启动脚本。value为base64格式。
launch-script：linux系统支持bash和python，编码前须分别以 #!/bin/bash 和 #!/usr/bin/env python 作为内容首行;
launch-script：windows系统支持bat和powershell，编码前须分别以 &lt;cmd&gt;&lt;/cmd&gt; 和 &lt;powershell&gt;&lt;/powershell&gt; 作为内容首、尾行。

     */
    private List<Userdata> userdata;

    /**
     * 主机描述，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     */
    private String description;

    /**
     * 不使用模板中的密码。
仅当不使用Ag，并且使用了模板，并且password参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了password参数时，此参数无效，以新指定的为准。

     */
    private Boolean noPassword;

    /**
     * 不使用模板中的密钥。
仅当不使用Ag，并且使用了模板，并且keynames参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了keynames参数时，此参数无效，以新指定的为准。

     */
    private Boolean noKeyNames;

    /**
     * 不使用模板中的弹性公网IP。
仅当不使用Ag，并且使用了模板，并且elasticIp参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了elasticIp参数时，此参数无效，以新指定的为准。
     */
    private Boolean noElasticIp;


    /**
     * get 高可用组Id。指定了此参数后，只能通过高可用组关联的实例模板创建虚机，并且实例模板中的参数不可覆盖替换。实例模板以外的参数还可以指定。
     *
     * @return
     */
    public String getAgId() {
        return agId;
    }

    /**
     * set 高可用组Id。指定了此参数后，只能通过高可用组关联的实例模板创建虚机，并且实例模板中的参数不可覆盖替换。实例模板以外的参数还可以指定。
     *
     * @param agId
     */
    public void setAgId(String agId) {
        this.agId = agId;
    }

    /**
     * get 实例模板id，如果没有使用高可用组，那么对于实例模板中没有的信息，需要使用创建虚机的参数进行补充，或者选择覆盖启动模板中的参数。
     *
     * @return
     */
    public String getInstanceTemplateId() {
        return instanceTemplateId;
    }

    /**
     * set 实例模板id，如果没有使用高可用组，那么对于实例模板中没有的信息，需要使用创建虚机的参数进行补充，或者选择覆盖启动模板中的参数。
     *
     * @param instanceTemplateId
     */
    public void setInstanceTemplateId(String instanceTemplateId) {
        this.instanceTemplateId = instanceTemplateId;
    }

    /**
     * get 云主机所属的可用区。
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 云主机所属的可用区。
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 实例规格。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域或可用区的规格信息。
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例规格。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域或可用区的规格信息。
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 镜像ID。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeimages&quot;&gt;DescribeImages&lt;/a&gt;接口获得指定地域的镜像信息。
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeimages&quot;&gt;DescribeImages&lt;/a&gt;接口获得指定地域的镜像信息。
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 云主机名称，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 云主机名称，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 密码，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 密码，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get 密钥对名称，当前只支持传入一个。
     *
     * @return
     */
    public List<String> getKeyNames() {
        return keyNames;
    }

    /**
     * set 密钥对名称，当前只支持传入一个。
     *
     * @param keyNames
     */
    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }

    /**
     * get 主网卡主IP关联的弹性IP规格
     *
     * @return
     */
    public ElasticIpSpec getElasticIp() {
        return elasticIp;
    }

    /**
     * set 主网卡主IP关联的弹性IP规格
     *
     * @param elasticIp
     */
    public void setElasticIp(ElasticIpSpec elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * get 主网卡配置信息
     *
     * @return
     */
    public InstanceNetworkInterfaceAttachmentSpec getPrimaryNetworkInterface() {
        return primaryNetworkInterface;
    }

    /**
     * set 主网卡配置信息
     *
     * @param primaryNetworkInterface
     */
    public void setPrimaryNetworkInterface(InstanceNetworkInterfaceAttachmentSpec primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
    }

    /**
     * get 系统盘配置信息
     *
     * @return
     */
    public InstanceDiskAttachmentSpec getSystemDisk() {
        return systemDisk;
    }

    /**
     * set 系统盘配置信息
     *
     * @param systemDisk
     */
    public void setSystemDisk(InstanceDiskAttachmentSpec systemDisk) {
        this.systemDisk = systemDisk;
    }

    /**
     * get 数据盘配置信息，本地盘(local类型)做系统盘的云主机可挂载8块数据盘，云硬盘(cloud类型)做系统盘的云主机可挂载7块数据盘。
     *
     * @return
     */
    public List<InstanceDiskAttachmentSpec> getDataDisks() {
        return dataDisks;
    }

    /**
     * set 数据盘配置信息，本地盘(local类型)做系统盘的云主机可挂载8块数据盘，云硬盘(cloud类型)做系统盘的云主机可挂载7块数据盘。
     *
     * @param dataDisks
     */
    public void setDataDisks(List<InstanceDiskAttachmentSpec> dataDisks) {
        this.dataDisks = dataDisks;
    }

    /**
     * get 计费配置
云主机不支持按用量方式计费，默认为按配置计费。
打包创建数据盘的情况下，数据盘的计费方式只能与云主机保持一致。
打包创建弹性公网IP的情况下，若公网IP的计费方式没有指定为按用量计费，那么公网IP计费方式只能与云主机保持一致。

     *
     * @return
     */
    public ChargeSpec getCharge() {
        return charge;
    }

    /**
     * set 计费配置
云主机不支持按用量方式计费，默认为按配置计费。
打包创建数据盘的情况下，数据盘的计费方式只能与云主机保持一致。
打包创建弹性公网IP的情况下，若公网IP的计费方式没有指定为按用量计费，那么公网IP计费方式只能与云主机保持一致。

     *
     * @param charge
     */
    public void setCharge(ChargeSpec charge) {
        this.charge = charge;
    }

    /**
     * get 元数据信息，目前只支持传入一个key为&quot;launch-script&quot;，表示首次启动脚本。value为base64格式。
launch-script：linux系统支持bash和python，编码前须分别以 #!/bin/bash 和 #!/usr/bin/env python 作为内容首行;
launch-script：windows系统支持bat和powershell，编码前须分别以 &lt;cmd&gt;&lt;/cmd&gt; 和 &lt;powershell&gt;&lt;/powershell&gt; 作为内容首、尾行。

     *
     * @return
     */
    public List<Userdata> getUserdata() {
        return userdata;
    }

    /**
     * set 元数据信息，目前只支持传入一个key为&quot;launch-script&quot;，表示首次启动脚本。value为base64格式。
launch-script：linux系统支持bash和python，编码前须分别以 #!/bin/bash 和 #!/usr/bin/env python 作为内容首行;
launch-script：windows系统支持bat和powershell，编码前须分别以 &lt;cmd&gt;&lt;/cmd&gt; 和 &lt;powershell&gt;&lt;/powershell&gt; 作为内容首、尾行。

     *
     * @param userdata
     */
    public void setUserdata(List<Userdata> userdata) {
        this.userdata = userdata;
    }

    /**
     * get 主机描述，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 主机描述，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 不使用模板中的密码。
仅当不使用Ag，并且使用了模板，并且password参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了password参数时，此参数无效，以新指定的为准。

     *
     * @return
     */
    public Boolean getNoPassword() {
        return noPassword;
    }

    /**
     * set 不使用模板中的密码。
仅当不使用Ag，并且使用了模板，并且password参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了password参数时，此参数无效，以新指定的为准。

     *
     * @param noPassword
     */
    public void setNoPassword(Boolean noPassword) {
        this.noPassword = noPassword;
    }

    /**
     * get 不使用模板中的密钥。
仅当不使用Ag，并且使用了模板，并且keynames参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了keynames参数时，此参数无效，以新指定的为准。

     *
     * @return
     */
    public Boolean getNoKeyNames() {
        return noKeyNames;
    }

    /**
     * set 不使用模板中的密钥。
仅当不使用Ag，并且使用了模板，并且keynames参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了keynames参数时，此参数无效，以新指定的为准。

     *
     * @param noKeyNames
     */
    public void setNoKeyNames(Boolean noKeyNames) {
        this.noKeyNames = noKeyNames;
    }

    /**
     * get 不使用模板中的弹性公网IP。
仅当不使用Ag，并且使用了模板，并且elasticIp参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了elasticIp参数时，此参数无效，以新指定的为准。
     *
     * @return
     */
    public Boolean getNoElasticIp() {
        return noElasticIp;
    }

    /**
     * set 不使用模板中的弹性公网IP。
仅当不使用Ag，并且使用了模板，并且elasticIp参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了elasticIp参数时，此参数无效，以新指定的为准。
     *
     * @param noElasticIp
     */
    public void setNoElasticIp(Boolean noElasticIp) {
        this.noElasticIp = noElasticIp;
    }


    /**
     * set 高可用组Id。指定了此参数后，只能通过高可用组关联的实例模板创建虚机，并且实例模板中的参数不可覆盖替换。实例模板以外的参数还可以指定。
     *
     * @param agId
     */
    public InstanceSpec agId(String agId) {
        this.agId = agId;
        return this;
    }

    /**
     * set 实例模板id，如果没有使用高可用组，那么对于实例模板中没有的信息，需要使用创建虚机的参数进行补充，或者选择覆盖启动模板中的参数。
     *
     * @param instanceTemplateId
     */
    public InstanceSpec instanceTemplateId(String instanceTemplateId) {
        this.instanceTemplateId = instanceTemplateId;
        return this;
    }

    /**
     * set 云主机所属的可用区。
     *
     * @param az
     */
    public InstanceSpec az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 实例规格。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeinstancetypes&quot;&gt;DescribeInstanceTypes&lt;/a&gt;接口获得指定地域或可用区的规格信息。
     *
     * @param instanceType
     */
    public InstanceSpec instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 镜像ID。可查询&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/describeimages&quot;&gt;DescribeImages&lt;/a&gt;接口获得指定地域的镜像信息。
     *
     * @param imageId
     */
    public InstanceSpec imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 云主机名称，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param name
     */
    public InstanceSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 密码，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param password
     */
    public InstanceSpec password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 密钥对名称，当前只支持传入一个。
     *
     * @param keyNames
     */
    public InstanceSpec keyNames(List<String> keyNames) {
        this.keyNames = keyNames;
        return this;
    }

    /**
     * set 主网卡主IP关联的弹性IP规格
     *
     * @param elasticIp
     */
    public InstanceSpec elasticIp(ElasticIpSpec elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * set 主网卡配置信息
     *
     * @param primaryNetworkInterface
     */
    public InstanceSpec primaryNetworkInterface(InstanceNetworkInterfaceAttachmentSpec primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
        return this;
    }

    /**
     * set 系统盘配置信息
     *
     * @param systemDisk
     */
    public InstanceSpec systemDisk(InstanceDiskAttachmentSpec systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }

    /**
     * set 数据盘配置信息，本地盘(local类型)做系统盘的云主机可挂载8块数据盘，云硬盘(cloud类型)做系统盘的云主机可挂载7块数据盘。
     *
     * @param dataDisks
     */
    public InstanceSpec dataDisks(List<InstanceDiskAttachmentSpec> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * set 计费配置
云主机不支持按用量方式计费，默认为按配置计费。
打包创建数据盘的情况下，数据盘的计费方式只能与云主机保持一致。
打包创建弹性公网IP的情况下，若公网IP的计费方式没有指定为按用量计费，那么公网IP计费方式只能与云主机保持一致。

     *
     * @param charge
     */
    public InstanceSpec charge(ChargeSpec charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set 元数据信息，目前只支持传入一个key为&quot;launch-script&quot;，表示首次启动脚本。value为base64格式。
launch-script：linux系统支持bash和python，编码前须分别以 #!/bin/bash 和 #!/usr/bin/env python 作为内容首行;
launch-script：windows系统支持bat和powershell，编码前须分别以 &lt;cmd&gt;&lt;/cmd&gt; 和 &lt;powershell&gt;&lt;/powershell&gt; 作为内容首、尾行。

     *
     * @param userdata
     */
    public InstanceSpec userdata(List<Userdata> userdata) {
        this.userdata = userdata;
        return this;
    }

    /**
     * set 主机描述，&lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/general_parameters&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param description
     */
    public InstanceSpec description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 不使用模板中的密码。
仅当不使用Ag，并且使用了模板，并且password参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了password参数时，此参数无效，以新指定的为准。

     *
     * @param noPassword
     */
    public InstanceSpec noPassword(Boolean noPassword) {
        this.noPassword = noPassword;
        return this;
    }

    /**
     * set 不使用模板中的密钥。
仅当不使用Ag，并且使用了模板，并且keynames参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了keynames参数时，此参数无效，以新指定的为准。

     *
     * @param noKeyNames
     */
    public InstanceSpec noKeyNames(Boolean noKeyNames) {
        this.noKeyNames = noKeyNames;
        return this;
    }

    /**
     * set 不使用模板中的弹性公网IP。
仅当不使用Ag，并且使用了模板，并且elasticIp参数为空时，此参数(值为true)生效。
若使用模板创建虚机时，又指定了elasticIp参数时，此参数无效，以新指定的为准。
     *
     * @param noElasticIp
     */
    public InstanceSpec noElasticIp(Boolean noElasticIp) {
        this.noElasticIp = noElasticIp;
        return this;
    }


    /**
     * add item to 密钥对名称，当前只支持传入一个。
     *
     * @param keyName
     */
    public void addKeyName(String keyName) {
        if (this.keyNames == null) {
            this.keyNames = new ArrayList<>();
        }
        this.keyNames.add(keyName);
    }

    /**
     * add item to 数据盘配置信息，本地盘(local类型)做系统盘的云主机可挂载8块数据盘，云硬盘(cloud类型)做系统盘的云主机可挂载7块数据盘。
     *
     * @param dataDisk
     */
    public void addDataDisk(InstanceDiskAttachmentSpec dataDisk) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisk);
    }

    /**
     * add item to 元数据信息，目前只支持传入一个key为&quot;launch-script&quot;，表示首次启动脚本。value为base64格式。
launch-script：linux系统支持bash和python，编码前须分别以 #!/bin/bash 和 #!/usr/bin/env python 作为内容首行;
launch-script：windows系统支持bat和powershell，编码前须分别以 &lt;cmd&gt;&lt;/cmd&gt; 和 &lt;powershell&gt;&lt;/powershell&gt; 作为内容首、尾行。

     *
     * @param userdata
     */
    public void addUserdata(Userdata userdata) {
        if (this.userdata == null) {
            this.userdata = new ArrayList<>();
        }
        this.userdata.add(userdata);
    }

}