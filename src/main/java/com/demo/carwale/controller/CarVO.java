package com.demo.carwale.controller;

public class CarVO {
    private String fuelType;
    private String name;
    private int milage;

    public CarVO(String fuelType, String name, int milage) {
        this.fuelType = fuelType;
        this.name = name;
        this.milage = milage;
    }

    public CarVO(String fuelType, String name) {
        this.fuelType = fuelType;
        this.name = name;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
