package com.ekino.demo.record.api;

import com.ekino.demo.record.properties.ExampleProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SomeRestController {

  private final ExampleProperties exampleProperties;

  @GetMapping("/prop")
  public ExampleProperties getProperty() {
    return exampleProperties;
  }
}
