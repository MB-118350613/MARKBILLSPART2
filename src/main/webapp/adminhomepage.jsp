<%@page import="utils.IConstants"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="POJOs.User"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Administrator Home Page</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/shop-homepage.css" rel="stylesheet">


    </head>

    <body>
 <!-- ensure people cant sneakily change url and say adminHome-->
    
        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">
                <a class="navbar-brand" href="#">Posters</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            
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

        <!-- Page Content -->
        <div class="container">

            <div class="row">

                <div class="col-lg-3">

                    <h1 class="my-4">Posters !!</h1>
                    <div class="list-group">
                        <a href="productAdmin?action=listProducts" class="list-group-item">Product Administration</a>
                        <a href="userAdmin?action=listUsers" class="list-group-item">User Administration</a>
                        <a href="paymentAdmin?action=listPayments" class="list-group-item">Payment Administration</a>

                    </div>

                </div>
                <!-- /.col-lg-3 -->

                <div class="col-lg-9">


                    <div class="row">

                        <h1 class="pt-4"> Administration Home </h3>    
                    </div>
                    <div class="row">

                        <br>    
                    </div>
                    <div class="row">

    
                    </div><!-- comment -->
                    <!-- /.row -->

                </div>
                <!-- /.col-lg-9 -->

            </div>
            <!-- /.row -->

        </div>
        <!-- /.container -->

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

