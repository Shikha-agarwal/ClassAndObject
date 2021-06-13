package ClassCar;

import ClassCar.Car;

/**
 * Created By: Shikha Agarwal
 * Project Name: Class And Object
 * Package Name: PACKAGE_NAME
 * Date: 08-06-2021
 */
public class Main {
    public static void main(String[] args) {
        Car obj = new Car();
        Car obj1 = new Car();

        obj.setModel("Carrera");
        System.out.println("Model is: " + obj.getModel());
        obj1.setModel("119");
        System.out.println("Model is: " + obj1.getModel());

        obj.setColor("Balck");
        System.out.println("Color is: " + obj.getColor());

        obj.setDoors(4);
        System.out.println("Doors are: " + obj.getDoors());

        obj.setEngine("abc");
        System.out.println("Engine is: " + obj.getEngine());

        obj.setWheels(4);
        System.out.println("Wheels are: " + obj.getWheels());
    }
}

