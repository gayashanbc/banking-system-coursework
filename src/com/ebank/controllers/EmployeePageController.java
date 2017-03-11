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
     * Get data of all the employees from the web service
     *
     * @return employees data records
     */
    public String[][] getEmployeesData() {
        String[][] employeesData = new String[3][5];
        employeesData[0][0] = 1 + "";
        employeesData[0][1] = "Gayashan Bombuwala";
        employeesData[0][2] = "Project Manager";
        employeesData[0][3] = "gayashanbc";
        employeesData[0][4] = "1128";

        employeesData[1][0] = 2 + "";
        employeesData[1][1] = "Mewantha Bandara";
        employeesData[1][2] = "Scrum Master";
        employeesData[1][3] = "mewa.bandara";
        employeesData[1][4] = "rgrg";

        employeesData[2][0] = 3 + "";
        employeesData[2][1] = "Achintha Premarathne";
        employeesData[2][2] = "Technical Lead";
        employeesData[2][3] = "achinthaprem";
        employeesData[2][4] = "11ththt28";

        return employeesData;
    }

}
