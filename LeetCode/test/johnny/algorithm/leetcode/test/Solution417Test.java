package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution417;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution417Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("pacificAtlantic");
        Solution417 instance = new Solution417();

        int[][] matrix1 = new int[][] {
            {1,2,2,3,5},
            {3,2,3,4,4},
            {2,4,5,3,1},
            {6,7,1,4,5},
            {5,1,1,2,4},
        };

        List<int[]> expect1 = ListUtil.buildList2(new int[][]{{0, 4}, {1, 3}, {1, 4}, {2, 2}, {3, 0}, {3, 1}, {4, 0}});
        assertArrayEquals(expect1.toArray(), instance.pacificAtlantic(matrix1).toArray());
    }
}
