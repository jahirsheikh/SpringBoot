package com.jahir.point_of_sale_pos.controller;

import com.jahir.point_of_sale_pos.model.product.Unit;
import com.jahir.point_of_sale_pos.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/unit")
public class UnitController {

    @Autowired
    private UnitRepository unitRepository;

    @GetMapping
    public List<Unit> getAllUnit() {
        List<Unit> unitList = unitRepository.findAll();
        return unitList;
    }

}
