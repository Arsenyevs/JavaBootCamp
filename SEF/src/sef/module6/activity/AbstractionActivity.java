package sef.module6.activity;

public class AbstractionActivity {
    public static void main(String[] args) {

        Shape p1 = new Square(5);
        p1.setColor("Red");


        System.out.println("*** Print the information for Square");
        System.out.println("Color of square:" + p1.getColor());
        System.out.println("Area of square " + p1.calculateArea());
        System.out.println("Perimeter of square " + p1.calculatePerimeter());



        Shape p2 = new Rectangle(5,10);
        p2.setColor("Blue");

        System.out.println("*** Print the information for Rectangle");
        System.out.println("Color of Rectangle:" + p2.getColor());
        System.out.println("Area of Rectangle " + p2.calculateArea());
        System.out.println("Perimeter of Rectangle " + p2.calculatePerimeter());

        Shape p3 = new Circle(5, 10);
        p3.setColor("red");

        System.out.println("*** Print the information for Circle");
        System.out.println("Color of Circle:" + p2.getColor());
        System.out.println("Area of Circle " + p2.calculateArea());
        System.out.println("Perimeter of Circle " + p2.calculatePerimeter());


    }
}
