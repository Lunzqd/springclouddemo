package com.rgs.springcloudclientb.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @RequestMapping("/getName")
    public String getName() {
        return "Martin" ;
    }
}
