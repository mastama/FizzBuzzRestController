package com.hackerrank.restcontrolleradvice.controller;

import com.hackerrank.restcontrolleradvice.dto.BuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzBuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzBuzzResponse;
import com.hackerrank.restcontrolleradvice.dto.FizzException;
import com.hackerrank.restcontrolleradvice.enums.FizzBuzzEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

  @GetMapping(value = "/controller_advice/{code}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<FizzBuzzResponse> getFizzBuzzResponse(@PathVariable("code") String code)
          throws FizzException, BuzzException, FizzBuzzException {
    if (FizzBuzzEnum.FIZZ.getValue().equals(code)) {
      //throw new FizzException
      throw new FizzException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), "Invalid code for Fizz operation");
    } else if (FizzBuzzEnum.BUZZ.getValue().equals(code)) {
      //throw new BuzzException
      throw new BuzzException(HttpStatus.BAD_REQUEST.getReasonPhrase(), "Invalid code for Buzz operation");
    } else if (FizzBuzzEnum.FIZZBUZZ.getValue().equals(code)) {
      //throw new FizzBuzzException
      throw new FizzBuzzException(HttpStatus.INSUFFICIENT_STORAGE.getReasonPhrase(), "Invalid code for FizzBuzz operation");
    }
    //return FizzBuzzResponse
    FizzBuzzResponse response = new FizzBuzzResponse("Successfully completed fizzbuzz test", HttpStatus.OK.value());
    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
