package com.example.customerapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class ProductItem {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
