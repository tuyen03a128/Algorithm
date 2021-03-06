package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import johnny.algorithm.leetcode.Solution336;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution336Test extends JunitBase {

    @Test
    public void testPalindromePairs() {
        System.out.println("palindromePairs");
        Solution336 instance = new Solution336();

        List<List<Integer>> expect1 = new ArrayList<List<Integer>>();
        assertEquals(expect1, instance.palindromePairs(null));

        List<List<Integer>> result2 = instance.palindromePairs(new String[]{"bat", "tab", "cat"});
        List<List<Integer>> expect2 = ListUtil.buildList2(new Integer[][] {{0,1},{1,0}});
        assertTrue(ListUtil.equalsIgnoreOrder(result2, expect2));

        List<List<Integer>> result3 = instance.palindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"});
        List<List<Integer>> expect3 = ListUtil.buildList2(new Integer[][] {{0,1},{1,0},{3,2},{2,4}});
        assertTrue(ListUtil.equalsIgnoreOrder(result3, expect3));
    }
}
