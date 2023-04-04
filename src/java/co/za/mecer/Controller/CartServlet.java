//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package co.za.mecer.item;
//
//import co.za.discount.DiscountService;
//import co.za.discount.DiscountServiceImplement;
//import co.za.mecer.order.OrderLineItem;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import javax.servlet.RequestDispatcher;
//
///**
// *
// * @author PULE
// */
//@WebServlet(name = "CartServlet", urlPatterns = {"/CartServlet"})
//public class CartServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter out = response.getWriter();
//        HttpSession session = request.getSession();
//        DiscountService discountDB = new DiscountServiceImplement();
//        HashMap<Integer, Integer> cart = (HashMap<Integer, Integer>) session.getAttribute("cart");
//        if (cart == null) {
//            out.print("You have not added anything to your cart");
//            return; // goto screen with message
//        }
//
//        List<OrderLineItem> order = new ArrayList<>(); //"orderitems"
//        ItemService itemService = new ItemServiceImplement();
//        cart.keySet().forEach(itemId -> {
//            Item item = itemService.getOneItem(itemId);
//            if (item != null) {
//                OrderLineItem orderLineItem = new OrderLineItem(cart.get(itemId), item);
//                
//                
//                order.add(orderLineItem);
//            }
//        });
//
//        request.setAttribute("orderitems", order);
//
//        RequestDispatcher dispatch = request.getRequestDispatcher("cart.jsp");
//        dispatch.forward(request, response);
////         session.setAttribute("orderitems", order);
////         response.sendRedirect("cart.jsp");
//    }
//}

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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author PULE
 */
@WebServlet(name = "CartServlet", urlPatterns = {"/CartServlet"})
public class CartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();

        HashMap<Integer, Integer> cart = (HashMap<Integer, Integer>) session.getAttribute("cart");
        if (cart == null) {
            out.print("You have not added anything to your cart");
            return; // goto screen with message
        }

        List<OrderLineItem> order = new ArrayList<OrderLineItem>(); //"orderitems"
        ItemService itemService = new ItemServiceImplement();
        for (Integer itemId : cart.keySet()) {
            Item item = itemService.getOneItem(itemId);
            if (item != null) {
                OrderLineItem orderLineItem = new OrderLineItem(cart.get(itemId), item);
                order.add(orderLineItem);

            }
        }
        request.setAttribute("orderitems", order);

               double price = 0.0, discountedPrice = 0.0,  totPrice = 0.0;

        double discount = (double) session.getAttribute("discount");
        boolean discountApplied = false;

        if (discount > 0) {
            discountApplied = true;
            if (discountApplied == true) {
                for (OrderLineItem item : order) {
                    price = item.getItem().getPrice();
                    discountedPrice = price - (price * discount);
                    totPrice += discountedPrice;

                }
            }
        }
        session.setAttribute("TotalPrice", totPrice);
        out.print("The tot = " + totPrice);

        RequestDispatcher dispatch = request.getRequestDispatcher("cart.jsp");
        dispatch.forward(request, response);
//         session.setAttribute("orderitems", order);
//         response.sendRedirect("cart.jsp");
    }


}
