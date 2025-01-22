package com.allexample.interfaceEx.functionalinterface;

public class FunctinalDetailMain {
    public static void main(String ar[]){
        FunctinalDetail functinalDetail=(String name, int id)->{
            System.out.println("name="+name+" "+"id="+id);
        };
        functinalDetail.detail("Ram",1);
    }

}
