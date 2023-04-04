/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.cart;

import co.za.mecer.products.Product;

/**
 *
 * @author PULE
 */

public class Cart extends Product{
    private int quantityOfProducts;

    public Cart() {
    }

//    public Cart(int quantity) {
//        this.quantityOfProducts = quantity;
//    }

    public int getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public void setQuantityOfProducts(int quantityOfProducts) {
        this.quantityOfProducts = quantityOfProducts;
    }

    @Override
    public String toString() {
        return "Cart{" + "quantity=" + quantityOfProducts + '}';
    }
    
    
}
