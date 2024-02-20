package com.sensei.backend.exception;

public class IncorrectPasswordException extends RuntimeException{

    public IncorrectPasswordException(){
        super("Incorrect Password Entered");
    }

}
