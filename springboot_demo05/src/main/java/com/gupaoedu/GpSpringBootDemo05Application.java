package com.gupaoedu;

import com.gupaoedu.filter.SecondFilter;
import com.gupaoedu.listener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class GpSpringBootDemo05Application {

    public static void main(String[] args) {
        SpringApplication.run(GpSpringBootDemo05Application.class,args);
    }

    @Bean
    public ServletRegistrationBean getRegistrationBean(){
        // 将要添加的Servlet封装为一个ServletRegistrationBean对象
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new SecondServlet());
        // 设置映射信息
        registrationBean.addUrlMappings("/second");
        return registrationBean;
    }


    @Bean
    public FilterRegistrationBean getRegistractionBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
        bean.addUrlPatterns("/second");
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean getListenerRegistrationBean(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new SecondListener());
        return bean;
    }

}
