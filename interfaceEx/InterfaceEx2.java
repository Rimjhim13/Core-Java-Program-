package com.allexample.interfaceEx;

public class InterfaceEx2 implements Inter2{
        //override
        static void show2(){
            System.out.println(" override show2");
        }
        public static void main(String ar[]){
            Inter2.show2();
            show2();
        }
}
