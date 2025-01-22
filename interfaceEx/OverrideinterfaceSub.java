package com.allexample.interfaceEx;

public interface OverrideinterfaceSub extends Overrideinterface {

    default void show(){
        System.out.println("ram2");
    }
}
