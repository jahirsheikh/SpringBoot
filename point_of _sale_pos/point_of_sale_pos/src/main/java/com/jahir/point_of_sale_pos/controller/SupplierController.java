package com.jahir.point_of_sale_pos.controller;

import com.jahir.point_of_sale_pos.model.supplier.Supplier;
import com.jahir.point_of_sale_pos.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/suppliers")
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;

    @GetMapping("")
    public List<Supplier> getAllSupplier() {

        List<Supplier> supplierList = supplierRepository.findAll();

        return supplierList;

    }
}
