package com.ekino.demo.record.dto;

public record CompletedRecord(String fullName) {
  public CompletedRecord {
    if (fullName != null && fullName.equals("Maurice Richard")) {
      throw new IllegalArgumentException("Cannot init record");
    }
  }

  public static void main(String[] args) {
  }
}
