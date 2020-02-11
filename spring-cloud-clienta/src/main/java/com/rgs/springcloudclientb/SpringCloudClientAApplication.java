package com.rgs.springcloudclientb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientAApplication.class, args);
    }


}
