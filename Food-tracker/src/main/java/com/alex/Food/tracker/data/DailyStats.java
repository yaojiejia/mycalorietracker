package com.alex.Food.tracker.data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



//@Entity
public class DailyStats {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;
    private double kcal;
    private double protein;
    private double carbs;
    private double fat;

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal += kcal;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein += protein;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs += carbs;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat += fat;
    }
}
