/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOs.User;
import utils.IConstants;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;

/**
 *
 * @author bemerson
 */
public class UserDAO {
//public static int counter =1; //
    public User getUserByEmail(String email) {

  
        User tempUser = new User();

        if (email.equals("admin@admin.com")){

        tempUser.setEmail("admin@admin.com");
        tempUser.setId(1);
        tempUser.setFirstName("Admin");
        tempUser.setLastName("Admin");
        tempUser.setPassword("Admin");
        tempUser.setUserType(IConstants.USER_TYPE_ADMIN);
      
    } else {
            tempUser.setEmail("user@user.com");
        tempUser.setId(1);
        tempUser.setFirstName("User");
        tempUser.setLastName("User");
        tempUser.setPassword("User");
        tempUser.setUserType(IConstants.USER_TYPE_GENERAL_USER);
      
        }
        
        return tempUser;
        
    }

    public User registerUser(String userEmail, String userPassword, String userFirstName, String userLastName) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
     User tempUser = new User();


        tempUser.setEmail(userEmail);
        //tempUser.setId(2);
       // tempUser.setId(counter);
        tempUser.setId(2);
        //counter++;
        tempUser.setFirstName(userFirstName);
        tempUser.setLastName(userLastName);
        tempUser.setPassword(userPassword);
        tempUser.setUserType(IConstants.USER_TYPE_GENERAL_USER);
        return tempUser;
 
}
     public static ArrayList<User> getUsers(){
        
        ArrayList<User> list = new ArrayList();
       
        //return list;     
        return list;
    }
    
    
    public User getUserById(int id){
        ArrayList<User> list = UserDAO.getUsers();
        
       return list.get(id);
    } 
    
  
    public void addNewUser(String email,String password, String firstName,String lastName, String type){
        
        
    }
   
   public void updateUser(int id,String email,String password, String firstName,String lastName, String type){
        
        
    }
   
   public void removeUserById(int id){

}
   
   
}