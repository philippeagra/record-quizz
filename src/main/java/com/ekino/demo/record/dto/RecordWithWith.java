package com.ekino.demo.record.dto;

import lombok.With;

public record RecordWithWith(
    @With
    String name,
    int age
) {

  public static void main(String[] args) {
    var first = new RecordWithWith("name", 0);
    var second = first.withName("name");
    var third = new RecordWithWith("name", 0);

    var ref1 = System.identityHashCode(first);
    var ref2 = System.identityHashCode(second);
    var ref3 = System.identityHashCode(third);

    System.out.println(ref1 + " " + ref2 + " " + ref3);

  }
}
