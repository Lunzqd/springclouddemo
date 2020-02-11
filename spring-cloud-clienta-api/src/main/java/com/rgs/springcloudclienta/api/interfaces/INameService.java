package com.rgs.springcloudclienta.api.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="app1")
public interface INameService {

    @RequestMapping(value="/getName",method= RequestMethod.GET)
    String getName();
}
