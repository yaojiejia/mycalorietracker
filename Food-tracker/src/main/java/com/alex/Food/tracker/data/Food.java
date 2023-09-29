package com.alex.Food.tracker.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Food {
    @JsonProperty("product")
    private Product product;
//    private Nutriments nutriments;

}
