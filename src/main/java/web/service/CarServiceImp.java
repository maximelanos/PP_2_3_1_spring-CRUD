package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.models.Car;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private final CarDao carDao = new CarDaoImp();

    @Override
    public List<Car> getList() {
        return carDao.getList();
    }

    @Override
    public List<Car> getListCar(List<Car> list, int count) {
        return carDao.getListCar(list, count);
    }

}
