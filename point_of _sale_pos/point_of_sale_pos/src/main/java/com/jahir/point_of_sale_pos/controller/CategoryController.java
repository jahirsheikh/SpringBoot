package com.jahir.point_of_sale_pos.controller;

import com.jahir.point_of_sale_pos.model.product.Category;
import com.jahir.point_of_sale_pos.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("")
    public List<Category> gettAllCategory(){
        List<Category> categoryList=categoryRepository.findAll();
        return categoryList;
    }
}
