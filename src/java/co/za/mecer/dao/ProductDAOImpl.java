/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.dao;

import co.za.mecer.cart.Cart;
import co.za.mecer.connection.DBConnection;
import co.za.mecer.products.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PULE
 */
public class ProductDAOImpl implements ProductDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean add(Product product) {
        boolean returnValue = false;
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("INSERT INTO product("
                        + "name,"
                        + "price,"
                        + "allergens,"
                        + "description,"
                        + "image) VALUES (?,?,?,?,?)");

                ps.setString(1, product.getName());
                ps.setDouble(2, product.getPrice());
                ps.setString(3, product.getAllergens());
                ps.setString(4, product.getDescription());
                ps.setString(5, product.getImage());
                returnValue = ps.executeUpdate() > 0;
                ps = con.prepareStatement("SELECT LAST_INSERT_ID() as id");
                rs = ps.executeQuery();
                int last_Id = 0;
                if (rs.next()) {
                    last_Id = rs.getInt("id");
                }
                System.out.println("The last ID: " + last_Id);
            }
        } catch (SQLException e) {
            System.out.println("THERE IS AN ERROR " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("OOPS ERROR: " + ex.getMessage());
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println("OOPS ERROR: " + ex.getMessage());
                }
            }
            con = null;
        }
        return returnValue;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> allItems = new ArrayList<>();
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM product");
                rs = ps.executeQuery();
                while (rs.next()) {
                    Product product = new Product();
                    product.setName(rs.getString("name"));
                    product.setPrice(rs.getDouble("price"));
                    product.setAllergens(rs.getString("allergens"));
                    product.setDescription(rs.getString("description"));
                    product.setImage(rs.getString("image"));
                    product.setProductID(rs.getInt("id"));
                    allItems.add(product);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                }
            }
            con = null;
        }
        return allItems;
    }

    @Override
    public Product getOneItem(int productID) {
        Product product = new Product();
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM product WHERE id = ?");
                ps.setInt(1, productID);
                rs = ps.executeQuery();
                while (rs.next()) {
                    product.setName(rs.getString("name"));
                    product.setPrice(rs.getDouble("price"));
                    product.setAllergens(rs.getString("allergens"));
                    product.setDescription(rs.getString("description"));
                    product.setImage(rs.getString("image"));
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                }
            }
            con = null;
        }
        return product;
    }

    @Override
    public boolean delete(int productID) {
        boolean resultValue = false;
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("DELETE from product WHERE id=?");
                ps.setInt(1, productID);
                resultValue = ps.executeUpdate() > 0;
            }
        } catch (SQLException ex) {
            System.out.println("Error Recipe not deleted: " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error! Closing: " + ex.getMessage());
                }
            }
        }
        return resultValue;
    }
    

    @Override
    public List<Cart> getCartProducts(ArrayList<Cart> cartList) {
        List<Cart> products = new ArrayList<>();
        
        try{
            if(cartList.size() > 0){
                for(Cart item : cartList){
                    ps=con.prepareStatement("SELECT * FROM product where id=?");
                    ps.setInt(1, item.getProductID());
                    rs = ps.executeQuery();
                    
                    while(rs.next()){
                        Cart cart = new Cart();
                        cart.setProductID(rs.getInt("id"));
                        cart.setName(rs.getString("name"));
                        cart.setPrice(rs.getDouble("price") * item.getQuantityOfProducts());
                        cart.setAllergens(rs.getString("allergens"));
                        cart.setDescription(rs.getString("description"));
                        cart.setImage(rs.getString("image"));
                        cart.setQuantityOfProducts(rs.getInt("quantity"));
                   products.add(cart);
                    }
                }
            }
        }catch(Exception ex){
            System.out.println("Error! " + ex.getMessage());
        }
        
        return products;    }

}
