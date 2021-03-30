package com.demo.carwale.entity;

import javax.persistence.*;

@Entity
@Table(name="car")
public class Car {
    private String fuelType;
    private String carModel;
    private String carBrand;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Car(String fuelType, String carModel, String carBrand) {
        this.fuelType = fuelType;
        this.carModel = carModel;
        this.carBrand = carBrand;
    }

    public Car() {
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
