package com.boa.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = DemoProperties.DEMO_PREFIX)
public class DemoProperties {

    public static final String DEMO_PREFIX = "demo";

    private String name;

}
