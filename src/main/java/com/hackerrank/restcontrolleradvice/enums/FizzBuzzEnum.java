package com.hackerrank.restcontrolleradvice.enums;

import lombok.Getter;

@Getter
public enum FizzBuzzEnum {
  FIZZ("fizz"),
  BUZZ("buzz"),
  FIZZBUZZ("fizzbuzz");

  private final String value;

  FizzBuzzEnum(String value) {
    this.value = value;
  }

    public static FizzBuzzEnum getStatus(String value) {
      return switch (value) {
          case "Fizz" -> FizzBuzzEnum.FIZZ;
          case "Buzz" -> FizzBuzzEnum.BUZZ;
          case "FizzBuzz" -> FizzBuzzEnum.FIZZBUZZ;
          default -> null;
      };
  }
}
