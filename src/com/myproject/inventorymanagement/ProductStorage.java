package com.myproject.inventorymanagement;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static com.myproject.inventorymanagement.ViewTheProduct.*;


public class ProductStorage {
      /*creating a HASHMAP (key-value) pair
        Interface (left side) & Concrete class (right side), this concept is called Programming to an Interface not an implementation
        it helps in Polymorphism if in between if we need to change for TreeMap or others we can just change the class name
        we will completely use the functionality of interface and not stick to one class
        --> The interface will tell what methods the object can perform and the class will tell how these are performed */

    private static Map<Integer, Productdetails> inventory = new HashMap<>();

    //adding the stock
    public static void addItems(int product_id, Productdetails stock){
        inventory.putIfAbsent(product_id, stock);
        System.out.println("Product added successfully to the cart !!!");
    }

    //viewing the stock
    public static void viewItems(){
        viewProduct(inventory);
    }

}

