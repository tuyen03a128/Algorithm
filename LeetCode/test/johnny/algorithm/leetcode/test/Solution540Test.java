package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution540;

public class Solution540Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("singleNonDuplicate");
        Solution540 instance = new Solution540();

        assertEquals(2, instance.singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
        assertEquals(10, instance.singleNonDuplicate(new int[] {3,3,7,7,10,11,11}));
    }
}
