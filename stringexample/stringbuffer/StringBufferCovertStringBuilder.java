package com.allexample.stringexample.stringbuffer;

public class StringBufferCovertStringBuilder {
    public static void main(String ar[]){
        StringBuffer sb=new StringBuffer("Ram");
        String string=sb.toString();
        StringBuilder stringBuilder=new StringBuilder(string);
        System.out.println("StringBufferCovertStringBuilder:"+stringBuilder);

    }
}
