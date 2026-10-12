/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progtest;

/**
 *
 * @author Student
 */

public class PROGtest {

    public static void main(String[] args) {
        // 1D Arrays for categories
        String[] cities = {"Cape Town", "Post Elizabeth", "Pretoria"};
        String[] beverages = {"Coffee", "Tea", "Boba Tea"};

        // 2D Array for sales data (Rows = Cities, Columns = Beverages)
        int[][] salesData = {
            {500,300,125},  
            {450,250,100},   
            {480, 175,120}   
        };

        // 1D Array to store calculated totals for each city
        int[] cityTotals = new int[cities.length];
        int grandTotal = 0;

        // Calculate totals
        for (int i = 0; i < cities.length; i++) {
            int currentCityTotal = 0;
            for (int j = 0; j < beverages.length; j++) {
                currentCityTotal += salesData[i][j];
            }
            cityTotals[i] = currentCityTotal; // Store in 1D array
            grandTotal += currentCityTotal;   // Accumulate grand total
        }
        // Display rows with city details, item sales, and city totals
        for (int i = 0; i < cities.length; i++) {
            System.out.print
                cities[i], 
                salesData[i][0], // Coffee
                salesData[i][1], // Tea
                salesData[i][2], // Boba Tea
                cityTotals[i]    // City Total from 1D array
            );
        }
        System.out.print( "GRAND TOTAL SALES:", grandTotal);
  
}
