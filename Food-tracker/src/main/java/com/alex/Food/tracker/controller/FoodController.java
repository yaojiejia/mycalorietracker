package com.alex.Food.tracker.controller;

import com.alex.Food.tracker.data.BarCode;
import com.alex.Food.tracker.data.Food;
import com.alex.Food.tracker.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoodController {
    FoodService foodService;
    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @RequestMapping("get")
    public String showCode(Model model) {
        model.addAttribute("barcode", new BarCode()); //input barcode
        return "start";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String saveFood(@ModelAttribute BarCode barCode, Model model) {
        System.out.println(barCode);
        model.addAttribute("food", foodService.getData(barCode));//search n display barcode
        foodService.addStats(foodService.getData(barCode).getProduct().getNutriments().getEnergyKcal_serving(),
                foodService.getData(barCode).getProduct().getNutriments().getCarbohydrates_serving(),
                foodService.getData(barCode).getProduct().getNutriments().getProteins_serving(),
                foodService.getData(barCode).getProduct().getNutriments().getFat_serving());
        return "result"; //ask if it needs to be added
    }
    @RequestMapping(value = "backToGet", method = RequestMethod.POST)
    public String backToGet(@ModelAttribute BarCode barCode, Model model) {
        model.addAttribute("stat", foodService);
        return "backToGet";//display added successfully
    }
}
