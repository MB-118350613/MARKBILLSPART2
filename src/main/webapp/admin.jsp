<%@page import="utils.IConstants"%>
<%@page import="POJOs.User"%>

<%-- 
    Document   : admin
    Created on : 27 Nov 2020, 18:13:40
    Author     : samdo
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
      if (session.getAttribute(IConstants.SESSION_KEY_USER)==null)  
      {
      response.sendRedirect("mustlogin.html");
    }
    else {
     User user = (User)session.getAttribute("SKUSER"); 
                 if (user.getUserType()!= IConstants.USER_TYPE_ADMIN){
              response.sendRedirect("HomePage");} 

     }
       
        %>
        <h1>Hello ${IConstants.SESSION_KEY_USER.firstName}!</h1>
        <p><% User user = (User)session.getAttribute("SKUSER"); %>
                <% if (user!= null){
              out.println("Logged in: " + user.getFirstName()); }
                else { out.println("(Not Logged in)");} %></p>
        <p> Hello ${SKUSER.firstName}</p>
    </body>
</html>

