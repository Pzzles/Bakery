/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.item;

import co.za.discount.Discount;
import co.za.discount.DiscountService;
import co.za.discount.DiscountServiceImplement;
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
@WebServlet(name = "ItemServlet", urlPatterns = {"/ItemServlet"})
public class ItemServlet extends HttpServlet {

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

        HttpSession session = request.getSession();
        HashMap<Integer, Integer> cart = (HashMap<Integer, Integer>) session.getAttribute("cart");
        PrintWriter out = response.getWriter();
        int chosenItem = 0;
        DiscountService discountDB = new DiscountServiceImplement();

        ItemService /*itemService*/ prs = new ItemServiceImplement();

        int appliedDIscountID = Integer.parseInt(request.getParameter("discounts"));
        for (Integer itemId : cart.keySet()) {
            Item item = prs.getOneItem(itemId);
            chosenItem = item.getItem_Id();
        }

        double itemOriginalPrice, discountedPrice;

        double discount = 0.0;
        switch (appliedDIscountID) {

            case 8:
                discount = discountDB.getOneDiscount(appliedDIscountID).getDiscount();
                itemOriginalPrice = prs.getOneItem(chosenItem).getPrice();
                discountedPrice = itemOriginalPrice - (itemOriginalPrice * discount);
                out.print("<h1>Item Price: " + discountedPrice + "</h1>");
                break;
            case 9:
                discount = discountDB.getOneDiscount(appliedDIscountID).getDiscount();
                itemOriginalPrice = prs.getOneItem(chosenItem).getPrice();
                discountedPrice = itemOriginalPrice - (itemOriginalPrice * discount);
                out.print("<h1>Item Price: " + discountedPrice + "</h1>");
                break;
            default:
                discount = discountDB.getOneDiscount(12).getDiscount();
                discount = discountDB.getOneDiscount(appliedDIscountID).getDiscount();
                itemOriginalPrice = prs.getOneItem(chosenItem).getItem_Id();
                discountedPrice = itemOriginalPrice - (itemOriginalPrice * discount);
                out.print("<h1>Item Price: " + discountedPrice + "</h1>");
                break;
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
/*
            case 10:
                discount = discountDB.getOneDiscount(appliedDIscountID).getDiscount();
                itemOriginalPrice = prs.getOneItem(chosenItem).getItem_Id();
                discountedPrice = itemOriginalPrice - (itemOriginalPrice * discount);
                out.print("<h1>Item Price: " + discountedPrice + "</h1>");
                break;
            case 12:
                discount = discountDB.getOneDiscount(appliedDIscountID).getDiscount();
                itemOriginalPrice = prs.getOneItem(chosenItem).getItem_Id();
                discountedPrice = itemOriginalPrice - (itemOriginalPrice * discount);
                out.print("<h1>Item Price: " + discountedPrice + "</h1>");
                break;
            case 14:
                discount = discountDB.getOneDiscount(appliedDIscountID).getDiscount();
                itemOriginalPrice = prs.getOneItem(chosenItem).getItem_Id();
                discountedPrice = itemOriginalPrice - (itemOriginalPrice * discount);
                out.print("<h1>Item Price: " + discountedPrice + "</h1>");
                break;
             */