package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution634;

public class Solution634Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findDerangement");
        Solution634 instance = new Solution634();

        assertEquals(2, instance.findDerangement(3));
    }
}
