import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { EmployeeModel } from '../model/employeemodel';



@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl = 'http://localhost:8090/api/employee';

  constructor(private httpClient: HttpClient) { }

  getAllEmployees():Observable<EmployeeModel[]>{
    return this.httpClient.get<EmployeeModel[]>(this.baseUrl);

  }

  getEmployeeById(id: number): Observable<EmployeeModel> {
    return this.httpClient.get<EmployeeModel>(`${this.baseUrl}/${id}`);
  }

  createEmployee(employee: EmployeeModel): Observable<EmployeeModel> {
    return this.httpClient.post<EmployeeModel>(this.baseUrl, employee);
  }

  updateEmployee(id: number, employee: EmployeeModel): Observable<EmployeeModel> {
    return this.httpClient.put<EmployeeModel>(`${this.baseUrl}/${id}`, employee);
  }

  deleteEmployee(id: number): Observable<void> {
    return this.httpClient.delete<void>(`${this.baseUrl}/${id}`);
  }


}
