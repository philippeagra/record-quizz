package com.ekino.demo.record.dto;

public record RecordWithInner(String name, int age) {

  public record InnerRecord(String name) {
  }

  public static void main(String[] args) {
    var record = new RecordWithInner("java", 31);

    var inner = new InnerRecord("");
  }
}
