package com.jahir.point_of_sale_pos.controller;

import com.jahir.point_of_sale_pos.model.product.Stock;
import com.jahir.point_of_sale_pos.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/stocks")
public class StockController {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllStock(){
        List<Stock> stockList= stockRepository.findAll();

        return stockList;
    }
}
