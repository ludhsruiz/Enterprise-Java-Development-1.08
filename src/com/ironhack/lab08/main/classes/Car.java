package com.ironhack.lab08.main.classes;

public abstract class Car {

    protected int vinNumber;
    protected String make;
    protected String model;
    protected int mileage;


    public Car(int vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make= make;
        this.model= model;
        this.mileage = mileage;
    }

    // GETTERS & SETTERS

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


}

