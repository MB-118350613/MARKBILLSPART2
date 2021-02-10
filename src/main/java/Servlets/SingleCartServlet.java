package Servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import DAO.ProductDAO;
import POJOs.LineItem;
import POJOs.Cart;
import POJOs.Product;
import service.ProductService;

public class SingleCartServlet extends HttpServlet {

@Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        ServletContext sc = getServletContext();
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "cart";  // default action
        }

        // perform action and set URL to appropriate page
        String url = "/addcart.jsp";
        if (action.equals("shop")) {            
           // url = "/Producttypes.jsp";    // the "index" page
           url ="HomePage";
        } 
        else if (action.equals("cart")) {
            String idCode = request.getParameter("id");
            String quantityString = request.getParameter("quantity");

            HttpSession session = request.getSession();
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
            }

            //if the user enters a negative or invalid quantity,
            //the quantity is automatically reset to 1.
            int quantity;
            try {
                quantity = Integer.parseInt(quantityString);
                if (quantity < 0) {
                    quantity = 1;
                }
            } catch (NumberFormatException nfe) {
                quantity = 1;
            }
            ProductService service = new ProductService();
            //need to decrement by 1 becaause index of array starts at 0 not 1 
            int id;
            id = Integer.parseInt(idCode);
            id-=1;
            Product product = service.getProductById(id);

            LineItem lineItem = new LineItem();
            lineItem.setProduct(product);
            lineItem.setQuantity(quantity);
            if (quantity > 0) {
                cart.addItem(lineItem);
            } else if (quantity == 0) {
                cart.removeItem(lineItem);
            }

            session.setAttribute("cart", cart);
            url = "/Cart_11.jsp";
        }
        else if (action.equals("checkout")) {
            url = "/checkout1.html";
        }

        sc.getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
}