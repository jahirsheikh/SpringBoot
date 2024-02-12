package com.jahir.point_of_sale_pos.repository;

import com.jahir.point_of_sale_pos.model.product.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
