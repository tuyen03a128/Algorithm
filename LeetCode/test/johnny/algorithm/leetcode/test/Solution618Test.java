package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution618;

public class Solution618Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("Database");
        Solution618 instance = new Solution618();

        assertEquals(0, instance.query());
    }
}
