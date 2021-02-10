/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import POJOs.Product;
import POJOs.User;
import java.sql.Statement;
import utils.DBManager;

/**
 *
 * @author be_me
 */
public class ProductDerbyDAO{
    
    /* Gets number of top products specified */
    /* we are gonna fake this one */
    public static ArrayList<Product> getTopProducts(){
        
        
        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int productId = 0;
        String name = null;
        String description = null;
        float price = 0.0f;
        String image_location = null;
        String quantity = null;
        String type = null;
        ArrayList<Product> productData = new ArrayList();

        String query = "SELECT * FROM PRODUCTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            int productCount = 0;
            while (rs.next()) {
              //  if (productCount >= numProducts)
                   // break;
                productId = (rs.getInt(1));
                name = (rs.getString(2));
                description = (rs.getString(3));
                price = (rs.getFloat(4));
                image_location = (rs.getString(5));
                quantity = (rs.getString(6));
                type = (rs.getString(7));
                Product product = new Product();
                product.setId(productId);
                product.setName(name);
                product.setDescription(description);
                product.setPrice(price);
                product.setImageLocation(image_location);
                product.setQuantity(quantity);
                product.setType(type);
                productData.add(product);
               // productCount++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return productData;
        
         
        
    }
    
    public ArrayList<Product> getProductsByCategory(String category){
        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int productId = 0;
        String name = null;
        String description = null;
        float price = 0.0f;
        String image_location = null;
        String quantity = null;
        String type = null;
        ArrayList<Product> productData = new ArrayList();

        String query = "SELECT * FROM PRODUCTS WHERE TYPE=" + "'" + category + "'";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            int productCount = 0;
            while (rs.next()) {
              //  if (productCount >= numProducts)
                   // break;
                productId = (rs.getInt(1));
                name = (rs.getString(2));
                description = (rs.getString(3));
                price = (rs.getFloat(4));
                image_location = (rs.getString(5));
                quantity = (rs.getString(6));
                type = (rs.getString(7));
                Product product = new Product();
                product.setId(productId);
                product.setName(name);
                product.setDescription(description);
                product.setPrice(price);
                product.setImageLocation(image_location);
                product.setQuantity(quantity);
                product.setType(type);
                productData.add(product);
               // productCount++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return productData;
        
         
        
    }
        
        
    
    
    
    
    
    
    
    
    
    
     public Product getProductById(int id){
        ArrayList<Product> list;
        list = ProductDerbyDAO.getTopProducts();
        
       return list.get(id);
    } 
     
       public Product getProductByName(String productName) {

        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
       
        int productId = 0;
        String name = null;
        String description = null;
        float price = 0.0f;
        String image_location = null;
        String quantity = null;
        String type = null;
        Product tempProduct = new Product();

        String query = "SELECT * FROM PRODUCTS WHERE PRODUCTNAME=" + "'" + productName + "'";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                productId = (rs.getInt(1));
                description = (rs.getString(3));
                price = (rs.getFloat(4));
                image_location = (rs.getString(5));
                quantity = (rs.getString(6));
                type = (rs.getString(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        tempProduct.setId(productId);
        tempProduct.setName(productName);
        tempProduct.setDescription(description);
        tempProduct.setPrice(price);
        tempProduct.setImageLocation(image_location);
        tempProduct.setQuantity(quantity);
        tempProduct.setType(type);
        return tempProduct;

    }
 public void addProduct(Product newProduct){
        
        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;
        
        try {
        
            stmt = con.createStatement();
            String sql = String.format("INSERT INTO PRODUCTS(NAME,DESCRIPTION,PRICE,IMAGE_LOCATION,QUANTITY,TYPE) " + 
                            "VALUES('%s','%s',%s,'%s','%s')",newProduct.getName(),newProduct.getDescription(),newProduct.getPrice(),newProduct.getImageLocation(),newProduct.getQuantity(),newProduct.getType());
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
  public void insertProduct(Product newProduct){
        
        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;
        
        try {
        
            stmt = con.createStatement();
            String sql = String.format("INSERT INTO PRODUCTS(NAME,DESCRIPTION,PRICE,IMAGE_LOCATION,QUANTITY,TYPE) " + 
                            "VALUES('%s','%s',%s,'%s','%s','%s')",newProduct.getName(),newProduct.getDescription(),newProduct.getPrice(),newProduct.getImageLocation(),newProduct.getQuantity(), newProduct.getType());
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
    
    public void updateProduct(Product newProduct){
        
        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;
        
        try {
        
            stmt = con.createStatement();
            String sql = String.format("UPDATE PRODUCTS SET NAME='%s',DESCRIPTION='%s',PRICE=%s,IMAGE_LOCATION='%s',QUANTITY='%s', TYPE='%s' where PRODUCT_ID=%d ",newProduct.getName(),newProduct.getDescription(),newProduct.getPrice(),newProduct.getImageLocation(),newProduct.getQuantity(),newProduct.getType(),newProduct.getId());
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
    
    public void deleteProduct(long productId){
        
        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;
        
        try {
        
            stmt = con.createStatement();
            String sql = String.format("DELETE FROM PRODUCTS WHERE PRODUCT_ID=%d",productId);
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
     public ArrayList<Product> getAllProducts() {

        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int productId = 0;
        String name = null;
        String description = null;
        float price = 0.0f;
        String image_location = null;
        String quantity = null;
        String type = null;
        ArrayList<Product> productData = new ArrayList();

        String query = "SELECT * FROM PRODUCTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
               productId = (rs.getInt(1));
                name = (rs.getString(2));
                description = (rs.getString(3));
                price = (rs.getFloat(4));
                image_location = (rs.getString(5));
                quantity = (rs.getString(6));
                type = (rs.getString(7));
                
                Product tempProduct = new Product();
                  tempProduct.setId(productId);
        tempProduct.setName(name);
        tempProduct.setDescription(description);
        tempProduct.setPrice(price);
        tempProduct.setImageLocation(image_location);
        tempProduct.setQuantity(quantity);
        tempProduct.setType(type);;
                productData.add(tempProduct);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return productData;

    }
     public Product getProductById(long productId) {

        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
         String name = null;
        String description = null;
        float price = 0.0f;
        String image_location = null;
        String quantity = null;
        String type = null;
        
        Product tempProduct = new Product();

        String query = String.format("SELECT * FROM PRODUCTS WHERE PRODUCT_ID=%d",productId);
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                name = (rs.getString(2));
                description = (rs.getString(3));
                price = (rs.getFloat(4));
                image_location = (rs.getString(5));
                quantity = (rs.getString(6));
                type = (rs.getString(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
       int intId = Math.round(productId);//
       tempProduct.setId(intId);
        tempProduct.setName(name);
        tempProduct.setDescription(description);
        tempProduct.setPrice(price);
        tempProduct.setImageLocation(image_location);
        tempProduct.setQuantity(quantity);
        tempProduct.setType(type);;
        return tempProduct;

    }
}
