package com.ekino.demo.record.dto;

import java.time.temporal.ChronoUnit;

public record GenericRecord<T, U>(T time, U unit) implements Printable {

  public static void main(String[] args) {
    GenericRecord<Long, ChronoUnit> record = new GenericRecord<>(300L, ChronoUnit.HOURS);
    System.out.println(record);
    record.print();
  }

  @Override
  public void print() {
    System.out.println("GenericRecord: " + time + " " + unit);
  }

}
