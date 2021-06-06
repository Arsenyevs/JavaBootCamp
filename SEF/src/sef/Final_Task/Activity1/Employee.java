package sef.Final_Task.Activity1;
public class Employee extends Person{
    public String jobtitle;
    public String company;
    public int salary;


    public Employee(){
        this.company = setCompany(company);
        this.jobtitle = setJobtitle(jobtitle);
        this.salary = setSalary(salary);
    }

    public Employee(String company,String jobtitle, int salary){
        super();
        this.company = company;
        this.jobtitle = jobtitle;
        this.salary = salary;

    }

    public String getCompany(){return company; }

    public String setCompany(String company) { this.company = company;return company; }

    public String setJobtitle(String jobtitle){ this.jobtitle = jobtitle;return jobtitle; }

    public String getJobtitle() {return jobtitle;}

    public int setSalary(int salary) {this.salary = salary;return salary;}

    public int getSalary(){return salary;}

   public String introduction(){
       System.out.println("Hi my name is "+ getName() + " And I'm " + getAge() + " years old. I work as a "+ getJobtitle() +" In " + getCompany());
       return "Hi my name is "+ getName() + " And I'm " + getAge() + " years old. I work as a "+ getJobtitle() +" In " + getCompany();
   }
















}


















