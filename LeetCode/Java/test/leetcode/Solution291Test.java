/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Map;
import java.util.Set;
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
public class Solution291Test {
    
    public Solution291Test() {
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
     * Test of wordPatternMatch method, of class Solution291.
     */
    @Test
    public void testWordPatternMatch() {
        System.out.println("wordPatternMatch");
        String pattern = "";
        String str = "";
        Solution291 instance = new Solution291();
        boolean expResult = true;
        boolean result = instance.wordPatternMatch(pattern, str);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.wordPatternMatch("abab", "redblueredblue"));
        assertEquals(true, instance.wordPatternMatch("aaaa", "asdasdasdasd"));
        assertEquals(false, instance.wordPatternMatch("aabb", "xyzabcxzyabc"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
}
