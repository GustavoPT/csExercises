package com.company.Random;

import java.util.Date;

public class Student {

    int age;
    String name;
    private Date dob;


    public Student(int age,String name)
    {
        this.age = age;
        this.name = name;
    }

    public Student(int age,String name,Date newdob)
    {
        this.age = age;
        this.name = name;
        this.dob = newdob;
    }
}
