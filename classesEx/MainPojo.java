package com.allexample.classesEx;

public class MainPojo {
    public static void main(String ar[]){
        Pojo pojoobj=new Pojo();
        System.out.println("allready set="+" "+pojoobj.get());
        pojoobj.set(40);
        System.out.println("change value by set:"+" "+pojoobj.get());
    }
}
