package sef.module6.activity;

public class Circle extends Shape {
    private double radius;
    private double diameter;


    Circle (double radius, double diameter){
        this.radius = radius;
        this.diameter = diameter;}

    public double calculateArea() {
        double area = 2 * 3.14159 * radius;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 3.14159 * radius * radius;
        return perimeter;
    }



    }




