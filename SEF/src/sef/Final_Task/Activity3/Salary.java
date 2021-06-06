package sef.Final_Task.Activity3;

public abstract class Salary {
    public int PayDate;

    public Salary(){}

    abstract public double calculateSalary();

    public void setPayDate(int d) {
        PayDate = d;
    }
    public int getPayDate() {
        return PayDate;
    }

}
