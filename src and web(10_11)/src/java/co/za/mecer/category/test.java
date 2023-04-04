/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.category;

import co.za.mecer.connection.DBConnection;
import co.za.mecer.service.CategoryService;
import co.za.mecer.service.CategoryServiceImplement;
import java.sql.Connection;

/**
 *
 * @author PULE
 */
public class test {

    public static void main(String[] args) {
        new test().run();

    }

    public void run() {
        CategoryService catserv = new CategoryServiceImplement();
        
        Category category = new Category("khekhe");
        catserv.add(category);
        
    }
    
    public static Connection getConnection(){
        return DBConnection.getInstance();
    }

}

