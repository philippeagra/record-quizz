package com.ekino.demo.record.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConfigurationPropertiesScan("com.ekino.demo.record.properties")
public class PropertiesConfig {
}
