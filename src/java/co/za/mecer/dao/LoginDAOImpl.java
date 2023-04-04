/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.dao;

import co.za.mecer.service.RegisterImpl;
import co.za.mecer.client.Customer;
import co.za.mecer.service.RegisterService;
import co.za.mecer.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PULE
 */
public class LoginDAOImpl implements LoginDAO {

    RegisterService ab = new RegisterImpl();
    public static void main(String[] args) {
        new LoginDAOImpl().run();
    }
   

    Connection con = null;

    public void run() {
        Customer cust = new Customer();
        cust.setEmail_Address("mecerIntered@mecer");
        cust.setPassword("12345");
        
       String validate = ValidateLogIn(cust);

    }

    @Override
    public String ValidateLogIn(Customer customer) {
        String result = "";
        try {
            con = DBConnection.getInstance();

            int clientID = customer.getClient_Id();
            String username = customer.getEmail_Address();
            String password = customer.getPassword();

            String savedUsername = "";
            String savedPassword = "";

            PreparedStatement pstmt;
            pstmt = con.prepareStatement("SELECT * FROM client WHERE Email_Address = ? AND User_Password =?");
           // pstmt.setInt(1, clientID);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
             //   int dbclientID = rs.getInt("Client_id");
                savedUsername = rs.getString("Email_Address");
                savedPassword = rs.getString("User_Password");

                if (username.equals(savedUsername) && password.equals(savedPassword)) {

                    result = "SUCCSSFULLY LOGGED IN";
                    System.out.println(result);
                    return result;
                }
            }

            pstmt.close();
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.getMessage());
        } finally {
        }
        result = "INCORRECT USERNAME OR PASSWORD... Try again";
        System.out.println(result);
        return result;

    }

    @Override
    public Customer readCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
