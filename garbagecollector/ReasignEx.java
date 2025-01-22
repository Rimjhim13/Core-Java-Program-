package com.allexample.garbagecollector;

public class ReasignEx {
    public static void main(String[] args) {
        get();

    }
    static void get(){
        ReassignA reassignA=new ReassignA();
        reassignA.show();
        ReassignA reassignA1=new ReassignA();
        reassignA1.show();
        //reassign the variable
        reassignA=reassignA1;
        reassignA.show();
        reassignA1.show();
    }
}
