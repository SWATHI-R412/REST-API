package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
@Service
public class CarService
{
@Autowired
CarRepository repository;
public boolean addCar(Car car)
{
repository.save(car);
return true;
}
public List<Car> getCarByOwners(int owners)
{
return repository.findCarByOwners(owners);
}
public List<Car> getCarByAddress(String address)
{
return repository.findCarByAddress(address);
}
public List<Car> getCarByCarName(String carName)
{
return repository.findCarByCarName(carName);
}
public List<Car> getCarByOwnersAndCarType(int owners,String carType)
{
return repository.findCarByOwnersAndCarType(owners, carType);
}
}