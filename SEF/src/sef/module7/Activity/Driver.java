package sef.module7.Activity;

public class Driver {
   private String name;
   private Moving driversMoving;



     public Driver (String name) {
        this.name = name;

     }






   public void setDriversMoving(Moving driversMoving){
        this.driversMoving = driversMoving;
     }

     public void driverStartsDriving() {
        System.out.print("Driver " + name);
        driversMoving.drive();
     }
   }


