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

import johnny.algorithm.lintcode.DecodeWays;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class DecodeWaysTest {
    
    public DecodeWaysTest() {
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
     * Test of numDecodings method, of class DecodeWays.
     */
    @Test
    public void testNumDecodings() {
        System.out.println("numDecodings");
        String s = "";
        DecodeWays instance = new DecodeWays();
        int expResult = 0;
        int result = instance.numDecodings(s);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.numDecodings("0"));
        assertEquals(1, instance.numDecodings("10"));
        assertEquals(0, instance.numDecodings("19261001"));
        assertEquals(2, instance.numDecodings("12"));
        assertEquals(5, instance.numDecodings("1213"));
        assertEquals(47923200, instance.numDecodings("2226252724242221201918171615141311108787876761721201211012111989898911918293"));
    }
}
