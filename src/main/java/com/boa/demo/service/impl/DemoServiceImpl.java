package com.boa.demo.service.impl;

import com.boa.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoServiceImpl implements DemoService {

    private String name;

    public DemoServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void demoMethod() {
        log.info("demo starter name is : {}", name);
    }

}
