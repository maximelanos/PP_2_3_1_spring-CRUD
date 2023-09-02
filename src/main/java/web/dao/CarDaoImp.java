package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImp implements CarDao {
    private final List<Car> list = new ArrayList<>();

    {
        list.add(new Car("BMW", "X5", 1000000));
        list.add(new Car("BMW", "X6", 2000000));
        list.add(new Car("OPEL", "5", 700000));
        list.add(new Car("AUDI", "A8", 3000000));
        list.add(new Car("FORD", "3", 600000));
    }

    @Override
    public List<Car> getList() {
        return list;
    }

    @Override
    public List<Car> getListCar(List<Car> list, int count) {
        if (count == 0 || count > 5) {
            return list;
        }
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
