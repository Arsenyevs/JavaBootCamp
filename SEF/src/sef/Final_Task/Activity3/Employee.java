package sef.Final_Task.Activity3;

import java.io.Serializable;

public class Employee  extends Salary implements Serializable {
    private int YearsInCompany;

    Employee (int YearsInCompany){
        this.YearsInCompany = YearsInCompany;
    }


    public double calculateSalary(){
    double salary = 1700 + (YearsInCompany*200);
    return salary;
    }




}
