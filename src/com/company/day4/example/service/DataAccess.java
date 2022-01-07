package com.company.day4.example.service;

import com.company.day4.example.beans.Employee;

public interface DataAccess {
    void save(Employee employee);
    Employee read();
    Employee update(Employee employee);
    void delete(int id);
}
