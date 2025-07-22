package com.example.didemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class CarService {

    private final EngineService engineService;

    public CarService(EngineService engineService) {
        this.engineService = engineService;
    }

    public void startCar() {
        engineService.run();
    }
}
