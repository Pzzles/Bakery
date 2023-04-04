/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.service;

import co.za.mecer.client.Customer;
import co.za.mecer.connection.DBConnection;
import co.za.mecer.dao.RegisterDAO;
import co.za.mecer.dao.RegisterDAOImpl;

import co.za.mecer.service.RegisterService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PULE
 */
public class RegisterImpl implements RegisterService{
    
    private RegisterDAO regDAO;

    public RegisterImpl() {
        this.regDAO = new RegisterDAOImpl();
    }
    
    @Override
    public void addCustomer(Customer customer) {
       regDAO.addCustomer(customer);
    }
    
}
