package com.allexample.interfaceEx.functionalinterface;

public class FunctionalInterfaceLambdaExp {
    public static void main(String ar[]){
        Functional functional=()->{
            System.out.println("Functinal interface body");
        };
        functional.show();
    }
}
