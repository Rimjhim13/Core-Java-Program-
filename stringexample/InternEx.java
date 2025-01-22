package com.allexample.stringexample;

public class InternEx {
    public static void main(String ar[]){
        String s1=new String("Ram").intern();
        String s2=new String("Ram").intern();
        System.out.println("s1==s2:"+(s1==s2));
    }
}
