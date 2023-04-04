/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.discount;


public interface DiscountService {
    public boolean add(Discount discount);
    public Discount getOneDiscount(int ItemDiscount_id);
    public boolean delete(int id);
}
