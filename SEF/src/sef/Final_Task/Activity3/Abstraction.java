package sef.Final_Task.Activity3;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.List;

public class Abstraction {
    public static void main(String[] args) throws IOException {
        Salary a = new Employee(8);
        a.setPayDate(12);

        System.out.println();
        System.out.println("********** Print the salary for Employee ************");
        System.out.println("Pay Date: " + a.getPayDate());
        System.out.println("Salary for Employee: " + a.calculateSalary());


        Salary b = new Student(48);
        b.setPayDate(14);

        System.out.println("********** Print the salary for Student ************");
        System.out.println("Pay Date: " + b.getPayDate());
        System.out.println("Salary for Student " + b.calculateSalary());


        Salary c = new Employee(4);
        a.setPayDate(12);


        System.out.println("********** Print the salary for Employee ************");
        System.out.println("Pay Date: " + c.getPayDate());
        System.out.println("Salary for Employee: " + c.calculateSalary());


        Salary d = new Student(56);
        b.setPayDate(14);

        System.out.println("********** Print the salary for Student ************");
        System.out.println("Pay Date: " + d.getPayDate());
        System.out.println("Salary for Student " + d.calculateSalary());
        System.out.println("*****************************************************");


        List<Object> p1 = new ArrayList<>();
        p1.add(a);
        p1.add(c);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Employees.txt"));
        out.writeObject(p1);












    }
}
