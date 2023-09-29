package com.alex.Food.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//exclude = {DataSourceAutoConfiguration.class }
@SpringBootApplication()
public class FoodTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodTrackerApplication.class, args);
	}

}
