package com.hackerrank.restcontrolleradvice.dto;

import lombok.Data;

@Data
public class GlobalError {
  private String message;
  private String errorReason;

  public GlobalError() {
  }

  public GlobalError(String message, String errorReason) {
    this.message = message;
    this.errorReason = errorReason;
  }

}
