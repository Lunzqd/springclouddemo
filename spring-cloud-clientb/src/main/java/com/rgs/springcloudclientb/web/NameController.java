package com.rgs.springcloudclientb.web;

import com.rgs.springcloudclienta.api.interfaces.INameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NameController {

    @Autowired
    INameService nameService;

//    @Autowired
//    RestTemplate restTemplate;

    @RequestMapping("/getName")
    public String getName() {

        //String obj=restTemplate.getForObject("http://app1/getName",String.class);
        String obj=nameService.getName();
        return "Hi,"+obj;
    }
}
