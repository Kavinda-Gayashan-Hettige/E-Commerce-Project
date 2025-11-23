package edu.icet.service;

import edu.icet.model.dto.ProductDto;

import java.util.List;


public interface ProductService {
    void addProduct(ProductDto product);

    List<ProductDto> getAll();
}
