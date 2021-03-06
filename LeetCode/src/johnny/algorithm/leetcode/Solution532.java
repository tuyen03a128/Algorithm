package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * K-diff Pairs in an Array
 * 
 * Given an array of integers and an integer k, you need to find the number of 
 * unique k-diff pairs in the array. Here a k-diff pair is defined as an integer
 * pair (i, j), where i and j are both numbers in the array and their absolute 
 * difference is k.
 * 
 * Example 1:
 * Input: [3, 1, 4, 1, 5], k = 2
 * Output: 2
 * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 * Although we have two 1s in the input, we should only return the number of 
 * unique pairs.
 * 
 * Example 2:
 * Input:[1, 2, 3, 4, 5], k = 1
 * Output: 4
 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 * 
 * Example 3:
 * Input: [1, 3, 1, 5, 4], k = 0
 * Output: 1
 * Explanation: There is one 0-diff pair in the array, (1, 1).
 * 
 * Note:
 * 1. The pairs (i, j) and (j, i) count as the same pair.
 * 2. The length of the array won't exceed 10,000.
 * 3. All the integers in the given input belong to the range: [-1e7, 1e7].
 * 
 * @author Johnny
 */
public class Solution532 {
    // Two pointers, time: nlog(n), space: O(1)
    public int findPairs2(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        
        Arrays.sort(nums);
        
        int fast = 1;
        int slow = 0;
        
        int res = 0;
        while (fast < nums.length && slow < nums.length - 1) {
            if (fast == slow) {
                fast++;
                continue;
            }
     
            int diff = nums[fast] - nums[slow];
            if (diff == k) {
                res++;
                while(fast + 1 < nums.length && nums[fast] == nums[fast + 1]) {
                    fast++;
                }
                while(slow + 1 < nums.length && nums[slow] == nums[slow + 1] && slow + 1 != fast) {
                    slow++;
                }
                fast++;
                slow++;
            } else if (diff > k) {
                slow++;
            } else {
                fast++;
            }
        }
        
        return res;
    }
    
    // Hashmap, time: O(n), space: O(n)
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                } 
            } else {
                if (map.containsKey(entry.getKey() - k)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
