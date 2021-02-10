/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOs;

import java.text.NumberFormat;
import utils.IConstants;

/**
 *
 * @author be_me
 */
public class Product {
    
    //private long id;
    private int id;
    private String name;
    private String description;
    private float price;
    private String imageLocation;
    private String quantity;
    private String type;

    
    
    
    public Product(int id, String name,String description,float price , String imageLocation, String quanity,  String type){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageLocation = imageLocation;
        this.quantity = quantity;
        this.type = type;
        
    }

    public Product() {
    }

   
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the imageLocation
     */
    public String getImageLocation() {
        return imageLocation;
    }

    /**
     * @param imageLocation the imageLocation to set
     */
    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
   
    public String getQuantity() {
        return quantity;
    }

    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    public String getType() {
        return type;
    }

    /**
     * @param id the id to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    public String getPriceCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
}
