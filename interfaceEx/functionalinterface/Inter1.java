package com.allexample.interfaceEx.functionalinterface;

public interface Inter1 {
   abstract void show2();
    default void display(){
        System.out.println("Inter1 default");
    }
}
