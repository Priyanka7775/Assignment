package org.example.dao;

import org.example.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface Employeedao {
    public int addEmployee(String employeeName,double employeeSalary)  throws SQLException,ClassNotFoundException;
    public int updateEmployeeByName(int employee_id,double employeeSalary,String employeeName) throws SQLException, ClassNotFoundException;
    public List<Employee> getEmployees();
}
