package com.joaorvieira.mongodbspringboot.services.exception;

public class ObjectUserNotFoundException extends RuntimeException {

    public ObjectUserNotFoundException(String msg){
        super(msg);
    }

}
