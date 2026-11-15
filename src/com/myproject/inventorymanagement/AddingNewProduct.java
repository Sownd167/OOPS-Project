package com.myproject.inventorymanagement;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class AddingNewProduct {
    private static final List<DateTimeFormatter> Date_Formats = Arrays.asList(
            DateTimeFormatter.ofPattern("dd-MM-yyyy"),
            DateTimeFormatter.ofPattern("MM-dd-yyyy"),
            DateTimeFormatter.ofPattern("yyyy-MM-dd"),
            DateTimeFormatter.ofPattern("dd/MM/yyyy"),
            DateTimeFormatter.ofPattern("MM/dd/yyyy"),
            DateTimeFormatter.ofPattern("yyyy/MM/dd")
    );
    public static void addProduct() {

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

        //user can input in this format but LocalDate has only one format yyyy-mm-dd, so we are now formatting according to the pattern
        LocalDate expiration_date = null;

        while (expiration_date == null){
            try {
                System.out.print("Enter the Expiration date(dd-mm-yyyy):  ");
                String dateString = sc.nextLine();
                expiration_date = dateparse(dateString);
            } catch (DateTimeParseException e) {
                 System.out.println(expiration_date);
            }
    }

        System.out.print("Enter the Manufacturer Name:  ");
        String manufacturer_name = sc.nextLine();

        Productdetails stock = new Productdetails(product_id,product_name,quantity_nos,quantity_gms,quantity_kgs,price,expiration_date,manufacturer_name);
        ProductStorage.addItems(product_id, stock);
    }

    //getting the userinput as String and formatting as per built-in formats
    public static LocalDate dateparse(String date) throws DateTimeParseException {
        String inputdate = date.trim();
        for(DateTimeFormatter formats: Date_Formats){
            try{
                return LocalDate.parse(inputdate, formats);
            }
            catch(DateTimeParseException e){
                //if one fails , continue to next one until it reaches the end of the list
            }
        }
        throw new DateTimeParseException("Invalid Date Format",inputdate,1);
    }
}
