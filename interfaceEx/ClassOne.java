package com.allexample.interfaceEx;

public class ClassOne implements SuperInterface {
    public void run (){
        System.out.println("Run Class1Method");
    }

    @Override
    public void stop() {
        System.out.println("Stop Class1Method");
    }

    @Override
    public void display() {
        System.out.println("Display Class1Method");
    }
}
