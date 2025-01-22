package com.allexample.garbagecollector;

public class MainTest {
    public static void main(String ar[]){
        get();
    }
    static void get(){
        test testobj=new test();
        test testobj2=new test();
        //SupperTest supperTest=new SupperTest();
        testobj.t=testobj2;
        testobj2.t=testobj;

        testobj=null;
        testobj2=null;

        System.out.println(testobj);
        System.out.println(testobj2);




    }
}
