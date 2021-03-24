package com.demo.carwale.controller;

import org.springframework.stereotype.Service;

@Service
public class CarService {
    final String petrol = "Petrol";
    final String diesel = "Diesel";

    public CarVO read(String lastname) {

        return new CarVO("Petrol", "TATA");
    }

    public CarVO read(String fuelType, String carName) {
        int milage = calculateMilage(fuelType, carName);
        return new CarVO(fuelType, carName, milage);
    }

    private int calculateMilage(String fuelType, String carName) {

        if (fuelType.equalsIgnoreCase(this.petrol) && carName.equalsIgnoreCase("TATA")) {
            return 15;
        } else if (fuelType.equalsIgnoreCase(this.diesel) && carName.equalsIgnoreCase("TATA")) {
            return 20;
        } else if (fuelType.equalsIgnoreCase(this.diesel) && carName.equalsIgnoreCase("Swift")) {
            return 25;
        } else if (fuelType.equalsIgnoreCase(this.petrol) && carName.equalsIgnoreCase("Swift")) {
            return 20;
        }
        return 0;

    }

}
