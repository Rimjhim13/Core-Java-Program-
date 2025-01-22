package com.allexample.stringexample;

public class ImmutableEx {
    public static void main(String ar[]){
        /*
       // String orignal=new String("Ram");
        String orignal="Ram";
        String change=orignal.concat("SiTa");
       // String change=orignal.concat("Sita");
        System.out.println(orignal);
       System.out.println(change);

         */
        /*
        StringBuffer stringBuffer=new StringBuffer("Ram");
        stringBuffer.append("Sita");
        System.out.println(stringBuffer);

         */
        StringBuilder stringBuilder=new StringBuilder("Ram");
        stringBuilder.append("Shyam");
        System.out.println(stringBuilder);
    }
}
