/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DAO.PaymentDerbyDAO;
import POJOs.Payment;
import java.util.ArrayList;

/**
 *
 * @author samdo
 */
public class PaymentService {
    public ArrayList<Payment> getAllPayments(){
       
       PaymentDerbyDAO pDao = new PaymentDerbyDAO();
        ArrayList<Payment> paymentList = pDao.getAllPayments();
        return paymentList;
        
    }
    
    public void insertPayment(Payment p){
       PaymentDerbyDAO pDao = new PaymentDerbyDAO();
        pDao.insertPayment(p);
        return;
        
    }
    /*
    public void updatePayment(Payment p){
       PaymentDerbyDAO pDao = new PaymentDerbyDAO();
        pDao.updatePayment(p);
        return;
        
    }
    
    public void deletePayment(long paymentId){
       PaymentDerbyDAO pDao = new PaymentDerbyDAO();
        pDao.deletePayment(paymentId);
        return;
        
    }
*/
}
