package co.za.mecer.recipe;

import co.za.discount.Discount;
import co.za.mecer.category.Category;
import co.za.mecer.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TRAIN 02
 */
public class RecipeDAOImplement implements RecipeDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean add(Recipe recipe) {
        boolean returnValue = false;
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("INSERT INTO recipe(Recipe_Id, Ingredient_Id, Measurements) VALUES(NULL, (SELECT Ingredient_Id FROM ingredients where Ingredient_Id = ?), ?)");
                ps.setInt(1, recipe.getIngredient_Id());
                ps.setString(2, recipe.getMeasurements());
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
            System.out.println("THERE IS AN ERROR");
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
    public boolean update(int Recipe_Id, String Measurements) {
        boolean returnValue = false;
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("UPDATE client SET Measurements=? WHERE Recipe_Id=?");
                ps.setString(1, Measurements);
                ps.setInt(2, Recipe_Id);
                returnValue = ps.executeUpdate() > 0;
            }
        } catch (SQLException ex) {
            System.out.println("Error! Measurements not updated" + ex.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("Error! Closing: " + ex.getMessage());
                }
            }
        }
        return returnValue;
    }

    @Override
    public List<Recipe> read() {
        List<Recipe> allRecipe = new ArrayList<>();
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM recipe");
                rs = ps.executeQuery();
                while (rs.next()) {
                    Recipe recipe = new Recipe();
                    recipe.setRecipe_Id(rs.getInt("Recipe_Id"));
                    recipe.setIngredient_Id(rs.getInt("Ingredient_Id"));
                    recipe.setMeasurements(rs.getString("Measurements"));
                    allRecipe.add(recipe);
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
        return allRecipe;
    }
       public Recipe getOneDiscount(int Recipe_id) {
        Recipe item = new Recipe();
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM recipe WHERE Recipe_id = ?");
                ps.setInt(1, Recipe_id);
                rs = ps.executeQuery();
                while (rs.next()) {
                    item.setRecipe_Id(rs.getInt("Recipe_Id"));
                    item.setIngredient_Id(rs.getInt("Ingredient_Id"));
                    item.setMeasurements(rs.getString("Measurements"));
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
        return item;
    }

    @Override
    public boolean delete(int Recipe_Id) {
        boolean resultValue = false;
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("DELETE from recipe WHERE Recipe_Id=?");
                ps.setInt(1, Recipe_Id);
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

}
