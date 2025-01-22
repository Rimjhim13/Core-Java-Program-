package com.allexample.garbagecollector;

public class ExcepInFinalize {
    public static void main(String ar[]){

        ExcepInFinalize f = new  ExcepInFinalize();

        f = null;
        System.gc();
        System.out.println("End");
    }
    public void finalize(){
        try {
            System.out.println(10 / 0);
        }
        catch (Exception e){
            System.out.println("Handle by manually"+e);
        }
        System.out.println("Finalize method");




    }
}
