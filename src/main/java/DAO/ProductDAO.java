/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import POJOs.Product;
import utils.IConstants;
import static utils.IConstants.*;

/**
 *
 * @author be_me
 */
public class ProductDAO {
    //fake DAO
    /* Gets number of top products specified */
    /* we are gonna fake this one */
    public static ArrayList<Product> getTopProducts(){
        
        ArrayList<Product> prods = new ArrayList();
        Product p1 = new Product(1,"Philips","Universal Philips remote",15,"philips.jpg","0", "Infrared");
        prods.add(p1);
        
        Product p2 = new Product(2,"JVC","Universal JVC remote",10,"oneforall.jpg","0", "Infrared");
       
        prods.add(p2);
        
        Product p3 = new Product(3,"Sky Voice","Voice Control",45,"skyvoice.jpg","0", "Voice");
        prods.add(p3);
        
        Product p4 = new Product(4,"Google Voice","For all android smart TVs",30,"googlevoice.jpg","0", "Voice");
        prods.add(p4);
        
        Product p5 = new Product(5,"Flysky Drone Control","Universal Drone Remote",80,"flysky.jpg","0", "Radio");
        prods.add(p5);
        
       Product p6 = new Product(6,"Explorer","Advanced Drone Remote",150,"advanceddrone.jpg","0", "Radio");
        prods.add(p6);
        
        return prods;     
        
    }
    
    
    //returning a product based on its id
    public Product getProductById(int id){
        ArrayList<Product> list = ProductDAO.getTopProducts();
        
       return list.get(id);
    } 
    
     public int getProductByName(String name){
        ArrayList<Product> list = ProductDAO.getTopProducts();
        int id = 0;
        //iterating over list until find the name ...return the corresponding id then
        for (Product p : list){
         if (p.getName().equals(name)){  
             
             id= p.getId();
        }
         else {
             id= -1;
         }
        }
       
     return id;
    
     }
     
     public ArrayList<Product> getProductByType(String type){
           ArrayList<Product> list = ProductDAO.getTopProducts();
            ArrayList<Product> prods = new ArrayList<Product>();
         for (Product p : list){
             if(p.getType().equals(type)){
                 prods.add(p);
             
     }
         }
             return prods;
    
     }
     
     
     //CRUD operations for part 2
     public void addNewProduct( String name, float price, String type,int quantity){
       
         }
         
         
         
         
         
}


