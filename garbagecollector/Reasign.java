package com.allexample.garbagecollector;

public class Reasign {
    public static void main(String[] args) {
        get();
    }
    static void get(){
        ReasignB reasignB=new ReasignB();
        ReasignB reasignB1=new ReasignB();
       reasignB.get(10,20);
       reasignB.show();
       reasignB1.show();
       reasignB1=reasignB;
       reasignB1.show();

    }
}
