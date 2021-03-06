package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution656;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution656Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("cheapestJump");
        Solution656 instance = new Solution656();

        List<Integer> expect1 = ListUtil.buildList(new Integer[] {1,3,5});
        assertEquals(expect1, instance.cheapestJump(new int[] {1,2,4,-1,2},2));
    }
}
