package com.ekino.demo.record.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("record")
public record ExampleProperties(
    List<String> listProperty) {
}
