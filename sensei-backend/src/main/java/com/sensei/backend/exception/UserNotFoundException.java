package com.sensei.backend.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(){
        super("The user does not exist with given credentials");
    }

}
