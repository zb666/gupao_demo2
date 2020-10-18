package com.gupaoedu.demo01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({UserService.class})
public class JavaConfig {

    @Bean
    public UserService getUserService(){
        return new UserService();
    }

}
