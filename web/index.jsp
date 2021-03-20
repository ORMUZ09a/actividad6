<%-- 
    Document   : index
    Created on : 19/03/2021, 05:49:42 PM
    Author     : jmmm9_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="myTags" uri="/WEB-INF/tlds/myTags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Hello World!</h1>
            <body>
            <myTags:nombre/>

<myTags:dia>
    <p>Formatted Date (1): <fmt:formatDate type = "time" 
         value = "${now}" /></p>
    
</myTags:dia>
    
</html>
