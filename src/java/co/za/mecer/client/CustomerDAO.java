/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.client;

import java.util.List;

/**
 *
 * @author PULE
 */
public interface CustomerDAO {
    public List<Customer> ReadAllCustomers();
    public void updateCustomer(int Customer_ID);
    //public Customer ReadOneCustomer();
    
}
