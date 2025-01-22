package com.allexample.classesEx.innerclasses;

public class Nestedmain {
    public static void main(String ar[]){
        NestedClass.Inner obj=new  NestedClass().new Inner();
        obj.method();
        NestedClass obj1=new NestedClass();
        obj1.method();
    }
}
