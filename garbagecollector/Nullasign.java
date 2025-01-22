package com.allexample.garbagecollector;

public class Nullasign {
    public static void main(String[] args) {
       get();
    }
    static void get(){
        NullasignA nullasignA=new NullasignA();
        nullasignA.show();
        //Null pointer exception is generate
      /*  nullasignA=null;
        nullasignA.show();

       */
    }
}
