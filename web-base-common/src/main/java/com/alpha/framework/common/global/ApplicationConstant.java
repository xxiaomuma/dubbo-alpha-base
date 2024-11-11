package com.alpha.framework.common.global;

import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Value;

/**
 * 应用全局信息
 */
public class ApplicationConstant {

    /**
     * 端口
     */
    @Value("${server.port}")
    public int port;

    /**
     * 应用名称
     */
    @Value("${spring.application.name}")
    public String applicationName;

    /**
     * 环境
     */
    @Value("${spring.profiles.active:dev}")
    public String profile;

    public boolean isDevProfile() {
        return StrUtil.isBlank(profile) || StrUtil.equalsIgnoreCase(profile, "DEV");
    }

    public boolean isTestProfile() {
        return StrUtil.equalsIgnoreCase(profile, "TEST");
    }

    public boolean isPrevProfile() {
        return StrUtil.equalsIgnoreCase(profile, "PREV");
    }

    public boolean isProdProfile() {
        return StrUtil.equalsIgnoreCase(profile, "PROD");
    }

}
