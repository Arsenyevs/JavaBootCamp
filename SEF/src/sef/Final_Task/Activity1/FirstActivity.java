package sef.Final_Task.Activity1;
import java.util.*;

public class FirstActivity {
    public static void main(String[] args) {

        try {
            Student mg = new Student();
            mg.setSchoolName(" Accenture School");
            mg.setName("Wick");
            mg.setAge(16);
            System.out.println("*******************************");
            mg.introduction();
            mg.Introduce();
            System.out.println("*******************************   EMPLOYEES SORTED FROM TOP SALARY TO LESS ******************************************************");
            System.out.println();


            Employee a = new Employee();
            a.setAge(22);
            a.setName("Paul");
            a.setJobtitle("Programmer");
            a.setSalary(2000);
            a.setCompany("Accenture");


            Employee b = new Employee();
            b.setAge(23);
            b.setName("John");
            b.setJobtitle("QA tester");
            b.setSalary(4000);
            b.setCompany("Accenture");

            Employee c = new Employee();
            c.setAge(24);
            c.setName("Dave");
            c.setJobtitle("QA Lead");
            c.setSalary(2100);
            c.setCompany("Accenture");

            int a1 = a.getSalary();
            int b1 = b.getSalary();
            int c1 = c.getSalary();

            List<Integer> m = new ArrayList<Integer>();
            m.add(a1);
            m.add(b1);
            m.add(c1);
            Collections.sort(m);
            Collections.reverse(m);

            Iterator L = m.iterator();
            Object first = L.next();
            Object second = L.next();
            Object third = L.next();

            int i = (Integer)first;
            if(i == a.getSalary()) {a.introduction();}
            else if (i == b.getSalary()) {b.introduction();}
            else{c.introduction();}

            System.out.println("*******************************");

            int o = (Integer)second;
            if(o == a.getSalary()) {a.introduction();}
            else if (o == b.getSalary()) {b.introduction();}
            else{c.introduction();}

            System.out.println("*******************************");

            int p = (Integer)third;
            if(p == a.getSalary()) {a.introduction();}
            else if (p == b.getSalary()) {b.introduction();}
            else{c.introduction();}
            System.out.println("*******************************");

            //If name contains numbers check
            Employee bd = new Employee();
            bd.setName("David125");

        }catch (CustomizedException e) {
        System.err.println(e.getMessage());
    }
    }
}
