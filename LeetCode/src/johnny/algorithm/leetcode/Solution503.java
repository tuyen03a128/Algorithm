package johnny.algorithm.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * Next Greater Element II
 * 
 * Given a circular array (the next element of the last element is the first 
 * element of the array), print the Next Greater Number for every element. 
 * The Next Greater Number of a number x is the first greater number to its
 * traversing-order next in the array, which means you could search circularly
 * to find its next greater number. If it doesn't exist, output -1 for this 
 * number.
 * 
 * Example 1:
 * Input: [1,2,1]
 * Output: [2,-1,2]
 * Explanation: The first 1's next greater number is 2; 
 * The number 2 can't find next greater number; 
 * The second 1's next greater number needs to search circularly, which is also 2.
 * 
 * Note: The length of given array won't exceed 10000.
 * @author Johnny
 */
public class Solution503 {
    // input:  [1,3, 4, 2], output: [3,4,-1,3]
    public int[] nextGreaterElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<Integer>(); // keep ascending order for the elements at right side
        
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                stack.pop();
            }
           
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            
            stack.push(nums[i]);
        }
        
        return res;
    }
    
    public int[] nextGreaterElements2(int[] nums) {
        int n = nums.length;
        int[] next = new int[n];
        Arrays.fill(next, -1);
        Stack<Integer> stack = new Stack<>(); // index stack
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n]; 
            while (!stack.isEmpty() && nums[stack.peek()] < num)
                next[stack.pop()] = num;
            if (i < n) stack.push(i);
        }   
        return next;
    }
}
