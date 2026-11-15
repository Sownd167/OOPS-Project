package com.myproject.inventorymanagement;

import java.util.Map;
import java.util.Scanner;

public class ViewTheProduct {
   private static Scanner sc = new Scanner(System.in);
    public static void viewProduct(Map<Integer, Productdetails> invobject){
        viewLoop:
        while(true){
            System.out.println("----------------------------------");
            System.out.println("1.View All Products\n2.View A Product\n3.Exit\n");
            System.out.println("----------------------------------");
            int option;
            //input validation
            while(true){
                try {
                    System.out.println("Enter the option: ");
                    option = sc.nextInt();
                    break;
                }
                catch(NumberFormatException e){
                    System.out.println("Please enter a number:");
                    sc.nextLine();
                }
            }
            //switch case
            switch(option){
                case 1:
                    viewAllProduct(invobject);
                    break;
                case 2:
                    viewAProduct(invobject);
                    break;
                case 3:
                    System.out.println("Exiting ...");
                    break viewLoop;
                default:
                    System.out.println("Please enter numbers from 1-3 ");
            }
        }
    }

    //viewingalltheproducts
    public static void viewAllProduct(Map<Integer,Productdetails> invobject){
        System.out.println("*******************************");
        System.out.println("        PRODUCT LIST           ");
        System.out.println("*******************************");
        if(invobject.isEmpty()){
            System.out.println("No Stock Present !!");
        }
        else{
            for(Map.Entry<Integer, Productdetails> mpp : invobject.entrySet()){
                System.out.println( "Details:\n "+ mpp.getValue());
            }
            System.out.println("*****************************");
        }
    }

    //viewAspecificProduct
    public static void viewAProduct(Map<Integer,Productdetails> invobject) {
        if (invobject.isEmpty()) {
            System.out.println("No Stock Present !!");
        }
        else {
            System.out.print("Enter the Product id to view: ");
            int id = sc.nextInt();
            System.out.println("*******************************");
            System.out.println("        THE PRODUCT DETAILS           ");
            System.out.println("*******************************");
            if (invobject.containsKey(id)) {
                System.out.println(invobject.get(id));
            } else {
                System.out.println("There is no stocks present for this product id: " + id);
            }
        }
    }
}
