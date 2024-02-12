package com.jahir.point_of_sale_pos.model.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    private Double sellingPrice;

    private LocalDate manufactureDate;

    private LocalDate expireDate;

    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private Product product;


}
