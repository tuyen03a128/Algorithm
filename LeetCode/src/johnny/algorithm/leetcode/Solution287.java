package johnny.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the Duplicate Number.
 * 
 * Given an array nums containing n + 1 integers where each integer is between 1
 * and n (inclusive), prove that at least one duplicate number must exist. 
 * Assume that there is only one duplicate number, find the duplicate one.
 * 
 * Note:
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 *  
 * @author Johnny
 */
public class Solution287 {
    //Floyd's Tortoise and Hare
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }
    //http://bookshadow.com/weblog/2015/09/28/leetcode-find-duplicate-number/
    // binary
    public int findDuplicate4(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int low = 1;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }
            if (cnt > mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    //Floyd's Tortoise and Hare
    public int findDuplicate3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //The "tortoise and hare" step.  We start at the end of the array and try
        // to find an intersection point in the cycle.
        int slow = 0;
        int fast = 0;
    
        // Keep advancing 'slow' by one step and 'fast' by two steps until they
        // meet inside the loop.
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
    
            if (slow == fast) {
                break;
            }
        }
    
        // Start up another pointer from the end of the array and march it forward
        // until it hits the pointer inside the array.
        int finder = 0;
        while (true) {
            slow = nums[slow];
            finder = nums[finder];
    
            // If the two hit, the intersection index is the duplicate element.
            if (slow == finder) {
                return slow;
            }
        }
    }
    
    // Hashset, time: O(n), space: O(n)
    public int findDuplicate2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        
        return 0;
    }
}
