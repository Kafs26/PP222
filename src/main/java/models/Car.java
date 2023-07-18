package models;

public class Car {
    private String model;
    private int number;

    private int year;


    public Car() {
    }

    public Car(String model, int number, int year) {
        this.model = model;
        this.number = number;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", year=" + year +
                '}';
    }
}
