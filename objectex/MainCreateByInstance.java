package com.allexample.objectex;

import java.lang.reflect.Constructor;

public class MainCreateByInstance {
    public static void main(String ar[]){
        try{
            Constructor<CreateObjectBynewInstance> c=CreateObjectBynewInstance.class.getDeclaredConstructor();
            CreateObjectBynewInstance cr=c.newInstance();
           System.out.println( cr.name);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
