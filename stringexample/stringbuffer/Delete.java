package com.allexample.stringexample.stringbuffer;

public class Delete {
    public static void main(String ar[]){
        StringBuffer sb=new StringBuffer("helloJava");
      //  sb.delete(0,5);
        sb.delete(5,9);
        System.out.println(sb);
    }
}
