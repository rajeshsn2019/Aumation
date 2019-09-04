package com.sugat.automation.pkg1;

import com.sugat.automation.customexecption.MulitiplyByZeroException;
import com.sugat.automation.pkg2.B;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A {

    private int num1;
    private int num2;

   // public A(){

   // }

    public A(int num1,int num2)
    {
        this.num1 = num1;
        this.num2= num2;
    }

    public int getNum1(){
        return this.num1;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public int getNum2()
    {
        return this.num2;
    }


    public void setNum2(int num2)
    {
        this.num2 = num2;
    }

    public String toString(){
        return "Num1 : "+ this.num1 + " Num2:"+this.num2;
    }


    public void add(){
        System.out.println( " Addition :"+ (this.num1+this.num2 )) ;
    }

    public void sub(){
        System.out.println( " Sub :"+ (this.num1- this.num2) );
    }

    public void openFile() throws FileNotFoundException{

        File file = new File("C:\\Users\\sugat\\Desktop\\25Automation\\A.txt");


        FileInputStream fis = new FileInputStream(file);


    }

    public void mul(){
        if(this.num1 == 0 || this.num2==0)
            throw new MulitiplyByZeroException("You cant mul by 0");

        System.out.println( " Multiplication :"+ (this.num1*this.num2));
    }

    public void div(){

        //1
        try {
            int res = this.num1 / this.num2;
            System.out.println(" DIV :" + res);
        } catch ( ArithmeticException e){
            //e.printStackTrace();
            if(this.num2 ==0)
            System.out.println("You have passed num 2 ");
        }

        //2

        try{
            //add
            //sub
            //div
            //mul
        }
        catch (ArithmeticException e){

        }catch (NullPointerException ne){

        }catch (ArrayIndexOutOfBoundsException ae){

        } catch (Exception e){ //generic block

        }

        try{

            //db con open

            //.....

            //db close
        }catch (Exception e)
        {
            //.....

            //db close
        }finally {
            //db close
        }
    }


}
