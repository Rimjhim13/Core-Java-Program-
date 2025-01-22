package com.allexample.classesEx;

public class MainStatic {
    public static void main(String ar[]){
        Staticclass.met();
        Staticclass.NestedstaticClass obj=new  Staticclass.NestedstaticClass();
        obj.display();

        SingletonEx singleton=new SingletonEx();
        SingletonEx singletonEx1=new SingletonEx();
        SingletonEx singletonEx2=new SingletonEx();
//Singleton singleton=new Singleton();
        System.out.println(singleton);
        System.out.println(singletonEx1);
        System.out.println(singletonEx2);
       // Singleton s1=  Singleton.singleton();




    }
}
