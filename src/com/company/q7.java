package com.company;

class  myException extends Exception{
    myException(String str)
    {
        super(str);
    }
}


public class q7 {
    public static void main(String[] args) {
        try {
            System.out.println("executing try block");
            throw new myException("Error,This is incorrect");
        }
        catch (myException e){
            System.out.println(e);
        }
        finally {
            System.out.println("So where are inside finally");
        }
    }
}
