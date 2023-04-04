package co.za.discount;

import co.za.mecer.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DiscountDAOImplement implements DiscountDAO {

    public static void main(String[] args) {
       // DiscountService me = new DiscountDAOImplement();
        DiscountService ds = new DiscountServiceImplement();
        Discount dis = new Discount(0.75);
        ds.add(dis);
        System.out.println(dis.getDiscount());
      ;
    }

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

      public DiscountDAOImplement() {
          this.con = DBConnection.getInstance();
    }
    
    @Override
    public boolean add(Discount discount) {
        boolean returnValue = false;
        try {
            if (con != null) {
                ps = con.prepareStatement("INSERT INTO Item_Discount(ItemDiscount_Id, Discount) VALUES(NULL, ?)");
                ps.setDouble(1, discount.getDiscount());
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
          //  con = null;
        }
        return returnValue;
    }
    @Override
    public Discount getOneDiscount(int ItemDiscount_id) {
        Discount item = new Discount();
    //    con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("SELECT * FROM Item_Discount WHERE ItemDiscount_Id = ?");
                ps.setInt(1, ItemDiscount_id);
                rs = ps.executeQuery();
                while (rs.next()) {
                    item.setItemDiscount_id(rs.getInt("ItemDiscount_id"));
                    item.setDiscount(rs.getDouble("Discount"));
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
      //      con = null;
        }
        return item;
    }

    @Override
    public boolean delete(int ItemDiscount_Id) {
        boolean result = false;
    //    con = DBConnection.getInstance();
        try {
            if (con != null) {
                ps = con.prepareStatement("DELETE from item_discount WHERE ItemDiscount_Id = ?");
                ps.setDouble(1, ItemDiscount_Id);
                result = ps.executeUpdate() > 0;
            }
        } catch (SQLException ex) {

        }finally {
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

