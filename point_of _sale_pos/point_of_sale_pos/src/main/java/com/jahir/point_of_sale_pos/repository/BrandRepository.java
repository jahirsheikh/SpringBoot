package com.jahir.point_of_sale_pos.repository;

import com.jahir.point_of_sale_pos.model.product.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
