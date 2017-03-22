/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebank.controllers;

import java.util.ArrayList;

/**
 *
 * @author Shan
 */
public class EmployeeFormController {

    /**
     * Synchronize added/edited employee record with the web service
     *
     * @param employeeId employeeId of the existing employee
     * @param name name of the new/existing employee
     * @param position position of the new/existing employee
     * @param username username of the new/existing employee
     * @param password password of the new/existing employee
     * @return result of the operation
     */
    public boolean syncEmployeeAddEditOperation(int employeeId, String name,
            String position, String username, String password) {
        return addEditEmployee(employeeId, name, position, username, password);
    }

    /**
     * Get data of a particular employee from the web service
     *
     * @param employeeId id of the employee whose data needs to be retrieved
     * @return details of the requested employeeId
     */
    public String[] getEmployeeData(int employeeId) {
        ArrayList<String> data = (ArrayList<String>) getEmployee(employeeId);
        String[] employee = new String[data.size()];
        for (int i = 0; i < data.size(); i++) {
            employee[i] = data.get(i);
        }
        return employee;
    }

    private static java.util.List<java.lang.String> getEmployee(int employeeId) {
        ebank.employee.EmployeeService_Service service = new ebank.employee.EmployeeService_Service();
        ebank.employee.EmployeeService port = service.getEmployeeServicePort();
        return port.getEmployee(employeeId);
    }

    private static boolean addEditEmployee(int employeeId, java.lang.String name, java.lang.String position, java.lang.String username, java.lang.String password) {
        ebank.employee.EmployeeService_Service service = new ebank.employee.EmployeeService_Service();
        ebank.employee.EmployeeService port = service.getEmployeeServicePort();
        return port.addEditEmployee(employeeId, name, position, username, password);
    }
}
