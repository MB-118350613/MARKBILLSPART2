<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="POJOs.User"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

    <head>

      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"> 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">


    </head>

    <body>


       
                        <c:url value="/productAdmin" var="updateProductUrl">
                                        <c:param name="action" value="updateCompleteProduct"/>
                                    </c:url>

                         <form action="${updateProductUrl}" method="POST">
                            <input id="id" name="id" type="hidden" value="${oldProduct.id}">
                          

  <div class="form-group row">
    <label for="name" class="col-4 col-form-label">Name</label> 
    <div class="col-8">
      <input id="name" name="name" placeholder="Enter name" type="text" value="${oldProduct.name}" class="form-control" required="required">
    </div>
  </div>
  <div class="form-group row">
    <label for="description" class="col-4 col-form-label">Description</label> 
    <div class="col-8">
      <input id="description" name="description" placeholder="Enter decription" type="text" value="${oldProduct.description}" class="form-control" required="required">
    </div>
  </div>
  <div class="form-group row">
    <label for="price" class="col-4 col-form-label">Price</label> 
    <div class="col-8">
      <input id="price" name="price" type="text" value="${oldProduct.price}" class="form-control" required="required">
    </div>
  </div>
  <div class="form-group row">
    <label for="imageLocation" class="col-4 col-form-label">Image Location</label> 
    <div class="col-8">
      <input id="imageLocation" name="imageLocation" type="text" value="${oldProduct.imageLocation}" class="form-control" required="required">
    </div>
  </div>
    <div class="form-group row">
    <label for="quantity" class="col-4 col-form-label">Quantity</label> 
    <div class="col-8">
      <input id="quantity" name="quantity" type="text" value="${oldProduct.quantity}" class="form-control" required="required">
    </div>
  </div>
  <div class="form-group row">
    <label for="type" class="col-4 col-form-label">Type</label> 
    <div class="col-8">
      <input id="type" name="type" type="text" value="${oldProduct.type}" class="form-control" required="required">
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
