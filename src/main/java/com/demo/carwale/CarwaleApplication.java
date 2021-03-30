package com.demo.carwale;

import com.demo.carwale.entity.Car;
import com.demo.carwale.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarwaleApplication implements CommandLineRunner {

	@Autowired
	private CarRepository carRepository;
	public static void main(String[] args) {
		SpringApplication.run(CarwaleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		carRepository.save(new Car("Petrol","Tiago","TATA"));
	}
}
