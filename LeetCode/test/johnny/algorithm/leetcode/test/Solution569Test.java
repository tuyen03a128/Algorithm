package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution569;

public class Solution569Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution569 instance = new Solution569();

        assertEquals(0, instance.query());
    }
}
