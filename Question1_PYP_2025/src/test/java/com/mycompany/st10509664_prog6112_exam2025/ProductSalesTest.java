/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.st10509664_prog6112_exam2025;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductSalesTest {
    //supplied the product sales data for testing
    int[][] productSales = {{300, 150, 700},{250,200,600}};
    
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        //establish a connection to the ProductSales class to call methods
        ProductSales ps = new ProductSales();
        
        int expected = 2200;
        int actual = ps.TotalSales(productSales);
        
        assertEquals(expected, actual);
    }

    @Test
    public void testAverageSales() {
        //establish a connection to the ProductSales class to call methods
        ProductSales ps = new ProductSales();
        
        double expected = 2200/6;
        double actual = ps.AverageSales(productSales);
        
        assertEquals(expected, actual);
    }
    
}
