package com.horacioss.cppmsaelectronic.controller;

import com.horacioss.cppmsaelectronic.entity.Product;
import com.horacioss.cppmsaelectronic.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(path = "/products", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Map<String, List<Product>>  getProducts() {

        log.info("Executed 'ProductController'");
        ArrayList<Product> products = new ArrayList<Product>();
        products.addAll(productRepository.findAll());

        return Map.of("results", products);
    }

}
