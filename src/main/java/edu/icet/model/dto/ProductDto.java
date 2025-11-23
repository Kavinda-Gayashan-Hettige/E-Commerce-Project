package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private String productID;
    private String productName;
    private int qty;
    private double price;
    private String category;
    private String description;
}
