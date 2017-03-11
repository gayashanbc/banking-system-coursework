/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebank.controllers;

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
    public boolean syncEmployeeAddEditOperation(int employeeId, String name, String position, String username, String password) {
        boolean isOperationSuccess = true;
        return isOperationSuccess;
    }

    /**
     * Get data of a particular employee from the web service
     *
     * @param employeeId id of the employee whose data needs to be retrieved
     * @return details of the requested employeeId
     */
    public String[] getEmployeeData(int employeeId) {
        String[] employeeDara = {"8", "Gayashan Kalhara", "Manager", "gayashanbc", "1128"};
        System.out.println(employeeDara.toString());
        return employeeDara;
    }
}
