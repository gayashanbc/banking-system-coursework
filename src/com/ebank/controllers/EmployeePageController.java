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
     *
     * @param employeeId employee's Id that needs to be deleted
     * @return result of the operation
     */
    public boolean syncEmployeeDeleteOperation(int employeeId) {
        boolean isOperationSuccess = true;
        return isOperationSuccess;
    }

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
    public boolean syncEmployeeAddEditOperation(int employeeId, String name, String position, String username, String password) {
        boolean isOperationSuccess = true;
        return isOperationSuccess;
    }

}
