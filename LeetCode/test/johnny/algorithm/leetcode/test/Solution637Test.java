package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution637;
import johnny.algorithm.leetcode.common.ListUtil;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution637Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("averageOfLevels");
        Solution637 instance = new Solution637();

        TreeNode root1 = TreeNode.createInstance(new String[] {"3","9","20","#","#","15","7"});
        List<Double> result1 = ListUtil.buildList(new Double[] {3.0, 14.5, 11.0});
        assertEquals(result1, instance.averageOfLevels(root1));
    }
}
