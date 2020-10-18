/**
 * Copyright (c) 2020-2025. www.zntie.com All Rights Reserved.
 * 项目名称：隧道监控平台
 * 类名称：ImgInfo.java
 * 创建人：nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 项目官网:
 */
package com.djn.cn.spring.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * <b>类  名：</b>com.djn.cn.spring.mongo.entity.ImgInfo<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>nie-dongjia<br/>
 * <b>创建时间：</b>2020/10/13 22:32<br/>
 * <b>修改人：</b>nie-dongjia<br/>
 * <b>修改时间：</b>2020/10/13 22:32<br/>
 * <b>修改备注：</b><br/>
 * @version 1.0<br />
 *
 */
@Document(collection="T_BD_ImgInfo")
public class ImgInfo {
    @Id
    private String id;

    private String uploadUserId;

    private String title;

    private Integer systemType;

    private Integer type;

    private String url;

    private String linkUrl;

    private Integer showState;

    private Date createDate;

    private Date updateDate;

    private String remark;

    private String bEnable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUploadUserId() {
        return uploadUserId;
    }

    public void setUploadUserId(String uploadUserId) {
        this.uploadUserId = uploadUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public void setSystemType(Integer systemType) {
        this.systemType = systemType;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getShowState() {
        return showState;
    }

    public void setShowState(Integer showState) {
        this.showState = showState;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getbEnable() {
        return bEnable;
    }

    public void setbEnable(String bEnable) {
        this.bEnable = bEnable;
    }
}
