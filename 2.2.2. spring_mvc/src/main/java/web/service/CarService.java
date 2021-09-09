package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> getFiveCars() {

        List<Car> messages = new ArrayList<>();
        messages.add(new Car("lada", 1984, 90));
        messages.add(new Car("ford", 2000, 250));
        messages.add(new Car("opel", 2020, 160));
        messages.add(new Car("toyota", 1960, 90));
        messages.add(new Car("bmw", 1990, 120));
        return messages;
    }

    public List<Car> newList(int z){
        List<Car> list = new ArrayList<>();
        for (int i=0; i<z && i<5;i++ ){
            list.add(getFiveCars().get(i));
        }
        return list;
    }
}
