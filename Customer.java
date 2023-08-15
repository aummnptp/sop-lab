package com.example.lab3;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {
    String ID;
    String name;
    String sex;
    int age;

    public Customer(String ID,String n,String s,int a){
        this.ID = ID;
        this.name = n;
        this.sex = s;
        this.age = a;
    }

    public Customer(){
        this("",null,"Male",0);
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

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        if (age >0){
            this.age = age;

        }
       else{  this.age = 0;}
    }

    public int getAge() {
        return age;
    }



}