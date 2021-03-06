package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import johnny.algorithm.leetcode.Solution648;
import johnny.algorithm.leetcode.common.ListUtil;

public class Solution648Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("replaceWords");
        Solution648 instance = new Solution648();

        List<String> dict1 = ListUtil.buildList(new String[] {"cat", "bat", "rat"});
        assertEquals("the cat was rat by the bat", instance.replaceWords(dict1, "the cattle was rattled by the battery"));
    }
}
