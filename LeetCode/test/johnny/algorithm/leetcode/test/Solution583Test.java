package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution583;

public class Solution583Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minDistance");
        Solution583 instance = new Solution583();

        assertEquals(2, instance.minDistance("sea", "eat"));
    }
}
