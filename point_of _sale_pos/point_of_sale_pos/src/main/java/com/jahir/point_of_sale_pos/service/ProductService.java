package com.jahir.point_of_sale_pos.service;

import com.jahir.point_of_sale_pos.model.product.Product;
import com.jahir.point_of_sale_pos.repository.BrandRepository;
import com.jahir.point_of_sale_pos.repository.ProductRepository;
import com.jahir.point_of_sale_pos.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {




    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.orElse(null);
    }

    public Product createProduct(Product product) {
        // Perform any business logic or validation if needed before saving
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        // Check if the product with the given id exists
        Optional<Product> optionalExistingProduct = productRepository.findById(id);

        if (optionalExistingProduct.isPresent()) {
            // Perform any business logic or validation if needed before updating
            Product existingProduct = optionalExistingProduct.get();
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setBrand(updatedProduct.getBrand());
            existingProduct.setUnit(updatedProduct.getUnit());

            return productRepository.save(existingProduct);
        } else {
            // Handle the case where the product with the given id is not found
            return null;
        }
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
