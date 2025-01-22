package com.allexample.stringexample.stringbuilder;

public class PerformanceStringBuilder {
    public static void main(String ar[]){
        StringBuilder sb=new StringBuilder("Ram");
        //change in object
        sb.append("Sita");
        System.out.println(sb);
    }
}
