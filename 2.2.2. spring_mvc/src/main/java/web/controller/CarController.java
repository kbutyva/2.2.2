package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    @GetMapping("/cars")
    public String getCars(ModelMap model, @RequestParam(value = "count", required = false) String count){

        if(count==null||Integer.parseInt(count)>=5) {
            List<Car> messages = new ArrayList<>();
            messages.add(new Car("lada", 1984, 90));
            messages.add(new Car("ford", 2000, 250));
            messages.add(new Car("opel", 2020, 160));
            messages.add(new Car("toyota", 1960, 90));
            messages.add(new Car("bmw", 1990, 120));
            model.addAttribute("messages", messages);
        } else if (Integer.parseInt(count) == 2){
            List<Car> messages = new ArrayList<>();
            messages.add(new Car("lada", 1984, 90));
            messages.add(new Car("ford", 2000, 250));
            model.addAttribute("messages", messages);
        } else  if (Integer.parseInt(count) == 3){
            List<Car> messages = new ArrayList<>();
            messages.add(new Car("lada", 1984, 90));
            messages.add(new Car("ford", 2000, 250));
            messages.add(new Car("opel", 2020, 160));
            model.addAttribute("messages", messages);
        }
        return "cars";
    }


}