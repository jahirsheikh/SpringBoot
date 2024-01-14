package com.jahir.project_daynamic_pos.repository;

import com.jahir.project_daynamic_pos.model.product.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {

    Page<Category> findByNameContaining(String text, Pageable pageable);

    boolean existsByName(String name);

}
