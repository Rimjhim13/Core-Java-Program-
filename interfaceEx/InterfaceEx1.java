package com.allexample.interfaceEx;

public class InterfaceEx1 implements Inter1{
        //define body
        public void show(){
            System.out.println("show");
        }

        public static void main(String ar[]){
            InterfaceEx1  p=new InterfaceEx1();
            p.show();
            Inter1.show2();

        }
    }

