package app.controller;

import app.serviсe.CarServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarServiceImp carServiseImp;

    @Autowired
    public CarsController(CarServiceImp carServiseImp) {
        this.carServiseImp = carServiseImp;
    }

    @GetMapping("")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "0") int count, ModelMap model) {
        model.addAttribute("cars", carServiseImp.listOfCarsByCount(count));
        return "cars";
    }


}
