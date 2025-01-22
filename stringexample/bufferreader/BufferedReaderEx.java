package com.allexample.stringexample.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//BufferedReader by read method
public class BufferedReaderEx {
    public static void main(String ar[])throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        int x=br.read();
        System.out.println("value of latter is="+x);

    }
}
