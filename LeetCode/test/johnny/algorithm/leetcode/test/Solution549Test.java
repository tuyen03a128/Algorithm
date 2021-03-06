package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution549;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution549Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("longestConsecutive");
        Solution549 instance = new Solution549();

        TreeNode root1 = TreeNode.createInstance(new String[] {"1","2","3"});
        assertEquals(2, instance.longestConsecutive(root1));

        TreeNode root2 = TreeNode.createInstance(new String[] {"2","1","3"});
        assertEquals(3, instance.longestConsecutive(root2));
    }
}
