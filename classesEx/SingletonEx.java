package com.allexample.classesEx;
//eager intialization(no dependency,lightweight)
public class SingletonEx {
    public static void main(String ar[]){
        Singleton s1=  Singleton.singleton();
        System.out.println(s1);
        Singleton s2=  Singleton.singleton();
        System.out.println(s2);
        if(s1==s2){
            System.out.println("Same object");
        }


    }
}
