package com.mycompany.coffehutreport;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the beverage type");
        System.out.println("1) COFFEE");
        System.out.println("2) TEA");
        System.out.println("3) BOBA");

       
        int choice = 0;
        while (choice < 1 || choice > 3) {
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                input.next(); 
            }
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Enter 1, 2 or 3:");
            }
        }
        input.nextLine();

        String beverageType;
        switch (choice) {
            case 1:  beverageType = "COFFEE"; break;
            case 2:  beverageType = "TEA";    break;
            default: beverageType = "BOBA";   break;
        }

        System.out.print("Enter the city: ");
        String city = input.nextLine().trim().toUpperCase();

        
        int totalSales = -1;
        System.out.print("Enter the total sales of " + beverageType
                + " beverages in " + city + " :");
        while (totalSales < 0) {
            if (input.hasNextInt()) {
                totalSales = input.nextInt();
                if (totalSales < 0) {
                    System.out.print("Sales cannot be negative. Try again: ");
                }
            } else {
                input.next();
                System.out.print("Please enter a whole number: ");
            }
        }

        Beverage beverage = new BeverageSales(beverageType, city, totalSales);
        beverage.printReport();

        input.close();
    }
}