package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Relative Ranks
 * 
 * Given scores of N athletes, find their relative ranks and the people with 
 * the top three highest scores, who will be awarded medals: "Gold Medal", 
 * "Silver Medal" and "Bronze Medal".
 * 
 * Example 1:
 * Input: [5, 4, 3, 2, 1]
 * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * Explanation: The first three athletes got the top three highest scores, 
 * so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
 * For the left two athletes, you just need to output their relative ranks
 * according to their scores.
 * 
 * Note:
 * 1. N is a positive integer and won't exceed 10,000.
 * 2. All the scores of athletes are guaranteed to be unique.
 * 
 * @author Johnny
 */
public class Solution506 {
    public String[] findRelativeRanks(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new String[]{};
        }
        
        Integer[] index = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++) {
            index[i] = i;
        }
        
        Arrays.sort(index, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return nums[o2] - nums[o1];
            }
        });
        
        String[] res = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[index[i]] = "Gold Medal";
            } else if (i == 1) {
                res[index[i]] = "Silver Medal";
            } else if (i == 2) {
                res[index[i]] = "Bronze Medal";
            } else {
                res[index[i]] = String.valueOf(i + 1);
            }
        }

        return res;
    }
}
