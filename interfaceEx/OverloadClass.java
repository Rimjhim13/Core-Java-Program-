package com.allexample.interfaceEx;

public class OverloadClass {
    public static void main(String ar[]){
        getCall();
    }
    static void getCall(){
     SumClass sumClass=new SumClass();
     sumClass.sum2(10,20);
     sumClass.sum3(10,20,10);
     sumClass.sum4(10,20,20,10);


    }
}
