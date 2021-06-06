package sef.Final_Task.Activity3;

public class Student extends Salary {
    private int HoursPerWeek;


    Student (int HoursPerWeek){
        this.HoursPerWeek = HoursPerWeek;
    }
    public double calculateSalary(){
        double salary = 1700 + (HoursPerWeek*3);
        return salary;
    }


}
