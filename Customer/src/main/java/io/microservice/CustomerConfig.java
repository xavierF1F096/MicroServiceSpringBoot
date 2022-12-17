package io.microservice;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {
    @Bean
    @LoadBalanced//distribulle el registro uno para cada instacia ejecutacuando ay fraudes¡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
