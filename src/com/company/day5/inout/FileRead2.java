package com.company.day5.inout;

import com.company.day5.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileRead2 {
    public static void main(String[] args){
        try{
            FileInputStream fileInputStream = new FileInputStream("employee.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employee = (Employee)objectInputStream.readObject();
            System.out.println("Content from the file");
            System.out.println(employee);
            objectInputStream.close();
        }
        catch(FileNotFoundException notFound) {
            notFound.printStackTrace();
        }
        catch(ClassNotFoundException classNotFound) {
            classNotFound.printStackTrace();
        }
        catch(IOException ioExc) {
            ioExc.printStackTrace();
        }
        System.out.println("All done!");
    }
}
