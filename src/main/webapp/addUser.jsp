<%@page import="POJOs.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="POJOs.Product"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title></title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/shop-homepage.css" rel="stylesheet">

    </head>

    <body>

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">
                <a class="navbar-brand" href="#">User Administration</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <c:if test="${empty SKUSER.firstName}">
                                <a class="nav-link" href="./login.jsp">Login
                                    <span class="sr-only">(current)</span>
                                </a>
                            </c:if>
                            <c:if test="${not empty SKUSER.firstName}">
                                <a class="nav-link" href="./login.jsp">Hi ${SKUSER.firstName}
                                    <span class="sr-only">(current)</span>
                                </a>
                            </c:if>
                        </li>
                         <li class="nav-item">
                            <a class="nav-link" href="#">Home</a>
                        </li>
                      
                         <li class="nav-item"><a class="nav-link" href="LogoutServlet">
                                 <% User user = (User)session.getAttribute("SKUSER"); %>
                <% if (user!= null){
              out.println("Logout"); }
                else { out.println("");} %></a></li>
                    </ul>
                </div>
            </div>
        </nav>
<div class="col-lg-12">
            <br/>
        </div>
        <!-- Page Content -->
        <div class="container bg-light">

           


       
                        <c:url value="/userAdmin" var="insertUserUrl">
                                        <c:param name="action" value="insertUser"/>
                                    </c:url>

                        <form action="${insertUserUrl}" method="POST">
                           <body>
    
<form>
  <div class="form-group row">
    <label for="email" class="col-4 col-form-label">Email</label> 
    <div class="col-8">
      <input id="email" name="email" placeholder="Enter email" type="text" class="form-control" required="required">
    </div>
  </div>
  <div class="form-group row">
    <label for="password" class="col-4 col-form-label">Password</label> 
    <div class="col-8">
      <input id="password" name="password" placeholder="Enter password" type="text" class="form-control" required="required">
    </div>
  </div>
  <div class="form-group row">
    <label for="firstName" class="col-4 col-form-label">First Name</label> 
    <div class="col-8">
      <input id="firstName" name="firstName" type="text" class="form-control" required="required">
    </div>
  </div>
  <div class="form-group row">
    <label for="lastName" class="col-4 col-form-label">Last Name</label> 
    <div class="col-8">
      <input id="lastName" name="lastName" type="text" class="form-control" required="required">
    </div>
  </div>
  <div class="form-group row">
                                <label class="col-4">User Type</label> 
                                <div class="col-8">
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input name="userType" id="userType_0" type="radio" class="custom-control-input" value="ADMIN"> 
                                        <label for="userType_0" class="custom-control-label">Administrator</label>
                                    </div>
                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input name="userType" id="userType_1" type="radio" class="custom-control-input" value="GENUSER"> 
                                        <label for="userType_1" class="custom-control-label">Customer</label>
                                    </div>
                                </div>
                            </div> 
  <div class="form-group row">
    <div class="offset-4 col-8">
      <button name="submit" type="submit" class="btn btn-primary">Submit</button>
    </div>
  </div>
</form>











                 

   

        </div>
        <!-- /.container -->
        <div class="col-lg-12">
            <br/>
        </div>
        <!-- Footer -->
        <footer class="py-5 bg-dark">
            <div class="container">
                <p class="m-0 text-center text-white">Copyright &copy; Your Website 2020</p>
            </div>
            <!-- /.container -->
        </footer>

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>

</html>
