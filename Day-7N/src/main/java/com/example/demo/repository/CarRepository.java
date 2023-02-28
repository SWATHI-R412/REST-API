package com.example.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, Integer>
{
public List<Car> findCarByOwners(int owners);
public List<Car> findCarByAddress(String address);
public List<Car> findCarByCarName(String carName);
public List<Car> findCarByOwnersAndCarType(int owners, String CarType);
}