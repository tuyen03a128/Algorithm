package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution755;

public class Solution755Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("pourWater");
        Solution755 instance = new Solution755();

        assertArrayEquals(new int[] {2,2,2,3,2,2,2}, instance.pourWater(new int[] {2,1,1,2,1,2,2}, 4, 3));
        assertArrayEquals(new int[] {2,3,3,4}, instance.pourWater(new int[] {1,2,3,4}, 2, 2));
        assertArrayEquals(new int[] {4,4,4}, instance.pourWater(new int[] {3,1,3}, 5, 1));
    }
}
