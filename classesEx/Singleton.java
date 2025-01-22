package com.allexample.classesEx;

public class Singleton {
   /*
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    //public static Singleton method(){
    public  Singleton SingletonEx() {
        return instance;
    }

}

     */

    private static Singleton single;

    private Singleton() {

    }

    public static  Singleton singleton() {
        if (single == null) {
            synchronized (Singleton.class) {
                if (single == null)
                    single = new Singleton();
            }

        }

        return  single;


    }
}



