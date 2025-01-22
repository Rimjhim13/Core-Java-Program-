package com.allexample.stringexample;

public class SpaceRemove {
    public static void main(String ar[]){
        String s="My name is ram";
        System.out.println(s);
        //String remove=s.trim();
       // System.out.println(remove);
        String a[]= s.split(" ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }



    }
}
