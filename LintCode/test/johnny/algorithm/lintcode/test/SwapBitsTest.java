/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.lintcode.SwapBits;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class SwapBitsTest {
    
    public SwapBitsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of swapOddEvenBits method, of class SwapBits.
     */
    @Test
    public void testSwapOddEvenBits() {
        System.out.println("swapOddEvenBits");
        SwapBits instance = new SwapBits();

        //assertEquals(10, instance.swapOddEvenBits(5));
        assertEquals(-3, instance.swapOddEvenBits(-2));
    }
}
