package com.company.day3.Employee;

public class Employee {
    private long id;
    public String name;

    public Employee(){}

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getId() { return id;}

    public String getName() { return name; }
}
