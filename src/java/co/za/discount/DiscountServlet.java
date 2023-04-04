/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.discount;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "DiscountServlet", urlPatterns = {"/DiscountServlet"})
public class DiscountServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        DiscountService discountService = new DiscountServiceImplement();
        int discount_Id = Integer.parseInt(request.getParameter("discounts"));
        double discountPerc = 0.0;
        Discount discount = discountService.getOneDiscount(discount_Id);

        session.setAttribute("discount", discount);

        switch (discount_Id) {
            case 12:
                discountPerc = discountService.getOneDiscount(discount_Id).getDiscount();
                session.setAttribute("discount", discountPerc);
                break;
            case 14:
                discountPerc = discountService.getOneDiscount(discount_Id).getDiscount();
                session.setAttribute("discount", discountPerc);
                break;
            case 10:
                discountPerc = discountService.getOneDiscount(discount_Id).getDiscount();
                session.setAttribute("discount", discountPerc);
                break;
            case 8:
                discountPerc = discountService.getOneDiscount(discount_Id).getDiscount();
                session.setAttribute("discount", discountPerc);
                break;
            case 9:
                discountPerc = discountService.getOneDiscount(discount_Id).getDiscount();
                session.setAttribute("discount", discountPerc);
                break;

            default:
                discountPerc = discountService.getOneDiscount(10).getDiscount();
                session.setAttribute("discount", discountPerc);
                break;
        }
    }

}
