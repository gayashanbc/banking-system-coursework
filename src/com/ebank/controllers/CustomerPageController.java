/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebank.controllers;

import com.ebank.models.Customer;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Shan
 */
public class CustomerPageController {

    private Customer customer;

    /**
     * Default constructor
     */
    public CustomerPageController() {
        customer = new Customer();
    }

    /**
     * Synchronize deleted customer record with the web service
     *
     * @param customerId employee's Id that needs to be deleted
     * @return result of the operation
     */
    public boolean syncCustomerDeleteOperation(int customerId) {
        boolean isOperationSuccess = true;
        return isOperationSuccess;
    }

    /**
     * Get data of all the customers from the web service
     *
     * @return customer data records
     */
    public String[][] getCustomersData() {
        String[][] customersData = new String[5][11];
        for (int i = 0; i < 5; i++) {
            customersData[i][0] = (i + 1) + "";
            customersData[i][1] = "Gayashan Bombuwala";
            customersData[i][2] = LocalDate.now() + "";
            customersData[i][3] = "No. 284/ Gampaha";
            customersData[i][4] = "077-0548334";
            customersData[i][5] = "gayashanbc@gmail.com";
            customersData[i][6] = "Premium";
            customersData[i][7] = "8440049640";
            customersData[i][8] = "5";
            customersData[i][9] = "10000 LKR";
            customersData[i][10] = "4587 4585 2548 2548";
        }

        return customersData;
    }

    /**
     * Logout the current user from the web service
     *
     * @param username currently logged in user
     * @return
     */
    public boolean logout(String username) {
        boolean wasSuccessful = true;
        return wasSuccessful;
    }
}
