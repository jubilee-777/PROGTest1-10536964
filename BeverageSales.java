/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffehutreport;

/**
 *
 * @author Student
 */

public class BeverageSales extends Beverage {

    public BeverageSales(String beverageType, String city, int totalSales) {
        super(beverageType, city, totalSales);
    }

    @Override
    public void printReport() {
        System.out.println("NUMBER 1 COFFEE HUT REPORT");
        System.out.println("*******************");
        System.out.println("BEVERAGE TYPE: " + getBeverageType());
        System.out.println("CITY: " + getCity());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}
