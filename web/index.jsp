<%-- 
    Document   : index
    Created on : Feb 13, 2018, 6:07:40 PM
    Author     : Admin_8_1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HelloWorld h = new HelloWorld();
            String word =(String) request.getAttribute("word");
            String data = h.getData();
        %>
        <h1><%= data%></h1>
        <h1><%= word%></h1>
        
        <!--<h1></h1>-->
       <!--test-->
    </body>
</html>
