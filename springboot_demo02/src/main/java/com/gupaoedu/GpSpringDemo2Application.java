package com.gupaoedu;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class GpSpringDemo2Application {

    /**
     * main方法完成的是SpringIOC容器的初始化操作
     * 1. SpringBootApplication 注解
     * 2. 是一个组合注解
     * @param args
     */
    public static void main(String[] args) {
        //Spring IOC容器初始化  show Diagram 查看类图
        ApplicationContext applicationContext = SpringApplication.run(GpSpringDemo2Application.class, args);
    }

}
