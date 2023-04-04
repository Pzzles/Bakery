/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.dao;

import co.za.mecer.cart.Cart;
import co.za.mecer.products.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PULE
 */
public interface ProductDAO {
        public boolean add(Product product);
//    public boolean update();
    public List<Product> getAllProducts();
    public Product getOneItem(int productID);
    public boolean delete(int productID);
    public List<Cart> getCartProducts(ArrayList<Cart> cartList);
    
}
