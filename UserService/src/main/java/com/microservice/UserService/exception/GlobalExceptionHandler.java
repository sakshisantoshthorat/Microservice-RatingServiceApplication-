package com.microservice.UserService.exception;

//client server se communicate krke hme response dega
//postman se req -> error aayenge ->
//server ko de rhe hai data but wo send nhi ho rha

import com.microservice.UserService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice  //konse bhi controller ko apply
public class GlobalExceptionHandler {

public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex){
    String message = ex.getMessage();
    ApiResponse response = ApiResponse.builder().message(message).success(true).httpStatus(HttpStatus.NOT_FOUND).build();
    return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
}
}
