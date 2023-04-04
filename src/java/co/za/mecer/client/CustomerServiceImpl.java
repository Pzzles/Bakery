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
public class CustomerServiceImpl implements CustomerService{
    public static void main(String[] args) {
        new CustomerServiceImpl().run();
    }
    
    public void run(){
        Customer cust = new Customer();
        
        List<Customer> custList = ReadAllCustomers();
        
        for(Customer all : custList ){
            System.out.println(all.getFirst_Name());
        }
    }

    private CustomerDAOImpl customerDAOImp ;
    
    public CustomerServiceImpl(){
        customerDAOImp = new CustomerDAOImpl();
    }
    
    @Override
    public List<Customer> ReadAllCustomers() {
        return customerDAOImp.ReadAllCustomers();
    }

    @Override
    public void updateCustomer(int Customer_ID) {
        
    }
    
}
