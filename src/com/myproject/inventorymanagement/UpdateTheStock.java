package com.myproject.inventorymanagement;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import static com.myproject.inventorymanagement.AddingNewProduct.dateparse;

public class UpdateTheStock {
    private static Scanner sc = new Scanner(System.in);

    public static void updateStock(Map<Integer, Productdetails> inventory) {
        updateLoop:
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1.Update an Item\n2.Exit");
            System.out.println("--------------------------------");
            int option;
            while (true) {
                try {
                    System.out.print("Enter an option:");
                    option = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter only integer");
                    sc.nextLine();
                }
            }

            //switch
            switch (option) {
                case 1:
                    updateAnItem(inventory);
                    break;
                case 2:
                    System.out.println("Exiting .....");
                    break updateLoop;
                default:
                    System.out.println("Please enter either 1 or 2");
                    break;
            }
        }
    }

    public static void updateAnItem(Map<Integer, Productdetails> inventory) {
        updatestockLoop:
        while (true) {
            System.out.println("*******************************");
            System.out.println("1.Update the Product Name\n2.Update the Quantity in Numbers\n3.Update the Quantity in grams\n4.Update the Quantity in Kilograms\n5.Update the Price\n6.Update the expiration date\n7.Update the Manufacturer name\n8.Exit");
            System.out.println("*******************************");
            int option;
            while (true) {
                try {
                    System.out.print("Enter an option:");
                    option = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter only integer");
                    sc.nextLine();
                }
            }

            //switch part
            int prod_id;
            switch (option) {

                case 1:
                    System.out.print("Enter the Product id:");
                    prod_id = sc.nextInt();
                    if (inventory.isEmpty()) {
                        System.out.println("Currently no stock present!!");
                    } else {
                        if (inventory.containsKey(prod_id)) {
                            System.out.print("Enter the New Product Name: ");
                            String newprod_name = sc.next();
                            //fetches the value for the given key (value is an object so passing it to an object)
                            Productdetails prod_obj = inventory.get(prod_id);
                            //now update the product name
                            prod_obj.setProduct_name(newprod_name);
                            //update the inventory
                            inventory.replace(prod_id, prod_obj);
                            System.out.println("Product name has been changed successfully !!");
                        } else {
                            System.out.println("No stock with the given product id is found !!");

                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter the Product id:");
                    prod_id = sc.nextInt();
                    if (inventory.isEmpty()) {
                        System.out.println("Currently no stock present!!");
                    } else {
                        if (inventory.containsKey(prod_id)) {
                            System.out.print("Enter the New Quantity in Numbers: ");
                            int newqty_nos = sc.nextInt();
                            //fetches the value for the given key (value is an object so passing it to an object)
                            Productdetails prod_obj = inventory.get(prod_id);
                            //now update the product name
                            prod_obj.setQuantity_nos(newqty_nos);
                            //update the inventory
                            inventory.replace(prod_id, prod_obj);
                            System.out.println("Quantity(nos) has been changed successfully !!");
                        } else {
                            System.out.println("No stock with the given product id is found !!");

                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the Product id:");
                    prod_id = sc.nextInt();
                    if (inventory.isEmpty()) {
                        System.out.println("Currently no stock present!!");
                    } else {
                        if (inventory.containsKey(prod_id)) {
                            System.out.print("Enter the New Quantity in Grams: ");
                            int newqty_gms = sc.nextInt();
                            //fetches the value for the given key (value is an object so passing it to an object)
                            Productdetails prod_obj = inventory.get(prod_id);
                            //now update the product name
                            prod_obj.setQuantity_grams(newqty_gms);
                            //update the inventory
                            inventory.replace(prod_id, prod_obj);
                            System.out.println("Quantity(grams) has been changed successfully !!");
                        } else {
                            System.out.println("No stock with the given product id is found !!");

                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter the Product id:");
                    prod_id = sc.nextInt();
                    if (inventory.isEmpty()) {
                        System.out.println("Currently no stock present!!");
                    } else {
                        if (inventory.containsKey(prod_id)) {
                            System.out.print("Enter the New Quantity in Kilograms: ");
                            int newqty_kgs = sc.nextInt();
                            //fetches the value for the given key (value is an object so passing it to an object)
                            Productdetails prod_obj = inventory.get(prod_id);
                            //now update the product name
                            prod_obj.setQuantity_kgs(newqty_kgs);
                            //update the inventory
                            inventory.replace(prod_id, prod_obj);
                            System.out.println("Quantity(kgs) has been changed successfully !!");
                        } else {
                            System.out.println("No stock with the given product id is found !!");

                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter the Product id:");
                    prod_id = sc.nextInt();
                    if (inventory.isEmpty()) {
                        System.out.println("Currently no stock present!!");
                    } else {
                        if (inventory.containsKey(prod_id)) {
                            System.out.print("Enter the New Price: ");
                            BigDecimal price = sc.nextBigDecimal();
                            sc.nextLine();
                            //fetches the value for the given key (value is an object so passing it to an object)
                            Productdetails prod_obj = inventory.get(prod_id);
                            //now update the product name
                            prod_obj.setPrice(price);
                            //update the inventory
                            inventory.replace(prod_id, prod_obj);
                            System.out.println("Price has been changed successfully !!");
                        } else {
                            System.out.println("No stock with the given product id is found !!");

                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter the Product id:");
                    prod_id = sc.nextInt();
                    if (inventory.isEmpty()) {
                        System.out.println("Currently no stock present!!");
                    } else {
                        if (inventory.containsKey(prod_id)) {
                            LocalDate expiration_date = null;
                            while (expiration_date == null) {
                                try {
                                    System.out.print("Enter the New Expiration date: ");
                                    String dateString = sc.next();
                                    expiration_date = dateparse(dateString);
                                } catch (DateTimeParseException e) {
                                    System.out.println("Please enter valid date");
                                }
                            }

                            //fetches the value for the given key (value is an object so passing it to an object)
                            Productdetails prod_obj = inventory.get(prod_id);
                            //now update the product name
                            prod_obj.setExpiration_date(expiration_date);
                            //update the inventory
                            inventory.replace(prod_id, prod_obj);
                            System.out.println("Expiration date has been changed successfully !!");
                        } else {
                            System.out.println("No stock with the given product id is found !!");

                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter the Product id:");
                    prod_id = sc.nextInt();
                    if (inventory.isEmpty()) {
                        System.out.println("Currently no stock present!!");
                    } else {
                        if (inventory.containsKey(prod_id)) {
                            System.out.print("Enter the New Manufacturer name: ");
                            String newmanufacturer_name = sc.next();
                            //fetches the value for the given key (value is an object so passing it to an object)
                            Productdetails prod_obj = inventory.get(prod_id);
                            //now update the product name
                            prod_obj.setManufacturer_name(newmanufacturer_name);
                            //update the inventory
                            inventory.replace(prod_id, prod_obj);
                            System.out.println("Manufacturer name has been changed successfully !!");
                        } else {
                            System.out.println("No stock with the given product id is found !!");

                        }
                    }
                    break;

                case 8:
                    System.out.println("Exiting ...");
                    break updatestockLoop;

            }
        }
    }

}
