package web.dao;

import web.model.Car;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private List<Car>cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Uaz", "yellow", 1987, "All Right"));
        cars.add(new Car("Lada", "black", 2002, "Crapp"));
        cars.add(new Car("Volga", "green", 1999, "All Right"));
        cars.add(new Car("Gaz", "blue", 2020, "All Right"));
        cars.add(new Car("Kamaz", "orange", 1987, "Good"));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
