package org.example;

import org.example.dao.EmployeeDaoImpl;
import org.example.model.Employee;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class EmployeeMain
{


    public static void main(String[] args) {
        try{
            EmployeeMain employee = new EmployeeMain();
            System.out.println("Press 1 for see details");
            System.out.println("Press 2 to add Employee");
            Scanner scanner=new Scanner(System.in);
            int num=scanner.nextInt();
            scanner.nextInt();
            switch (num) {
                case1:{
                List<Employee> employeeList = employee.getEmployees();
                for (Employee employee1 : employeeList) {
                    System.out.format("%-10d %-30s  %-10s %-10s %-10s\n", employee1.getEmployee_id(), employee1.getEmployeeName(), employee1.getEmployeeSalary());
                }
                System.out.println("=============================================================");
                break;
            }
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


    }


}
