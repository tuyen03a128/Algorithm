package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution250;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution250Test extends JunitBase {

    @Test
    public void testCountUnivalSubtrees() {
        System.out.println("countUnivalSubtrees");
        Solution250 instance = new Solution250();

        assertEquals(0, instance.countUnivalSubtrees(null));

        TreeNode root2 = TreeNode.createInstance(new String[]{"5","1","5","5","5", "#","5"});
        assertEquals(4, instance.countUnivalSubtrees(root2));
    }
}
