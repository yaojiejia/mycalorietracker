package com.alex.Food.tracker.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Nutriments {
//    private List<Nutriments>nutriments;
    private String alcohol;
    private String alcohol_100g;
    private String alcohol_serving;
    private String alcohol_unit;
    private String alcohol_value;
    private String carbohydrates;
    private String carbohydrates_100g;
    private String carbohydrates_serving;
    private String carbohydrates_unit;
    private String carbohydrates_value;
    private String carbonFootprintFromKnownIngredientsProduct;
    private String carbonFootprintFromKnownIngredients_serving;
    private String energy;
    @JsonProperty("energy-kcal")
    private String energyKcal;
    @JsonProperty("energy-kcal_100g")
    private String energyKcal_100g;
    @JsonProperty("energy-kcal_serving")
    private String energyKcal_serving;
    @JsonProperty("energy-kcal_unit")
    private String energyKcal_unit;
    private String energyKcal_value;
    private String energyKcal_value_computed;
    private String energyKj;
    private String energyKj_100g;
    private String energyKj_serving;
    private String energyKj_unit;
    private String energyKj_value;
    private String energyKj_value_computed;
    private String energy_100g;
    private String energy_serving;
    private String energy_unit;
    private String energy_value;
    private String fat;
    private String fat_100g;
    private String fat_serving;
    private String fat_unit;
    private String fat_value;
    private String fiber;
    private String fiber_100g;
    private String fiber_serving;
    private String fiber_unit;
    private String fiber_value;
    private String fruitsVegetablesNutsEstimateFromIngredients_100g;
    private String fruitsVegetablesNutsEstimateFromIngredients_serving;
    private String novaGroup;
    private String novaGroup_100g;
    private String novaGroup_serving;
    private String nutritionScoreFr;
    private String nutritionScoreFr_100g;
    private String proteins;
    private String proteins_100g;
    private String proteins_serving;
    private String proteins_unit;
    private String proteins_value;
    private String salt;
    private String salt_100g;
    private String salt_serving;
    private String salt_unit;
    private String salt_value;
    private String saturatedFat;
    private String saturatedFat_100g;
    private String saturatedFat_serving;
    private String saturatedFat_unit;
    private String saturatedFat_value;
    private String sodium;
    private String sodium_100g;
    private String sodium_serving;
    private String sodium_unit;
    private String sodium_value;
    private String sugars;
    private String sugars_100g;
    private String sugars_serving;
    private String sugars_unit;
    private String sugars_value;

}
