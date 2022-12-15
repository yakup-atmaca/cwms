package com.yakupatmaca.cwms.service;

import com.yakupatmaca.cwms.model.Car;
import com.yakupatmaca.cwms.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarRepository carRepository;

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car updateCar(Car car) {
        return carRepository.save(car);
    }
    @Override
    public void deleteCar(Car car) {
        carRepository.delete(car);
    }
    @Override
    public Car findByLicensePlate(String licensePlate) {
        return null;
    }

    @Override
    public List<Car> findAllCars() {
        return carRepository.findAll();
    }
}
