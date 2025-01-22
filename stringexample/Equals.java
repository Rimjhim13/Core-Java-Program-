package com.allexample.stringexample;

public class Equals {
    public static void main(String ar[]){
        String s1="Ram";
        String s2="Ram";
        String s3="aac";
        String s4="AAc";
        System.out.println("s1 equals s2="+s1.equals(s2));
        System.out.println("s3 equals s4="+s3.equals(s4));

        System.out.println("s1 equals s4="+s1.equals(s4));
        System.out.println("s3 equalsIgnore Case s4="+s3.equalsIgnoreCase(s4));

    }
}
