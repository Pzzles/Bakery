
package co.za.mecer.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    private static Connection con = null;

    private DBConnection() {
    }

    public static Connection getInstance() {
        if (con == null) {
            
            try {
                Class.forName("org.gjt.mm.mysql.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakerydb?useSSL=false", "Pule", "P.zzle$0");
            } catch (SQLException se) {
                System.out.println("driver not found" + se.getMessage());
                return null;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Connection archieved");
        return con;
    }
}

