package com.crud.crud.restcontroller;

import com.crud.crud.model.Department;
import com.crud.crud.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class DepartmentRestController {

    @Autowired
    IDepartmentRepository departmentRepository;

    @GetMapping("/department")
    public List<Department> allDep(){

        return departmentRepository.findAll();
    }
    @PostMapping("/department")
    public  Department saveDepartment(@RequestBody Department department){

        return departmentRepository.save(department);
    }

    @DeleteMapping("/department/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        boolean exist=departmentRepository.existsById(id);
        if(exist){
            departmentRepository.deleteById(id);
            return  new ResponseEntity<>("Department is deleted", HttpStatus.OK);
        }
        return  new ResponseEntity<>("Department is not exist", HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/department/{id}")
    public ResponseEntity<String> update(@PathVariable("id") int id, @RequestBody Department department){
        boolean exist=departmentRepository.existsById(id);

        if(exist){
            Department department1=departmentRepository.getById(id);
            department1.setDname(department.getDname());
            department1.setDid(id);
            departmentRepository.save(department);
            return  new ResponseEntity<>("Department is Updated", HttpStatus.OK);
        }
        return  new ResponseEntity<>("Department is not Exist", HttpStatus.BAD_REQUEST);


    }



}
