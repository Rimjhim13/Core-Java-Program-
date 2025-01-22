package com.allexample.classesEx.innerclasses;

public class AbstractInner {
   abstract class Inner{
       abstract void show();
    }
    class Inner2 extends Inner{
        void show() {
            System.out.println("Calling");
        }
    }
}
