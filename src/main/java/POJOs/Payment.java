/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOs;

/**
 *
 * @author samdo
 */
public class Payment {
    private int id;
    private int userId;
    private float total;
    
    public Payment(){
        
    }
    public int getId(){
        return id;
    }
    public void setId(int x){
        id = x;
    }
    public int getUserId(){
        return userId;
    }
    public void setUserId(int x){
        id = x;
    }
    public float getTotal(){
        return total;
    }
    public void setTotal(float x){
        total = x;
    }
}
