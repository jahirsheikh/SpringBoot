package com.jahir.point_of_sale_pos.repository;

import com.jahir.point_of_sale_pos.model.product.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit,Long> {
}
