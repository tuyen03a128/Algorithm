package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution754;

public class Solution754Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("reachNumber");
        Solution754 instance = new Solution754();

        assertEquals(2, instance.reachNumber(3));
        assertEquals(3, instance.reachNumber(2));
    }
}
