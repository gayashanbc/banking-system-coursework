/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebank.controllers;

import com.ebank.models.Employee;

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
     * @param employeeId employee's Id that needs to be deleted
     * @return result of the operation
     */
    public boolean syncEmployeeDeleteOperation(int employeeId) {
        boolean isOperationSuccess = true;
        return isOperationSuccess;
    }

}
