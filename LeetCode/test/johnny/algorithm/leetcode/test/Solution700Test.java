package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution700;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution700Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("searchBST");
        Solution700 instance = new Solution700();

        TreeNode root1 = TreeNode.createInstance("4,2,7,1,3,null,null");
        TreeNode expect1 = TreeNode.createInstance("2,1,3");
        TreeNode result1 = instance.searchBST(root1, 2);
        assertTrue(TreeNode.isSame(expect1, result1));
    }
}
