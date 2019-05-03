package org.cnu.realcoding.RCLOL.RCLOL.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class LoLConfig {


    @Bean
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }
}
