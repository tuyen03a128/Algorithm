package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution773;

public class Solution773Test {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println("maxIncreaseKeepingSkyline");
        Solution773 instance = new Solution773();

        int[][] board1 = new int[][] {{1,2,3},{4,0,5}};
        assertEquals(1, instance.slidingPuzzle(board1));

        int[][] board2 = new int[][] {{1,2,3},{5,4,0}};
        assertEquals(-1, instance.slidingPuzzle(board2));

        int[][] board3 = new int[][] {{4,1,2},{5,0,3}};
        assertEquals(5, instance.slidingPuzzle(board3));
        
        int[][] board4 = new int[][] {{3,2,4},{1,5,0}};
        assertEquals(14, instance.slidingPuzzle(board4));
    }

}
