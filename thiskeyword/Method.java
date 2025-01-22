package com.allexample.thiskeyword;

public class Method {
    void show(){
        System.out.println("show1");
    }
    void show2(){
        System.out.println("show2");
        show();
        //this.method
    }
}
