package com.jahir.point_of_sale_pos.controller;

import com.jahir.point_of_sale_pos.model.product.Brand;
import com.jahir.point_of_sale_pos.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/brands")
public class BrandRestController {

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping
    public List<Brand> getAllBrand() {
        List<Brand> brandList = brandRepository.findAll();

        return brandList;
    }


}
