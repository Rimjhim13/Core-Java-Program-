package com.allexample.garbagecollector;

public class ManuallyCallingFinalize {
    public static void main(String ar[]){

            ManuallyCallingFinalize f = new ManuallyCallingFinalize();
            f.finalize();
            f.finalize();
            f = null;
            System.gc();
            System.out.println("End");
        }
        public void finalize(){
            System.out.println("Finalize method");




    }
}
