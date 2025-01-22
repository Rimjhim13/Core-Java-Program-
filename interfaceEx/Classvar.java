package com.allexample.interfaceEx;

public class Classvar implements InterfaceVar{

    public void show(){
      //  x=90; cannot assign value of final var
        System.out.println("x="+x);
    }
}
