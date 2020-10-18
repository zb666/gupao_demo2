package com.gupaoedu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class FireWebConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //Locations 指定本地的文件
        registry.addResourceHandler("").addResourceLocations("file:E:/....");
        super.addResourceHandlers(registry);
    }
}
