package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List getFiveCars() {

        List<Car> messages = new ArrayList<>();
        messages.add(new Car("lada", 1984, 90));
        messages.add(new Car("ford", 2000, 250));
        messages.add(new Car("opel", 2020, 160));
        messages.add(new Car("toyota", 1960, 90));
        messages.add(new Car("bmw", 1990, 120));
        return messages;
    }

    public List getTwoCars(){
        List<Car> messages = new ArrayList<>();
        messages.add(new Car("lada", 1984, 90));
        messages.add(new Car("ford", 2000, 250));
        return messages;
    }

    public List getThreeCars(){
        List<Car> messages = new ArrayList<>();
        messages.add(new Car("lada", 1984, 90));
        messages.add(new Car("ford", 2000, 250));
        messages.add(new Car("opel", 2020, 160));
        return messages;
    }
}
