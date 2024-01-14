package com.jahir.project_daynamic_pos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String customerId;
    private String name;
    private String address;
    private String phone;

}
