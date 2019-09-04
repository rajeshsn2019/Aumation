package com.sugat.automation.pkg2;

import com.sugat.automation.customexecption.CustCompileTimeException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class B {

    void m1(){
        try {
            m2();
        } catch (CustCompileTimeException e) {
            e.printStackTrace();
        }
    }

    void m2() throws CustCompileTimeException {
        m3();
    }

    void m3() throws CustCompileTimeException {

        throw new CustCompileTimeException("");
    }

}
