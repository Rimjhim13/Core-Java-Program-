package com.allexample.stringexample.stringbuilder;

public class StringBuilderConvertStringBuffer {
    public static void main(String ar[]){
        StringBuffer sb=new StringBuffer("Ram");
     //   sb= new StringBuilder("ram");
        String s=sb.toString();
        System.out.println(s.toString());
        StringBuilder stringBuilder=new StringBuilder(s);
        System.out.println(stringBuilder);

    }
}
