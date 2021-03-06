package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution097;

public class Solution097Test extends JunitBase {

    @Test
    public void testIsInterleave() {
        System.out.println("isInterleave");
        Solution097 instance = new Solution097();

        assertEquals(true, instance.isInterleave("", "", ""));
        assertEquals(true, instance.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        assertEquals(false, instance.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}
