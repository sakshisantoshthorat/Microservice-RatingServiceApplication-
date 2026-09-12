package com.microservice.UserService.exception;

public class ResourceNotFoundException extends RuntimeException{
    //use all methods of RuntimeException

    public ResourceNotFoundException(){
        super("Resource not found ");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
