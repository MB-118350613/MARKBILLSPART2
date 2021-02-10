/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.PrintWriter;
import DAO.UserDAO;
import service.UserService;
import POJOs.User;
import utils.IConstants;
import utils.StringUtils;
import java.io.IOException;
import java.util.Vector;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class RegisterUserServlet extends HttpServlet {

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
        String email = request.getParameter("email");
        String userPassword = request.getParameter("password");
        String userFirstName = request.getParameter("firstname");
        String userLastName = request.getParameter("lastname");
        //String userType  = request.getParameter("USERTYPE");
        if (StringUtils.isStringEmpty(email) || StringUtils.isStringEmpty(userPassword) ||StringUtils.isStringEmpty(userFirstName) ||StringUtils.isStringEmpty(userLastName)){ //||StringUtils.isStringEmpty(userType)) 

            RequestDispatcher rd = request.getRequestDispatcher("/register.html");
                    rd.forward(request, response);

        } else {

            UserService service = new UserService();
            //   service.newUser(email, userPassword, userFirstName, userLastName);
                              //  request.setAttribute("user", user);//
                                //want a way of maintaining state...ie if user is logged in
                      response.sendRedirect("registeredUser.html");
        }
        
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
