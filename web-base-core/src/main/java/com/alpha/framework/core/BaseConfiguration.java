package com.alpha.framework.core;

import com.alpha.framework.common.global.ApplicationConstant;
import org.springframework.context.annotation.Bean;

public class BaseConfiguration {

    @Bean
    public ApplicationConstant applicationConstant() {
        return new ApplicationConstant();
    }
}
