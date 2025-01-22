package com.allexample.classesEx;

public class Staticclass {
    static void met(){
        System.out.println(" Staticclass is calling");
    }
    static class  NestedstaticClass {
        //satic block
        {
            System.out.println(" StaticBlock InnerClass is calling");
        }
        public void display(){
            System.out.println(" NestedstaticClass method is calling");
        }
    }
}
