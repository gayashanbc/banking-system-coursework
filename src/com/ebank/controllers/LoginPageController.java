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
public class LoginPageController {

    /**
     * Validate user's username password with web server
     *
     * @param username username to be validated
     * @param password password to be validated
     * @return validity of the username and password
     */
    public boolean checkLogin(String username, String password) {
        return validateLogin(username, password);
    }

    private static boolean validateLogin(java.lang.String username, java.lang.String password) {
        ebank.employee.EmployeeService_Service service = new ebank.employee.EmployeeService_Service();
        ebank.employee.EmployeeService port = service.getEmployeeServicePort();
         return port.validateLogin(username, password);
    }

}
