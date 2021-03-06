package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution794;

public class Solution794Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validTicTacToe");
        Solution794 instance = new Solution794();

        assertEquals(false, instance.validTicTacToe(new String[] {"O  ", "   ", "   "}));
        assertEquals(false, instance.validTicTacToe(new String[] {"XOX", " X ", "   "}));
        assertEquals(false, instance.validTicTacToe(new String[] {"XXX", "   ", "OOO"}));
        assertEquals(true, instance.validTicTacToe(new String[] {"XOX", "O O", "XOX"}));
    }
}
