package com.allexample.classesEx.innerclasses;

public class MainStaticFinal {
    public static void main(String ar[]){
        StaticFinalVariable staticFinalVariable=new StaticFinalVariable();
        StaticFinalVariable. Inner inner=staticFinalVariable.new Inner();
        inner.show();

    }
}
