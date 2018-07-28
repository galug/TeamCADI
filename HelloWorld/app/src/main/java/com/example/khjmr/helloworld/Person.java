package com.example.khjmr.helloworld;

public class Person {
    int age;
    String name;
    Person(){}

    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
