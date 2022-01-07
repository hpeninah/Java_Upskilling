package com.company.day4.example.service;

import com.company.day4.example.beans.Employee;

public class DatabaseDataAccess implements DataAccess{

    @Override
    public void save(Employee employee) {
        System.out.println("Saving an employee object into database "+employee+"");
    }

    @Override
    public Employee read() {
        System.out.println("Reading a single employee object from DB");
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        System.out.println("Updating an existing employee in the DB");
        return null;
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting an existing employee from the DB");
    }

    public void FindByFirstName(String firstName){

    }
}
