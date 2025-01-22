package com.allexample.stringexample;

public class InternString {
    public static void main(String ar[]){
        String s1="Ram";
        String s2="Ram";
        System.out.println("s1==s2:" +(s1==s2));//true;

        String s3=new String("Ram");
        String s4=new String("Ram");
        System.out.println("s3==s4:"+(s3==s4));//false;

        String s5=s3.intern();
        System.out.println("s5==s1:"+(s5==s1));//true;
    }
}
