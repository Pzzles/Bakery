
package co.za.mecer.dao;

import co.za.mecer.category.Category;
import co.za.mecer.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CategoryDAOImplement implements CategoryDAO {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public static void main(String[] args) {
        new CategoryDAOImplement().run();
    }
    
    public void run(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter category = ");
        String cat = sc.next();
        
        Category category = new Category(cat);
        
        add(category);
    }
    
    
  

    @Override
    public List<Category> read() {
        List<Category> allcategories = new ArrayList<>();
        con = DBConnection.getInstance();
        try{
            if(con != null){
               ps = con.prepareStatement("SELECT * FROM category");
               rs = ps.executeQuery();
               while(rs.next()){
                   Category category = new Category();
                   category.setCategory_Id(rs.getInt("Category_Id"));
                   category.setCategory(rs.getString("Category"));
                   allcategories.add(category);
               }
        }
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
    }finally{
            if(ps != null){
                try{
                    ps.close();
                }catch(SQLException ex){
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                }
            }
            con = null;
        }
        return allcategories;
    }

    @Override
    public boolean delete(int Category_Id) {
         boolean result = false;
        con = DBConnection.getInstance();
        try {
            if (con!= null) {
                ps = con.prepareStatement("DELETE from category WHERE Category_Id=?");
                ps.setInt(1, Category_Id);
                result = ps.executeUpdate() > 0;
            }
        } catch (SQLException ex) {
            System.out.println("Error Category not deleted: " + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error! Closing: " + ex.getMessage());
                }
            }
        }
        return result;
    }

    @Override
    public void add(Category category) {
       try {
            con = DBConnection.getInstance();

            PreparedStatement pstmt;
            pstmt = con.prepareStatement("INSERT INTO category("
                    + "Category)"
         
                    + "VALUES(?)");

            pstmt.setString(1, category.getCategory());
          
            pstmt.executeUpdate();

    }catch(Exception ex){
            System.out.println("Error!" + ex.getMessage());
           
    }
    }
    
}
