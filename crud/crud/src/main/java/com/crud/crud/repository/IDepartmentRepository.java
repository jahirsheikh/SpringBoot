package com.crud.crud.repository;

import com.crud.crud.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

    Department findBydname(String dname);

}
