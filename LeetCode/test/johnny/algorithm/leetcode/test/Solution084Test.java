package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution084;

public class Solution084Test extends JunitBase {

    @Test
    public void testLargestRectangleArea() {
        System.out.println("largestRectangleArea");
        Solution084 instance = new Solution084();

        assertEquals(0, instance.largestRectangleArea(null));
        assertEquals(6, instance.largestRectangleArea(new int[]{4,3}));
        assertEquals(10, instance.largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
}
