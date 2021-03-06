/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.lintcode.test;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.lintcode.RecoverRotatedSortedArray;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class RecoverRotatedSortedArrayTest {
    
    public RecoverRotatedSortedArrayTest() {
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
     * Test of recoverRotatedSortedArray method, of class RecoverRotatedSortedArray.
     */
    @Test
    public void testRecoverRotatedSortedArray() {
        System.out.println("recoverRotatedSortedArray");
        ArrayList<Integer> nums = null;
        RecoverRotatedSortedArray instance = new RecoverRotatedSortedArray();
        instance.recoverRotatedSortedArray(nums);
        
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(4);
        nums2.add(5);
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        instance.recoverRotatedSortedArray(nums2);
        assertEquals(1, (long)nums2.get(0));
        assertEquals(2, (long)nums2.get(1));
        assertEquals(3, (long)nums2.get(2));
        assertEquals(4, (long)nums2.get(3));
        assertEquals(5, (long)nums2.get(4));
        
        ArrayList<Integer> nums3 = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++) {
           nums3.add(1);
        }
        nums3.add(-1);
        for (int i = 0; i < 11; i++) {
           nums3.add(1);
        }
        instance.recoverRotatedSortedArray(nums3);
        assertEquals(-1, (long)nums3.get(0));
        assertEquals(1, (long)nums3.get(1));
        assertEquals(1, (long)nums3.get(2));
        assertEquals(1, (long)nums3.get(9));
    }
}
