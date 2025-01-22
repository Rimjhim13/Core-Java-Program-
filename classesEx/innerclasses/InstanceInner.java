package com.allexample.classesEx.innerclasses;

public class InstanceInner {
    class Inner{
        void show(){
            System.out.println("Instance inner class");
        }
    }
    public static void main(String ar[]){
        InstanceInner instanceInner=new InstanceInner();
        Inner inner=instanceInner.new Inner();
        inner.show();
    }
}
