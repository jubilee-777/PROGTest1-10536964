/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffehutreport;

/**
 *
 * @author Student
 */

public abstract class Beverage implements IBeverage {
    private String beverageType;
    private String city;
    private int totalSales;

    public Beverage(String beverageType, String city, int totalSales) {
        this.beverageType = beverageType;
        this.city = city;
        this.totalSales = totalSales;
    }

    @Override
    public String getBeverageType() {
        return beverageType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }


    public abstract void printReport();
}