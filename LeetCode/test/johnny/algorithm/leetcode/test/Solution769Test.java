package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution769;

public class Solution769Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxChunksToSorted");
        Solution769 instance = new Solution769();

        assertEquals(1, instance.maxChunksToSorted(new int[] {4,3,2,1,0}));
        assertEquals(4, instance.maxChunksToSorted(new int[] {1,0,2,3,4}));
    }
}
