/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import java.util.ArrayList;
import POJOs.Product;
import DAO.ProductDerbyDAO;
import DAO.UserDerbyDAO;



/**
 *
 * @author be_me
 */
public class ProductService {
    
    public ArrayList<Product> getHomePageProducts(){
        
        ProductDerbyDAO pDao = new ProductDerbyDAO();
        return pDao.getTopProducts();//
        
    }
    
    //i added this method because when i go to add to cart want to know which product it was 
    
    public Product getProductById(int id){
        ProductDerbyDAO pDAO = new ProductDerbyDAO();
       
        Product p = pDAO.getProductById(id);
        return p;
        
    }   
   
     public Product getProductByName(String name){
        ProductDerbyDAO pDAO = new ProductDerbyDAO();
       Product p = pDAO.getProductByName(name);
        return p;
        
    }  
    public ArrayList<Product> getProductsByCategory(String category){
         ProductDerbyDAO pDao = new ProductDerbyDAO();
        return pDao.getProductsByCategory(category);//

}
    public ArrayList<Product> getAllProducts(){
       
       ProductDerbyDAO pDao = new ProductDerbyDAO();
        ArrayList<Product> productList = pDao.getAllProducts();
        return productList;
        
    }
      public Product getProduct(long productId){
       ProductDerbyDAO productDAO = new ProductDerbyDAO();
        Product product = productDAO.getProductById(productId);
        return product;
    }
    
    public void insertProduct(Product nProduct){
       ProductDerbyDAO pDao = new ProductDerbyDAO();
        pDao.insertProduct(nProduct);
        return;
        
    }
    
    public void updateProduct(Product nProduct){
       ProductDerbyDAO pDao = new ProductDerbyDAO();
        pDao.updateProduct(nProduct);
        return;
        
    }
    
    public void deleteProduct(long productId){
       ProductDerbyDAO pDao = new ProductDerbyDAO();
        pDao.deleteProduct(productId);
        return;
        
    }
}
