package johnny.algorithm.leetcode;

import java.util.Stack;

/**
 * Trapping Rain Water. (picture not downloaded)
 * Given n non-negative integers representing an elevation map where the width 
 * of each bar is 1, compute how much water it is able to trap after raining.
 * 
 * For example, 
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * 
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
 * In this case, 6 units of rain water (blue section) are being trapped. Thanks
 * Marcos for contributing this image!
 * 
 * @author Johnny
 */
public class Solution042 {
    // two points, O(n)
    public int trap2(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int start = 0;
        int end = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;
        while (start < end) {
            leftmax = Math.max(leftmax, height[start]);
            rightmax = Math.max(rightmax, height[end]);
            if (leftmax < rightmax) {
                water += leftmax - height[start];
                start++;
            } else {
                water += rightmax - height[end];
                end--;
            }
        }
        return water;
    }
    
    // Stack, O(n)
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0, maxWater = 0, maxBotWater = 0;
        while (i < height.length){
            if (stack.isEmpty() || height[i] <= height[stack.peek()]){
                stack.push(i++);
            }
            else {
                int bot = stack.pop();
                maxBotWater = stack.isEmpty()? // empty means no il
                0:(Math.min(height[stack.peek()],height[i])-height[bot])*(i-stack.peek()-1);
                maxWater += maxBotWater;
            }
        }
        return maxWater;
    }
    // DP, 3 times of O(n), space O(n)
    public int trap3(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int[] left = new int[height.length];
        int[] right = new int[height.length];

        //scan from left to find the maximum left height
        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        //scan from right to find the maximum right height
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        
        // water for each position
        int res = 0;
        for (int i = 1; i < height.length - 1; i++) {
            res += Math.min(left[i], right[i]) - height[i];
        }
        
        return res;
    }
    
    // Brute force, O(n^2)
    public int trap4(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int leftmax = 0, rightmax = 0;
            //Search the left part for max bar size
            for (int j = 0; j <= i; j++) { 
                leftmax = Math.max(leftmax, height[j]);
            }
            //Search the right part for max bar size
            for (int j = i; j < height.length; j++) { 
                rightmax = Math.max(rightmax, height[j]);
            }
            res += Math.min(leftmax, rightmax) - height[i];
        }
        return res;
    }
}
