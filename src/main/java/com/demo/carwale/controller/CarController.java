package com.demo.carwale.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api")
@RestController
public class CarController {

    Logger logger = LoggerFactory.getLogger(CarController.class);

    @GetMapping("hello")
    public String Hello() {

        logger.info("Hello funcation invoked");
        return "Hello World";
        //Todo : WhiteLable funcationality and customization
        //Todo : Get mapping vs Request Mapping
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


}
