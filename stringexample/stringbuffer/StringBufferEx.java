package com.allexample.stringexample.stringbuffer;

public class StringBufferEx {
    public static void main(String ar[]){
        StringBuffer sb=new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);//helloworld
        sb.insert(5,"java");//hellojavaworld
        System.out.println(sb);
        sb.delete(5,9);//helloworld

        System.out.println(sb);

    }
}
