package com.example.didemo;

import com.example.didemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DidemoApplication implements CommandLineRunner {

    @Autowired
    private CarService carService;

    public static void main(String[] args) {
        SpringApplication.run(DidemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        carService.startCar();
    }
}
