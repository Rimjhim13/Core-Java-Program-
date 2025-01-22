package com.allexample.interfaceEx.functionalinterface;

public interface Inter2 {
    abstract void show2();
    default void display2(){
        System.out.println("Inter2 default");
    }
}
