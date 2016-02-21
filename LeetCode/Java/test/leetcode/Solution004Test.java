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
public class Solution004Test {
    
    public Solution004Test() {
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
     * Test of findMedianSortedArrays method, of class Solution004.
     */
    @Test
    public void testFindMedianSortedArrays() {
        System.out.println("findMedianSortedArrays");
        int[] nums1 = null;
        int[] nums2 = null;
        Solution004 instance = new Solution004();
        double expResult = -1;
        double result = instance.findMedianSortedArrays(nums1, nums2);
        assertEquals(expResult, result, 0.0);
        
        assertEquals(0, instance.findMedianSortedArrays(new int[] {0}, null), 0.0);
        assertEquals(1, instance.findMedianSortedArrays(null, new int[] {1}), 0.0);
        assertEquals(1.5, instance.findMedianSortedArrays(new int[] {1}, new int[] {2}), 0.0);
        assertEquals(2, instance.findMedianSortedArrays(new int[] {1,2}, new int[] {3}), 0.0);
        assertEquals(2.5, instance.findMedianSortedArrays(new int[] {1,2,3}, new int[] {4}), 0.0);
        assertEquals(3, instance.findMedianSortedArrays(new int[] {1,2,3}, new int[] {4,5}), 0.0);
        assertEquals(3.5, instance.findMedianSortedArrays(new int[] {1,2,3,4,5,6}, new int[] {2,3,4,5}), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
