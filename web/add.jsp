<%@page import="Model.Products"%>
<%@page import="Model.Products"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Products product = (Products) request.getAttribute("product"); %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" type="text/css" href="customerStyle.css">
        <title>Add Product</title>
    </head>
    <body>
        <h1>Add A New Product</h1>
        
           <form name="addForm" action="addProduct" method="get">
   
                <label>Product Name:</label>
                <input type="text" name="productName" value="" />
                <br>
                
                
                <label>Product Price:</label>
                <input type="text" name="productPrice" value="" />
                <br>
            
             
                <label>Product Description:</label>
                <input type="text" name="productDescription" value="" />
                <br>
                 
               
                <label>Catagory:</label>
                <input type="text" name="catagory" value="" />
                
                
                <br>
                <label>Catagory ID:</label>
                <input type="text" name="catagoryID" value="" /> 
                <br>
                <input type="submit" name="submit" value="Submit" />
                
                </form>
                
                
                    
               
    </body>
</html>
