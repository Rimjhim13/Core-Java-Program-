package com.allexample.classesEx.innerclasses;

public class localvariable {
int x=101;
    void show(){
     // int x=10;
        System.out.println("x="+x);

        class Inner{
            void show1(){
                System.out.println("Inner x="+ x);
            }
        }
        Inner i=new Inner();
        i.show1();
    }
}
