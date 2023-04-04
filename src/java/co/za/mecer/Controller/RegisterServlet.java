/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.Controller;

import co.za.mecer.client.Customer;
import co.za.mecer.service.RegisterImpl;
import co.za.mecer.service.RegisterService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PULE
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RegisterService regServ = new RegisterImpl();
        if (request.getParameter("register_btn") != null) {

            String title = request.getParameter("title");
            String firstname = request.getParameter("firstname");
            String surname = request.getParameter("surname");
            String id_Number = request.getParameter("id_Number");
            //String deliveryAddress = request.getParameter("deliveryAddress");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String password = request.getParameter("password");

            Customer customer = new Customer();
            customer.setTitle(title);
            customer.setFirst_Name(firstname);
            customer.setSurname(surname);
            customer.setId_Number(id_Number);
            //customer.setDeliveryAddress_Id(1);
            customer.setEmail_Address(email);
            customer.setPhone(phone);
            customer.setPassword(password);

            regServ.addCustomer(customer);

            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);

        }
    }
}
