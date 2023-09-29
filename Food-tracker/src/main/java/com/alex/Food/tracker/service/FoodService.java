package com.alex.Food.tracker.service;

import com.alex.Food.tracker.data.*;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Data
public class FoodService {

//    private String kcal = "";
//    private String protein = "";
//    private String carbs = "";
//    private String fat = "";
    private double kcal = 0.0;
    private double protein = 0.0;
    private double carbs = 0.0;
    private double fat = 0.0;


    public void addStats(String kcal, String carbs, String protein, String fat) {
        double kca = Double.parseDouble(kcal);
        double car = Double.parseDouble(carbs);
        double protei = Double.parseDouble(protein);
        double fa = Double.parseDouble(fat);
        this.kcal += kca;
        this.protein += protei;
        this.carbs += car;
        this.fat += fa;
        System.out.println("carbs: " + this.getCarbs() +"pro"+ this.getProtein() +"kcal" + this.getKcal() + "fat"+this.getFat());
    }

    public Food getData(BarCode barCode){
        String uri = "https://world.openfoodfacts.org/api/v0/product/"+barCode.toString()+".json";
        RestTemplate restTemplate = new RestTemplate();
        Food food = restTemplate.getForObject(uri, Food.class);
        System.out.println(food);
//        addStats(nutriments.getEnergyKcal_serving(), nutriments.getCarbohydrates_serving(), nutriments.getProteins_serving(), nutriments.getFat_serving());
//        Product product = food.getProduct();
        return food;
    }



}
