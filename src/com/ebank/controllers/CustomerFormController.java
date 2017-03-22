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
    public boolean syncCustomerAddEditOperation(int customerId, String name, String birthdate, String address, String mobile, String email,
            String type, String accountNo, String sortCode,
            String balance, String card) {
        return addEditCustomer(customerId, name, birthdate, address, mobile, email, type, accountNo, sortCode, balance, card);
    }

    /**
     * Get data of a particular customer from the web service
     *
     * @param accountNo id of the customer whose data needs to be retrieved
     * @return details of the requested accountNo
     */
    public String[] getCustomerData(String accountNo) {
        ArrayList<String> data = (ArrayList<String>) getCustomer(accountNo);
        String[] customer = new String[data.size()];
        for (int i = 0; i < data.size(); i++) {
            customer[i] = data.get(i);
        }
        return customer;
    }

    private static java.util.List<java.lang.String> getCustomer(java.lang.String customerId) {
        ebank.customer.CustomerService_Service service = new ebank.customer.CustomerService_Service();
        ebank.customer.CustomerService port = service.getCustomerServicePort();
        return port.getCustomer(customerId);
    }

    private static boolean addEditCustomer(int customerId, java.lang.String name, java.lang.String birthdate, java.lang.String address, java.lang.String mobile, java.lang.String email, java.lang.String type, java.lang.String accountNo, java.lang.String sortCode, java.lang.String balance, java.lang.String card) {
        ebank.customer.CustomerService_Service service = new ebank.customer.CustomerService_Service();
        ebank.customer.CustomerService port = service.getCustomerServicePort();
        return port.addEditCustomer(customerId, name, birthdate, address, mobile, email, type, accountNo, sortCode, balance, card);
    }
}
