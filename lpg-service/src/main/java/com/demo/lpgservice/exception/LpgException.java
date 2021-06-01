package com.demo.lpgservice.exception;

import lombok.Value;

@Value
public class LpgException extends Exception{

    private String errorMessage;
    private Throwable exc;

    public LpgException(String errorMessage, Throwable exc){
        super(errorMessage, exc);
        this.errorMessage = errorMessage;
        this.exc = exc;
    }
}
