package model.constructor;

public class Car {
    private long id;
    private String model;
    private String color;
    private int year;

    public Car(long id, String model, String color, int year) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car(long id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public Car(){

    }

    public void setModel(String toyotta) {
    }
}
