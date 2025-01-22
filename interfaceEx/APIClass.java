package com.allexample.interfaceEx;

public class APIClass implements API, API2 {
   public void display(){
        System.out.println("Display");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }
}
