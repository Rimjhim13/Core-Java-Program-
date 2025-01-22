package com.allexample.classesEx.innerclasses;

public class MainAbstract {
    public static void main(String ar[]){
        AbstractInner a=new AbstractInner();
        AbstractInner.Inner2 i=a.new Inner2();
        i.show();
    }
}
