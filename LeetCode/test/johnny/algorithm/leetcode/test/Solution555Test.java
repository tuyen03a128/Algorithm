package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution555;

public class Solution555Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("splitLoopedString");
        Solution555 instance = new Solution555();

        assertEquals("zyxcba", instance.splitLoopedString(new String[] {"abc", "xyz"}));
    }
}
