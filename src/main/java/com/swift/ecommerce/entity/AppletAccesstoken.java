package com.swift.ecommerce.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (AppletAccesstoken)实体类
 *
 * @author makejava
 * @since 2025-01-09 00:20:44
 */
public class AppletAccesstoken implements Serializable {
    private static final long serialVersionUID = 494440986892047000L;
    /**
     * ID序号
     */
    private Integer id;
    /**
     * Union ID
     */
    private String unionid;
    /**
     * Open ID
     */
    private String openid;
    /**
     * Session Key
     */
    private String sessionKey;
    /**
     * Access Token
     */
    private String accessToken;
    /**
     * 过期时间
     */
    private Date expireTime;

    private Integer customerId;
    /**
     * openid 来源
     */
    private String type;
    /**
     * 微信昵称
     */
    private String nickname;
    /**
     * 微信头像
     */
    private String avatar;

    private Integer isActive;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

}

