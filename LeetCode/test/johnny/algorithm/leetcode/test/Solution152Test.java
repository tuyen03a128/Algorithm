package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution152;

public class Solution152Test extends JunitBase {

    @Test
    public void testMaxProduct() {
        System.out.println("maxProduct");
        Solution152 instance = new Solution152();

        assertEquals(0, instance.maxProduct(null));
        assertEquals(6, instance.maxProduct(new int[] {2,3,-2,4}));
        assertEquals(288, instance.maxProduct(new int[] {2,3,-2,4,-3,2,-1}));
    }
}
