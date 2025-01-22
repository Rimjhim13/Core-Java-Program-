package com.allexample.stringexample.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderByReadLine {
    public static void main(String ar[])throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        String x=br.readLine();
        System.out.println("line is="+x);
    }
}
