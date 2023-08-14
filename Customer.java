package com.example.lab3;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {
    String ID;
    String name;
    boolean sex;
    int age;

    public Customer(String ID,String n,boolean s,int a){
    this.ID = ID;
    this.name = n;
    this.sex = s;
    this.age = a;
    }

    public Customer(){
        this.ID = "";
        this.name = null;
        this.sex =  false;
        this.age = 0;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }



}
