package com.allexample.classesEx.innerclasses;

public class StaticInnerClass {
static void method(){
        System.out.println("calling outer class method");
    }
   static class Inner{
     //  static void method2(){ not allow satic declation in inner class method
    static void method2(){
            System.out.println("calling inner class method");
        StaticInnerClass.method();
        }
    }
}
