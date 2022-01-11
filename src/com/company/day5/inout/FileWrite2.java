package com.company.day5.inout;

import com.company.day5.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWrite2 {
    public static void main(String[] args){
        Employee employee = new Employee(1, "John", "Doe", "jDoe@missingpersons.com");

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("employee.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
        }
        catch (FileNotFoundException notFound) {
            notFound.printStackTrace();
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }
    }
}
