package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution973;

public class Solution973Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("kClosest");
        Solution973 instance = new Solution973();

        assertArrayEquals(new int[][] {{-2,2}}, instance.kClosest(new int[][] {{1,3},{-2,2}}, 1));
        assertArrayEquals(new int[][] {{3,3},{-2,4}}, instance.kClosest(new int[][] {{3,3},{5,-1},{-2,4}}, 2));
    }
}
