
<%@page import="Model.Products"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Products product =(Products) request.getAttribute("product"); %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update a Product</title>
    </head>
    <body>
        <h1>Update a Product</h1>
        <form name="updateForm" action="updateProduct" method="get">
   
                <label>Product Name:</label>
                <input type="text" name="productName" value="<%= product.getProductID() %>" />
                <br>
                
                
                <label>Product Price:</label>
                <input type="text" name="productPrice" value="<%= product.getProductPrice() %>" />
                <br>
            
             
                <label>Product Description:</label>
                <input type="text" name="productDescription" value="<%= product.getProductDescription() %>" />
                <br>
                 
               
                <label>Catagory:</label>
                <input type="text" name="catagory" value="<%= product.getCatagory() %>" />
                
                
                <br>
                <label>Catagory ID:</label>
                <input type="text" name="catagoryID" value="<%= product.getCatagoryID() %>" /> 
                <br>
                <input type="reset" name="reset" value="Clear" />
                <input type="submit" name="submit" value="Update" />
                
                </form>
                
    </body>
</html>
