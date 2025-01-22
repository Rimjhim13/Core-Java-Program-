package com.allexample.classesEx.innerclasses;

public class MainAnonymousInner {
    public static void main(String ar[]){
        AnonymousInner anonymousInner=new AnonymousInner() {
            @Override
            void show() {
                System.out.println(" AnonymousInner Class");

            }
        };
      anonymousInner.show();
    }
}
