package com.company.day3.Employee;

public class Supervisor extends Employee{
    private int experience;

    public Supervisor(int experience) {
        this.experience = experience;
    }

    public void setExperience(int experience){
        if(experience > 15) {
            this.experience = 15;
            return;
        }
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
