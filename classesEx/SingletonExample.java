package com.allexample.classesEx;

public class SingletonExample {
    private static SingletonExample singleInstance=null;
    SingletonExample(){

    }
    static public SingletonExample Singletonmethod(){

        if(singleInstance==null){
            singleInstance=new SingletonExample();
        }
        return singleInstance;
    }


}
