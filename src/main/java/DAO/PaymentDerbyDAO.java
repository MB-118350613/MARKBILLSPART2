/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOs.Payment;
import POJOs.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.DBManager;

/**
 *
 * @author samdo
 */
public class PaymentDerbyDAO {
    public ArrayList<Payment> getAllPayments() {

        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int paymentId = 0;
        int userId = 0;
        float total = 0.0f;
       
        ArrayList<Payment> paymentData = new ArrayList();

        String query = "SELECT * FROM PAYMENTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                paymentId = (rs.getInt(1));
                userId = (rs.getInt(2));
                total = (rs.getFloat(3));
               
                Payment tempPayment = new Payment();
                tempPayment.setId(paymentId);
                tempPayment.setUserId(userId);
                tempPayment.setTotal(total);
                
                paymentData.add(tempPayment);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return paymentData;

    }

     
       
  public void insertPayment(Payment newPayment){
        
        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;
        
        try {
        
            stmt = con.createStatement();
            String sql = String.format("INSERT INTO PAYMENTS(USER_ID,TOTAL) " + 
                            "VALUES(%s,%s)",newPayment.getUserId(),newPayment.getTotal());
            stmt.executeUpdate(sql);
        }
        catch (SQLException e){
            e.printStackTrace();
         }finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    /*
    public void updateUser(User newUser){
        
        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;
        
        try {
        
            stmt = con.createStatement();
            String sql = String.format("UPDATE USERDATA SET email='%s',password='%s',fname='%s',lname='%s',usertype='%s' where user_id=%d ",newUser.getEmail(),newUser.getPassword(),newUser.getFirstName(),newUser.getLastName(),newUser.getUserType(),newUser.getId());
            stmt.executeUpdate(sql);
        }
        catch (SQLException e){
            e.printStackTrace();
         }finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public void deleteUser(long userId){
        
        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;
        
        try {
        
            stmt = con.createStatement();
            String sql = String.format("DELETE FROM USERDATA WHERE USER_ID=%d",userId);
            stmt.executeUpdate(sql);
        }
        catch (SQLException e){
            e.printStackTrace();
         }finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
*/
}
