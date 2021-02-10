/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import POJOs.Product;
import POJOs.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.ProductService;
import service.UserService;

/**
 *
 * @author samdo
 */
public class CategoryServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        ProductService pServ = new ProductService();
        String url = null;
        if (action == null)
            request.getRequestDispatcher("/HomePage").forward(request, response);
       
       if (action.equals("INFRARED")){
            
            ArrayList<Product> products = pServ.getProductsByCategory("Infrared");
            request.setAttribute("productsList", products);
            request.getRequestDispatcher("/CategoryPage.jsp").forward(request, response);
        }
        if (action.equals("VOICE")){
            
            ArrayList<Product> products = pServ.getProductsByCategory("Voice");
            request.setAttribute("productsList", products);
            request.getRequestDispatcher("/CategoryPage.jsp").forward(request, response);
        }
        if (action.equals("RADIO")){
            
            ArrayList<Product> products = pServ.getProductsByCategory("Radio");
            request.setAttribute("productsList", products);
            request.getRequestDispatcher("/CategoryPage.jsp").forward(request, response);
        }
         
        else
            request.getRequestDispatcher("/HomePage").forward(request, response);
        return;
       
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
