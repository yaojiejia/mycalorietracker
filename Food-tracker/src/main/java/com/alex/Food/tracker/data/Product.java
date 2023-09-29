package com.alex.Food.tracker.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Product {
    @JsonProperty("_id")
    private String id;
    @JsonProperty("nutriments")
    private Nutriments nutriments;


}
