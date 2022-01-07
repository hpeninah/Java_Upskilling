package com.company.day4.example;

import com.company.day4.example.beans.Employee;
import com.company.day4.example.service.DataAccess;
import com.company.day4.example.service.DatabaseDataAccess;

public class Main {
    public static void main(String[] args) {
        //FileDataAccess fileDataAccess = new FileDataAccess();
        DataAccess dataAccess = new DatabaseDataAccess();
        Employee employee = new Employee(101, "John", "Doe", 3);
        dataAccess.save(employee);

    }
}
