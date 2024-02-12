package com.jahir.point_of_sale_pos.repository;

import com.jahir.point_of_sale_pos.model.supplier.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Long> {

}
