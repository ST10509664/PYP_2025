/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2_pyp2025;

/**
 *
 * @author bibia
 */
public class ProductSales implements IProductSales {
   //declare product sales data in 2d array
    int[][] productSales = {{300,150,700}, {250,200,600}};
   
    
    @Override
    public int[][] GetProductSales(){
        return productSales;
    }
    
    @Override 
    public int GetTotalSales(){
      int  total = 0;
       
        for (int r = 0; r < productSales.length; r++){
            for (int c = 0; c < productSales[r].length; c++){
                total += productSales[r][c];
            }
        }
        return total;
    }
    
    @Override
    public int GetSalesOverLimit(){
    int overLimit = 0;
        for (int r = 0; r < productSales.length; r++){
            for (int c = 0; c < productSales[r].length; c++){
                if (productSales[r][c] >= 500){
                    overLimit++;
                }
            }
        
        }
        return overLimit;
    }
    
    @Override
    public int GetSalesUnderLimit(){
    int underLimit = 0;
        for (int r = 0; r < productSales.length; r++){
            for (int c = 0; c < productSales[r].length; c++){
                if (productSales[r][c] >= 500){
                    underLimit++;
                }
            }
        
        }
        return underLimit;
    }
    
    //get the years, which is equal to the number of rows in the 2d array
    @Override
    public int GetProductsProcessed(){
        return productSales.length;
    }
    
    @Override
    public double GetAverageSales(){
        int total = GetTotalSales();
        int count = 0;
        for (int r = 0; r < productSales.length; r++){
            for (int c = 0; c < productSales[r].length; c++){
                count++;
            }
        
        }
        //(double) keeps the value as double. since you are dividing between 2 ints, itll convert to an int without (double)
        return (double) total/count;
    }
    
    
}
