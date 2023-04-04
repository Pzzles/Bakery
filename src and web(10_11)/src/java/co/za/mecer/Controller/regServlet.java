/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.Controller;

import co.za.mecer.client.Customer;
import co.za.mecer.client.test;
import co.za.mecer.connection.DBConnection;
import co.za.mecer.service.RegisterImpl;
import co.za.mecer.service.RegisterService;
import java.io.IOException;
import java.sql.Connection;
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
@WebServlet(name = "regServlet", urlPatterns = {"/regServlet"})
public class regServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       // response.sendRedirect("login.jsp");
       String[]args;
       Connection con = test.getConnection();
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
            Customer customer = new Customer(title, firstname, surname, 
             id_Number, phone, email, password);
           

            
            regServ.addCustomer(customer);
                RequestDispatcher view = request.getRequestDispatcher("login.jsp");
                view.forward(request, response);
                   
            }
        }
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
