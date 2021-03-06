package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution445;
import johnny.algorithm.leetcode.common.ListNode;

public class Solution445Test extends JunitBase {

    @Test
    public void testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        Solution445 instance = new Solution445();

        assertEquals(null, instance.addTwoNumbers(null, null));

        ListNode l21 = ListNode.createInstance(new int[]{1});
        ListNode l22 = ListNode.createInstance(new int[]{1});
        ListNode expect2 = ListNode.createInstance(new int[]{2});
        assertTrue(ListNode.isSame(expect2, instance.addTwoNumbers(l21, l22)));

        ListNode l31 = ListNode.createInstance(new int[]{1});
        ListNode l32 = ListNode.createInstance(new int[]{9});
        ListNode expect3 = ListNode.createInstance(new int[]{1,0});
        assertTrue(ListNode.isSame(expect3, instance.addTwoNumbers(l31, l32)));

        ListNode l41 = ListNode.createInstance(new int[]{1,2,3});
        ListNode l42 = ListNode.createInstance(new int[]{4,5});
        ListNode expect4 = ListNode.createInstance(new int[]{1,6,8});
        assertTrue(ListNode.isSame(expect4, instance.addTwoNumbers(l41, l42)));

        ListNode l51 = ListNode.createInstance(new int[]{3,7,8});
        ListNode l52 = ListNode.createInstance(new int[]{9,2});
        ListNode expect5 = ListNode.createInstance(new int[]{4,7,0});
        assertTrue(ListNode.isSame(expect5, instance.addTwoNumbers(l51, l52)));

        ListNode l61 = ListNode.createInstance(new int[]{7,2,4,3});
        ListNode l62 = ListNode.createInstance(new int[]{5,6,4});
        ListNode expect6 = ListNode.createInstance(new int[]{7,8,0,7});
        assertTrue(ListNode.isSame(expect6, instance.addTwoNumbers(l61, l62)));

        ListNode l71 = ListNode.createInstance(new int[]{1});
        ListNode l72 = ListNode.createInstance(new int[]{9,9,9,9});
        ListNode expect7 = ListNode.createInstance(new int[]{1,0,0,0,0});
        assertTrue(ListNode.isSame(expect7, instance.addTwoNumbers(l71, l72)));
    }
}
