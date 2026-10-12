/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progtest;

/**
 *
 * @author Student
 */
public class PROGtest2 {
    
}
 public abstract class Beverage
    {
        // Variables to store beverage type, city, and total sales
         string bevType;
         string city;
         double totalSales;

        // Constructor that accepts bevType, city, and totalSales as parameters
        public Beverage(string bevType, string city, double totalSales)
        {
            this.bevType = bevType;
            this.city = city;
            this.totalSales = totalSales;
        }

        // Methods to get the beverage type, city, and total sales
        public string GetBevType()
        {
            return bevType;
        }

        public string GetCity()
        {
            return city;
        }

        public double GetTotalSales()
        {
            return totalSales;
        }

        // Method to print the beverage type, city, and total sales
        public virtual void PrintReport()
        {
            Console.WriteLine(" NUMBER 1 COFFEE HUT REPORT ");
            Console.WriteLine("Beverage Type : {bevType}");
            Console.WriteLine("City          : {city}");
            Console.WriteLine("Total Sales   : {totalSales}");
           
        }
    }

    // Subclass called BevSales that extends the Beverage class
    public class BevSales : Beverage
    {
        // Constructor that accepts bevType, city, and totalSales as parameters
        public BevSales(string bevType, string city, double totalSales) 
            : base(bevType, city, totalSales)
        {
        }
    }

    // Separate class to run the application and instantiate BevSales
    public class RunApplication
    {
        public static void Main(string[] args)
        {
            Console.WriteLine(" NUMBER 1 COFFEE HUT - SALES SYSTEM ");
           
            // Prompt user to select a beverage type
            Console.Write("Enter the Beverage Type (e.g., Latte, Cappuccino): ");
            string bevType = Console.ReadLine();

            // Prompt user to enter the city
            Console.Write("Enter the City: ");
            string city = Console.ReadLine();

            // Prompt user to enter the total sales with basic validation
            double totalSales = 0;
            bool validSales = false;
            while (!validSales)
            {
                Console.Write("Enter the Total Sales ");
                string salesInput = Console.ReadLine();

                if (double.TryParse(salesInput, out totalSales) && totalSales >= 0)
                {
                    validSales = true;
                }
                else
                {
                    Console.WriteLine("Invalid input.");
                }
            }

            // Instantiate the BevSales class
            BevSales saleRecord = new BevSales(bevType, city, totalSales);

            // Print the report using the method
            saleRecord.PrintReport();

            Console.WriteLine("\nPress any key to exit...");
            Console.ReadKey();
        }
    }
}
