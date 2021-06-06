package sef.Final_Task.Activity1;
import junit.framework.TestCase;
import org.junit.Test;
import java.util.Scanner;
import sef.Final_Task.Activity1.Employee;

import static org.junit.Assert.fail;


public class EmployeeTest extends TestCase {
    private Employee employee;

    protected void setUp() throws Exception {
        employee = new Employee();
    }


    public void testSetAndGetCompany() {
        String testCompanyname = "Google";
        employee.setCompany(testCompanyname);
        assertEquals(testCompanyname, employee.getCompany());

    }
    public void testSetAndGetJobTitle() {
        String testJobTitle = "Programmer";
        employee.setJobtitle(testJobTitle);
        assertEquals(testJobTitle, employee.getJobtitle());

    }

    public void testSetAndGetEmptyJobTitle() {
        String testJobTitle = "";
        String ExpectedResult = "Valid JobTitle";
        String ActualResult = "JobTitle field cant be empty";
        if (testJobTitle.length()>0){
        System.out.println(ExpectedResult);}
        else {
            System.out.println(ActualResult);
        }
        assertEquals(ExpectedResult, ActualResult);


    }
    public void testSetAndGetSalary() {
        int testSalary = 1200;
        employee.setSalary(testSalary);
        assertEquals(testSalary, employee.getSalary());

    }

    public void testSetAndGetNegativeSalary() {
        int n = -1200;
        String ExpectedResult = "Number is positive";
        String ActualResult = "Number is negative";

        employee.setSalary(n);
        if(employee.getSalary() > 0) {
            System.out.println(ExpectedResult);
        }else {
            System.out.println(ActualResult);
        } assertEquals(ExpectedResult, ActualResult);




    }
    public void testIntroduction() throws CustomizedException {
        employee.setName("Paul");
        assertEquals(employee.introduction(),"Hi my name is Paul And I'm 0 years old. I work as a null In null");
    }
}





