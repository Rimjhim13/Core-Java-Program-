package com.allexample.classesEx.innerclasses;

public class FinalLocalVariable {
    void show(){
       final int x=10;
        System.out.println("x="+x);

        class Inner{
            void show1(){
                System.out.println("(Final)Inner x="+x);
            }
        }
        Inner i=new Inner();
        i.show1();
    }
}


