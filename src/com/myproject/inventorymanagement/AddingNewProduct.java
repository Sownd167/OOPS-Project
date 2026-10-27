package com.myproject.inventorymanagement;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AddingNewProduct {

    public static void addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.print("Enter the Product Id:  ");
        int product_id = sc.nextInt();
        sc.nextLine(); //clears the buffer

        System.out.print("Enter the Product Name:  ");
        String product_name = sc.nextLine();
        System.out.print("Enter the Quantity in Numbers:  ");
        int quantity_nos = sc.nextInt();
        System.out.print("Enter the Quantity in Grams:  ");
        int quantity_gms = sc.nextInt();
        System.out.print("Enter the Quantity in Kilograms:  ");
        int quantity_kgs = sc.nextInt();
        System.out.print("Enter the Price:  ");
        BigDecimal price = sc.nextBigDecimal();
        sc.nextLine(); //clears the buffer

        //inputchecks

        System.out.print("Enter the Expiration date(dd-mm-yyyy):  ");
        String dateString = sc.nextLine();  //user can input in this format but LocalDate has only one format yyyy-mm-dd, so we are now formatting according to the pattern
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");  //MM is used for Month, mm is used for Minutes
        LocalDate expiration_date = LocalDate.parse(dateString,pattern);  //I'm parsing (converting) the string to localdate object with the pattern mentioned
        System.out.print("Enter the Manufacturer Name:  ");
        String manufacturer_name = sc.nextLine();

        Productdetails stock = new Productdetails(product_id,product_name,quantity_nos,quantity_gms,quantity_kgs,price,expiration_date,manufacturer_name);
        ProductStorage.addItems(product_id, stock);







    }
}
