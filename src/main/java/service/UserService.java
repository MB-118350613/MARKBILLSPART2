/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import DAO.UserDAO;
import POJOs.User;
import DAO.UserDerbyDAO;
import java.util.ArrayList;

/**
 *
 * @author bemerson
 */
public class UserService {
    
    /** This will take a username and select from user table
     * This will return three possible statuses, login correct, 
     * unknown user or password incorrect
     * @param inUser 
     */
     public User loginUser(String email, String password){
        
       UserDerbyDAO userDAO = new UserDerbyDAO();
        User user = userDAO.getUserByEmail(email);
        if (user.getPassword().equals(password)){
            return user;
        }
        else return null;
    }
    
    public User getUser(long userId){
       UserDerbyDAO userDAO = new UserDerbyDAO();
        User user = userDAO.getUserById(userId);
        return user;
    }
    
    public ArrayList<User> getAllUsers(){
       
       UserDerbyDAO uDao = new UserDerbyDAO();
        ArrayList<User> userList = uDao.getAllUsers();
        return userList;
        
    }
    
    public void insertUser(User nUser){
       UserDerbyDAO uDao = new UserDerbyDAO();
        uDao.insertUser(nUser);
        return;
        
    }
    
    public void updateUser(User nUser){
       UserDerbyDAO uDao = new UserDerbyDAO();
        uDao.updateUser(nUser);
        return;
        
    }
    
    public void deleteUser(long userId){
       UserDerbyDAO uDao = new UserDerbyDAO();
        uDao.deleteUser(userId);
        return;
        
    }
}
