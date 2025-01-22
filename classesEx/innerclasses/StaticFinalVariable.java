package com.allexample.classesEx.innerclasses;

public class StaticFinalVariable {
   public class Inner{
      //  static{}//Not Supported
      //  static int x=10;//NoT Supported
      static final int x=10;
      void show() {
          System.out.println("static final variable x="+x);
      }

    }
}
