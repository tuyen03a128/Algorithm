package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution872;
import johnny.algorithm.leetcode.common.TreeNode;

public class Solution872Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("leafSimilar");
        Solution872 instance = new Solution872();

        TreeNode root1 = TreeNode.createInstance(new String[] {"3","5","1","6","2","9","8","#","#","7","4"});
        TreeNode root2 = TreeNode.createInstance(new String[] {"3","5","1","6","7","4","2","#","#","#","#","#","#","9","8"});
        assertEquals(true, instance.leafSimilar(root1, root2));
    }
}
