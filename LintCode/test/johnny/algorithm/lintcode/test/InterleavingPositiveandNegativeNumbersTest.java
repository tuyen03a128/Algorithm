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

import johnny.algorithm.lintcode.InterleavingPositiveandNegativeNumbers;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class InterleavingPositiveandNegativeNumbersTest {
    
    public InterleavingPositiveandNegativeNumbersTest() {
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
     * Test of rerange method, of class InterleavingPositiveandNegativeNumbers.
     */
    @Test
    public void testRerange() {
        System.out.println("rerange");
        int[] A = null;
        InterleavingPositiveandNegativeNumbers instance = new InterleavingPositiveandNegativeNumbers();
        instance.rerange(A);
        
        int[] A2 = new int[] {-33,-19,30,26,21,-9};
        instance.rerange(A2);
        int[] expected2 = new int[] {-33,30,-19,26,-9,21};
        assertArrayEquals(expected2, A2);
    }
}
