package com.ironhack.lab08.main.classes;

public class UtilityVehicles extends Car{

    public boolean fourWheelDrive;

    public UtilityVehicles(int vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    // GETTERS & SETTERS
    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }
}
