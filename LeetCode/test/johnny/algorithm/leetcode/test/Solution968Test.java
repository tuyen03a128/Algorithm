package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution968;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution968Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minCameraCover");
        Solution968 instance = new Solution968();

        TreeNode root1 = TreeNode.createInstance("0,0,#,0,0");
        assertEquals(1, instance.minCameraCover(root1));
        
        TreeNode root2 = TreeNode.createInstance("0,0,#,0,#,0,#,#,0");
        assertEquals(2, instance.minCameraCover(root2));
    }
}
