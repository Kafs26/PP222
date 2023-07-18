package web.controller;

import web.dao.CarDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/cars")
public class CarsController {


    private final CarDaoImp carDaoImp;

    @Autowired
    public CarsController(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @GetMapping("")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "0") int count, ModelMap model) {
        if (count == 0 || count > carDaoImp.getCarsCount()) {
            model.addAttribute("cars", carDaoImp.getCars());
        } else {
            model.addAttribute("cars", carDaoImp.listOfCarsByCount(count));
        }
        return "cars";
    }


}
