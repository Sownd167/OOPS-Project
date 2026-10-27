package com.myproject.inventorymanagement;

import java.math.BigDecimal; //we used this to avoid the discrepencies we face in double and float datatypes as they are not appreciated to use
import java.time.LocalDate; //to store the date alone without time

public class Productdetails {
    private int product_id;
    private String product_name;
    private int quantity_nos;
    private int quantity_grams;
    private int quantity_kgs;
    private BigDecimal price;
    private LocalDate expiration_date;
    private String manufacturer_name;

    //constructor to assign values initially to the attributes of the created object
    //Implementing constructor overloading to handle different object creation (based on quantity, gms, kgs)
    Productdetails(int product_id, String product_name, int quantity_nos, int quantity_grams, int quantity_kgs,BigDecimal price, LocalDate expiration_date, String manufacturer_name ){
        this.product_id = product_id;
        this.product_name = product_name;
        this.quantity_nos = quantity_nos;
        this.quantity_grams = quantity_grams;
        this.quantity_kgs = quantity_kgs;
        this.price = price;
        this.expiration_date = expiration_date;
        this.manufacturer_name = manufacturer_name;
    }

    /* currently not needed
    //Constructor 2 : For gram based
    inventorymanagement.Productdetails(int product_id, String product_name, int quantity_grams, BigDecimal price, LocalDate expiration_date, String manufacturer_name ){
        this.product_id = product_id;
        this.product_name = product_name;
        this.quantity_grams = quantity_grams;
        this.price = price;
        this.expiration_date = expiration_date;
        this.manufacturer_name = manufacturer_name;
    }

    //Constructor 3: For Kgs based here same order even variable names won't be considered for overloading so I'm changing the order
    inventorymanagement.Productdetails(int product_id, String product_name, BigDecimal price,  int quantity_kgs, LocalDate expiration_date, String manufacturer_name ){
        this.product_id = product_id;
        this.product_name = product_name;
        this.quantity_kgs = quantity_kgs;
        this.price = price;
        this.expiration_date = expiration_date;
        this.manufacturer_name = manufacturer_name;
    }
    */

    // we need to maintain getters and setters so that we can modify the object's state if needed and to fetch object's state
    //getters to fetch each state values
    public int getProduct_id(){ return this.product_id; }
    public String getProduct_name() { return this.product_name; }
    public int getQuantity_nos(){ return this.quantity_nos; }
    public int getQuantity_grams() { return this.quantity_grams; }
    public int getQuantity_kgs() { return this.quantity_kgs; }
    public BigDecimal getPrice() { return this.price; }
    public LocalDate getExpiration_date() { return this.expiration_date; }
    public String getManufacturer_name() { return this.manufacturer_name; }

    //setters to modify the existing state values
    public void setProduct_id(int product_id){
        this.product_id = product_id;
    }
    public void setProduct_name(String product_name){
        this.product_name = product_name;
    }
    public void setQuantity_nos(int quantity_nos){
        this.quantity_nos = quantity_nos;
    }
    public void setQuantity_grams(int quantity_gms){
        this.quantity_grams = quantity_gms;
    }
    public void setQuantity_kgs(int quantity_kgs){
        this.quantity_kgs = quantity_kgs;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public void setExpiration_date(LocalDate date){
        this.expiration_date = date;
    }
    public void setManufacturer_name(String manufacturer_name){
        this.manufacturer_name = manufacturer_name;
    }

    /*we will override the Object class .toString() method, because whenever we use Sysout for
    * objects, it will internally call .toString() method (which will return object's memory location) so
    * we can override this method and return our objects states. We can also write print() methods, but it
    * will be complex to add in many places if needed*/

    @Override
    public String toString(){
        String productdetail = "Product id: "+ this.product_id +"\n"+ "Product name: " +this.product_name+"\n"+"Quantity in Numbers: "+ this.quantity_nos+"\n"+"Quantity in Grams: "+this.quantity_grams+"\n"
                +"Quantity in Kilograms: "+this.quantity_kgs+"\n"+"Price: "+this.price+"\n"+"Expiration date: "+this.expiration_date+"\n"
                +"Manufaturer name: "+this.manufacturer_name;
        return productdetail;
    }

}
