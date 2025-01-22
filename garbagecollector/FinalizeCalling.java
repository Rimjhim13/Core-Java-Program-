package com.allexample.garbagecollector;

public class FinalizeCalling {
    public static void main(String ar[]){
       FinalizeCalling f = new FinalizeCalling();
        f = null;
        System.gc();
        System.out.println("End");
    }
    public void finalize(){
        System.out.println("Finalize method");


    }
}
