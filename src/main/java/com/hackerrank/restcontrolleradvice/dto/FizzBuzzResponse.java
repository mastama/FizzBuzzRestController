package com.hackerrank.restcontrolleradvice.dto;

import lombok.Data;

@Data
public class FizzBuzzResponse {
  private String message;
  private int statusCode;

  public FizzBuzzResponse(String message, int statusCode) {
    this.message = message;
    this.statusCode = statusCode;
  }
}
