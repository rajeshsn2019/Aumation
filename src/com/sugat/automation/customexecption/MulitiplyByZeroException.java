package com.sugat.automation.customexecption;

public class MulitiplyByZeroException extends RuntimeException {

    public MulitiplyByZeroException(){
        super();
    }

    public MulitiplyByZeroException(String message){
        super(message);
    }
}
