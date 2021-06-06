package sef.module6.activity;

public class Rectangle extends Shape {

    private double breadth;
    private double lenght;



    Rectangle(double lenght, double breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }


    public double calculateArea() {
        double area = lenght * breadth;
        return area;

    }

    public double calculatePerimeter() {
        double perimeter = (lenght+breadth) * 2;
        return perimeter;
    }
}