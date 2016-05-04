
package dbHelpers;

import Model.Products;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UpdateQuery {
        private Connection conn;
    
         public UpdateQuery(){

        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

}
         
         
         public void doUpdate(Products product){
         
            try {
                String query="UPDATE products SET productName = ?, productPrice = ?, productDescription= = ?, catagory = ?, catagoryID = ? WHERE productID = ?";
                
                PreparedStatement ps = conn.prepareStatement(query);
                
                ps.setString(1, product.getProductName());
                ps.setInt(2, product.getProductPrice());
                ps.setString(3, product.getProductDescription());
                ps.setString(4, product.getCatagory());
                ps.setInt(5, product.getCatagoryID());
                
                
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
         
         
         
         
         
         
}
