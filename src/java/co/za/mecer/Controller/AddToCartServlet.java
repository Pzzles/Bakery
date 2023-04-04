/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
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
@WebServlet(name = "AddToCartServlet", urlPatterns = {"/AddToCartServlet"})
public class AddToCartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            //  ArrayList<Cart> cartList = new ArrayList<>();
            HttpSession session = request.getSession();
            HashMap<Integer, Integer> cart = (HashMap<Integer, Integer>) session.getAttribute("cart");
            if (cart == null) {
                cart = new HashMap<>();
                session.setAttribute("cart", cart);
            }
            int id = Integer.parseInt(request.getParameter("item_Id"));      
            if (cart.containsKey(id)) {
                int count = cart.get(id) + 1;
                cart.put(id, count);
            } else {
                cart.put(id, 1);
            }
            int count = 0;
            for (Integer itemId : cart.keySet()) {
                count += cart.get(itemId);
            }

            if (cart.containsKey(id)) {
                session.setAttribute("quantityCount", count);
            }
            response.sendRedirect("ItemPage.jsp");


        }
    }

}
