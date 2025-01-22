package com.allexample.classesEx.innerclasses;

public class MainAnonymousRef {
    public static  void main(String[] args) {
        new AnoymousWithoutRef(){
            @Override
            void show() {
                System.out.println("calling Anoymous class Without Ref");
            }
        }.show();
    }
}
