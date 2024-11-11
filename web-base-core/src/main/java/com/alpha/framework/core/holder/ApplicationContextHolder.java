package com.alpha.framework.core.holder;

import org.springframework.context.ApplicationContext;

public class ApplicationContextHolder {

    private static ApplicationContext applicationContext;

    public ApplicationContextHolder(ApplicationContext applicationContext) {
        ApplicationContextHolder.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

}
