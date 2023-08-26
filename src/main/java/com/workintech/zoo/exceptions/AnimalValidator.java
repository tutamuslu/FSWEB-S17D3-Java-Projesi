package com.workintech.zoo.exceptions;

import org.springframework.http.HttpStatus;

public class AnimalValidator {
    public static void idIdValid(int id){
        if(id <= 0){
            throw new AnimalException("Id is not valid: " + id, HttpStatus.BAD_REQUEST );
        }
    }
}
