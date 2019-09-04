package com.sugat.automation.customexecption;

public class CustCompileTimeException extends Exception {

    public CustCompileTimeException(){
        super();
    }

    public CustCompileTimeException(String message){
        super(message);
    }
}
