package com.allexample.classesEx.innerclasses;

public class InnerPrivate {
  private  class Inner {
      void show() {
          System.out.println("Private data show");
      }
  }

           void show2() {
               Inner inner = new Inner();
               inner.show();

           }
       }

