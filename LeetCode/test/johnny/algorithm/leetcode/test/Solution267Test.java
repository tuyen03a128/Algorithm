package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution267;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution267Test extends JunitBase {

    @Test
    public void testGeneratePalindromes() {
        System.out.println("generatePalindromes");
        Solution267 instance = new Solution267();

        List<String> expect1 = ListUtil.buildList(new String[] {});
        List<String> result1 = instance.generatePalindromes("");
        assertTrue(ListUtil.equalsIgnoreOrder(expect1, result1));

        List<String> expect2 = ListUtil.buildList(new String[] {"abba","baab"});
        List<String> result2 = instance.generatePalindromes("aabb");
        assertTrue(ListUtil.equalsIgnoreOrder(expect2, result2));

        List<String> expect3 = ListUtil.buildList(new String[] {});
        List<String> result3 = instance.generatePalindromes("abc");
        assertTrue(ListUtil.equalsIgnoreOrder(expect3, result3));
    }
}
