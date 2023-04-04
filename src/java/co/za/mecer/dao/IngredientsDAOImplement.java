package co.za.mecer.dao;

import co.za.mecer.category.Category;
import java.util.List;
import co.za.mecer.connection.DBConnection;
import co.za.mecer.ingredients.Ingredients;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class IngredientsDAOImplement implements IngredientsDAO {
    public static void main(String[] args) {
        new IngredientsDAOImplement().run();
    }
    
    public void run(){
        Scanner sc = new Scanner(System.in);

        
        Ingredients ingredient = new Ingredients();
        
        //addIngredients(ingredient);
         List<Ingredients> ingList =  readIngredients();
         
        for(Ingredients ingred : ingList){
            System.out.println(ingred.getIngredient_Name());
        }
    }
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean addIngredients(Ingredients ingredient) {
        boolean returnValue = false;
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("INSERT INTO ingredients(Ingredient_Id, Ingredient_Name) VALUES(NULL, ?)");
                ps.setString(1, ingredient.getIngredient_Name());
                returnValue = ps.executeUpdate() > 0;
                ps = con.prepareStatement("SELECT LAST_INSERT_ID() as id");
                rs = ps.executeQuery();
                int last_Id = 0;
                if (rs.next()) {
                    last_Id = rs.getInt("id");
                }
                System.out.println("The last ID: " + last_Id);
            }
        } catch (SQLException ex) {
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
    public List<Ingredients> readIngredients() {
         List<Ingredients> allIngredients = new ArrayList<>();
        con = DBConnection.getInstance();
        try{
            if(con != null){
               ps = con.prepareStatement("SELECT * FROM ingredients");
               rs = ps.executeQuery();
               while(rs.next()){
                   Ingredients ingredients = new Ingredients();
                   ingredients.setIngredient_Id(rs.getInt("Ingredient_Id"));
                   ingredients.setIngredient_Name(rs.getString("Ingredient_Name"));
                   allIngredients.add(ingredients);
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
        return allIngredients;
    }

    @Override
    public boolean delete(int Ingredient_Id) {
         boolean result = false;
        con = DBConnection.getInstance();
        try {
            if (con!= null) {
                ps = con.prepareStatement("DELETE from ingredients WHERE ingredient_Id=?");
                ps.setInt(1, Ingredient_Id);
                result = ps.executeUpdate() > 0;
            }
        } catch (SQLException ex) {
            System.out.println("Error ingredients not deleted: " + ex.getMessage());
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
}
