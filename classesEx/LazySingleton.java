package com.allexample.classesEx;
//synchronized-using same object Run thread
public class LazySingleton {
    private static  LazySingleton instance;
    private LazySingleton(){}
   public static synchronized LazySingleton get(){
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }

}
