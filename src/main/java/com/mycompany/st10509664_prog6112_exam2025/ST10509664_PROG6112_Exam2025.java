/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10509664_prog6112_exam2025;

/**
 *
 * @author bibia
 */
public class ST10509664_PROG6112_Exam2025 {
    //FORMATTING:
    //eg: System.out.printf("%-8s", "");
    //%-12d  :   Print an integer (d), left-aligned (-), padded to 12 characters wide
    //%-8s   :   Print a string (s), left-aligned (-), padded to 8 characters wide
    public static void main(String[] args) {
        // 2D ARRAY
        int[][] sales = {{300, 150, 700},{250,200,600}};
        String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("===========================");
        
        //initialise formatting
        System.out.printf("%-8s", "");
        
        //PRINTING OUT A TABLE FORMAT
        //since quarters is a 1d array, we can use this method of for loops to display the 1d array
        for (String q : quarters){
            System.out.printf("%-8s", q);
        }
        System.out.println();
        for (int y = 0; y < sales.length; y++){
            System.out.printf("%-8s", "YEAR " + (y+1));
            
            //here, we reference only the rows within the sales 2d array (sales[y])
            for (int sale : sales[y]){ //so, for each element in that row
                System.out.printf("%-12d", sale); //print with this formatting
            }
            System.out.println();
        }
        
        System.out.println();
        //establish connection to ProductSales class to call methods
        ProductSales ps = new ProductSales();
        System.out.println("Total sales: " + ps.TotalSales(sales));
        //format the double variable (average calculation) to be rounded off
        System.out.printf("Average sales: %.0f%n", ps.AverageSales(sales));
        System.out.println("Maximum sales: " + ps.MinSale(sales));
        System.out.println("Minimum sales: " + ps.MaxSale(sales));
        System.out.println("----------------------------");
    }
}
