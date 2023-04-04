/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.Controller;

import co.za.mecer.client.Customer;
import co.za.mecer.dao.LoginDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PULE
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            Customer customer = new Customer();

            customer.setEmail_Address(username);
            customer.setPassword(password);

            LoginDAOImpl loginDAO = new LoginDAOImpl();

            String validate = loginDAO.ValidateLogIn(customer);
request.getSession().setAttribute("auth", customer);
            if (customer != null) {
                if (validate.equals("SUCCSSFULLY LOGGED IN")) {
                    
//                    HttpSession session = request.getSession();
//                    session.setAttribute("login", customer.getEmail_Address());
                    //out.println("<h1>" + session.getId() + "</h1>");
                    
                    RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                    dispatcher.forward(request, response);
                }else{
                
                out.println("<h1>LOGIN FAILED</h1>");
            }
            }


//             else{
//                 request.setAttribute("ErrorMsg", validate);
//                 RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
//                 dispatcher.include(request, response);
//             }
//        
//        
        }
    }
}
