package com.allexample.interfaceEx;

public interface DefaultInterface1 {
    void display1();

    default void display2() {
        System.out.println("default method");
    }
   static void display3() {
        System.out.println("static method");
    }
}
