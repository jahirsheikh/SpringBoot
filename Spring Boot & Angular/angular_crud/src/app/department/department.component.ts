import { Component, OnInit } from '@angular/core';
import { DepartmentModel } from '../model/departmentmodel';
import { FormBuilder, FormGroup } from '@angular/forms';
import { DepartmentService } from '../service/department.service';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrl: './department.component.css'
})
export class DepartmentComponent implements OnInit {

  departmentModel: DepartmentModel = new DepartmentModel();

  departmentData:any;
  formvalu !: FormGroup;

constructor(private depService:DepartmentService, private formBuiler:FormBuilder){}
ngOnInit(): void {
  this.formvalu=this.formBuiler.group(
    {
      dname:['']
    }
  );
  this.getAllDep
}


getAllDep(){
  this.depService.getAllDep()
  .subscribe(
    res=>{
      this.departmentData=res
    }
  )
}

saveDep(){
  this.departmentModel.dname=this.formvalu.value.dname;
  this.depService.saveDep(this.departmentModel)
  .subscribe(res=>{
    this.formvalu.reset();
    this.getAllDep();
  },
  err=>{
    alert("Data Not Save")
  }
    
  )
}





}
