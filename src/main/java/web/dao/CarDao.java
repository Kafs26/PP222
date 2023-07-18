package web.dao;

import models.Car;

import java.util.List;

public interface CarDao {
    void add(Car car);
    List<Car> listOfCarsByCount(int count);


}
