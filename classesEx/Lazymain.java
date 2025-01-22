package com.allexample.classesEx;

public class Lazymain {
    public static void main(String ar[]){
        LazySingleton lazyobject1=LazySingleton.get();
        LazySingleton lazyobject2=LazySingleton.get();
        if(lazyobject2==lazyobject2){
            System.out.println("both are same");
        }
    }
}
