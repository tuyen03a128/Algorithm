package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution906;

public class Solution906Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("superpalindromesInRange");
        Solution906 instance = new Solution906();

        assertEquals(4, instance.superpalindromesInRange("4","1000"));
    }
}
