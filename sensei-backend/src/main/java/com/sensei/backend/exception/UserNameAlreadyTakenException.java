package com.sensei.backend.exception;

public class UserNameAlreadyTakenException extends RuntimeException{

    public UserNameAlreadyTakenException(){
        super("UserName is Already Taken");
    }

}
