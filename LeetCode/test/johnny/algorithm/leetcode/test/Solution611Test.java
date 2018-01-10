package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution611;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution611Test {
    
    public Solution611Test() {
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
     * Test of triangleNumber method, of class Solution611.
     */
    @Test
    public void testTriangleNumber() {
        System.out.println("triangleNumber");
        int[] nums = null;
        Solution611 instance = new Solution611();
        int expResult = 0;
        int result = instance.triangleNumber(nums);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.triangleNumber(new int[]{1,2,3}));
        assertEquals(1, instance.triangleNumber(new int[]{2,2,3}));
        assertEquals(1, instance.triangleNumber(new int[]{1,2,3,4}));
        assertEquals(3, instance.triangleNumber(new int[]{2,2,3,4}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
