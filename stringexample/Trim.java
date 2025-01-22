package com.allexample.stringexample;

public class Trim {
    public static void main(String ar[]){
        String s1 = "   Ram   ";//
         String s2= s1.trim();
        System.out.println("s1 length="+(s1.length()));//9
        System.out.println("s1 trim="+s1.trim());//ram
        System.out.println("s2 length="+(s2.length()));//3
        System.out.println("s1 length="+(s1.length()));//3
}
}
