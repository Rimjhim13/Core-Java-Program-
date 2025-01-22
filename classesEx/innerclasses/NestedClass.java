package com.allexample.classesEx.innerclasses;

public class NestedClass {
    private int x=10;
    void method(){
        System.out.println("super x="+x);
    }
    public class Inner{
        void method(){
            System.out.println(" Inner x="+x);
        }
    }
}
