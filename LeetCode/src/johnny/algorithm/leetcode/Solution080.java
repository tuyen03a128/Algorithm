package johnny.algorithm.leetcode;

/**
 * Remove Duplicates from Sorted Array II.
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * 
 * For example,
 * Given sorted array A = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 * 
 * @author Johnny
 */
public class Solution080 {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
    
    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        if (nums.length == 1) {
            return 1;
        }
        
        int i = 1;
        int j = 0;
        int count = 0;
        while (i < nums.length) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
                count = 0;
            } else {
                if (count == 0) {
                    count++;
                    j++;
                    nums[j] = nums[i];
                } 
            }
            i++;
        }
        
        return j + 1;
    }
}
