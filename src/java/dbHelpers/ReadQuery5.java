
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Products;


public class ReadQuery5 {
    
    private Connection conn;
    private ResultSet results;

    public ReadQuery5() {

        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery5.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery5.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public void doRead() {

        try {
            String query = "Select * from products ORDER BY productID ASC";

            PreparedStatement ps = conn.prepareStatement(query);

            this.results = ps.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery5.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
  
     
      public String getHTMLtable() {

        String table = "";

        table += "<table>";
   
                table += "<tr>";

                table += "<th>";
                table += "Product ID";
                table += "</th>";

                table += "<th>";
                table += "Product Name";
                table += "</th>";

                table += "<th>";
                table += "Product Price";
                table += "</th>";

                table += "<th>";
                table += "Product Description";
                table += "</th>";

                
                table += "<th>";
                table += "Category";
                table += "</th>";
                
                table += "<th>";
                table += "CategoryID";
                table += "</th>";
                
                
                table += "</tr>";
        
        
        try {
            while (this.results.next()) {

                Products product = new Products();
                product.setProductID(this.results.getInt("productID"));
                product.setProductName(this.results.getString("productName"));
                product.setProductPrice(this.results.getInt("productPrice"));
                product.setProductDescription(this.results.getString("productDescription"));
                product.setCatagory(this.results.getString("catagory"));
                product.setCatagoryID(this.results.getInt("catagoryID"));


                table +="<tr>";
                
                table +="<td>";
                table += product.getProductID();                        
                table +="</td>";
                
                table += "<td>";
                table += product.getProductName();
                table += "</td>";

                table += "<td>";
                table += product.getProductPrice();
                table += "</td>";

                table += "<td>";
                table += product.getProductDescription();
                table += "</td>";

                
                table += "<td>";
                table += product.getCatagory();
                table += "</td>";
                
                table += "<td>";
                table += product.getCatagoryID();
                table += "</td>";
                
                table += "<th>";
                table += "<a href=update?productID=" + product.getProductID() + "> Update </a>" + "<a href=delete?productID=" + product.getProductID() + "> Delete </a>";
                table += "</th>";
                


                
                table +="</tr>";

            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery5.class.getName()).log(Level.SEVERE, null, ex);
        }

        table += "</table>";

        return table;

    }
    
}
