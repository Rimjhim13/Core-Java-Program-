package com.allexample.garbagecollector;

public class ExceptionHandleFinalize {
    public static void main(String ar[]){

        ExcepInFinalize f = new  ExcepInFinalize();

        f = null;
        System.gc();
        System.out.println("End");
    }
    public void finalize(){
        System.out.println(10/0);
        System.out.println("Finalize method");

    }
}
