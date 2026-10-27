package com.myproject.inventorymanagement;
import java.util.InputMismatchException;
import java.util.Scanner;
import static com.myproject.inventorymanagement.AddingNewProduct.*;
import static com.myproject.inventorymanagement.ProductStorage.*;
import static com.myproject.inventorymanagement.ViewTheProduct.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("      INVENTORY MANAGEMENT SYSTEM     ");
        System.out.println("------------------------------------------------");
        mainLoop: //giving a name to this block
        while(true){
            System.out.println("1. Add the stock \n2. Remove any stock  \n3. Update any stock\n4. View the stock details\n5.Exit");
            System.out.println("------------------------------------------------");
            int option;
            while(true){
                try{
                    System.out.println("Enter the option number to continue: ");
                    option = sc.nextInt();
                    break;
                }
                catch(InputMismatchException e){
                    System.out.println("Please enter only numbers");
                    sc.nextLine();
                }
            }

            switch(option){
                case 1:
                    addProduct();
                    break;
                case 2:
                    System.out.println("Removing stocks");
                    break;
                case 3:
                    System.out.println("Updating stocks");
                    break;
                case 4:
                    viewItems();
                    break;
                case 5:
                    System.out.println("Exiting");
                    break mainLoop; //similar to exit also we can use return statement
                default:
                    System.out.println("Select any option from 1 to 5");
                    break;
            }

        }
    }
}
