package com.example.Springboot_flight_service_001.exeception;

public class insufficientAmountException extends RuntimeException{
    public insufficientAmountException(String msg){
        super(msg);
    }
}
