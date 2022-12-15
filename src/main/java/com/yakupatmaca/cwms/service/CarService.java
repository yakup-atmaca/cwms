package com.yakupatmaca.cwms.service;

import com.yakupatmaca.cwms.model.Car;

import java.util.List;

public interface CarService {

    Car saveCar(Car car);

    Car updateCar(Car car);

    void deleteCar(Car car);

    Car findByLicensePlate(String licensePlate);

    List<Car> findAllCars();
}
