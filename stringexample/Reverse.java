package com.allexample.stringexample;

public class Reverse {
    public static void main(String ar[]) {
        String s = "Ram";
        String reverse="";
        System.out.println("org="+s);
        for (int i = s.length()-1; i >=0; i--) {
           reverse+=s.charAt(i);
        }
        System.out.println("reverse="+reverse);
    }
}

