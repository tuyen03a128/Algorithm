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

import johnny.algorithm.lintcode.HashFunction;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class HashFunctionTest {
    
    public HashFunctionTest() {
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
     * Test of hashCode method, of class HashFunction.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        char[] key = null;
        int HASH_SIZE = 0;
        HashFunction instance = new HashFunction();
        int expResult = 0;
        int result = instance.hashCode(key, HASH_SIZE);
        assertEquals(expResult, result);
        
        assertEquals(78, instance.hashCode("abcd".toCharArray(), 100));
    }
}
