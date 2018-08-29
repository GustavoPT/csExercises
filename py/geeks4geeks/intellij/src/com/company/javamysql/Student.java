package com.company.javamysql;

public class Student {

    public String name;

    public Student()
    {
        name = "";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
