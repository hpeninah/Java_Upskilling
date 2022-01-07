package com.company.day4.example.service;

import com.company.day4.example.beans.Employee;

public class FileDataAccess implements DataAccess {

    @Override
    public void save(Employee employee) {
        //write code to save employee object in file
        System.out.println("Saving employee into file.");
    }

    @Override
    public Employee read() {
        //write code to read employee data from file
        System.out.println("Reading and returning a single employee from file.");
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        System.out.println("Updating an existing employee in the file.");
        return null;
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting an existing employee from the file.");
    }

    public void sort() {
        System.out.println("Sorting all of the employees by the ID");
    }
}
