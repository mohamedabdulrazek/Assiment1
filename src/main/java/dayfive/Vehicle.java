package dayfive;

public class Vehicle {
    String brand;
    String color;
    String year;

    public  Vehicle(String brand, String year , String color) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public void start(){
        System.out.println("vehicle started");
    }
}