package com.boa.demo.config;

import com.boa.demo.service.DemoService;
import com.boa.demo.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
public class DemoAutoConfiguration {

    @Autowired
    DemoProperties demoProperties;

    @Bean
    @ConditionalOnMissingBean
    DemoService demoService() {
        return new DemoServiceImpl(demoProperties.getName());
    }

}
