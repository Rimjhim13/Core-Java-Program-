package com.allexample.interfaceEx;

public class StaticMethodInterf {
    public static void main(String[] args) {
        get();
    }
    static void get(){
        SubClassInterface subClassInterface=new SubClassInterface();
        subClassInterface.show();
        ClassInterface classInterface=new ClassInterface();
        classInterface.show();
        StaticInterface.show2();

    }
}
