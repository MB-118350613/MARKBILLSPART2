<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="POJOs.User"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

    <head>

       

    </head>

    <body>


       
                        <c:url value="/userAdmin" var="insertUserUrl">
                                        <c:param name="action" value="insertUser"/>
                                    </c:url>

                        <form action="${insertUserUrl}" method="POST">
                           <body>
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

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











                 

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>

</html>
