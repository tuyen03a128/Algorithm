package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution446;

public class Solution446Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numberOfArithmeticSlices");
        Solution446 instance = new Solution446();

        assertEquals(7, instance.numberOfArithmeticSlices(new int[] {2, 4, 6, 8, 10}));
    }
}
