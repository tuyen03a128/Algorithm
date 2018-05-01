package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution397;

public class Solution397Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("integerReplacement");
        Solution397 instance = new Solution397();

        assertEquals(3, instance.integerReplacement(8));
        assertEquals(4, instance.integerReplacement(7));
    }
}
