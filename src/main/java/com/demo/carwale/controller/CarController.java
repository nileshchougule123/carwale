package com.demo.carwale.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api")
@RestController
public class CarController {

    Logger logger = LoggerFactory.getLogger(CarController.class);
    @Autowired
    private CarService service;

    @GetMapping("hello")
    public String Hello() {

        logger.info("Hello funcation invoked");
        return "Hello World";
        //Todo : WhiteLable funcationality and customization
        //Todo : Get mapping vs Request Mapping
        //Todo : Replace getmapping with requestMapping
    }

    @GetMapping("hello/{name}")
    public String HelloName(@PathVariable("name") String firstname) {
        logger.info("HelloName funcation invoked");
        return "Hello " + firstname;
    }

    @GetMapping("helloQuery")
    public String HelloQuery(@RequestParam("Query") String specailQuery) {
        logger.info("HelloQuery funcation invoked");
        return "Hello " + specailQuery;
    }

    @GetMapping("/car")
    public ResponseEntity<CarVO> read() {
        CarVO foundStudent = service.read("NILESH");
        if (foundStudent == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(foundStudent);
        }
    }

    @GetMapping("/carparameterized")
    public ResponseEntity<CarVO> read1(@RequestParam("fuelType") String fuelType,@RequestParam("carName") String carName) {
        CarVO foundStudent = service.read(fuelType,carName);
        if (foundStudent == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(foundStudent);
        }
    }

}
