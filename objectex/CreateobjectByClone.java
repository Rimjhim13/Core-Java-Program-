package com.allexample.objectex;

public class CreateobjectByClone implements Cloneable{
    String n="Ram";
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
