package com.jahir.project_daynamic_pos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

    @Id
    private String orderId;
    private String orderDate;
    private String userId;



}
