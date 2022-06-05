package com.ironhack.lab08.main.classes;

public class Truck extends Car {

    public int towingCapacity;

    public Truck(int vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    // GETTERS & SETTERS
    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}


