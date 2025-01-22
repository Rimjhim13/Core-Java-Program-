package com.allexample.classesEx.innerclasses;
//1Type ofAnonymous class
public class AnonymousExtendsByClass {
    public static void main(String ar[]){
        Thread thread=new Thread(){
            public void run(){
                System.out.println("run thread");
            }

        };
        thread.start();
        System.out.println("Main ");
    }
}
