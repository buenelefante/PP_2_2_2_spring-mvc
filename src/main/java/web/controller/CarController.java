package web.controller;


import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCraps, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Uaz", "yellow", "1987"));
        list.add(new Car("Lada", "black", "2002"));
        list.add(new Car("Volga", "green", "1999"));
        list.add(new Car("Gaz", "blue", "2020"));
        list.add(new Car("Kamaz", "orange", "1987"));
        list = CarService.carsList(list, allCraps);
        model.addAttribute("carslist", list);
        return "cars";

    }


//
//@Autowired
//    List<Car> CarList;
//
//@GetMapping(value = "/cars")
//public String viewCar(ModelMap model) {
//
//    model.addAttribute("carslist", CarList);
//
//    return "cars";
//}


}
