package com.allexample.interfaceEx;

public class InterfaceExtendsMultipleClass {
    public static void main(String ar[]) {
    getMethod();
    }
        static void getMethod(){
        ClassOne classOne=new ClassOne();
        classOne.run();
        classOne.stop();
        classOne.display();
        ClassTwo classTwo=new ClassTwo();
        classTwo.walk();
    }
}
