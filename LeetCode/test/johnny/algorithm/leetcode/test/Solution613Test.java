package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution613;

public class Solution613Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution613 instance = new Solution613();

        assertEquals(0, instance.query());
    }
}
