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

        <title>Mighty Posters</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/shop-homepage.css" rel="stylesheet">

    </head>

    <body>

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">
                <a class="navbar-brand" href="#">Product Administration</a>
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

            <div class="row">

                <div class="col-lg-12">

                    <h1 class="my-4">Product Administration</h1>



                    <div class="row">

                        <table class="table table-bordered">
                            <thead>
                                <tr>
                                    <th scope="col">Id</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Image Location</th>
                                    <th scope="col">Quantity</th>
                                    <th scope="col">Type</th>

                                                                        
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${products}" var="product">
                                    <c:url value="/productAdmin" var="editProductUrl">
                                        <c:param name="action" value="edit"/>
                                        <c:param name="id" value="${product.id}"/>
                                    </c:url>
                                    <c:url value="/productAdmin" var="deleteProductUrl">
                                        <c:param name="action" value="delete"/>
                                        <c:param name="id" value="${product.id}"/>
                                    </c:url>
                                <tr>
                                    <td scope="row">${product.id}</th>
                                    <td>${product.name}</td>
                                    <td>${product.description}</td>
                                    <td>${product.price}</td>
                                    <td>${product.imageLocation}</td>
                                    <td>${product.quantity}</td>
                                    <td>${product.type}</td>
                                    
                                    <td><a href="${editProductUrl}"> Edit</a> <a href="${deleteProductUrl}">Delete</a></td>
                                </tr>
                                </c:forEach>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <c:url value="/productAdmin" var="addProductUrl">
                                        <c:param name="action" value="add"/>
                                    </c:url>
                                    <td><a href="${addProductUrl}" > Add </a></td>
                                    
                                </tr>
                            </tbody>
                        </table>      











                    </div>
                    <!-- /.row -->

                </div>
                <!-- /.col-lg-9 -->

            </div>
            <!-- /.row -->

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
