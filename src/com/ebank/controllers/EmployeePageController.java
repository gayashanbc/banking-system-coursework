/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebank.controllers;

import com.ebank.models.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shan
 */
public class EmployeePageController {
    
    private Employee employee;
    
    public EmployeePageController() {
        employee = new Employee();
    }

    /**
     * Synchronize deleted employee record with the web service
     *
     * @param employeeId employee's Id that needs to be deleted
     * @return result of the operation
     */
    public boolean syncEmployeeDeleteOperation(int employeeId) {
        return deleteEmployee(employeeId);
    }

    /**
     * Get data of all the employees from the web service
     *
     * @return employees data records
     */
    public String[][] getEmployeesData() {
        ArrayList<String> DB_Records = (ArrayList<String>) getEmployees();
        String[][] employeesData = new String[DB_Records.size()][5];
        
        for (int i = 0; i < DB_Records.size(); i++) {
            String[] tempRecord = DB_Records.get(i).split(";");
            employeesData[i][0] = tempRecord[0];
            employeesData[i][1] = tempRecord[1];
        }
        
        return employeesData;
    }
    
    private static boolean deleteEmployee(int employeeId) {
        ebank.employee.EmployeeService_Service service = new ebank.employee.EmployeeService_Service();
        ebank.employee.EmployeeService port = service.getEmployeeServicePort();
        return port.deleteEmployee(employeeId);
    }
    
    private static java.util.List<java.lang.String> getEmployees() {
        ebank.employee.EmployeeService_Service service = new ebank.employee.EmployeeService_Service();
        ebank.employee.EmployeeService port = service.getEmployeeServicePort();
        return port.getEmployees();
    }
    
}
