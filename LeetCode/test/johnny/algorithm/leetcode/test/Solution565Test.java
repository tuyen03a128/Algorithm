package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution565;

public class Solution565Test extends JunitBase {

    @Test
    public void testArrayNesting() {
        System.out.println("arrayNesting");
        Solution565 instance = new Solution565();

        assertEquals(0, instance.arrayNesting(null));
        assertEquals(1, instance.arrayNesting(new int[]{0}));
        assertEquals(1, instance.arrayNesting(new int[]{1}));
        assertEquals(1, instance.arrayNesting(new int[]{0,1,2,3,4,5}));
        assertEquals(2, instance.arrayNesting(new int[]{2,1,0}));
        assertEquals(3, instance.arrayNesting(new int[]{1,2,0}));
        assertEquals(4, instance.arrayNesting(new int[]{5,4,0,3,1,6,2}));
    }
}
