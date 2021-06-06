package sef.module7.Activity;

public class DrivingActivity {

    public static void main(String[] args) {
        Driver d1 = new Driver("Kirils");
        Car c1 = new Car();
        Motorcycle m1 = new Motorcycle();

        d1.setDriversMoving(c1);
        d1.driverStartsDriving();
        d1.setDriversMoving(m1);
        d1.driverStartsDriving();








    }
}
