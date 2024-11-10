package com.emarts.Landscape.Model;

public class Vehicle {
    private String carPlate;
    private String make;
    private String model;
    private short year;
    private String color;
    private String  definingFeature;

    // Constructors
    public Vehicle() {}

    public Vehicle(String carPlate, String make, String model, short year, String color, String definingFeature) {
        this.carPlate = carPlate;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.definingFeature = definingFeature;
    }

    // Getters
    public String getCarPlate() {
        return carPlate;
    }

    public String getDefiningFeature() {
        return definingFeature;
    }

    public String getColor() {
        return color;
    }

    public short getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    //Setters
    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDefiningFeature(String definingFeature) {
        this.definingFeature = definingFeature;
    }
}
