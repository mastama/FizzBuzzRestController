package com.hackerrank.restcontrolleradvice.dto;

import lombok.Getter;

public class FizzException extends RuntimeException {

  private final String message;
  @Getter
  private final String errorReason;

  public FizzException(String message, String errorReason) {
    this.message = message;
    this.errorReason = errorReason;
  }

  public FizzException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1, String errorReason) {
    super(message, cause, enableSuppression, writableStackTrace);
    this.message = message1;
    this.errorReason = errorReason;
  }

  @Override
  public String getMessage() {
    return message;
  }

}
