package com.allexample.interfaceEx.functionalinterface;

public interface SubInter extends SuperInter {
//show
    default void display() {
        System.out.println("display default");
    }
}
