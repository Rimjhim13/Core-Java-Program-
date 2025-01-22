package com.allexample.objectex;

public class MainAccount {
    public static void main(String ar[]){
        Account account=new Account();
        account.create("ram",1,80000);
    account.display();
    account.withdraw(90000);
    account.checkbalance();


}
}
