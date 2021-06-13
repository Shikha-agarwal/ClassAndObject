package ClassCar;

/**
 * Created By: Shikha Agarwal
 * Project Name: Class And Object
 * Package Name: PACKAGE_NAME
 * Date: 08-06-2021
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if((validModel.equals("carrera")) || (validModel.equals("suzuki"))) {
            this.model = model;
        } else  {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }


    public void setDoors(int doors) {
        this.doors = doors;
    }
    public int getDoors() {
        return this.doors;
    }


    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public int getWheels() {
        return  this.wheels;
    }


    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getEngine() {
        return this.engine;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }

}

