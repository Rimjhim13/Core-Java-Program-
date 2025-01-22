package com.allexample.classesEx.innerclasses;

public class AnonymousInsideArg {
    public static void main(String ar[]){
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run Thread(describe inside arr)");

            }
        });
        thread.start();
        System.out.println("Main");
    }
}
