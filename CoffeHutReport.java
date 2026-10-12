/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coffehutreport;

/**
 *
 * @author Student
 */

public class CoffeHutReport {
    public static void main(String[] args) {
      
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] beverages = {"Coffee", "Tea", "Boba Tea"};


        int[][] sales = {
            {500, 300, 125},  
            {450, 250, 100},   
            {480, 175, 120}    
        };

        int grandTotal = 0;

        System.out.println("NUMBER 1 COFFEE HUT BEVERAGE REPORT");
        System.out.println("***********************************");

        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            System.out.println("City: " + cities[i]);

            for (int j = 0; j < beverages.length; j++) {
                System.out.println("  " + beverages[j] + " sales: " + sales[i][j]);
                cityTotal += sales[i][j];
            }

            System.out.println("  Total sales for " + cities[i] + ": " + cityTotal);
            System.out.println();
            grandTotal += cityTotal;
        }

        System.out.println("TOTAL SALES FOR ALL CITIES: " + grandTotal);
    }

    
}
