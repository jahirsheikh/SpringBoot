/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classtestexamcrud.model;

/**
 *
 * @author user
 */
public class Employee {
    
    private int id;
    private String name;
    private String department;
    private String gender;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String department, String gender, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", department=" + department + ", gender=" + gender + ", salary=" + salary + '}';
    }
    
    
    
}