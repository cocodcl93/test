<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" type="text/css" href="customerStyle.css">
        <title>Meat</title>
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1>Meat</h1>
        <%= table %>
        
    </body>
</html>
