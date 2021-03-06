package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution307;

public class Solution307Test extends JunitBase {

    @Test
    public void testSumRange() {
        System.out.println("sumRange");
        Solution307 instance = new Solution307(new int[]{});

        assertEquals(0, instance.sumRange(0, 0));

        Solution307 instance2 = new Solution307(new int[]{1});
        assertEquals(1, instance2.sumRange(0, 0));
        assertEquals(0, instance2.sumRange(0, 1));

        Solution307 instance3 = new Solution307(new int[]{1,2,3,4,5});
        assertEquals(3, instance3.sumRange(0, 1));
        assertEquals(6, instance3.sumRange(0, 2));
        assertEquals(9, instance3.sumRange(3, 4));

        Solution307 instance4 = new Solution307(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, instance4.sumRange(0, 2));
        assertEquals(-1, instance4.sumRange(2, 5));
        assertEquals(-3, instance4.sumRange(0, 5));

        Solution307 instance5 = new Solution307(new int[]{1,3,5});
        assertEquals(9, instance5.sumRange(0, 2));
        instance5.update(1, 2);
        assertEquals(8, instance5.sumRange(0, 2));
        instance5.update(1, -2);
        assertEquals(-1, instance5.sumRange(0, 1));
    }
}
