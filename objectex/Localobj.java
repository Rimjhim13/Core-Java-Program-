package com.allexample.objectex;

public class Localobj {
    void method(){
        System.out.println("ram");
        //go to gc after calling method
        Localobj l=new Localobj();
       Localobj l1=new Localobj();

    }
}
