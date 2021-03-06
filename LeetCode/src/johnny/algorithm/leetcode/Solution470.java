package johnny.algorithm.leetcode;

import johnny.algorithm.leetcode.common.SolBase;

/**
 * 470. Implement Rand10() Using Rand7()

Given a function rand7 which generates a uniform random integer in the range 1 to 7, write a function rand10 which generates a uniform random integer in the range 1 to 10.

Do NOT use system's Math.random().

Example 1:

Input: 1
Output: [7]
Example 2:

Input: 2
Output: [8,4]
Example 3:

Input: 3
Output: [8,1,10]
 

Note:

rand7 is predefined.
Each testcase has one argument: n, the number of times that rand10 is called.
 

Follow up:

What is the expected value for the number of calls to rand7() function?
Could you minimize the number of calls to rand7()?

 * @author Johnny
 */
/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
public class Solution470 extends SolBase {
    public int rand10() {
        int index = 41;
        while (index > 40) {
            int row = rand7();
            int col = rand7();
            index = col + (row - 1) * 7;
        }
        
        return 1 + (index - 1) % 10;
    }
}
