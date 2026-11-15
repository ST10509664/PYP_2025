/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10509664_prog6112_exam2025;

/**
 *
 * @author bibia
 */

//this line will stay red until all the methods in the interface has been corrected written out
public class ProductSales implements IProductSales {
    
    @Override
    public int TotalSales(int[][] productSales){
        int total = 0;
        //loop through the whole 2d array to tally up the total
        for (int r = 0; r < productSales.length; r++)
        {
            for (int c = 0; c < productSales[r].length; c++)
            {
                 total += productSales[r][c];    
            }
        }       
        return total;
    }
    
    @Override
    public double AverageSales(int[][] productSales){
        int count = 0;
        //loop through the whole 2d array to tally up the number of values
        for (int r = 0; r < productSales.length; r++)
        {
            for (int c = 0; c < productSales[r].length; c++)
            {
                count++; 
            }
        } 
        //call method to get the total sales      
        return TotalSales(productSales)/count;
    }
    
    
    @Override
    public int MaxSale(int[][] productSales){
        int max = productSales[1][1];
        for (int r = 0; r < productSales.length; r++)
        {
            for (int c = 0; c < productSales[r].length; c++)
            {
                //check for maximum
                if (productSales[r][c] > max){
                    max = productSales[r][c];
                }
            }
        }
        return max;
    }
    
    @Override
    public int MinSale(int[][] productSales){
        int min = productSales[1][1];
        for (int r = 0; r < productSales.length; r++)
        {
            for (int c = 0; c < productSales[r].length; c++)
            {
                 //check for minimum
                if (productSales[r][c] < min){
                    min = productSales[r][c];
                }
            }
        }
        return min;
    }
    
}
