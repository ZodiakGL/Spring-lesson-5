package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImp implements CarService {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1,"LADA", "2107"));
        cars.add(new Car(2, "Mazda", "RX8"));
        cars.add(new Car(3,"KIA", "RIO"));
        cars.add(new Car(4,"BMW", "F40"));
        cars.add(new Car(5,"Nissan", "Patrol"));
    }
    @Override
    public List<Car> getCars () {
        return cars;
    }
    @Override
    public List<Car> getCarsByCount (int count) {
        if (count >= 5) {
            return getCars();
        } else {
            List<Car> result = new ArrayList<>();
            for (int i = 0; i < count && i < cars.size(); i++) {
                result.add(cars.get(i));
            }
            return result;
        }
    }
}
