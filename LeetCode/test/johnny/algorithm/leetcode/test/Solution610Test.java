package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution610;

public class Solution610Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution610 instance = new Solution610();

        assertEquals(0, instance.query());
    }
}
