package com.myproject.inventorymanagement;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class RemoveTheStock {
    private static Scanner sc = new Scanner(System.in);
    public static void removeStock(Map<Integer, Productdetails> inventory) {
        removeLoop:
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("1.Remove an item\n2.Remove all items\n3.Exit");
            System.out.println("------------------------------------");
            int option;
            //input validation
            while(true){
                try{
                    System.out.print("Enter an option to proceed:");
                    option = sc.nextInt();
                    break;
                }
                catch(InputMismatchException e){
                    System.out.println("Please enter only number");
                    sc.nextLine();
                }
            }
            //switch case
            switch(option){
                case 1:
                    removeAStock(inventory);
                    break;
                case 2:
                    removeAllStocks(inventory);
                    break;
                case 3:
                    System.out.println("Exiting....");
                    break removeLoop;
                default:
                    System.out.println("Please enter numbers from 1-3 ");
            }

        }
    }

    public static void removeAStock(Map<Integer, Productdetails> inventory){

        if(inventory.isEmpty()){
            System.out.println("Currently no stocks present to remove ... !!!");
        }
        else{
            System.out.print("Enter the product id to remove: ");
            int prod_id = sc.nextInt();
            if(inventory.containsKey(prod_id)){
                inventory.remove(prod_id);
                System.out.println("Product removed successfully ...!!!");
            }
            else{
                System.out.println("There is no such product with id"+ prod_id);
            }
        }
    }

    public static void removeAllStocks(Map<Integer, Productdetails> inventory){
        if(inventory.isEmpty()){
            System.out.println("Currently no stocks present to remove ... !!!");
        }
        else{
            inventory.clear();
            System.out.println("All Products removed successfully...!!!");
        }
    }
}
