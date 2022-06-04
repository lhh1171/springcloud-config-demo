package com.springcloud.configclient2.controller;

import com.springcloud.configclient2.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo")
    public String demo(){
        return demoService.demo();
    }
}
