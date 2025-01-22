package com.allexample.garbagecollector;

public class Localvar {
    void show1(){
       Localvar localvar=new Localvar();
       localvar.show2();
        Localvar localvar1=new Localvar();
        localvar1.show2();
        Localvar localvar2=new Localvar();
        localvar2.show2();
    }
    void show2(){
        System.out.println("show2 method");
    }
}
