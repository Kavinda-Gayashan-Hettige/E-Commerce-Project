package edu.icet.controller;

import edu.icet.model.dto.ProductDto;

import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/product")

public class ProductController {

       final ProductService service;
        @PostMapping("/add")
        @ResponseStatus(HttpStatus.CREATED)
        public void addProduct( ProductDto product) {
            service.addProduct(product);

        }
}
