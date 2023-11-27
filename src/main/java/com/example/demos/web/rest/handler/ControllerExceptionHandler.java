package com.example.demos.web.rest.handler;

import com.example.demos.exeption.FahdException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerExceptionHandler {

    //@ExceptionHandler(FahdException.class)
    //public ResponseEntity ifFahdException(FahdException fahdException, WebRequest request){
     //   return new ResponseEntity(fahdException.getIntegerStringMap(), HttpStatus.NOT_FOUND);
   // }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity ifUserNotValid(MethodArgumentNotValidException e){
        Map<String,String> errors = new HashMap<>();
        e.getBindingResult().getAllErrors().forEach(error->{
            errors.put(
                    ((FieldError) error).getField(),
                    error.getDefaultMessage()
            );
        });
        return ResponseEntity.badRequest().body(errors);
    }

}
