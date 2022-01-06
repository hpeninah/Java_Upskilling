package com.company.day3;

public class Main {

    public static void main(String[] args){
        Worker worker = new Worker();
        Supervisor supervisor = new Supervisor(17);
        Manager manager = new Manager("Completed 15 projects");

        worker.setId(1);
        worker.setName("Worker Name");

        manager.setId(2);
        manager.setName("Manager Name");

        supervisor.setId(3);
        supervisor.setName("Supervisor Name");


        System.out.println("Worker ID is " + worker.getId() + " and worker's name is " + worker.getName());
        System.out.println("Manager ID is " + manager.getId() + " with name " + manager.getName() + " who has " + manager.getQualification() + " qualification.");
        System.out.println("Supervisor ID is " + supervisor.getId() + " with name " + supervisor.getName() + " who has " + supervisor.getExperience() + " years of experience.");
    }
}

//Main class
//Employee is superclass with id and name setter getters
//Worker subclass
//Supervisor subclass with experience (how many years) 15+ years
//Manager subclass education 16-17 years education