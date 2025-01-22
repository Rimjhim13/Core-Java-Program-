package com.allexample.classesEx;

public class Immutableclass {
    private final String s;
    Immutableclass(final String s){
        this.s=s;
    }
    public final String getName(){
        return s;
    }
}
