package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution419;

public class Solution419Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("countBattleships");
        Solution419 instance = new Solution419();

        char[][] board1 = new char[][] {
            {'X','.','.','X'},
            {'.','.','.','X'},
            {'.','.','.','X'}
        };
        assertEquals(2, instance.countBattleships(board1));

        char[][] board2 = new char[][] {
            {'.','.','.','X'},
            {'X','X','X','X'},
            {'.','.','.','X'}
        };
        assertEquals(2, instance.countBattleships(board2));
    }
}
