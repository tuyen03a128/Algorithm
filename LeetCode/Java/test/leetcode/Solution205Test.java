/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution205Test {
    
    public Solution205Test() {
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
     * Test of isIsomorphic method, of class Solution205.
     */
    @Test
    public void testIsIsomorphic() {
        System.out.println("isIsomorphic");
        String s = "";
        String t = "";
        Solution205 instance = new Solution205();
        boolean expResult = true;
        boolean result = instance.isIsomorphic(s, t);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isIsomorphic("a", "a"));
        assertEquals(false, instance.isIsomorphic("ab", "aa"));
        assertEquals(true, instance.isIsomorphic("egg", "add"));
        assertEquals(false, instance.isIsomorphic("foo", "bar"));
        assertEquals(true, instance.isIsomorphic("paper", "title"));
        assertEquals(true, instance.isIsomorphic("teacher", "awchkwo"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}