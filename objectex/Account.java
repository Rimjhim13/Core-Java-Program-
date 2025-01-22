package com.allexample.objectex;

public class Account {
  String name;
    int id;
   float salary;

    void create(String name,int id,long salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display(){
        System.out.println("name="+name+" id= "+id+" amount="+salary);
    }
    void checkbalance(){
        System.out.println("amount="+salary);
    }
    void withdraw(float amt){
        if(salary<amt){
            System.out.println("insufficient balance");
        }
        else{
            salary=salary-amt;
            System.out.println(amt+"withdraw");
        }


    }


}
