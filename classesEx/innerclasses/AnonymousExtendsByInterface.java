package com.allexample.classesEx.innerclasses;

public class AnonymousExtendsByInterface {
    public static void main(String ar[]){
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
              System.out.println("Run Runnable thread");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("Main");
    }
}
