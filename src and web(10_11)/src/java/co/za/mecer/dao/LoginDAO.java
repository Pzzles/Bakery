/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.dao;

import co.za.mecer.client.Customer;

/**
 *
 * @author PULE
 */
public interface LoginDAO {
    public String ValidateLogIn(Customer customer);
    public Customer readCustomer(Customer customer);
}
