package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution946;

public class Solution946Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validateStackSequences");
        Solution946 instance = new Solution946();

        assertEquals(true, instance.validateStackSequences(new int[] {1,2,3,4,5}, new int[] {4,5,3,2,1}));
        assertEquals(false, instance.validateStackSequences(new int[] {1,2,3,4,5}, new int[] {4,3,5,1,2}));
    }
}
