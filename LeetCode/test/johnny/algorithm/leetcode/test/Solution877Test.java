package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution877;

public class Solution877Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("stoneGame");
        Solution877 instance = new Solution877();

        assertEquals(true, instance.stoneGame(new int[] {5,3,4,5}));
    }
}
