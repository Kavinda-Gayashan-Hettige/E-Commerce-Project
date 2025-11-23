package edu.icet.service.impl;

import edu.icet.model.dto.ProductDto;
import edu.icet.model.entity.Product;
import edu.icet.repository.ProductRepository;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    final ProductRepository repository;
     ModelMapper mapper = new ModelMapper();
    @Override
    public void addProduct(ProductDto product) {
    repository.save(mapper.map(product, Product.class));
    }

    @Override
    public List<ProductDto> getAll() {

        List<ProductDto> productList = new ArrayList<>();
        List<Product> all = repository.findAll();

        all.forEach(product -> {
            productList.add(mapper.map(product, ProductDto.class));
        });

        return productList;
    }
}
