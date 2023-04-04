/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.client;

import co.za.mecer.connection.DBConnection;
import co.za.mecer.service.RegisterImpl;
import co.za.mecer.service.RegisterService;
import java.sql.Connection;

/**
 *
 * @author PULE
 */
public class test {
    public static void main(String[] args) {
        new test().run();
    }
    
    public void run(){
        Customer cust = new Customer("mr", "ppuullee", "ttsshheettllhhaa",
                "999333999333", "09485458", "nsameee@nsamee.com", "vnvroeerr");
        
        RegisterService regserv = new RegisterImpl();
        
        regserv.addCustomer(cust);
    }
    
    public static Connection getConnection(){
        return DBConnection.getInstance();
    }
}
