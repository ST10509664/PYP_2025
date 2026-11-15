/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.question2_pyp2025;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bibia
 */
public class ProductSalesTest {
    
    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales(){
        ProductSales ps = new ProductSales();

        int expected = 2;
        int actual = ps.GetSalesOverLimit();

        assertEquals(expected, actual);
    }
    
    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales(){
        ProductSales  ps = new ProductSales();
        
        int expected = 4;
        int actual = ps.GetSalesUnderLimit();
        
        assertEquals(expected, actual);
    }
    
}
