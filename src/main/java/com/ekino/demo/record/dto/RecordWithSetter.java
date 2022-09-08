package com.ekino.demo.record.dto;

import lombok.Setter;

import java.util.Arrays;
import java.util.Collections;

public record RecordWithSetter(
    @Setter
    String name,
    int age
) {

  public static void main(String[] args) {
    var record = new RecordWithSetter("name", 0);

    Collections.shuffle(Arrays.asList("", "", ""));
  }
}
