package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long productID;
    private String productName;
    private int qty;
    private double price;
    private String category;
    private String description;
}
