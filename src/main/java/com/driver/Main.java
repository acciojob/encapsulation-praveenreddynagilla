package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        RWOnly obj=new RWOnly();
//        obj.name="praveen";
//        System.out.println(obj.name); //java: name has private access in com.driver.RWOnly
        obj.setName("Developer");
        System.out.println(obj.getName());
    }
  
}