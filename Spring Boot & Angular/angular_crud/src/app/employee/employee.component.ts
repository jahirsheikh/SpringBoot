import { Component, OnInit } from '@angular/core';


import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../service/employee.service';
import { DepartmentService } from '../service/department.service';
import { error } from 'console';

import { EmployeeModel } from '../model/employeemodel';
import { DepartmentModel } from '../model/departmentmodel';





@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent implements OnInit {
  employees: EmployeeModel[] = [];
  departments: DepartmentModel[]=[];
  employeeForm!: FormGroup;

  constructor(
    private employeeService: EmployeeService,
    private formBuilder: FormBuilder,
    private departmentService : DepartmentService,
    
  ){}

  ngOnInit(): void {
    this.loadEmployees();
    this.loadDepartments();
    this.initEmployeeForm();
  }

private loadEmployees(){
  this.employeeService.getAllEmployees().subscribe(
    data => this.employees = data,
    error => console.error('Error fetching employee', error)
  );

}

private loadDepartments() {
  this.departmentService.getAllDep().subscribe(
    data => this.departments = data,
    error => console.error('Error fetching departments', error)
  );
}

private initEmployeeForm() {
  this.employeeForm = this.formBuilder.group({
    name: ['', Validators.required],
    email: ['', [Validators.required, Validators.email]],
    cellNo: ['', Validators.required],
    department: [null, Validators.required] // Assuming you have a department dropdown
  });
}

onSubmit() {
  if (this.employeeForm.valid) {
    const employeeData: EmployeeModel = this.employeeForm.value;
    this.employeeService.createEmployee(employeeData).subscribe(
      response => {
        console.log('Employee created successfully', response);
        this.loadEmployees(); // Refresh the list of employees after creation
        this.employeeForm.reset(); // Reset the form
      },
      error => alert('Error creating employee')
    );
  }
}

}
