package com.jahir.project_daynamic_pos.repository;

import com.jahir.project_daynamic_pos.model.product.Brand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBrandRepository extends JpaRepository<Brand , Long> {

    Page<Brand> findByNameContaining(String name, PageRequest pageRequest);

    boolean existsByName(String name);

}
