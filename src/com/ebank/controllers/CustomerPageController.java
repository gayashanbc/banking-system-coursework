/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebank.controllers;

import com.ebank.models.Customer;
import java.time.LocalDate;
import java.util.ArrayList;
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
    public boolean syncCustomerDeleteOperation(String accountNo) {
        return deleteCustomer(accountNo);
    }

    /**
     * Get data of all the customers from the web service
     *
     * @return customer data records
     */
    public String[][] getCustomersData() {
        ArrayList<String> DB_Records = (ArrayList<String>) getCustomers();
        String[][] customerData = new String[DB_Records.size()][5];

        for (int i = 0; i < DB_Records.size(); i++) {
            String[] tempRecord = DB_Records.get(i).split(";");
            customerData[i][0] = tempRecord[0];
            customerData[i][1] = tempRecord[1];
        }

        return customerData;
    }

    /**
     * Logout the current user from the web service
     *
     * @param username currently logged in user
     * @return
     */
    public boolean logout(String username) {
        return logoutCheck(username);
    }

    private static boolean logoutCheck(java.lang.String username) {
        ebank.employee.EmployeeService_Service service = new ebank.employee.EmployeeService_Service();
        ebank.employee.EmployeeService port = service.getEmployeeServicePort();
        return port.logout(username);
    }

    private static java.util.List<java.lang.String> getCustomers() {
        ebank.customer.CustomerService_Service service = new ebank.customer.CustomerService_Service();
        ebank.customer.CustomerService port = service.getCustomerServicePort();
        return port.getCustomers();
    }

    private static boolean deleteCustomer(java.lang.String accountNo) {
        ebank.customer.CustomerService_Service service = new ebank.customer.CustomerService_Service();
        ebank.customer.CustomerService port = service.getCustomerServicePort();
        return port.deleteCustomer(accountNo);
    }
}
