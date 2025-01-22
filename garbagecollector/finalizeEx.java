package com.allexample.garbagecollector;

public class finalizeEx {
    public static void main(String ar[]){
        String s = new String("Ram");
        s = null;
        System.gc();
        System.out.println("End");
    }
  public void finalize(){
            System.out.println("Finalize method");


    }
}
