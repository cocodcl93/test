
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" type="text/css" href="customerStyle.css">
        <title>Dairy</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1>All Products</h1>
        
        <%= table %>
        
        <a href ="add">Add A New Product</a>
        
    </body>
</html>

