package com.allexample.thiskeyword;

public class ConstructorClass {
    ConstructorClass(){
        System.out.println("constructor current class");
    }
    ConstructorClass(int a,int b){
        //in constructor this should be first stmt
        this();
        System.out.println("Sum="+(a+b));

    }
}
