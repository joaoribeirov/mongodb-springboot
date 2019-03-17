package com.joaorvieira.mongodbspringboot.resource.exception;

import com.joaorvieira.mongodbspringboot.services.exception.ObjectUserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectUserNotFoundException.class)
    public ResponseEntity<StandartError> objectNotFound(ObjectUserNotFoundException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandartError err = new StandartError(System.currentTimeMillis(),status.value(), "Nao encontrando", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

}
