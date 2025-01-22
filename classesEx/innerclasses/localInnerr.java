package com.allexample.classesEx.innerclasses;

public class localInnerr {

        void method(){
            System.out.println("calling outer class method");

        class Inner {
            void method2() {
                System.out.println("calling inner class method");
            }
        }
            Inner i=new Inner();
            i.method2();
        }



    }

