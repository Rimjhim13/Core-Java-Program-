package com.allexample.classesEx.innerclasses;

public class MainInnerConstructor {
    public static void main(String ar[]){
        ConstructorInnerClass constructorInnerClass=new ConstructorInnerClass();
        ConstructorInnerClass.Inner2 i=constructorInnerClass.new Inner2();
    }
}
