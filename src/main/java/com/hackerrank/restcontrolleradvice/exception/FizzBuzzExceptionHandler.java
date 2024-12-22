package com.hackerrank.restcontrolleradvice.exception;

import com.hackerrank.restcontrolleradvice.dto.BuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzBuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzException;
import com.hackerrank.restcontrolleradvice.dto.GlobalError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class FizzBuzzExceptionHandler extends ResponseEntityExceptionHandler {

    public FizzBuzzExceptionHandler() {
        super();
    }

    // Handle FizzException
    @ExceptionHandler(FizzException.class)
    public ResponseEntity<GlobalError> handleFizzException(FizzException ex) {
        GlobalError error = new GlobalError("Fizz Exception has been thrown", ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR); // 500
    }

    // Handle BuzzException
    @ExceptionHandler(BuzzException.class)
    public ResponseEntity<GlobalError> handleBuzzException(BuzzException ex) {
        GlobalError error = new GlobalError("Buzz Exception has been thrown", ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST); // 400
    }

    // Handle FizzBuzzException
    @ExceptionHandler(FizzBuzzException.class)
    public ResponseEntity<GlobalError> handleFizzBuzzException(FizzBuzzException ex) {
        GlobalError error = new GlobalError("FizzBuzz Exception has been thrown", ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.INSUFFICIENT_STORAGE); // 507
    }
}
