package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution651;

public class Solution651Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxA");
        Solution651 instance = new Solution651();

        assertEquals(3, instance.maxA(3));
        assertEquals(9, instance.maxA(7));
    }
}
