package com.springcloud.configclient2.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class DemoServiceImpl implements DemoService{
    @Value("${my.content}")
    private String content;

    @Override
    public String demo() {
        return content;
    }
}
