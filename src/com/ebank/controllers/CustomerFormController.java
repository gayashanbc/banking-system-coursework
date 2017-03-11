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
public class CustomerFormController {

    /**
     * Synchronize added/edited customer record with the web service
     *
     * @param customerId customerId of the existing customer
     * @param name name of the new/existing customer
     * @param birthdate of the new/existing customer
     * @param address of the new/existing customer
     * @param mobile of the new/existing customer
     * @param email of the new/existing customer
     * @param type of the new/existing customer
     * @param accountNo of the new/existing customer
     * @param sortCode of the new/existing customer
     * @param balance of the new/existing customer
     * @param card of the new/existing customer
     * @return result of the operation
     */
    public boolean syncEmployeeAddEditOperation(int customerId, String name, String birthdate, String address, String mobile, String email,
            String type, String accountNo, String sortCode,
            String balance, String card) {
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
