/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.dao;

import co.za.mecer.client.Customer;
import co.za.mecer.connection.DBConnection;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sun.security.rsa.RSACore;

/**
 *
 * @author PULE
 */
public class RegisterDAOImpl implements RegisterDAO {
    

 
    Connection con = null;

    @Override
    public void addCustomer(Customer customer) {
         

        try {
            con = DBConnection.getInstance();

            PreparedStatement pstmt;
            pstmt = con.prepareStatement("INSERT INTO client("
                    + "DeliveryAddress_Id, "
                    + "PaymentType_Id, "
                    + "Title, "
                    + "First_Name, "
                    + "Surname, "
                    + "Id_Number, "
                    + "Email_Address, "
                    + "Phone, "
                    + "User_Password) "
                    + "VALUES((select DeliveryAddress_Id from delivery_address where DeliveryAddress_Id = ?),"
                    + "(select PaymentType_Id from paymenttype where PaymentType_Id = ?),?,?,?,?,?,?,?)");

            pstmt.setInt(1, customer.getDeliveryAddress_Id());
            pstmt.setInt(2, customer.getPaymentType_Id());
            pstmt.setString(3, customer.getTitle());
            pstmt.setString(4, customer.getFirst_Name());
            pstmt.setString(5, customer.getSurname());
            pstmt.setString(6, customer.getId_Number());
            pstmt.setString(7, customer.getEmail_Address());
            pstmt.setString(8, customer.getPhone());
            pstmt.setString(9, customer.getPassword());
            pstmt.executeUpdate();

    }catch(Exception ex){
            System.out.println("Error!" + ex.getMessage());
           
    }
    
}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    @Override
//    public String ValidateRegistration(Customer customer) {
//        System.out.println("In Validate Reg");
//
//        int Client_Id = customer.getClient_Id();
//        int DeliveryAddress_Id = customer.getDeliveryAddress_Id();
//        int getPaymentType_Id = customer.getPaymentType_Id();
//        String title = customer.getTitle();
//        String firstname = customer.getFirst_Name();
//        String surname = customer.getSurname();
//        String id_Number = customer.getId_Number();
//        String email = customer.getEmail_Address();
//        String phone = customer.getPhone();
//        String password = customer.getPassword();
//
//        try {
//            con = DBConnection.getInstance();
//
//            PreparedStatement pstmt;
//            pstmt = con.prepareStatement("INSERT INTO client("
//                    + "DeliveryAddress_Id, "
//                    + "PaymentType_Id, "
//                    + "Title, "
//                    + "First_Name, "
//                    + "Surname, "
//                    + "Id_Number, "
//                    + "Email_Address, "
//                    + "Phone, "
//                    + "User_Password) "
//                    + "VALUES((select DeliveryAddress_Id from delivery_address where DeliveryAddress_Id = ?),"
//                    + "(select PaymentType_Id from paymenttype where PaymentType_Id = ?),?,?,?,?,?,?,?)");
////            pstmt = con.prepareStatement("INSERT INTO client("
////                    + "Title, "
////                    + "First_Name, "
////                    + "Surname, "
////                    + "Id_Number, "
////                    + "Email_Address, "
////                    + "Phone,"
////                    + "User_Password)"
////                    + "VALUES(?,?,?,?,?,?,?)");
//
////            pstmt.setString(1, title);
////            pstmt.setString(2, firstname);
////            pstmt.setString(3, surname);
////            pstmt.setString(4, id_Number);
////            pstmt.setString(5, email);
////            pstmt.setString(6, phone);
////            pstmt.setString(7, password);
//            pstmt.setInt(1, DeliveryAddress_Id);
//            pstmt.setInt(2, getPaymentType_Id);
//            pstmt.setString(3, title);
//            pstmt.setString(4, firstname);
//            pstmt.setString(5, surname);
//            pstmt.setString(6, id_Number);
//            pstmt.setString(7, email);
//            pstmt.setString(8, phone);
//            pstmt.setString(9, password);
//            pstmt.executeUpdate();



