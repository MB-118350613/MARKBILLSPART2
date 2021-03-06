<%@page import="POJOs.User"%>
<%-- 
    Document   : Shop_11
    Created on : 1 Dec 2020, 18:58:58
    Author     : samdo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Free Snow Bootstrap Website Template | Shop :: w3layouts</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script src="js/jquery.min.js"></script>
<script type="text/javascript">
        $(document).ready(function() {
            $(".dropdown img.flag").addClass("flagvisibility");

            $(".dropdown dt a").click(function() {
                $(".dropdown dd ul").toggle();
            });
                        
            $(".dropdown dd ul li a").click(function() {
                var text = $(this).html();
                $(".dropdown dt a span").html(text);
                $(".dropdown dd ul").hide();
                $("#result").html("Selected value is: " + getSelectedValue("sample"));
            });
                        
            function getSelectedValue(id) {
                return $("#" + id).find("dt a span.value").html();
            }

            $(document).bind('click', function(e) {
                var $clicked = $(e.target);
                if (! $clicked.parents().hasClass("dropdown"))
                    $(".dropdown dd ul").hide();
            });


            $("#flagSwitcher").click(function() {
                $(".dropdown img.flag").toggleClass("flagvisibility");
            });
        });
     </script>
</head>
<body>

	<div class="header">
		<div class="container">
			<div class="row">
			  <div class="col-md-12">
				 <div class="header-left">
					 <div class="logo">
						<a href="index.html"><img src="images/logo.png" alt=""/></a>
					 </div>
					 <div class="menu">
						  <a class="toggleMenu" href="#"><img src="images/nav.png" alt="" /></a>
						    <ul class="nav" id="nav">
                                                        <li><a href="login.jsp"><% User user = (User)session.getAttribute("SKUSER"); %>
                <% if (user!= null){
              out.println("Hi " + user.getFirstName()); }
                else { out.println("Login");} %></</a></li>
						    	<!--<li class="current"><a href="Homepage">Shop</a></li>-->
                                                        <li class="current"><a href="HomePage">Shop</a></li>
						    	<li><a href="team.jsp">Team</a></li>
						    		
                                                        	
								<li><a href="contact.jsp">Contact</a></li>								
								
                                                                <li><a href="LogoutServlet">
                <% if (user!= null){
              out.println("Logout"); }
                else { out.println("");} %></a></li>
                                                                <div class="clear"></div>
							</ul>
							<script type="text/javascript" src="js/responsive-nav.js"></script>
				    </div>							
	    		    <div class="clear"></div>
	    	    </div>
	            <div class="header_right">
	    		  <!-- start search-->
				  <div class="search-box">
							<div id="sb-search" class="sb-search">
								<form action="Search" method="post">
									<input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
									<input class="sb-search-submit" type="submit" value="">
									<span class="sb-icon-search"> </span>
								</form>
							</div>
						</div>
						<!----search-scripts---->
						<script src="js/classie.js"></script>
						<script src="js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
				    
		        <div class="clear"></div>
	       </div>
	      </div>
		 </div>
	    </div>
	  </div>
   
     
     <div class="main">
         <div class="row">

                <div class="col-lg-3">

                    <h1 class="my-4">Filters</h1>
                    <div class="list-group">
                         <c:url value="/category" var="infraredCategoryURL">
                                        <c:param name="action" value="INFRARED"/>                
                            </c:url>
                          <c:url value="/category" var="voiceCategoryURL">
                                        <c:param name="action" value="VOICE"/>                
                            </c:url>
                          <c:url value="/category" var="radioCategoryURL">
                                        <c:param name="action" value="RADIO"/>                
                            </c:url>
                        <a href="${infraredCategoryURL}" class="list-group-item">Infrared</a>
                        <a href="${voiceCategoryURL}" class="list-group-item" >Voice</a>
                        <a href="${radioCategoryURL}" class="list-group-item" >Radio</a>
                    </div>


                </div>
                
      <div class="shop_top">
		<div class="container">
                    
			<div class="row shop_box-top">
                            <c:forEach items="${productsList}" var="topProduct">
                            <div class="col-md-3 shop_box">
					  <form action="SingleServlet" method="post">
                                             
                                                  
                                        <input type="hidden" name="id" value=${topProduct.id}>
					<img src="images/${topProduct.imageLocation}" class="img-responsive" alt=""/>
					<span class="new-box">
						<span class="new-label">New</span>
					</span>
					<!--<span class="sale-box">
						<span class="sale-label">Sale!</span>
					</span>-->
					<div class="shop_desc">
						<h3><a href="#">${topProduct.name} </a></h3>
						<p>${topProduct.description}    </p>
						<!--<span class="reducedfrom">€32</span>-->
						<span class="actual">€ ${topProduct.price} </span><br>
						<ul class="buttons">
                                                                                                         

                                                        <input type="submit" value="Buy Now">
                                                       
                                                        
							<!--<li class="shop_btn"><a href="./single.html">Read More</a></li>-->
							<div class="clear"> </div>
					    </ul></form>
				    </div>
				</div>
                               </c:forEach> 
                                  
         
			</div>
		 </div>
	   </div>
	  </div>
	<div class="footer">
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<ul class="footer_box">
							<h4>Products</h4>
							<li><a href="HomePage">Infrared Remotes</a></li>
							<li><a href="HomePage">Voice Control Remotes</a></li>
							<li><a href="HomePage">Radio Frequency Remotes</a></li>
						</ul>
					</div>
					<div class="col-md-3">
						<ul class="footer_box">
							<h4>About</h4>
							
							<li><a href="team.jsp">Our Team</a></li>
							<li><a href="team.jsp">Our Values</a></li>
                                                        <li><a href="team.jsp">Our Mission</a></li>
						</ul>
					</div>
					<div class="col-md-3">
						<ul class="footer_box">
							<h4>Customer Support</h4>
							<li><a href="contact.jsp">Contact Us</a></li>
							<li><a href="contact.jsp">Shipping and Order Tracking</a></li>
							<li><a href="contact.jsp">Easy Returns</a></li>
							<li><a href="contact.jsp">Warranty</a></li>
							<li><a href="contact.jsp">Replacement Binding Parts</a></li>
						</ul>
					</div>
					<div class="col-md-3">
						<ul class="footer_box">
							
							<ul class="social">	
							  <li class="facebook"><a href="#"><span> </span></a></li>
							  <li class="twitter"><a href="#"><span> </span></a></li>
							  <li class="instagram"><a href="#"><span> </span></a></li>	
							  <li class="pinterest"><a href="#"><span> </span></a></li>	
							  <li class="youtube"><a href="#"><span> </span></a></li>										  				
						    </ul>
		   					
						</ul>
					</div>
				</div>
				<div class="row footer_bottom">
				    <div class="copy">
			           <p>© 2014 Template by <a href="http://w3layouts.com" target="_blank">w3layouts</a></p>
		            </div>
					<!--  <dl id="sample" class="dropdown">
				        <dt><a href="#"><span>Change Region</span></a></dt>
				        <dd>
				            <ul>
				                <li><a href="#">Australia<img class="flag" src="images/as.png" alt="" /><span class="value">AS</span></a></li>
				                <li><a href="#">Sri Lanka<img class="flag" src="images/srl.png" alt="" /><span class="value">SL</span></a></li>
				                <li><a href="#">Newziland<img class="flag" src="images/nz.png" alt="" /><span class="value">NZ</span></a></li>
				                <li><a href="#">Pakistan<img class="flag" src="images/pk.png" alt="" /><span class="value">Pk</span></a></li>
				                <li><a href="#">United Kingdom<img class="flag" src="images/uk.png" alt="" /><span class="value">UK</span></a></li>
				                <li><a href="#">United States<img class="flag" src="images/us.png" alt="" /><span class="value">US</span></a></li>
				            </ul>
				         </dd>
	   				  </dl>
   				</div>-->
			</div>
		</div>
</body>	
</html>