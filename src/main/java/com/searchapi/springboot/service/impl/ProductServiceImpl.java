package com.searchapi.springboot.service.impl;

import com.searchapi.springboot.entity.Product;
import com.searchapi.springboot.repository.ProductRepository;
import com.searchapi.springboot.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProducts(query);
    }
}
