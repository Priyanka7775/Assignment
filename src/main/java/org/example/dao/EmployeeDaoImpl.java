package org.example.dao;

import org.example.config.Config;
import org.example.model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements Employeedao{
    @Override
    public int addEmployee(String employeeName,double employeeSalary)  throws SQLException,ClassNotFoundException{
        int row=0;
        Connection connection=Config.getConnection();
        String sql="Insert into Employee(employeeName,employeeSalary) values (?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,employeeName);
        preparedStatement.setDouble(2,employeeSalary);
        row=preparedStatement.executeUpdate();
        return row;
    }

    @Override
    public int updateEmployeeByName(int employee_id,double employeeSalary,String employeeName) throws SQLException, ClassNotFoundException {
        int row=0;
        Connection connection=Config.getConnection();
        String sql="Update Employee set employeeName=? , employeeSalary=? where employee_id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);

        preparedStatement.setString(1,employeeName);
        preparedStatement.setDouble(2,employeeSalary);
        preparedStatement.setInt(3,employee_id);
        row=preparedStatement.executeUpdate();

        return row;
    }



    @Override
    public List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList();
        try {
            Connection connection = Config.getConnection();
            Statement statement = connection.createStatement();
            String sql = "select * from Employee";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int employee_id = resultSet.getInt(1);
                String employeeName = resultSet.getString(2);
                double employeeSalary = resultSet.getDouble(3);
                employeeList.add(new Employee(employee_id, employeeName, employeeSalary));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  employeeList;
    }








}
