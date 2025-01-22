package com.allexample.interfaceEx.functionalinterface;

public class PrivateMethodInFunctional {
    public static void main(String[] args) {
     get();
    }
    static void get(){
        SubFunctional subFunctional=new SubFunctional();
        subFunctional.display();
    }
}
