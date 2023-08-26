package com.workintech.zoo.exceptions;

import org.springframework.http.HttpStatus;

import java.util.Map;

public class AnimalValidator {
    public static void idIdValid(int id){
        if(id <= 0){
            throw new AnimalException("Id is not valid: " + id, HttpStatus.BAD_REQUEST );
        }
    }
    public static void iSIdNotExist(Map animals, int id){
        if(!animals.containsKey(id)) {
            throw new AnimalException("Animal with given id is not exist: " + id, HttpStatus.NOT_FOUND);
        }
    }
}
