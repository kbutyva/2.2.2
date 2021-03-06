package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(ModelMap model, @RequestParam(value = "count", required = false) String count) {

        if (count == null || Integer.parseInt(count) >= 5) {
            model.addAttribute("messages", new CarService().getFiveCars());
        } else {

            model.addAttribute("messages", new CarService().newList(Integer.parseInt(count)));
        }
        return "cars";
    }

}
