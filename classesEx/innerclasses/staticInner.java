package com.allexample.classesEx.innerclasses;

public class staticInner
{
    static int x=10;
    private static int y=20;
    int z=90;
   static public class Inner{
      public static  void method(){
            System.out.println("static x="+x);
            System.out.println("private y="+y);
            staticInner s=new staticInner();
            System.out.println("instance z="+s.z);
        }
    }
}
