package com.jahir.point_of_sale_pos.repository;

import com.jahir.point_of_sale_pos.model.supplier.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {


}
