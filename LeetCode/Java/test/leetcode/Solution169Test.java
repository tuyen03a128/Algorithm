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
public class Solution169Test {
    
    public Solution169Test() {
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
     * Test of majorityElement method, of class Solution169.
     */
    @Test
    public void testMajorityElement() {
        System.out.println("majorityElement");
        int[] num = null;
        Solution169 instance = new Solution169();
        int expResult = Integer.MIN_VALUE;
        int result = instance.majorityElement(num);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.majorityElement(new int[] {1}));
        assertEquals(1, instance.majorityElement(new int[] {1,1}));
        //assertEquals(expResult, instance.majorityElement(new int[] {1,2}));
        //assertEquals(expResult, instance.majorityElement(new int[] {1,2,3,4,5}));
        assertEquals(3, instance.majorityElement(new int[] {1,3,3,3,5}));
        //assertEquals(expResult, instance.majorityElement(new int[] {1,2,3,4,4}));
        assertEquals(1, instance.majorityElement(new int[] {1,2,1,4,1}));
        assertEquals(2, instance.majorityElement(new int[] {2,2,2,2,2}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of majorityNumber method, of class Solution169.
     */
    @Test
    public void testMajorityNumber() {
        System.out.println("majorityNumber");
        int[] nums = null;
        Solution169 instance = new Solution169();
        int expResult = Integer.MIN_VALUE;
        int result = instance.majorityNumber(nums);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.majorityNumber(new int[] {1}));
        assertEquals(1, instance.majorityNumber(new int[] {1,1}));
        assertEquals(3, instance.majorityNumber(new int[] {1,3,3,3,5}));
        assertEquals(4, instance.majorityNumber(new int[] {1,2,3,4,4}));
        assertEquals(1, instance.majorityNumber(new int[] {1,2,1,4,1}));
        assertEquals(2, instance.majorityNumber(new int[] {2,2,2,2,2}));
        
        assertEquals(2, instance.majorityNumber(new int[]{1,1,2,2,2}));
        assertEquals(3, instance.majorityNumber(new int[]{1,1,2,2,2,3,3,3,3,3}));
        assertEquals(2, instance.majorityNumber(new int[]{1,1,2,2,2,2,2,3,3}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");                
    }
    
}
