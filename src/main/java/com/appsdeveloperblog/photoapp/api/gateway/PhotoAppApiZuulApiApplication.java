package com.appsdeveloperblog.photoapp.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@EnableZuulProxy
//@EnableEurekaClient
@SpringBootApplication
public class PhotoAppApiZuulApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppApiZuulApiApplication.class, args);
    }

}
