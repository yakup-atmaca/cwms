package com.yakupatmaca.cwms.controller;

import com.yakupatmaca.cwms.model.Car;
import com.yakupatmaca.cwms.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public Car saveCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @PutMapping
    public Car updateCar(@RequestBody Car car) {
        return carService.updateCar(car);
    }

    @DeleteMapping
    public void deleteCar(@RequestBody Car car) {
        carService.deleteCar(car);
    }

    @GetMapping("/{licensePlate}")
    public Car findByLicensePlate(@PathVariable String licensePlate) {
        return carService.findByLicensePlate(licensePlate);
    }

    @GetMapping
    public List<Car> findAllCars() {
        return carService.findAllCars();
    }
}
