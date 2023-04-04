package co.za.mecer.item;

import co.za.discount.DiscountDAOImplement;
import co.za.discount.DiscountService;
import co.za.discount.DiscountServiceImplement;
import co.za.mecer.connection.DBConnection;
import co.za.mecer.recipe.Recipe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import co.za.discount.DiscountDAO;

public class ItemDAOImplement implements ItemDAO {

    public static void main(String[] args) {
//        new ItemDAOImplement().calculateDiscount();
          ItemService is =  new ItemServiceImplement();
//          Item item = new Item(3, 2, 2, "Brown Bread", 12.99, "none", "Soft and fresh");
          Item item = new Item("cookie", 12.4, "none", "sweet");
// Item item = new Item(1, 1, 1, " white Bread", 11.99, "none", "Soft and fresh");
//           Item item = new Item();
//           //item.setItem_Id(1);
//
//           item.setItem_Name("Bread");
//           item.setPrice(11.99);
//           item.setAllegens("gluten");
//           item.setDesription("Soft and fresh");
           
           ItemDAOImplement itemDaoImpl = new ItemDAOImplement();
            System.out.println(itemDaoImpl.add(item));
//            is.delete(3);
//          if(is.delete(3)){
//              System.out.println("Success");
//          }else{
//              System.out.println("Not successful");
//          }
    }
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public boolean add(Item item) {
        boolean returnValue = false;
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("INSERT INTO item(ItemDiscount_Id, Category_Id,"
                        + " Recipe_Id,"
                        + "Item_Name,"
                        + "Price,"
                        + "Allegens,"
                        + "Description) VALUES ((SELECT ItemDiscount_Id FROM item_discount WHERE ItemDiscount_Id=?), (SELECT Category_Id FROM category WHERE Category_Id=?),"
                        + "(SELECT Recipe_Id FROM recipe WHERE Recipe_Id=?),?,?,?,?)");
                ps.setInt(1, item.getItemDiscount_Id());
                ps.setInt(2, item.getCategory_Id());
                ps.setInt(3, item.getRecipe_Id());
                ps.setString(4, item.getItem_Name());
                ps.setDouble(5, item.getPrice());
                ps.setString(6, item.getAllegens());
                ps.setString(7, item.getDesription());
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

    public void calculateDiscount(int Item_Id, int Discount_Id) {
        con = DBConnection.getInstance();
        try{
            if(con != null){
                ps = con.prepareStatement("SELECT Price FROM item WHERE Item_Id = ? ");
               PreparedStatement ps1 = con.prepareStatement("SELECT Discount FROM item WHERE ItemDiscount_Id = ? ");
                ps.setInt(1, Item_Id);
//                ps1.setInt(1, ItemDiscount_Id);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex.getMessage());
        }
        DiscountService ds = new DiscountServiceImplement();
        ItemService is = new ItemServiceImplement();
        double discountPercentage = ds.getOneDiscount(3).getDiscount();
        double price = is.getOneItem(1).getPrice();
        double discountedPrice = discountPercentage * price;
        System.out.println(discountedPrice);
    }

//    @Override
//    public boolean update() {
//    }
    @Override
    public List<Item> read() {
        List<Item> allItems = new ArrayList<>();
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM item");
                rs = ps.executeQuery();
                while (rs.next()) {
                    Item item = new Item();
                    item.setItemDiscount_Id(rs.getInt("ItemDiscount_Id"));
                    item.setCategory_Id(rs.getInt("Category_Id"));
                    item.setRecipe_Id(rs.getInt("Recipe_Id"));
                    item.setItem_Name(rs.getString("Item_Name"));
                    item.setPrice(rs.getDouble("Price"));
                    item.setAllegens(rs.getString("Allegens"));
                    item.setDesription(rs.getString("Description"));
                    allItems.add(item);
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

//    @Override
//    public boolean delete(int Item_Id) {
//    }
    @Override
    public Item getOneItem(int Item_Id) {
        Item item = new Item();
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM item WHERE Item_Id = ?");
                ps.setInt(1, Item_Id);
                rs = ps.executeQuery();
                while (rs.next()) {
                    item.setItemDiscount_Id(rs.getInt("ItemDiscount_Id"));
                    item.setCategory_Id(rs.getInt("Category_Id"));
                    item.setRecipe_Id(rs.getInt("Recipe_Id"));
                    item.setItem_Name(rs.getString("Item_Name"));
                    item.setPrice(rs.getDouble("Price"));
                    item.setAllegens(rs.getString("Allegens"));
                    item.setDesription(rs.getString("Description"));
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

    public boolean delete(int Item_Id) {
        boolean resultValue = false;
        con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("DELETE from item WHERE Item_Id=?");
                ps.setInt(1, Item_Id);
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
