package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution182;

public class Solution182Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution182 instance = new Solution182();

        assertEquals(0, instance.query());
    }
}
