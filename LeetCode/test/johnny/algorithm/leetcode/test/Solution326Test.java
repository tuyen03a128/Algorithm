package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution326;

public class Solution326Test extends JunitBase {

    @Test
    public void testIsPowerOfThree() {
        System.out.println("isPowerOfThree");
        Solution326 instance = new Solution326();

        assertEquals(false, instance.isPowerOfThree(0));
        assertEquals(true, instance.isPowerOfThree(3));
        assertEquals(false, instance.isPowerOfThree(8));
        assertEquals(true, instance.isPowerOfThree(81));
        assertEquals(false, instance.isPowerOfThree(101));
        assertEquals(false, instance.isPowerOfThree(Integer.MAX_VALUE));
    }
}
