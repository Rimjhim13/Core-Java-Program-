package com.allexample.interfaceEx;

public class StudentDetail implements InterfaceDetail {
   private String stdname;
    private int stdid;
    private String stdaddress;
   public void detail(String name,int id,String address) {
       this.stdname = name;
       this.stdid = id;
       this.stdaddress = address;
   }
   void display(){
       System.out.println("Std name="+stdname);
       System.out.println("Std id="+stdid);
       System.out.println("Std stdaddress="+stdaddress);
   }





    }

