package com.allexample.classesEx.innerclasses;
//We create Inner class in Static block,instance block,method,constructor in this way
public class InnerInConstructor {
//    InnerInConstructor(){
//{
static{
       class Inner{

            void show() {
              //  System.out.println("Inner class in Constructor");
//                System.out.println("Inner class instance block is call");
                System.out.println("Inner class Static block is call");
            }
        }
        Inner inner=new Inner();
        inner.show();
//        System.out.println("outer Constructor");
//    System.out.println("instance block");
    System.out.println("Static block");
    }
}
