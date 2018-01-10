package johnny.algorithm.leetcode;

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
    // two points
    // http://www.jiuzhang.com/solutions/trapping-rain-water/
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int start = 0;
        int end = height.length - 1;
        int smaller = 0;
        int water = 0;
        while (start < end) {
            if (height[start] < height[end]) {
                smaller = height[start];
                while (start < end && height[start] <= smaller) {
                    water += smaller - height[start];
                    start++;
                }
            } else {
                smaller = height[end];
                while (start < end && height[end] <= smaller) {
                    water += smaller - height[end];
                    end--;
                }
            }
        }
        return water;
    }
    //http://bangbingsyb.blogspot.com/2014/11/leetcode-trapping-rain-water.html
    public int trap2(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        //scan from left to right to find the maximum left height
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i - 1]);
        }
        
        int water = 0;
        //scan from right to left to find the maximum right height
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i + 1]);
            // water for each position
            int min = Math.min(left[i], right[i]); // the highest water level depends on the lower height
            if (min > height[i]) { // it must higher than the current height.
                water += min - height[i];
            }
        }
        
        return water;
    }
}
