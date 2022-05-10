package web.controller;


import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class CarController {

@Autowired
    List<Car> CarList;

@GetMapping(value = "/cars")
public String viewCar(ModelMap model) {
    model.addAttribute("carslist", CarList);

    return "cars";
}


}
