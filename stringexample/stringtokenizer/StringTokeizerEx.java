package com.allexample.stringexample.stringtokenizer;

import java.util.StringJoiner;

public class StringTokeizerEx {
    public static void main(String ar[]){
        StringJoiner stringJoiner=new StringJoiner(",");
        stringJoiner.add("Ram");
        stringJoiner.add("sita");
        stringJoiner.add("geeta");
        System.out.println(stringJoiner);
    }
}
