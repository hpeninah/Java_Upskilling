package com.company.day3;

public class Manager extends Employee{
    private String qualification;

    public Manager(String qualification) {
        this.qualification = qualification;
    }

    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    public String getQualification(){
        return qualification;
    }
}
