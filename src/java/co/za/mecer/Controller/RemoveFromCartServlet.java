/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.Controller;

import co.za.mecer.item.Item;
import co.za.mecer.item.ItemService;
import co.za.mecer.item.ItemServiceImplement;
import co.za.mecer.order.OrderLineItem;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
@WebServlet(name = "RemoveFromCartServlet", urlPatterns = {"/RemoveFromCartServlet"})
public class RemoveFromCartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        HashMap<Integer, Integer> cart = (HashMap<Integer, Integer>) session.getAttribute("cart");
        Integer newTot = (Integer)session.getAttribute("quantityCount");
        try (PrintWriter out = response.getWriter()) {

            List<OrderLineItem> order = new ArrayList<OrderLineItem>(); //"orderitems"
            ItemService itemService = new ItemServiceImplement();
            for (Integer itemId : cart.keySet()) {
                Item item = itemService.getOneItem(itemId);
                if (item != null) {
                    OrderLineItem orderLineItem = new OrderLineItem(cart.get(itemId), item);
                    order.remove(orderLineItem);
                    cart.remove(cart.get(itemId));
                    newTot = (Integer) (session.getAttribute("quantityCount"))-1 ;
                    out.print("<h1> Item with ID " + itemId + " has been removed</h1>");
                }
            }

            response.sendRedirect("cart.jsp");

        }

//        Item i = new Item();
//        List<OrderLineItem> cart = new ArrayList<OrderLineItem>();
//        List<OrderLineItem> cartList = (ArrayList<OrderLineItem>) session.getAttribute("myCart");
//        int id = Integer.parseInt(request.getParameter("id"));
//        cart = cartList;
//        int count = 0;
//        try (PrintWriter out = response.getWriter()) {
//        for (OrderLineItem olit : cart) {
//            if (olit.getItem().getItem_Id() == id) {
//                cart = (List<OrderLineItem>) cart.remove(id);
//            }
//            count++;
//            if(count == cart.size()){
//            //out.print(id);
//            response.sendRedirect("CartServlet.jsp");
//            }
//        }
//
//    }
    }


}
