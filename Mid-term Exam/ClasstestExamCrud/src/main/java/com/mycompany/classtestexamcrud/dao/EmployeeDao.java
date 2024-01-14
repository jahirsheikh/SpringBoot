
package com.mycompany.classtestexamcrud.dao;

import com.mycompany.classtestexamcrud.model.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class EmployeeDao {
    
   JdbcTemplate jdbcTemplate;
    
     public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    
     public int saveEmp(Employee e) {

        String sql = "insert into emp(name, department, salary,gender)"
                + "values('" + e.getName() + "', '" + e.getDepartment() + "', '" + e.getSalary() + "','" + e.getGender()+ "')";

        return jdbcTemplate.update(sql);
    }
     
      public int deleteEmp(int id) {

        String sql = "delete from emp where id=" + id + " ";

        return jdbcTemplate.update(sql);
    }

    public int updateEmp(Employee e) {

        String sql = "update  emp set name='" + e.getName() + "', department='" + e.getDepartment() + "', salary='" + e.getSalary() + "',gender='" + e.getGender() + "' where id='" + e.getId()+ "' ";

        return jdbcTemplate.update(sql);
    }
    
    public List<Employee> getAllEmp() {
        return jdbcTemplate.query("select * from emp", new RowMapper<Employee>() {
            public Employee mapRow(ResultSet rs, int row) throws SQLException {
                Employee e = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getString("gender"),
                        rs.getInt("salary")
                       
                );

                return e;
            }
        });

    }
    
     public Employee getEmpById(int id) {
        String sql = "select * from emp where id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Employee.class));
    }
 
    
    
}
