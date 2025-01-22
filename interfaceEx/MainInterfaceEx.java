package com.allexample.interfaceEx;

public class MainInterfaceEx {
    public static void main(String ar[]){
       getAPI();

    }

    static void getAPI(){
        APIClass apiClass=new APIClass();
        apiClass.display();
        apiClass.run();
    }
}
