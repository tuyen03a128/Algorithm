package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution584;

public class Solution584Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution584 instance = new Solution584();

        assertEquals(0, instance.query());
    }
}
