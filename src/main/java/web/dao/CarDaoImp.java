package web.dao;

import models.Car;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Model1", 1, 2020));
        cars.add(new Car("Model2", 2, 2021));
        cars.add(new Car("Model3", 3, 2022));
        cars.add(new Car("Model4", 4, 2019));
        cars.add(new Car("Model5", 5, 2018));
    }


    public CarDaoImp() {
    }

    public CarDaoImp(List<Car> cars) {
        this.cars = cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public int getCarsCount() {
        return cars.size();
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> listOfCarsByCount(int count) {
        if (count > cars.size()) return cars;
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "CarDaoImp{" +
                "cars=" + cars +
                '}';
    }
}
