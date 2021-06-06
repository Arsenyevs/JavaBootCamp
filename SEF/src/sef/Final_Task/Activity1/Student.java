package sef.Final_Task.Activity1;


public class Student extends Person{
    public String schoolname;







    public String Introduce(){
        System.out.println("I am study in University "+ getSchoolname());
        return "I am study in University "+ getSchoolname();
    }

    public String setSchoolName(String schoolname){
        this.schoolname = schoolname;
        return schoolname;
    }
    public String getSchoolname(){return schoolname;}



}

